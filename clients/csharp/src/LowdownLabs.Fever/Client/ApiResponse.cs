using System;
using System.Collections.Generic;
using System.Net;

namespace LowdownLabs.Fever.Client
{
    public interface IApiResponse
    {
        Type ResponseType { get; }

        Object Content { get; }

        HttpStatusCode StatusCode { get; }

        Multimap<string, string> Headers { get; }

        string ErrorText { get; set; }

        List<Cookie> Cookies { get; set; }

        string RawContent { get; }
    }

    public class ApiResponse<T> : IApiResponse
    {
        #region Properties

        public HttpStatusCode StatusCode { get; }

        public Multimap<string, string> Headers { get; }

        public T Data { get; }

        public string ErrorText { get; set; }

        public List<Cookie> Cookies { get; set; }

        public Type ResponseType
        {
            get { return typeof(T); }
        }

        public object Content
        {
            get { return Data; }
        }

        public string RawContent { get; }

        #endregion Properties

        #region Constructors

        public ApiResponse(HttpStatusCode statusCode, Multimap<string, string> headers, T data, string rawContent)
        {
            StatusCode = statusCode;
            Headers = headers;
            Data = data;
            RawContent = rawContent;
        }

        public ApiResponse(HttpStatusCode statusCode, Multimap<string, string> headers, T data) : this(statusCode, headers, data, null)
        {
        }

        public ApiResponse(HttpStatusCode statusCode, T data, string rawContent) : this(statusCode, null, data, rawContent)
        {
        }

        public ApiResponse(HttpStatusCode statusCode, T data) : this(statusCode, data, null)
        {
        }

        #endregion Constructors
    }
}
