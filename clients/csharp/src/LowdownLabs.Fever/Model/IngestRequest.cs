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
    [DataContract(Name = "IngestRequest")]
    public partial class IngestRequest : IValidatableObject
    {
        public IngestRequest(List<IngestMedia> media = default, bool overwrite = false, IngestSource source = default, int? targetRes = default)
        {
            this.Media = media;
            this.Overwrite = overwrite;
            this.Source = source;
            this.TargetRes = targetRes;
        }

        [DataMember(Name = "media", EmitDefaultValue = true)]
        public List<IngestMedia> Media { get; set; }

        [DataMember(Name = "overwrite", EmitDefaultValue = true)]
        public bool Overwrite { get; set; }

        [DataMember(Name = "source", EmitDefaultValue = true)]
        public IngestSource Source { get; set; }

        [DataMember(Name = "target_res", EmitDefaultValue = true)]
        public int? TargetRes { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IngestRequest {\n");
            sb.Append("  Media: ").Append(Media).Append("\n");
            sb.Append("  Overwrite: ").Append(Overwrite).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
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
