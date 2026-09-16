require 'cgi'

module FeverClient
  class JobsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    def cancel_job(job_id, opts = {})
      data, _status_code, _headers = cancel_job_with_http_info(job_id, opts)
      data
    end

    def cancel_job_with_http_info(job_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: JobsApi.cancel_job ...'
      end
      if @api_client.config.client_side_validation && job_id.nil?
        fail ArgumentError, "Missing the required parameter 'job_id' when calling JobsApi.cancel_job"
      end
      local_var_path = '/v1/jobs/{job_id}/cancel'.sub('{job_id}', CGI.escape(job_id.to_s))

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Job'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"JobsApi.cancel_job",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: JobsApi#cancel_job\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    def get_job(job_id, opts = {})
      data, _status_code, _headers = get_job_with_http_info(job_id, opts)
      data
    end

    def get_job_with_http_info(job_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: JobsApi.get_job ...'
      end
      if @api_client.config.client_side_validation && job_id.nil?
        fail ArgumentError, "Missing the required parameter 'job_id' when calling JobsApi.get_job"
      end
      local_var_path = '/v1/jobs/{job_id}'.sub('{job_id}', CGI.escape(job_id.to_s))

      query_params = opts[:query_params] || {}

      header_params = opts[:header_params] || {}
      header_params['Accept'] = @api_client.select_header_accept(['application/json']) unless header_params['Accept']

      form_params = opts[:form_params] || {}

      post_body = opts[:debug_body]

      return_type = opts[:debug_return_type] || 'Job'

      auth_names = opts[:debug_auth_names] || ['bearerAuth']

      new_options = opts.merge(
        :operation => :"JobsApi.get_job",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: JobsApi#get_job\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
