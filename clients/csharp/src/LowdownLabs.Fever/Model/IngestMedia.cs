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
    [DataContract(Name = "IngestMedia")]
    public partial class IngestMedia : IValidatableObject
    {
        public IngestMedia(string caption = default, string customerId = default, string data = default, Dictionary<string, Object> metadata = default, bool stripExif = false, List<string> tags = default, string url = default)
        {
            this.Caption = caption;
            this.CustomerId = customerId;
            this.Data = data;
            this.Metadata = metadata;
            this.StripExif = stripExif;
            this.Tags = tags;
            this.Url = url;
        }

        [DataMember(Name = "caption", EmitDefaultValue = true)]
        public string Caption { get; set; }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "data", EmitDefaultValue = true)]
        public string Data { get; set; }

        [DataMember(Name = "metadata", EmitDefaultValue = true)]
        public Dictionary<string, Object> Metadata { get; set; }

        [DataMember(Name = "strip_exif", EmitDefaultValue = true)]
        public bool StripExif { get; set; }

        [DataMember(Name = "tags", EmitDefaultValue = true)]
        public List<string> Tags { get; set; }

        [DataMember(Name = "url", EmitDefaultValue = true)]
        public string Url { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IngestMedia {\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  StripExif: ").Append(StripExif).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
