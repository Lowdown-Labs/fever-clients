require 'cgi'

module FeverClient
  class CustomersApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def reassign_customers_bulk(opts = {})
      data, _status_code, _headers = reassign_customers_bulk_with_http_info(opts)
      data
    end

    def reassign_customers_bulk_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomersApi.reassign_customers_bulk ...'
      end
      local_var_path = '/v1/customers/reassign-bulk'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['multipart/form-data'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}
      form_params['file'] = opts[:'file'] if !opts[:'file'].nil?

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Object'

      auth_names = opts[:debug_auth_names] || ['adminToken']

      new_options = opts.merge(
        :operation => :"CustomersApi.reassign_customers_bulk",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomersApi#reassign_customers_bulk\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
