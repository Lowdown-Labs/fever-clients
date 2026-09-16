require 'cgi'

module FeverClient
  class KeysApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def create_key(create_key_request, opts = {})
      data, _status_code, _headers = create_key_with_http_info(create_key_request, opts)
      data
    end

    def create_key_with_http_info(create_key_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: KeysApi.create_key ...'
      end
      if @api_client.config.client_side_validation && create_key_request.nil?
        fail ArgumentError, "Missing the required parameter 'create_key_request' when calling KeysApi.create_key"
      end
      local_var_path = '/v1/keys'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body] || @api_client.object_to_http_body(create_key_request)

      return_type = opts[:debug_return_type] || 'KeyReveal'

      auth_names = opts[:debug_auth_names] || ['adminToken']

      new_options = opts.merge(
        :operation => :"KeysApi.create_key",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: KeysApi#create_key\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def list_keys(opts = {})
      data, _status_code, _headers = list_keys_with_http_info(opts)
      data
    end

    def list_keys_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: KeysApi.list_keys ...'
      end
      local_var_path = '/v1/keys'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Array<ApiKey>'

      auth_names = opts[:debug_auth_names] || ['adminToken']

      new_options = opts.merge(
        :operation => :"KeysApi.list_keys",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: KeysApi#list_keys\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def revoke_key(key_id, opts = {})
      data, _status_code, _headers = revoke_key_with_http_info(key_id, opts)
      data
    end

    def revoke_key_with_http_info(key_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: KeysApi.revoke_key ...'
      end
      if @api_client.config.client_side_validation && key_id.nil?
        fail ArgumentError, "Missing the required parameter 'key_id' when calling KeysApi.revoke_key"
      end
      local_var_path = '/v1/keys/{key_id}/revoke'.sub('{key_id}', CGI.escape(key_id.to_s))

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Object'

      auth_names = opts[:debug_auth_names] || ['adminToken']

      new_options = opts.merge(
        :operation => :"KeysApi.revoke_key",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: KeysApi#revoke_key\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
