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

    public interface IQueryApiSync : IApiAccessor
    {
        #region Synchronous Operations
        QueryResult Query(QueryRequest queryRequest);

        ApiResponse<QueryResult> QueryWithHttpInfo(QueryRequest queryRequest);
        #endregion Synchronous Operations
    }

    public interface IQueryApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        System.Threading.Tasks.Task<QueryResult> QueryAsync(QueryRequest queryRequest, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<QueryResult>> QueryWithHttpInfoAsync(QueryRequest queryRequest, System.Threading.CancellationToken cancellationToken = default);
        #endregion Asynchronous Operations
    }

    public interface IQueryApi : IQueryApiSync, IQueryApiAsync
    {

    }

    public partial class QueryApi : IDisposable, IQueryApi
    {
        private LowdownLabs.Fever.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        public QueryApi() : this((string)null)
        {
        }

        public QueryApi(string basePath)
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

        public QueryApi(LowdownLabs.Fever.Client.Configuration configuration)
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

        public QueryApi(HttpClient client, HttpClientHandler handler = null) : this(client, (string)null, handler)
        {
        }

        public QueryApi(HttpClient client, string basePath, HttpClientHandler handler = null)
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

        public QueryApi(HttpClient client, LowdownLabs.Fever.Client.Configuration configuration, HttpClientHandler handler = null)
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

        public QueryApi(LowdownLabs.Fever.Client.ISynchronousClient client, LowdownLabs.Fever.Client.IAsynchronousClient asyncClient, LowdownLabs.Fever.Client.IReadableConfiguration configuration)
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

        public QueryResult Query(QueryRequest queryRequest)
        {
            LowdownLabs.Fever.Client.ApiResponse<QueryResult> localVarResponse = QueryWithHttpInfo(queryRequest);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<QueryResult> QueryWithHttpInfo(QueryRequest queryRequest)
        {
            if (queryRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'queryRequest' when calling QueryApi->Query");

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

            localVarRequestOptions.Data = queryRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Post<QueryResult>("/v1/query", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Query", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<QueryResult> QueryAsync(QueryRequest queryRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<QueryResult> localVarResponse = await QueryWithHttpInfoAsync(queryRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<QueryResult>> QueryWithHttpInfoAsync(QueryRequest queryRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            if (queryRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'queryRequest' when calling QueryApi->Query");

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

            localVarRequestOptions.Data = queryRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.PostAsync<QueryResult>("/v1/query", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Query", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
