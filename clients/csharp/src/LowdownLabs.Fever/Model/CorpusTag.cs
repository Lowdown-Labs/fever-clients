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
    [DataContract(Name = "CorpusTag")]
    public partial class CorpusTag : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected CorpusTag() { }
        public CorpusTag(int count = default, string tag = default)
        {
            this.Count = count;
            if (tag == null)
            {
                throw new ArgumentNullException("tag is a required property for CorpusTag and cannot be null");
            }
            this.Tag = tag;
        }

        [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
        public int Count { get; set; }

        [DataMember(Name = "tag", IsRequired = true, EmitDefaultValue = true)]
        public string Tag { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CorpusTag {\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Tag: ").Append(Tag).Append("\n");
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
