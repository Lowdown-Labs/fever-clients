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
    [DataContract(Name = "MediaFrame")]
    public partial class MediaFrame : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected MediaFrame() { }
        public MediaFrame(int frameNo = default, int tsMs = default)
        {
            this.FrameNo = frameNo;
            this.TsMs = tsMs;
        }

        [DataMember(Name = "frame_no", IsRequired = true, EmitDefaultValue = true)]
        public int FrameNo { get; set; }

        [DataMember(Name = "ts_ms", IsRequired = true, EmitDefaultValue = true)]
        public int TsMs { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MediaFrame {\n");
            sb.Append("  FrameNo: ").Append(FrameNo).Append("\n");
            sb.Append("  TsMs: ").Append(TsMs).Append("\n");
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
