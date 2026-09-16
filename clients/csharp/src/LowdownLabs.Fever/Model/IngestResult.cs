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
    [DataContract(Name = "IngestResult")]
    public partial class IngestResult : IValidatableObject
    {
        public IngestResult(List<IngestedMedia> existing = default, List<IngestedMedia> ingested = default, Job job = default)
        {
            this.Existing = existing;
            this.Ingested = ingested;
            this.Job = job;
        }

        [DataMember(Name = "existing", EmitDefaultValue = false)]
        public List<IngestedMedia> Existing { get; set; }

        [DataMember(Name = "ingested", EmitDefaultValue = false)]
        public List<IngestedMedia> Ingested { get; set; }

        [DataMember(Name = "job", EmitDefaultValue = true)]
        public Job Job { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IngestResult {\n");
            sb.Append("  Existing: ").Append(Existing).Append("\n");
            sb.Append("  Ingested: ").Append(Ingested).Append("\n");
            sb.Append("  Job: ").Append(Job).Append("\n");
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
