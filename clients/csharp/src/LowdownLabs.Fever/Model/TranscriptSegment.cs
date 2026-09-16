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
    [DataContract(Name = "TranscriptSegment")]
    public partial class TranscriptSegment : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected TranscriptSegment() { }
        public TranscriptSegment(int? endMs = default, int seq = default, int? startMs = default, string text = default)
        {
            if (endMs == null)
            {
                throw new ArgumentNullException("endMs is a required property for TranscriptSegment and cannot be null");
            }
            this.EndMs = endMs;
            this.Seq = seq;
            if (startMs == null)
            {
                throw new ArgumentNullException("startMs is a required property for TranscriptSegment and cannot be null");
            }
            this.StartMs = startMs;
            if (text == null)
            {
                throw new ArgumentNullException("text is a required property for TranscriptSegment and cannot be null");
            }
            this.Text = text;
        }

        [DataMember(Name = "end_ms", IsRequired = true, EmitDefaultValue = true)]
        public int? EndMs { get; set; }

        [DataMember(Name = "seq", IsRequired = true, EmitDefaultValue = true)]
        public int Seq { get; set; }

        [DataMember(Name = "start_ms", IsRequired = true, EmitDefaultValue = true)]
        public int? StartMs { get; set; }

        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = true)]
        public string Text { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TranscriptSegment {\n");
            sb.Append("  EndMs: ").Append(EndMs).Append("\n");
            sb.Append("  Seq: ").Append(Seq).Append("\n");
            sb.Append("  StartMs: ").Append(StartMs).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
