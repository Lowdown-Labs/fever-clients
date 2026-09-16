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
    [DataContract(Name = "Job")]
    public partial class Job : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected Job() { }
        public Job(int done = 0, string error = default, int id = default, int skipped = 0, string status = default, int total = 0)
        {
            this.Id = id;
            if (status == null)
            {
                throw new ArgumentNullException("status is a required property for Job and cannot be null");
            }
            this.Status = status;
            this.Done = done;
            this.Error = error;
            this.Skipped = skipped;
            this.Total = total;
        }

        [DataMember(Name = "done", EmitDefaultValue = false)]
        public int Done { get; set; }

        [DataMember(Name = "error", EmitDefaultValue = true)]
        public string Error { get; set; }

        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        [DataMember(Name = "skipped", EmitDefaultValue = false)]
        public int Skipped { get; set; }

        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public string Status { get; set; }

        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Job {\n");
            sb.Append("  Done: ").Append(Done).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Skipped: ").Append(Skipped).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
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
