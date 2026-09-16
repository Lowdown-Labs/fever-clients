using Polly;
using System.Net.Http;

namespace LowdownLabs.Fever.Client
{
    public static class RetryConfiguration
    {
        public static ISyncPolicy<HttpResponseMessage> RetryPolicy { get; set; }

        public static IAsyncPolicy<HttpResponseMessage> AsyncRetryPolicy { get; set; }
    }
}
