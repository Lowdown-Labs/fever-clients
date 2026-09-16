require 'cgi'

module FeverClient
  class QueryApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def query(query_request, opts = {})
      data, _status_code, _headers = query_with_http_info(query_request, opts)
      data
    end

    def query_with_http_info(query_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QueryApi.query ...'
      end
      if @api_client.config.client_side_validation && query_request.nil?
        fail ArgumentError, "Missing the required parameter 'query_request' when calling QueryApi.query"
      end
      local_var_path = '/v1/query'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body] || @api_client.object_to_http_body(query_request)

      return_type = opts[:debug_return_type] || 'QueryResult'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"QueryApi.query",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QueryApi#query\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
