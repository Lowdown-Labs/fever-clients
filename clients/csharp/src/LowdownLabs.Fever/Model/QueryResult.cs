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
    [DataContract(Name = "QueryResult")]
    public partial class QueryResult : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected QueryResult() { }
        public QueryResult(List<string> columns = default, List<List<Object>> rows = default, bool truncated = default)
        {
            if (columns == null)
            {
                throw new ArgumentNullException("columns is a required property for QueryResult and cannot be null");
            }
            this.Columns = columns;
            if (rows == null)
            {
                throw new ArgumentNullException("rows is a required property for QueryResult and cannot be null");
            }
            this.Rows = rows;
            this.Truncated = truncated;
        }

        [DataMember(Name = "columns", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Columns { get; set; }

        [DataMember(Name = "rows", IsRequired = true, EmitDefaultValue = true)]
        public List<List<Object>> Rows { get; set; }

        [DataMember(Name = "truncated", IsRequired = true, EmitDefaultValue = true)]
        public bool Truncated { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class QueryResult {\n");
            sb.Append("  Columns: ").Append(Columns).Append("\n");
            sb.Append("  Rows: ").Append(Rows).Append("\n");
            sb.Append("  Truncated: ").Append(Truncated).Append("\n");
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
