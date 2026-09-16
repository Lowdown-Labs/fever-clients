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

namespace LowdownLabs.Fever.Model
{
    [DataContract(Name = "ExportRequest")]
    public partial class ExportRequest : IValidatableObject
    {
        [JsonConverter(typeof(StringEnumConverter))]
        public enum FormatEnum
        {
            [EnumMember(Value = "ndjson")]
            Ndjson = 1,

            [EnumMember(Value = "parquet")]
            Parquet = 2
        }

        [DataMember(Name = "format", EmitDefaultValue = false)]
        public FormatEnum? Format { get; set; }
        [JsonConverter(typeof(StringEnumConverter))]
        public enum KindEnum
        {
            [EnumMember(Value = "image")]
            Image = 1,

            [EnumMember(Value = "video")]
            Video = 2,

            [EnumMember(Value = "audio")]
            Audio = 3,

            [EnumMember(Value = "pdf")]
            Pdf = 4,

            [EnumMember(Value = "doc")]
            Doc = 5,

            [EnumMember(Value = "note")]
            Note = 6
        }

        [DataMember(Name = "kind", EmitDefaultValue = true)]
        public KindEnum? Kind { get; set; }
        [JsonConstructorAttribute]
        protected ExportRequest() { }
        public ExportRequest(string customerId = default, FormatEnum? format = FormatEnum.Ndjson, KindEnum? kind = default, string s3Uri = default, string tag = default)
        {
            if (s3Uri == null)
            {
                throw new ArgumentNullException("s3Uri is a required property for ExportRequest and cannot be null");
            }
            this.S3Uri = s3Uri;
            this.CustomerId = customerId;
            this.Format = format;
            this.Kind = kind;
            this.Tag = tag;
        }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "s3_uri", IsRequired = true, EmitDefaultValue = true)]
        public string S3Uri { get; set; }

        [DataMember(Name = "tag", EmitDefaultValue = true)]
        public string Tag { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ExportRequest {\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  S3Uri: ").Append(S3Uri).Append("\n");
            sb.Append("  Tag: ").Append(Tag).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
