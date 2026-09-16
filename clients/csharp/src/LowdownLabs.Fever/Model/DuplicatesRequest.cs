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
    [DataContract(Name = "DuplicatesRequest")]
    public partial class DuplicatesRequest : IValidatableObject
    {
        public DuplicatesRequest(string customerId = default, List<string> customerIds = default, int limit = 500, decimal threshold = 0.92M)
        {
            this.CustomerId = customerId;
            this.CustomerIds = customerIds;
            this.Limit = limit;
            this.Threshold = threshold;
        }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "customer_ids", EmitDefaultValue = true)]
        public List<string> CustomerIds { get; set; }

        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        [DataMember(Name = "threshold", EmitDefaultValue = false)]
        public decimal Threshold { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DuplicatesRequest {\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  CustomerIds: ").Append(CustomerIds).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Threshold: ").Append(Threshold).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            if (this.Limit > (int)5000)
            {
                yield return new ValidationResult("Invalid value for Limit, must be a value less than or equal to 5000.", new [] { "Limit" });
            }

            if (this.Limit < (int)1)
            {
                yield return new ValidationResult("Invalid value for Limit, must be a value greater than or equal to 1.", new [] { "Limit" });
            }

            if (this.Threshold > (decimal)1.0)
            {
                yield return new ValidationResult("Invalid value for Threshold, must be a value less than or equal to 1.0.", new [] { "Threshold" });
            }

            if (this.Threshold < (decimal)0.0)
            {
                yield return new ValidationResult("Invalid value for Threshold, must be a value greater than or equal to 0.0.", new [] { "Threshold" });
            }

            yield break;
        }
    }

}
