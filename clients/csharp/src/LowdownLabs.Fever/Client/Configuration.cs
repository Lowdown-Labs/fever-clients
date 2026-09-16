using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Reflection;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Net.Http;
using System.Net.Security;

namespace LowdownLabs.Fever.Client
{
    public class Configuration : IReadableConfiguration
    {
        #region Constants

        public const string Version = "0.3.2";

        public const string ISO8601_DATETIME_FORMAT = "o";

        #endregion Constants

        #region Static Members

        public static readonly ExceptionFactory DefaultExceptionFactory = (methodName, response) =>
        {
            var status = (int)response.StatusCode;
            if (status >= 400)
            {
                return new ApiException(status,
                    string.Format("Error calling {0}: {1}", methodName, response.RawContent),
                    response.RawContent, response.Headers);
            }
            if (status == 0)
            {
                return new ApiException(status,
                    string.Format("Error calling {0}: {1}", methodName, response.ErrorText), response.ErrorText);
            }
            return null;
        };

        #endregion Static Members

        #region Private Members

        private string _basePath;

        private bool _useDefaultCredentials = false;

        private IDictionary<string, string> _apiKey;

        private IDictionary<string, string> _apiKeyPrefix;

        private string _dateTimeFormat = ISO8601_DATETIME_FORMAT;
        private string _tempFolderPath = Path.GetTempPath();

        private IList<IReadOnlyDictionary<string, object>> _servers;

        private IReadOnlyDictionary<string, List<IReadOnlyDictionary<string, object>>> _operationServers;

        #endregion Private Members

        #region Constructors

        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("ReSharper", "VirtualMemberCallInConstructor")]
        public Configuration()
        {
            Proxy = null;
            UserAgent = WebUtility.UrlEncode("OpenAPI-Generator/0.3.2/csharp");
            BasePath = "http://localhost";
            DefaultHeaders = new ConcurrentDictionary<string, string>();
            ApiKey = new ConcurrentDictionary<string, string>();
            ApiKeyPrefix = new ConcurrentDictionary<string, string>();
            Servers = new List<IReadOnlyDictionary<string, object>>()
            {
                {
                    new Dictionary<string, object> {
                        {"url", ""},
                        {"description", "No description provided"},
                    }
                }
            };
            OperationServers = new Dictionary<string, List<IReadOnlyDictionary<string, object>>>()
            {
            };

            Timeout = TimeSpan.FromSeconds(100);
        }

        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("ReSharper", "VirtualMemberCallInConstructor")]
        public Configuration(
            IDictionary<string, string> defaultHeaders,
            IDictionary<string, string> apiKey,
            IDictionary<string, string> apiKeyPrefix,
            string basePath = "http://localhost") : this()
        {
            if (string.IsNullOrWhiteSpace(basePath))
                throw new ArgumentException("The provided basePath is invalid.", "basePath");
            if (defaultHeaders == null)
                throw new ArgumentNullException("defaultHeaders");
            if (apiKey == null)
                throw new ArgumentNullException("apiKey");
            if (apiKeyPrefix == null)
                throw new ArgumentNullException("apiKeyPrefix");

            BasePath = basePath;

            foreach (var keyValuePair in defaultHeaders)
            {
                DefaultHeaders.Add(keyValuePair);
            }

            foreach (var keyValuePair in apiKey)
            {
                ApiKey.Add(keyValuePair);
            }

            foreach (var keyValuePair in apiKeyPrefix)
            {
                ApiKeyPrefix.Add(keyValuePair);
            }
        }

        #endregion Constructors

        #region Properties

        public virtual string BasePath
        {
            get { return _basePath; }
            set { _basePath = value; }
        }

        public virtual bool UseDefaultCredentials
        {
            get { return _useDefaultCredentials; }
            set { _useDefaultCredentials = value; }
        }

        [Obsolete("Use DefaultHeaders instead.")]
        public virtual IDictionary<string, string> DefaultHeader
        {
            get
            {
                return DefaultHeaders;
            }
            set
            {
                DefaultHeaders = value;
            }
        }

        public virtual IDictionary<string, string> DefaultHeaders { get; set; }

        public virtual TimeSpan Timeout { get; set; }

        public virtual WebProxy Proxy { get; set; }

        public virtual string UserAgent { get; set; }

        public virtual string Username { get; set; }

        public virtual string Password { get; set; }

        public string GetApiKeyWithPrefix(string apiKeyIdentifier)
        {
            string apiKeyValue;
            ApiKey.TryGetValue(apiKeyIdentifier, out apiKeyValue);
            string apiKeyPrefix;
            if (ApiKeyPrefix.TryGetValue(apiKeyIdentifier, out apiKeyPrefix))
            {
                return apiKeyPrefix + " " + apiKeyValue;
            }

            return apiKeyValue;
        }

        public X509CertificateCollection ClientCertificates { get; set; }

        public virtual string AccessToken { get; set; }

        public virtual string TempFolderPath
        {
            get { return _tempFolderPath; }

            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    _tempFolderPath = Path.GetTempPath();
                    return;
                }

                if (!Directory.Exists(value))
                {
                    Directory.CreateDirectory(value);
                }

                if (value[value.Length - 1] == Path.DirectorySeparatorChar)
                {
                    _tempFolderPath = value;
                }
                else
                {
                    _tempFolderPath = value + Path.DirectorySeparatorChar;
                }
            }
        }

        public virtual string DateTimeFormat
        {
            get { return _dateTimeFormat; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    _dateTimeFormat = ISO8601_DATETIME_FORMAT;
                    return;
                }

                _dateTimeFormat = value;
            }
        }

        public virtual IDictionary<string, string> ApiKeyPrefix
        {
            get { return _apiKeyPrefix; }
            set
            {
                if (value == null)
                {
                    throw new InvalidOperationException("ApiKeyPrefix collection may not be null.");
                }
                _apiKeyPrefix = value;
            }
        }

        public virtual IDictionary<string, string> ApiKey
        {
            get { return _apiKey; }
            set
            {
                if (value == null)
                {
                    throw new InvalidOperationException("ApiKey collection may not be null.");
                }
                _apiKey = value;
            }
        }

        public virtual IList<IReadOnlyDictionary<string, object>> Servers
        {
            get { return _servers; }
            set
            {
                if (value == null)
                {
                    throw new InvalidOperationException("Servers may not be null.");
                }
                _servers = value;
            }
        }

        public virtual IReadOnlyDictionary<string, List<IReadOnlyDictionary<string, object>>> OperationServers
        {
            get { return _operationServers; }
            set
            {
                if (value == null)
                {
                    throw new InvalidOperationException("Operation servers may not be null.");
                }
                _operationServers = value;
            }
        }

        public string GetServerUrl(int index)
        {
            return GetServerUrl(Servers, index, null);
        }

        public string GetServerUrl(int index, Dictionary<string, string> inputVariables)
        {
            return GetServerUrl(Servers, index, inputVariables);
        }

        public string GetOperationServerUrl(string operation, int index)
        {
            return GetOperationServerUrl(operation, index, null);
        }

        public string GetOperationServerUrl(string operation, int index, Dictionary<string, string> inputVariables)
        {
            if (operation != null && OperationServers.TryGetValue(operation, out var operationServer))
            {
                return GetServerUrl(operationServer, index, inputVariables);
            }

            return null;
        }

        private string GetServerUrl(IList<IReadOnlyDictionary<string, object>> servers, int index, Dictionary<string, string> inputVariables)
        {
            if (index < 0 || index >= servers.Count)
            {
                throw new InvalidOperationException($"Invalid index {index} when selecting the server. Must be less than {servers.Count}.");
            }

            if (inputVariables == null)
            {
                inputVariables = new Dictionary<string, string>();
            }

            IReadOnlyDictionary<string, object> server = servers[index];
            string url = (string)server["url"];

            if (server.ContainsKey("variables"))
            {
                foreach (KeyValuePair<string, object> variable in (IReadOnlyDictionary<string, object>)server["variables"])
                {

                    IReadOnlyDictionary<string, object> serverVariables = (IReadOnlyDictionary<string, object>)(variable.Value);

                    if (inputVariables.ContainsKey(variable.Key))
                    {
                        if (!serverVariables.ContainsKey("enum_values") || ((List<string>)serverVariables["enum_values"]).Contains(inputVariables[variable.Key]))
                        {
                            url = url.Replace("{" + variable.Key + "}", inputVariables[variable.Key]);
                        }
                        else
                        {
                            throw new InvalidOperationException($"The variable `{variable.Key}` in the server URL has invalid value #{inputVariables[variable.Key]}. Must be {(List<string>)serverVariables["enum_values"]}");
                        }
                    }
                    else
                    {
                        url = url.Replace("{" + variable.Key + "}", (string)serverVariables["default_value"]);
                    }
                }
            }

            return url;
        }

        public RemoteCertificateValidationCallback RemoteCertificateValidationCallback { get; set; }

        #endregion Properties

        #region Methods

        public static string ToDebugReport()
        {
            string report = "C# SDK (LowdownLabs.Fever) Debug Report:\n";
            report += "    OS: " + System.Environment.OSVersion + "\n";
            report += "    .NET Framework Version: " + System.Environment.Version  + "\n";
            report += "    Version of the API: 0.3.0\n";
            report += "    SDK Package Version: 0.3.2\n";

            return report;
        }

        public void AddApiKey(string key, string value)
        {
            ApiKey[key] = value;
        }

        public void AddApiKeyPrefix(string key, string value)
        {
            ApiKeyPrefix[key] = value;
        }

        #endregion Methods

        #region Static Members
        public static IReadableConfiguration MergeConfigurations(IReadableConfiguration first, IReadableConfiguration second)
        {
            if (second == null) return first ?? GlobalConfiguration.Instance;

            Dictionary<string, string> apiKey = first.ApiKey.ToDictionary(kvp => kvp.Key, kvp => kvp.Value);
            Dictionary<string, string> apiKeyPrefix = first.ApiKeyPrefix.ToDictionary(kvp => kvp.Key, kvp => kvp.Value);
            Dictionary<string, string> defaultHeaders = first.DefaultHeaders.ToDictionary(kvp => kvp.Key, kvp => kvp.Value);

            foreach (var kvp in second.ApiKey) apiKey[kvp.Key] = kvp.Value;
            foreach (var kvp in second.ApiKeyPrefix) apiKeyPrefix[kvp.Key] = kvp.Value;
            foreach (var kvp in second.DefaultHeaders) defaultHeaders[kvp.Key] = kvp.Value;

            var config = new Configuration
            {
                ApiKey = apiKey,
                ApiKeyPrefix = apiKeyPrefix,
                DefaultHeaders = defaultHeaders,
                BasePath = second.BasePath ?? first.BasePath,
                Timeout = second.Timeout,
                Proxy = second.Proxy ?? first.Proxy,
                UserAgent = second.UserAgent ?? first.UserAgent,
                Username = second.Username ?? first.Username,
                Password = second.Password ?? first.Password,
                AccessToken = second.AccessToken ?? first.AccessToken,
                TempFolderPath = second.TempFolderPath ?? first.TempFolderPath,
                DateTimeFormat = second.DateTimeFormat ?? first.DateTimeFormat,
                ClientCertificates = second.ClientCertificates ?? first.ClientCertificates,
                UseDefaultCredentials = second.UseDefaultCredentials,
                RemoteCertificateValidationCallback = second.RemoteCertificateValidationCallback ?? first.RemoteCertificateValidationCallback,
            };
            return config;
        }
        #endregion Static Members
    }
}
