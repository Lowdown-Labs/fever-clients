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
    [DataContract(Name = "IngestSource")]
    public partial class IngestSource : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected IngestSource() { }
        public IngestSource(string customerId = default, string s3Uri = default, int? targetRes = default)
        {
            if (s3Uri == null)
            {
                throw new ArgumentNullException("s3Uri is a required property for IngestSource and cannot be null");
            }
            this.S3Uri = s3Uri;
            this.CustomerId = customerId;
            this.TargetRes = targetRes;
        }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "s3_uri", IsRequired = true, EmitDefaultValue = true)]
        public string S3Uri { get; set; }

        [DataMember(Name = "target_res", EmitDefaultValue = true)]
        public int? TargetRes { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IngestSource {\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  S3Uri: ").Append(S3Uri).Append("\n");
            sb.Append("  TargetRes: ").Append(TargetRes).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            if (this.TargetRes > (int?)4096)
            {
                yield return new ValidationResult("Invalid value for TargetRes, must be a value less than or equal to 4096.", new [] { "TargetRes" });
            }

            if (this.TargetRes < (int?)64)
            {
                yield return new ValidationResult("Invalid value for TargetRes, must be a value greater than or equal to 64.", new [] { "TargetRes" });
            }

            yield break;
        }
    }

}
