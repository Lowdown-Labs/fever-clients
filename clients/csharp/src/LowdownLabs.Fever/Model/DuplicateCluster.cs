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
    [DataContract(Name = "DuplicateCluster")]
    public partial class DuplicateCluster : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected DuplicateCluster() { }
        public DuplicateCluster(List<string> memberCustomers = default, List<int> members = default, int size = default, decimal tightness = default)
        {
            if (members == null)
            {
                throw new ArgumentNullException("members is a required property for DuplicateCluster and cannot be null");
            }
            this.Members = members;
            this.Size = size;
            this.Tightness = tightness;
            this.MemberCustomers = memberCustomers;
        }

        [DataMember(Name = "member_customers", EmitDefaultValue = false)]
        public List<string> MemberCustomers { get; set; }

        [DataMember(Name = "members", IsRequired = true, EmitDefaultValue = true)]
        public List<int> Members { get; set; }

        [DataMember(Name = "size", IsRequired = true, EmitDefaultValue = true)]
        public int Size { get; set; }

        [DataMember(Name = "tightness", IsRequired = true, EmitDefaultValue = true)]
        public decimal Tightness { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DuplicateCluster {\n");
            sb.Append("  MemberCustomers: ").Append(MemberCustomers).Append("\n");
            sb.Append("  Members: ").Append(Members).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  Tightness: ").Append(Tightness).Append("\n");
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
