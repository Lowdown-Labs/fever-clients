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
    [DataContract(Name = "ExportResult")]
    public partial class ExportResult : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected ExportResult() { }
        public ExportResult(int exported = default, string s3Uri = default)
        {
            this.Exported = exported;
            if (s3Uri == null)
            {
                throw new ArgumentNullException("s3Uri is a required property for ExportResult and cannot be null");
            }
            this.S3Uri = s3Uri;
        }

        [DataMember(Name = "exported", IsRequired = true, EmitDefaultValue = true)]
        public int Exported { get; set; }

        [DataMember(Name = "s3_uri", IsRequired = true, EmitDefaultValue = true)]
        public string S3Uri { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ExportResult {\n");
            sb.Append("  Exported: ").Append(Exported).Append("\n");
            sb.Append("  S3Uri: ").Append(S3Uri).Append("\n");
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
