require 'cgi'

module FeverClient
  class MediaApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def get_media_bytes(blob_id, opts = {})
      data, _status_code, _headers = get_media_bytes_with_http_info(blob_id, opts)
      data
    end

    def get_media_bytes_with_http_info(blob_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MediaApi.get_media_bytes ...'
      end
      if @api_client.config.client_side_validation && blob_id.nil?
        fail ArgumentError, "Missing the required parameter 'blob_id' when calling MediaApi.get_media_bytes"
      end
      local_var_path = '/v1/media/{blob_id}/bytes'.sub('{blob_id}', CGI.escape(blob_id.to_s))

      query_params = opts[:query_params] || {}
      query_params[:'max_dim'] = opts[:'max_dim'] if !opts[:'max_dim'].nil?
      query_params[:'waveform'] = opts[:'waveform'] if !opts[:'waveform'].nil?

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'image/jpeg', 'image/png']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Object'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"MediaApi.get_media_bytes",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#get_media_bytes\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def get_media_info(blob_id, opts = {})
      data, _status_code, _headers = get_media_info_with_http_info(blob_id, opts)
      data
    end

    def get_media_info_with_http_info(blob_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MediaApi.get_media_info ...'
      end
      if @api_client.config.client_side_validation && blob_id.nil?
        fail ArgumentError, "Missing the required parameter 'blob_id' when calling MediaApi.get_media_info"
      end
      local_var_path = '/v1/media/{blob_id}'.sub('{blob_id}', CGI.escape(blob_id.to_s))

      query_params = opts[:query_params] || {}
      query_params[:'customer_id'] = opts[:'customer_id'] if !opts[:'customer_id'].nil?

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'MediaInfo'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"MediaApi.get_media_info",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#get_media_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def list_media_formats(opts = {})
      data, _status_code, _headers = list_media_formats_with_http_info(opts)
      data
    end

    def list_media_formats_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MediaApi.list_media_formats ...'
      end
      local_var_path = '/v1/media/formats'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'MediaFormats'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"MediaApi.list_media_formats",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#list_media_formats\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def list_media_frames(blob_id, opts = {})
      data, _status_code, _headers = list_media_frames_with_http_info(blob_id, opts)
      data
    end

    def list_media_frames_with_http_info(blob_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MediaApi.list_media_frames ...'
      end
      if @api_client.config.client_side_validation && blob_id.nil?
        fail ArgumentError, "Missing the required parameter 'blob_id' when calling MediaApi.list_media_frames"
      end
      local_var_path = '/v1/media/{blob_id}/frames'.sub('{blob_id}', CGI.escape(blob_id.to_s))

      query_params = opts[:query_params] || {}
      query_params[:'customer_id'] = opts[:'customer_id'] if !opts[:'customer_id'].nil?

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Array<MediaFrame>'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"MediaApi.list_media_frames",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#list_media_frames\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def list_media_transcript(blob_id, opts = {})
      data, _status_code, _headers = list_media_transcript_with_http_info(blob_id, opts)
      data
    end

    def list_media_transcript_with_http_info(blob_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: MediaApi.list_media_transcript ...'
      end
      if @api_client.config.client_side_validation && blob_id.nil?
        fail ArgumentError, "Missing the required parameter 'blob_id' when calling MediaApi.list_media_transcript"
      end
      local_var_path = '/v1/media/{blob_id}/transcript'.sub('{blob_id}', CGI.escape(blob_id.to_s))

      query_params = opts[:query_params] || {}
      query_params[:'customer_id'] = opts[:'customer_id'] if !opts[:'customer_id'].nil?

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Array<TranscriptSegment>'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"MediaApi.list_media_transcript",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: MediaApi#list_media_transcript\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
