using System;
using System.Collections.Generic;
using System.Net;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;

namespace LowdownLabs.Fever.Client
{
    public interface IReadableConfiguration
    {
        string AccessToken { get; }

        IDictionary<string, string> ApiKey { get; }

        IDictionary<string, string> ApiKeyPrefix { get; }

        string BasePath { get; }

        string DateTimeFormat { get; }

        [Obsolete("Use DefaultHeaders instead.")]
        IDictionary<string, string> DefaultHeader { get; }

        IDictionary<string, string> DefaultHeaders { get; }

        string TempFolderPath { get; }

        TimeSpan Timeout { get; }

        WebProxy Proxy { get; }

        string UserAgent { get; }

        string Username { get; }

        string Password { get; }

        bool UseDefaultCredentials { get; }

        IReadOnlyDictionary<string, List<IReadOnlyDictionary<string, object>>> OperationServers { get; }

        string GetApiKeyWithPrefix(string apiKeyIdentifier);

        string GetOperationServerUrl(string operation, int index);

        X509CertificateCollection ClientCertificates { get; }

        RemoteCertificateValidationCallback RemoteCertificateValidationCallback { get; }
    }
}
