using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using FileParameter = LowdownLabs.Fever.Client.FileParameter;
using OpenAPIDateConverter = LowdownLabs.Fever.Client.OpenAPIDateConverter;
using System.Reflection;

namespace LowdownLabs.Fever.Model
{
    [JsonConverter(typeof(LocationInnerJsonConverter))]
    [DataContract(Name = "Location_inner")]
    public partial class LocationInner : AbstractOpenAPISchema, IValidatableObject
    {
        public LocationInner(string actualInstance)
        {
            IsNullable = false;
            SchemaType= "anyOf";
            ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        public LocationInner(int actualInstance)
        {
            IsNullable = false;
            SchemaType= "anyOf";
            ActualInstance = actualInstance;
        }

        private Object _actualInstance;

        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(int))
                {
                    _actualInstance = value;
                }
                else if (value.GetType() == typeof(string))
                {
                    _actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: int, string");
                }
            }
        }

        public string GetString()
        {
            return (string)ActualInstance;
        }

        public int GetInt()
        {
            return (int)ActualInstance;
        }

        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LocationInner {\n");
            sb.Append("  ActualInstance: ").Append(ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        public override string ToJson()
        {
            return JsonConvert.SerializeObject(ActualInstance, LocationInner.SerializerSettings);
        }

        public static LocationInner FromJson(string jsonString)
        {
            LocationInner newLocationInner = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newLocationInner;
            }

            try
            {
                newLocationInner = new LocationInner(JsonConvert.DeserializeObject<int>(jsonString, LocationInner.SerializerSettings));
                return newLocationInner;
            }
            catch (Exception exception)
            {
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into int: {1}", jsonString, exception.ToString()));
            }

            try
            {
                newLocationInner = new LocationInner(JsonConvert.DeserializeObject<string>(jsonString, LocationInner.SerializerSettings));
                return newLocationInner;
            }
            catch (Exception exception)
            {
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into string: {1}", jsonString, exception.ToString()));
            }

            throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
        }

        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    public class LocationInnerJsonConverter : JsonConverter
    {
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(LocationInner).GetMethod("ToJson").Invoke(value, null)));
        }

        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            switch(reader.TokenType)
            {
                case JsonToken.String:
                    return new LocationInner(Convert.ToString(reader.Value));
                case JsonToken.Integer:
                    return new LocationInner(Convert.ToInt32(reader.Value));
                case JsonToken.StartObject:
                    return LocationInner.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return LocationInner.FromJson(JArray.Load(reader).ToString(Formatting.None));
                default:
                    return null;
            }
        }

        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
