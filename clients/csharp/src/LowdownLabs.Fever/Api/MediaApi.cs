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

    public interface IMediaApiSync : IApiAccessor
    {
        #region Synchronous Operations
        Object GetMediaBytes(int blobId, int? maxDim = default, int? waveform = default);

        ApiResponse<Object> GetMediaBytesWithHttpInfo(int blobId, int? maxDim = default, int? waveform = default);
        MediaInfo GetMediaInfo(int blobId, string? customerId = default);

        ApiResponse<MediaInfo> GetMediaInfoWithHttpInfo(int blobId, string? customerId = default);
        MediaFormats ListMediaFormats();

        ApiResponse<MediaFormats> ListMediaFormatsWithHttpInfo();
        List<MediaFrame> ListMediaFrames(int blobId, string? customerId = default);

        ApiResponse<List<MediaFrame>> ListMediaFramesWithHttpInfo(int blobId, string? customerId = default);
        List<TranscriptSegment> ListMediaTranscript(int blobId, string? customerId = default);

        ApiResponse<List<TranscriptSegment>> ListMediaTranscriptWithHttpInfo(int blobId, string? customerId = default);
        #endregion Synchronous Operations
    }

    public interface IMediaApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        System.Threading.Tasks.Task<Object> GetMediaBytesAsync(int blobId, int? maxDim = default, int? waveform = default, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<Object>> GetMediaBytesWithHttpInfoAsync(int blobId, int? maxDim = default, int? waveform = default, System.Threading.CancellationToken cancellationToken = default);
        System.Threading.Tasks.Task<MediaInfo> GetMediaInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<MediaInfo>> GetMediaInfoWithHttpInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default);
        System.Threading.Tasks.Task<MediaFormats> ListMediaFormatsAsync(System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<MediaFormats>> ListMediaFormatsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default);
        System.Threading.Tasks.Task<List<MediaFrame>> ListMediaFramesAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<List<MediaFrame>>> ListMediaFramesWithHttpInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default);
        System.Threading.Tasks.Task<List<TranscriptSegment>> ListMediaTranscriptAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default);

        System.Threading.Tasks.Task<ApiResponse<List<TranscriptSegment>>> ListMediaTranscriptWithHttpInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default);
        #endregion Asynchronous Operations
    }

    public interface IMediaApi : IMediaApiSync, IMediaApiAsync
    {

    }

    public partial class MediaApi : IDisposable, IMediaApi
    {
        private LowdownLabs.Fever.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        public MediaApi() : this((string)null)
        {
        }

        public MediaApi(string basePath)
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

        public MediaApi(LowdownLabs.Fever.Client.Configuration configuration)
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

        public MediaApi(HttpClient client, HttpClientHandler handler = null) : this(client, (string)null, handler)
        {
        }

        public MediaApi(HttpClient client, string basePath, HttpClientHandler handler = null)
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

        public MediaApi(HttpClient client, LowdownLabs.Fever.Client.Configuration configuration, HttpClientHandler handler = null)
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

        public MediaApi(LowdownLabs.Fever.Client.ISynchronousClient client, LowdownLabs.Fever.Client.IAsynchronousClient asyncClient, LowdownLabs.Fever.Client.IReadableConfiguration configuration)
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

        public Object GetMediaBytes(int blobId, int? maxDim = default, int? waveform = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<Object> localVarResponse = GetMediaBytesWithHttpInfo(blobId, maxDim, waveform);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<Object> GetMediaBytesWithHttpInfo(int blobId, int? maxDim = default, int? waveform = default)
        {
            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json",
                "image/jpeg",
                "image/png"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (maxDim != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "max_dim", maxDim));
            }
            if (waveform != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "waveform", waveform));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Get<Object>("/v1/media/{blob_id}/bytes", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetMediaBytes", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<Object> GetMediaBytesAsync(int blobId, int? maxDim = default, int? waveform = default, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<Object> localVarResponse = await GetMediaBytesWithHttpInfoAsync(blobId, maxDim, waveform, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<Object>> GetMediaBytesWithHttpInfoAsync(int blobId, int? maxDim = default, int? waveform = default, System.Threading.CancellationToken cancellationToken = default)
        {

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json",
                "image/jpeg",
                "image/png"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (maxDim != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "max_dim", maxDim));
            }
            if (waveform != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "waveform", waveform));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.GetAsync<Object>("/v1/media/{blob_id}/bytes", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetMediaBytes", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public MediaInfo GetMediaInfo(int blobId, string? customerId = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<MediaInfo> localVarResponse = GetMediaInfoWithHttpInfo(blobId, customerId);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<MediaInfo> GetMediaInfoWithHttpInfo(int blobId, string? customerId = default)
        {
            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (customerId != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "customer_id", customerId));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Get<MediaInfo>("/v1/media/{blob_id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetMediaInfo", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<MediaInfo> GetMediaInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<MediaInfo> localVarResponse = await GetMediaInfoWithHttpInfoAsync(blobId, customerId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<MediaInfo>> GetMediaInfoWithHttpInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default)
        {

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (customerId != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "customer_id", customerId));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.GetAsync<MediaInfo>("/v1/media/{blob_id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetMediaInfo", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public MediaFormats ListMediaFormats()
        {
            LowdownLabs.Fever.Client.ApiResponse<MediaFormats> localVarResponse = ListMediaFormatsWithHttpInfo();
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<MediaFormats> ListMediaFormatsWithHttpInfo()
        {
            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Get<MediaFormats>("/v1/media/formats", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ListMediaFormats", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<MediaFormats> ListMediaFormatsAsync(System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<MediaFormats> localVarResponse = await ListMediaFormatsWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<MediaFormats>> ListMediaFormatsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default)
        {

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.GetAsync<MediaFormats>("/v1/media/formats", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ListMediaFormats", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public List<MediaFrame> ListMediaFrames(int blobId, string? customerId = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<List<MediaFrame>> localVarResponse = ListMediaFramesWithHttpInfo(blobId, customerId);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<List<MediaFrame>> ListMediaFramesWithHttpInfo(int blobId, string? customerId = default)
        {
            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (customerId != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "customer_id", customerId));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Get<List<MediaFrame>>("/v1/media/{blob_id}/frames", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ListMediaFrames", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<List<MediaFrame>> ListMediaFramesAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<List<MediaFrame>> localVarResponse = await ListMediaFramesWithHttpInfoAsync(blobId, customerId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<List<MediaFrame>>> ListMediaFramesWithHttpInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default)
        {

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (customerId != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "customer_id", customerId));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.GetAsync<List<MediaFrame>>("/v1/media/{blob_id}/frames", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ListMediaFrames", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public List<TranscriptSegment> ListMediaTranscript(int blobId, string? customerId = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<List<TranscriptSegment>> localVarResponse = ListMediaTranscriptWithHttpInfo(blobId, customerId);
            return localVarResponse.Data;
        }

        public LowdownLabs.Fever.Client.ApiResponse<List<TranscriptSegment>> ListMediaTranscriptWithHttpInfo(int blobId, string? customerId = default)
        {
            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (customerId != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "customer_id", customerId));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = this.Client.Get<List<TranscriptSegment>>("/v1/media/{blob_id}/transcript", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ListMediaTranscript", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        public async System.Threading.Tasks.Task<List<TranscriptSegment>> ListMediaTranscriptAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default)
        {
            LowdownLabs.Fever.Client.ApiResponse<List<TranscriptSegment>> localVarResponse = await ListMediaTranscriptWithHttpInfoAsync(blobId, customerId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        public async System.Threading.Tasks.Task<LowdownLabs.Fever.Client.ApiResponse<List<TranscriptSegment>>> ListMediaTranscriptWithHttpInfoAsync(int blobId, string? customerId = default, System.Threading.CancellationToken cancellationToken = default)
        {

            LowdownLabs.Fever.Client.RequestOptions localVarRequestOptions = new LowdownLabs.Fever.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = LowdownLabs.Fever.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("blob_id", LowdownLabs.Fever.Client.ClientUtils.ParameterToString(blobId));
            if (customerId != null)
            {
                localVarRequestOptions.QueryParameters.Add(LowdownLabs.Fever.Client.ClientUtils.ParameterToMultiMap("", "customer_id", customerId));
            }

            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            var localVarResponse = await this.AsynchronousClient.GetAsync<List<TranscriptSegment>>("/v1/media/{blob_id}/transcript", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ListMediaTranscript", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
