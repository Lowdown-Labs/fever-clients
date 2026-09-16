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
    [DataContract(Name = "CorpusStats")]
    public partial class CorpusStats : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected CorpusStats() { }
        public CorpusStats(Dictionary<string, int> kinds = default, List<CorpusTag> topTags = default)
        {
            if (kinds == null)
            {
                throw new ArgumentNullException("kinds is a required property for CorpusStats and cannot be null");
            }
            this.Kinds = kinds;
            if (topTags == null)
            {
                throw new ArgumentNullException("topTags is a required property for CorpusStats and cannot be null");
            }
            this.TopTags = topTags;
        }

        [DataMember(Name = "kinds", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, int> Kinds { get; set; }

        [DataMember(Name = "top_tags", IsRequired = true, EmitDefaultValue = true)]
        public List<CorpusTag> TopTags { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CorpusStats {\n");
            sb.Append("  Kinds: ").Append(Kinds).Append("\n");
            sb.Append("  TopTags: ").Append(TopTags).Append("\n");
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
