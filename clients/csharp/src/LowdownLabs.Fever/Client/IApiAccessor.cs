using System;

namespace LowdownLabs.Fever.Client
{
    public interface IApiAccessor
    {
        IReadableConfiguration Configuration { get; set; }

        string GetBasePath();

        ExceptionFactory ExceptionFactory { get; set; }
    }
}
