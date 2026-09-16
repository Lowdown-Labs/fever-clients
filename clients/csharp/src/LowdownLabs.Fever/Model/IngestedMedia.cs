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
    [DataContract(Name = "IngestedMedia")]
    public partial class IngestedMedia : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected IngestedMedia() { }
        public IngestedMedia(int blobId = default, string externalRef = default)
        {
            this.BlobId = blobId;
            this.ExternalRef = externalRef;
        }

        [DataMember(Name = "blob_id", IsRequired = true, EmitDefaultValue = true)]
        public int BlobId { get; set; }

        [DataMember(Name = "external_ref", EmitDefaultValue = true)]
        public string ExternalRef { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IngestedMedia {\n");
            sb.Append("  BlobId: ").Append(BlobId).Append("\n");
            sb.Append("  ExternalRef: ").Append(ExternalRef).Append("\n");
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
