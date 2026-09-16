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

    public interface ISearchApiSync : IApiAccessor
    {
        #region Synchronous Operations
        List<SearchHit> Search(SearchRequest searchRequest);

        ApiResponse<List<SearchHit>> SearchWithHttpInfo(SearchRequest searchRequest);
        #endregion Synchronous Operations
    }

    public interface ISearchApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        System.Threading.Tasks.Task<List<SearchHit>> SearchAsync(SearchRequest searchRequest, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<List<SearchHit>>> SearchWithHttpInfoAsync(SearchRequest searchRequest, System.Threading.CancellationToken cancellationToken = default);
        #endregion Asynchronous Operations
    }

    public interface ISearchApi : ISearchApiSync, ISearchApiAsync
    {

    }

    public partial class SearchApi : IDisposable, ISearchApi
    {
        private LowdownLabs.Fever.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        public SearchApi() : this((string)null)
        {
        }

        public SearchApi(string basePath)
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

        public SearchApi(LowdownLabs.Fever.Client.Configuration configuration)
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

        public SearchApi(HttpClient client, HttpClientHandler handler = null) : this(client, (string)null, handler)
        {
        }

        public SearchApi(HttpClient client, string basePath, HttpClientHandler handler = null)
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

        public SearchApi(HttpClient client, LowdownLabs.Fever.Client.Configuration configuration, HttpClientHandler handler = null)
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

        public SearchApi(LowdownLabs.Fever.Client.ISynchronousClient client, LowdownLabs.Fever.Client.IAsynchronousClient asyncClient, LowdownLabs.Fever.Client.IReadableConfiguration configuration)
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

        public List<SearchHit> Search(SearchRequest searchRequest)
        {
            LowdownLabs.Fever.Client.ApiResponse<List<SearchHit>> localVarResponse = SearchWithHttpInfo(searchRequest);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<List<SearchHit>> SearchWithHttpInfo(SearchRequest searchRequest)
        {
            if (searchRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'searchRequest' when calling SearchApi->Search");

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

            localVarRequestOptions.Data = searchRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Post<List<SearchHit>>("/v1/search", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Search", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<List<SearchHit>> SearchAsync(SearchRequest searchRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<List<SearchHit>> localVarResponse = await SearchWithHttpInfoAsync(searchRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<List<SearchHit>>> SearchWithHttpInfoAsync(SearchRequest searchRequest, System.Threading.CancellationToken cancellationToken = default)
        {
            if (searchRequest == null)
                throw new LowdownLabs.Fever.Client.ApiException(400, "Missing required parameter 'searchRequest' when calling SearchApi->Search");

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

            localVarRequestOptions.Data = searchRequest;

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.PostAsync<List<SearchHit>>("/v1/search", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("Search", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
