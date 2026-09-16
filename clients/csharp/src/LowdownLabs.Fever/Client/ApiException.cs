using System;

namespace LowdownLabs.Fever.Client
{
    public class ApiException : Exception
    {
        public int ErrorCode { get; set; }

        public object ErrorContent { get; private set; }

        public Multimap<string, string> Headers { get; private set; }

        public ApiException() { }

        public ApiException(int errorCode, string message) : base(message)
        {
            this.ErrorCode = errorCode;
        }

        public ApiException(int errorCode, string message, object errorContent = null, Multimap<string, string> headers = null) : base(message)
        {
            this.ErrorCode = errorCode;
            this.ErrorContent = errorContent;
            this.Headers = headers;
        }
    }

}
