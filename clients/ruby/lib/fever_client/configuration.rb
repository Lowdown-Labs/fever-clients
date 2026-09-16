module FeverClient
  class Configuration
    attr_accessor :scheme

    attr_accessor :host

    attr_accessor :base_path

    attr_accessor :server_index

    attr_accessor :server_operation_index

    attr_accessor :server_variables

    attr_accessor :server_operation_variables

    attr_accessor :api_key

    attr_accessor :api_key_prefix

    attr_accessor :username

    attr_accessor :password

    attr_accessor :access_token

    attr_accessor :access_token_getter

    attr_accessor :return_binary_data

    attr_accessor :debugging

    attr_accessor :ignore_operation_servers

    attr_accessor :logger

    attr_accessor :temp_folder_path

    attr_accessor :timeout

    attr_accessor :client_side_validation

    attr_accessor :ssl_verify

    attr_accessor :ssl_verify_mode

    attr_accessor :ssl_ca_file

    attr_accessor :ssl_client_cert

    attr_accessor :ssl_client_key

    attr_accessor :proxy

    attr_accessor :params_encoder


    attr_accessor :inject_format

    attr_accessor :force_ending_format

    def initialize
      @scheme = 'http'
      @host = 'localhost'
      @base_path = ''
      @server_index = nil
      @server_operation_index = {}
      @server_variables = {}
      @server_operation_variables = {}
      @api_key = {}
      @api_key_prefix = {}
      @client_side_validation = true
      @ssl_verify = true
      @ssl_verify_mode = nil
      @ssl_ca_file = nil
      @ssl_client_cert = nil
      @ssl_client_key = nil
      @middlewares = Hash.new { |h, k| h[k] = [] }
      @configure_connection_blocks = []
      @timeout = 60
      @return_binary_data = false
      @params_encoder = nil
      @debugging = false
      @ignore_operation_servers = false
      @inject_format = false
      @force_ending_format = false
      @logger = defined?(Rails) ? Rails.logger : Logger.new(STDOUT)

      yield(self) if block_given?
    end

    def self.default
      @@default ||= Configuration.new
    end

    def configure
      yield(self) if block_given?
    end

    def scheme=(scheme)
      @scheme = scheme.sub(/:\/\//, '')
    end

    def host=(host)
      @host = host.sub(/https?:\/\//, '').split('/').first
    end

    def base_path=(base_path)
      @base_path = "/#{base_path}".gsub(/\/+/, '/')
      @base_path = '' if @base_path == '/'
    end

    def base_url(operation = nil)
      return "#{scheme}://#{[host, base_path].join('/').gsub(/\/+/, '/')}".sub(/\/+\z/, '') if ignore_operation_servers
      if operation_server_settings.key?(operation) then
        index = server_operation_index.fetch(operation, server_index)
        server_url(index.nil? ? 0 : index, server_operation_variables.fetch(operation, server_variables), operation_server_settings[operation])
      else
        server_index.nil? ? "#{scheme}://#{[host, base_path].join('/').gsub(/\/+/, '/')}".sub(/\/+\z/, '') : server_url(server_index, server_variables, nil)
      end
    end

    def api_key_with_prefix(param_name, param_alias = nil)
      key = @api_key[param_name]
      key = @api_key.fetch(param_alias, key) unless param_alias.nil?
      if @api_key_prefix[param_name]
        "#{@api_key_prefix[param_name]} #{key}"
      else
        key
      end
    end

    def access_token_with_refresh
      return access_token if access_token_getter.nil?
      access_token_getter.call
    end

    def basic_auth_token
      'Basic ' + ["#{username}:#{password}"].pack('m').delete("\r\n")
    end

    def auth_settings
      {
        'adminToken' =>
          {
            type: 'bearer',
            in: 'header',
            key: 'Authorization',
            value: "Bearer #{access_token_with_refresh}"
          },
        'bearerAuth' =>
          {
            type: 'bearer',
            in: 'header',
            key: 'Authorization',
            value: "Bearer #{access_token_with_refresh}"
          },
      }
    end

    def server_settings
      [
        {
          url: "",
          description: "No description provided",
        }
      ]
    end

    def operation_server_settings
      {
      }
    end

    def server_url(index, variables = {}, servers = nil)
      servers = server_settings if servers == nil

      if (index.nil? || index < 0 || index >= servers.size)
        fail ArgumentError, "Invalid index #{index} when selecting the server. Must not be nil and must be less than #{servers.size}"
      end

      server = servers[index]
      url = server[:url]

      return url unless server.key? :variables

      server[:variables].each do |name, variable|
        if variables.key?(name)
          if (!server[:variables][name].key?(:enum_values) || server[:variables][name][:enum_values].include?(variables[name]))
            url.gsub! "{" + name.to_s + "}", variables[name]
          else
            fail ArgumentError, "The variable `#{name}` in the server URL has invalid value #{variables[name]}. Must be #{server[:variables][name][:enum_values]}."
          end
        else
          url.gsub! "{" + name.to_s + "}", server[:variables][name][:default_value]
        end
      end

      url
    end

    def configure_faraday_connection(&block)
      @configure_connection_blocks << block
    end

    def configure_connection(conn)
      @configure_connection_blocks.each do |block|
        block.call(conn)
      end
    end

    def use(*middleware)
      set_faraday_middleware(:use, *middleware)
    end

    def request(*middleware)
      set_faraday_middleware(:request, *middleware)
    end

    def response(*middleware)
      set_faraday_middleware(:response, *middleware)
    end

    def set_faraday_middleware(operation, key, *args, &block)
      unless [:request, :response, :use, :insert, :insert_before, :insert_after, :swap, :delete].include?(operation)
        fail ArgumentError, "Invalid faraday middleware operation #{operation}. Must be" \
                            " :request, :response, :use, :insert, :insert_before, :insert_after, :swap or :delete."
      end

      @middlewares[operation] << [key, args, block]
    end
    ruby2_keywords(:set_faraday_middleware) if respond_to?(:ruby2_keywords, true)

    def configure_middleware(connection)
      return if @middlewares.empty?

      [:request, :response, :use, :insert, :insert_before, :insert_after, :swap].each do |operation|
        next unless @middlewares.key?(operation)

        @middlewares[operation].each do |key, args, block|
          connection.builder.send(operation, key, *args, &block)
        end
      end

      if @middlewares.key?(:delete)
        @middlewares[:delete].each do |key, _args, _block|
          connection.builder.delete(key)
        end
      end
    end

  end
end
