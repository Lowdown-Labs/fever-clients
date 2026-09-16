using System;
using System.Collections.Generic;
using System.IO;
using System.Net;

namespace LowdownLabs.Fever.Client
{
    public class RequestOptions
    {
        public Dictionary<string, string> PathParameters { get; set; }

        public Multimap<string, string> QueryParameters { get; set; }

        public Multimap<string, string> HeaderParameters { get; set; }

        public Dictionary<string, string> FormParameters { get; set; }

        public Multimap<string, FileParameter> FileParameters { get; set; }

        public List<Cookie> Cookies { get; set; }

        public Object Data { get; set; }

        public RequestOptions()
        {
            PathParameters = new Dictionary<string, string>();
            QueryParameters = new Multimap<string, string>();
            HeaderParameters = new Multimap<string, string>();
            FormParameters = new Dictionary<string, string>();
            FileParameters = new Multimap<string, FileParameter>();
            Cookies = new List<Cookie>();
        }
    }
}
