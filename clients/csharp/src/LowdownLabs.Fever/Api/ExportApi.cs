using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Mime;
using LowdownLabs.Fever.Client;
using LowdownLabs.Fever.Model;

namespace LowdownLabs.Fever.Api
{

    public interface IExportApiSync : IApiAccessor
    {
        #region Synchronous Operations
        ExportResult ExportTenant(ExportRequest exportRequest);

        ApiResponse<ExportResult> ExportTenantWithHttpInfo(ExportRequest exportRequest);
        ImportResult ImportTenant(ImportRequest importRequest);

        ApiResponse<ImportResult> ImportTenantWithHttpInfo(ImportRequest importRequest);
        #endregion Synchronous Operations
    }

    public interface IExportApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        System.Threading.Tasks.Task<ExportResult> ExportTenantAsync(ExportRequest exportRequest, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<ExportResult>> ExportTenantWithHttpInfoAsync(ExportRequest exportRequest, System.Threading.CancellationToken cancellationToken = default);
        System.Threading.Tasks.Task<ImportResult> ImportTenantAsync(ImportRequest importRequest, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<ImportResult>> ImportTenantWithHttpInfoAsync(ImportRequest importRequest, System.Threading.CancellationToken cancellationToken = default);
        #endregion Asynchronous Operations
    }

    public interface IExportApi : IExportApiSync, IExportApiAsync
    {

    }

    public partial class ExportApi : IDisposable, IExportApi
    {
        private LowdownLabs.Fever.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        public ExportApi() : this((string)null)
        {
        }

        public ExportApi(string basePath)
        {
            this.Configuration = LowdownLabs.Fever.Client.Configuration.MergeConfigurations(
                LowdownLabs.Fever.Client.GlobalConfiguration.Instance,
                new LowdownLabs.Fever.Client.Configuration { BasePath = basePath }
            );
            this.ApiClient = new LowdownLabs.Fever.Client.ApiClient(this.Configuration.BasePath);
            this.Client =  this.ApiClient;
            this.AsynchronousClient = this.ApiClient;
            this.ExceptionFactory = LowdownLabs.Fever.Client.Configuration.DefaultExceptionFactory;
        }

        public ExportApi(LowdownLabs.Fever.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = LowdownLabs.Fever.Client.Configuration.MergeConfigurations(
                LowdownLabs.Fever.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.ApiClient = new LowdownLabs.Fever.Client.ApiClient(this.Configuration.BasePath);
            this.Client = this.ApiClient;
            this.AsynchronousClient = this.ApiClient;
            ExceptionFactory = LowdownLabs.Fever.Client.Configuration.DefaultExceptionFactory;
        }

        public ExportApi(HttpClient client, HttpClientHandler handler = null) : this(client, (string)null, handler)
        {
        }

        public ExportApi(HttpClient client, string basePath, HttpClientHandler handler = null)
        {
            if (client == null) throw new ArgumentNullException("client");

            this.Configuration = LowdownLabs.Fever.Client.Configuration.MergeConfigurations(
                LowdownLabs.Fever.Client.GlobalConfiguration.Instance,
                new LowdownLabs.Fever.Client.Configuration { BasePath = basePath }
            );
            this.ApiClient = new LowdownLabs.Fever.Client.ApiClient(client, this.Configuration.BasePath, handler);
            this.Client =  this.ApiClient;
            this.AsynchronousClient = this.ApiClient;
            this.ExceptionFactory = LowdownLabs.Fever.Client.Configuration.DefaultExceptionFactory;
        }

        public ExportApi(HttpClient client, LowdownLabs.Fever.Client.Configuration configuration, HttpClientHandler handler = null)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");
            if (client == null) throw new ArgumentNullException("client");

            this.Configuration = LowdownLabs.Fever.Client.Configuration.MergeConfigurations(
                LowdownLabs.Fever.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.ApiClient = new LowdownLabs.Fever.Client.ApiClient(client, this.Configuration.BasePath, handler);
            this.Client = this.ApiClient;
            this.AsynchronousClient = this.ApiClient;
            ExceptionFactory = LowdownLabs.Fever.Client.Configuration.DefaultExceptionFactory;
        }

        public ExportApi(LowdownLabs.Fever.Client.ISynchronousClient client, LowdownLabs.Fever.Client.IAsynchronousClient asyncClient, LowdownLabs.Fever.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = LowdownLabs.Fever.Client.Configuration.DefaultExceptionFactory;
        }

        public void Dispose()
        {
            this.ApiClient?.Dispose();
        }

        public LowdownLabs.Fever.Client.ApiClient ApiClient { get; set; } = null;

        public LowdownLabs.Fever.Client.IAsynchronousClient AsynchronousClient { get; set; }

        public LowdownLabs.Fever.Client.ISynchronousClient Client { get; set; }

        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        public LowdownLabs.Fever.Client.IReadableConfiguration Configuration { get; set; }

        public LowdownLabs.Fever.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        public ExportResult ExportTenant(ExportRequest exportRequest)
        {
            LowdownLabs.Fever.Client.ApiResponse<ExportResult> localVarResponse = ExportTenantWithHttpInfo(exportRequest);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<ExportResult> ExportTenantWithHttpInfo(ExportRequest exportRequest)
        {
            if (exportRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'exportRequest' when calling ExportApi->ExportTenant");

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = exportRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Post<ExportResult>("/v1/export", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ExportTenant", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<ExportResult> ExportTenantAsync(ExportRequest exportRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<ExportResult> localVarResponse = await ExportTenantWithHttpInfoAsync(exportRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<ExportResult>> ExportTenantWithHttpInfoAsync(ExportRequest exportRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            if (exportRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'exportRequest' when calling ExportApi->ExportTenant");

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = exportRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.PostAsync<ExportResult>("/v1/export", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ExportTenant", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public ImportResult ImportTenant(ImportRequest importRequest)
        {
            LowdownLabs.Fever.Client.ApiResponse<ImportResult> localVarResponse = ImportTenantWithHttpInfo(importRequest);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<ImportResult> ImportTenantWithHttpInfo(ImportRequest importRequest)
        {
            if (importRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'importRequest' when calling ExportApi->ImportTenant");

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = importRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Post<ImportResult>("/v1/import", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ImportTenant", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<ImportResult> ImportTenantAsync(ImportRequest importRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<ImportResult> localVarResponse = await ImportTenantWithHttpInfoAsync(importRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<ImportResult>> ImportTenantWithHttpInfoAsync(ImportRequest importRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            if (importRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'importRequest' when calling ExportApi->ImportTenant");

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = importRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.PostAsync<ImportResult>("/v1/import", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ImportTenant", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
