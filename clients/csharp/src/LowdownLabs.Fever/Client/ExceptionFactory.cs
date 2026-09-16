using System;

namespace LowdownLabs.Fever.Client
{
    public delegate Exception ExceptionFactory(string methodName, IApiResponse response);
}
