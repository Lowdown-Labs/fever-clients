require 'date'
require 'json'
require 'logger'
require 'tempfile'
require 'time'
require 'faraday'
require 'faraday/multipart' if Gem::Version.new(Faraday::VERSION) >= Gem::Version.new('2.0')
require 'marcel'


module FeverClient
  class ApiClient
    attr_accessor :config

    attr_accessor :default_headers

    def initialize(config = Configuration.default)
      @config = config
      @user_agent = "OpenAPI-Generator/#{VERSION}/ruby"
      @default_headers = {
        'Content-Type' => 'application/json',
        'User-Agent' => @user_agent
      }
    end

    def self.default
      @@default ||= ApiClient.new
    end

    def call_api(http_method, path, opts = {})
      stream = nil
      begin
        response = connection(opts).public_send(http_method.to_sym.downcase) do |req|
          request = build_request(http_method, path, req, opts)
          stream = download_file(request) if opts[:return_type] == 'File' || opts[:return_type] == 'Binary'
        end

        if config.debugging
          config.logger.debug "HTTP response body ~BEGIN~\n#{response.body}\n~END~\n"
        end

        unless response.success?
          if response.status == 0 && response.respond_to?(:return_message)
            fail ApiError.new(code: 0,
                              message: response.return_message)
          else
            fail ApiError.new(code: response.status,
                              response_headers: response.headers,
                              response_body: response.body),
                 response.reason_phrase
          end
        end
      rescue Faraday::TimeoutError
        fail ApiError.new('Connection timed out')
      rescue Faraday::ConnectionFailed
        fail ApiError.new('Connection failed')
      end

      if opts[:return_type] == 'File' || opts[:return_type] == 'Binary'
        data = deserialize_file(response, stream)
      elsif opts[:return_type]
        data = deserialize(response, opts[:return_type])
      else
        data = nil
      end
      return data, response.status, response.headers
    end

    def build_request(http_method, path, request, opts = {})
      url = build_request_url(path, opts)
      http_method = http_method.to_sym.downcase

      header_params = @default_headers.merge(opts[:header_params] || {})
      query_params = opts[:query_params] || {}
      form_params = opts[:form_params] || {}

      update_params_for_auth! header_params, query_params, opts[:auth_names]

      if [:post, :patch, :put, :delete].include?(http_method)
        req_body = build_request_body(header_params, form_params, opts[:body])
        if config.debugging
          config.logger.debug "HTTP request body param ~BEGIN~\n#{req_body}\n~END~\n"
        end
      end
      request.headers = header_params
      request.body = req_body

      request.options.params_encoder = config.params_encoder if config.params_encoder
      request.options.timeout        = config.timeout        if config.timeout

      request.url url
      request.params = query_params
      request
    end

    def build_request_body(header_params, form_params, body)
      if header_params['Content-Type'] == 'application/x-www-form-urlencoded'
        data = URI.encode_www_form(form_params)
      elsif header_params['Content-Type'] == 'multipart/form-data'
        data = {}
        form_params.each do |key, value|
          case value
          when ::File, ::Tempfile
            data[key] = Faraday::FilePart.new(value.path, Marcel::MimeType.for(Pathname.new(value.path)))
          when ::Array, nil
            data[key] = value
          else
            data[key] = value.to_s
          end
        end
      elsif body
        data = body.is_a?(String) ? body : body.to_json
      else
        data = nil
      end
      data
    end

    def download_file(request)
      stream = []

      request.options.on_data = Proc.new do |chunk, overall_received_bytes|
        stream << chunk
      end

      stream
    end

    def deserialize_file(response, stream)
      body     = response.body
      encoding = body.encoding

      content = stream.join
      content = content.unpack('m').join if response.headers['Content-Transfer-Encoding'] == 'binary'
      content = content.force_encoding(encoding)

      return content if @config.return_binary_data == true

      content_disposition = response.headers['Content-Disposition']
      if content_disposition && content_disposition =~ /filename=/i
        filename = content_disposition[/filename=['"]?([^'"\s]+)['"]?/, 1]
        prefix = sanitize_filename(filename)
      else
        prefix = 'download-'
      end
      prefix = prefix + '-' unless prefix.end_with?('-')

      tempfile = Tempfile.open(prefix, @config.temp_folder_path, encoding: encoding)
      tempfile.write(content)
      tempfile.close

      config.logger.info "Temp file written to #{tempfile.path}, please copy the file to a proper folder "\
                          "with e.g. `FileUtils.cp(tempfile.path, '/new/file/path')` otherwise the temp file "\
                          "will be deleted automatically with GC. It's also recommended to delete the temp file "\
                          "explicitly with `tempfile.delete`"
      tempfile
    end

    def connection(opts)
      opts[:header_params]['Content-Type'] == 'multipart/form-data' ? connection_multipart : connection_regular
    end

    def connection_multipart
      @connection_multipart ||= build_connection do |conn|
        conn.request :multipart
        conn.request :url_encoded
      end
    end

    def connection_regular
      @connection_regular ||= build_connection
    end

    def build_connection
      Faraday.new(url: config.base_url, ssl: ssl_options, proxy: config.proxy) do |conn|
        basic_auth(conn)
        config.configure_middleware(conn)
        yield(conn) if block_given?
        conn.adapter(Faraday.default_adapter)
        config.configure_connection(conn)
      end
    end

    def ssl_options
      {
        ca_file: config.ssl_ca_file,
        verify: config.ssl_verify,
        verify_mode: config.ssl_verify_mode,
        client_cert: config.ssl_client_cert,
        client_key: config.ssl_client_key
      }
    end

    def basic_auth(conn)
      if config.username && config.password
        if Gem::Version.new(Faraday::VERSION) >= Gem::Version.new('2.0')
          conn.request(:authorization, :basic, config.username, config.password)
        else
          conn.request(:basic_auth, config.username, config.password)
        end
      end
    end

    def json_mime?(mime)
      (mime == '*/*') || !(mime =~ /^Application\/.*json(?!p)(;.*)?/i).nil?
    end

    def deserialize(response, return_type)
      body = response.body
      return nil if body.nil? || body.empty?

      return body.to_s if return_type == 'String'

      content_type = response.headers['Content-Type'] || 'application/json'

      fail "Content-Type is not supported: #{content_type}" unless json_mime?(content_type)

      begin
        data = JSON.parse("[#{body}]", :symbolize_names => true)[0]
      rescue JSON::ParserError => e
        if %w(String Date Time).include?(return_type)
          data = body
        else
          raise e
        end
      end

      convert_to_type data, return_type
    end

    def convert_to_type(data, return_type)
      return nil if data.nil?
      case return_type
      when 'String'
        data.to_s
      when 'Integer'
        data.to_i
      when 'Float'
        data.to_f
      when 'Boolean'
        data == true
      when 'Time'
        Time.parse data
      when 'Date'
        Date.parse data
      when 'Object'
        data
      when /\AArray<(.+)>\z/
        sub_type = $1
        data.map { |item| convert_to_type(item, sub_type) }
      when /\AHash\<String, (.+)\>\z/
        sub_type = $1
        {}.tap do |hash|
          data.each { |k, v| hash[k] = convert_to_type(v, sub_type) }
        end
      else
        klass = FeverClient.const_get(return_type)
        if klass.respond_to?(:openapi_one_of) || klass.respond_to?(:openapi_any_of)
          klass.build(data)
        else
          klass.build_from_hash(data)
        end
      end
    end

    def sanitize_filename(filename)
      filename.split(/[\/\\]/).last
    end

    def build_request_url(path, opts = {})
      path = "/#{path}".gsub(/\/+/, '/')
      @config.base_url(opts[:operation]) + path
    end

    def update_params_for_auth!(header_params, query_params, auth_names)
      Array(auth_names).each do |auth_name|
        auth_setting = @config.auth_settings[auth_name]
        next unless auth_setting
        case auth_setting[:in]
        when 'header' then header_params[auth_setting[:key]] = auth_setting[:value]
        when 'query'  then query_params[auth_setting[:key]] = auth_setting[:value]
        else fail ArgumentError, 'Authentication token must be in `query` or `header`'
        end
      end
    end

    def user_agent=(user_agent)
      @user_agent = user_agent
      @default_headers['User-Agent'] = @user_agent
    end

    def select_header_accept(accepts)
      return nil if accepts.nil? || accepts.empty?
      json_accept = accepts.find { |s| json_mime?(s) }
      json_accept || accepts.join(',')
    end

    def select_header_content_type(content_types)
      return if content_types.nil? || content_types.empty?
      json_content_type = content_types.find { |s| json_mime?(s) }
      json_content_type || content_types.first
    end

    def object_to_http_body(model)
      return model if model.nil? || model.is_a?(String)
      local_body = nil
      if model.is_a?(Array)
        local_body = model.map { |m| object_to_hash(m) }
      else
        local_body = object_to_hash(model)
      end
      local_body.to_json
    end

    def object_to_hash(obj)
      if obj.respond_to?(:to_hash)
        obj.to_hash
      else
        obj
      end
    end

    def build_collection_param(param, collection_format)
      case collection_format
      when :csv
        param.join(',')
      when :ssv
        param.join(' ')
      when :tsv
        param.join("\t")
      when :pipes
        param.join('|')
      when :multi
        param
      else
        fail "unknown collection format: #{collection_format.inspect}"
      end
    end
  end
end
