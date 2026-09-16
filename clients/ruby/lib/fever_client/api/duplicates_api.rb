require 'cgi'

module FeverClient
  class DuplicatesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def find_duplicates(duplicates_request, opts = {})
      data, _status_code, _headers = find_duplicates_with_http_info(duplicates_request, opts)
      data
    end

    def find_duplicates_with_http_info(duplicates_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DuplicatesApi.find_duplicates ...'
      end
      if @api_client.config.client_side_validation && duplicates_request.nil?
        fail ArgumentError, "Missing the required parameter 'duplicates_request' when calling DuplicatesApi.find_duplicates"
      end
      local_var_path = '/v1/duplicates'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body] || @api_client.object_to_http_body(duplicates_request)

      return_type = opts[:debug_return_type] || 'DuplicatesResponse'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"DuplicatesApi.find_duplicates",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DuplicatesApi#find_duplicates\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def suggested_dedup_threshold(opts = {})
      data, _status_code, _headers = suggested_dedup_threshold_with_http_info(opts)
      data
    end

    def suggested_dedup_threshold_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DuplicatesApi.suggested_dedup_threshold ...'
      end
      local_var_path = '/v1/duplicates/suggested-threshold'

      query_params = opts[:query_params] || {}
      query_params[:'customer_id'] = opts[:'customer_id'] if !opts[:'customer_id'].nil?

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Object'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"DuplicatesApi.suggested_dedup_threshold",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DuplicatesApi#suggested_dedup_threshold\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
