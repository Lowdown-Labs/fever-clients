using Newtonsoft.Json.Converters;

namespace LowdownLabs.Fever.Client
{
    public class OpenAPIDateConverter : IsoDateTimeConverter
    {
        public OpenAPIDateConverter()
        {
            DateTimeFormat = "yyyy-MM-dd";
        }
    }
}
