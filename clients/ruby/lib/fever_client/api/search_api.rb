require 'cgi'

module FeverClient
  class SearchApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def search(search_request, opts = {})
      data, _status_code, _headers = search_with_http_info(search_request, opts)
      data
    end

    def search_with_http_info(search_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SearchApi.search ...'
      end
      if @api_client.config.client_side_validation && search_request.nil?
        fail ArgumentError, "Missing the required parameter 'search_request' when calling SearchApi.search"
      end
      local_var_path = '/v1/search'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body] || @api_client.object_to_http_body(search_request)

      return_type = opts[:debug_return_type] || 'Array<SearchHit>'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"SearchApi.search",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SearchApi#search\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
