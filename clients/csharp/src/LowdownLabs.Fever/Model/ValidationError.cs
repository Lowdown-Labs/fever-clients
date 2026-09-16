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
    [DataContract(Name = "ValidationError")]
    public partial class ValidationError : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected ValidationError() { }
        public ValidationError(Object ctx = default, Object input = default, List<LocationInner> loc = default, string msg = default, string type = default)
        {
            if (loc == null)
            {
                throw new ArgumentNullException("loc is a required property for ValidationError and cannot be null");
            }
            this.Loc = loc;
            if (msg == null)
            {
                throw new ArgumentNullException("msg is a required property for ValidationError and cannot be null");
            }
            this.Msg = msg;
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for ValidationError and cannot be null");
            }
            this.Type = type;
            this.Ctx = ctx;
            this.Input = input;
        }

        [DataMember(Name = "ctx", EmitDefaultValue = false)]
        public Object Ctx { get; set; }

        [DataMember(Name = "input", EmitDefaultValue = true)]
        public Object Input { get; set; }

        [DataMember(Name = "loc", IsRequired = true, EmitDefaultValue = true)]
        public List<LocationInner> Loc { get; set; }

        [DataMember(Name = "msg", IsRequired = true, EmitDefaultValue = true)]
        public string Msg { get; set; }

        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ValidationError {\n");
            sb.Append("  Ctx: ").Append(Ctx).Append("\n");
            sb.Append("  Input: ").Append(Input).Append("\n");
            sb.Append("  Loc: ").Append(Loc).Append("\n");
            sb.Append("  Msg: ").Append(Msg).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
