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
    [DataContract(Name = "QueryRequest")]
    public partial class QueryRequest : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected QueryRequest() { }
        public QueryRequest(int rowLimit = 200, string sql = default)
        {
            if (sql == null)
            {
                throw new ArgumentNullException("sql is a required property for QueryRequest and cannot be null");
            }
            this.Sql = sql;
            this.RowLimit = rowLimit;
        }

        [DataMember(Name = "row_limit", EmitDefaultValue = false)]
        public int RowLimit { get; set; }

        [DataMember(Name = "sql", IsRequired = true, EmitDefaultValue = true)]
        public string Sql { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class QueryRequest {\n");
            sb.Append("  RowLimit: ").Append(RowLimit).Append("\n");
            sb.Append("  Sql: ").Append(Sql).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            if (this.RowLimit > (int)1000)
            {
                yield return new ValidationResult("Invalid value for RowLimit, must be a value less than or equal to 1000.", new [] { "RowLimit" });
            }

            if (this.RowLimit < (int)1)
            {
                yield return new ValidationResult("Invalid value for RowLimit, must be a value greater than or equal to 1.", new [] { "RowLimit" });
            }

            yield break;
        }
    }

}
