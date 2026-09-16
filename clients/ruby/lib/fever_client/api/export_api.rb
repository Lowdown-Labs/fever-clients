require 'cgi'

module FeverClient
  class ExportApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def export_tenant(export_request, opts = {})
      data, _status_code, _headers = export_tenant_with_http_info(export_request, opts)
      data
    end

    def export_tenant_with_http_info(export_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ExportApi.export_tenant ...'
      end
      if @api_client.config.client_side_validation && export_request.nil?
        fail ArgumentError, "Missing the required parameter 'export_request' when calling ExportApi.export_tenant"
      end
      local_var_path = '/v1/export'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body] || @api_client.object_to_http_body(export_request)

      return_type = opts[:debug_return_type] || 'ExportResult'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"ExportApi.export_tenant",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ExportApi#export_tenant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def import_tenant(import_request, opts = {})
      data, _status_code, _headers = import_tenant_with_http_info(import_request, opts)
      data
    end

    def import_tenant_with_http_info(import_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ExportApi.import_tenant ...'
      end
      if @api_client.config.client_side_validation && import_request.nil?
        fail ArgumentError, "Missing the required parameter 'import_request' when calling ExportApi.import_tenant"
      end
      local_var_path = '/v1/import'

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body] || @api_client.object_to_http_body(import_request)

      return_type = opts[:debug_return_type] || 'ImportResult'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"ExportApi.import_tenant",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ExportApi#import_tenant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
