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
    [DataContract(Name = "DuplicatesResponse")]
    public partial class DuplicatesResponse : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected DuplicatesResponse() { }
        public DuplicatesResponse(int clusters = default, List<DuplicateCluster> duplicateClusters = default, int totalDuplicates = default)
        {
            this.Clusters = clusters;
            this.TotalDuplicates = totalDuplicates;
            this.DuplicateClusters = duplicateClusters;
        }

        [DataMember(Name = "clusters", IsRequired = true, EmitDefaultValue = true)]
        public int Clusters { get; set; }

        [DataMember(Name = "duplicate_clusters", EmitDefaultValue = false)]
        public List<DuplicateCluster> DuplicateClusters { get; set; }

        [DataMember(Name = "total_duplicates", IsRequired = true, EmitDefaultValue = true)]
        public int TotalDuplicates { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DuplicatesResponse {\n");
            sb.Append("  Clusters: ").Append(Clusters).Append("\n");
            sb.Append("  DuplicateClusters: ").Append(DuplicateClusters).Append("\n");
            sb.Append("  TotalDuplicates: ").Append(TotalDuplicates).Append("\n");
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
