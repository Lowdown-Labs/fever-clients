require 'cgi'

module FeverClient
  class AuthApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def whoami(opts = {})
      data, _status_code, _headers = whoami_with_http_info(opts)
      data
    end

    def whoami_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AuthApi.whoami ...'
      end
      local_var_path = '/v1/whoami'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Object'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"AuthApi.whoami",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthApi#whoami\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
