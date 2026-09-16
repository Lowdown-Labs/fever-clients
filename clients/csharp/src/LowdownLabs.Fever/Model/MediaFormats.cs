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
    [DataContract(Name = "MediaFormats")]
    public partial class MediaFormats : IValidatableObject
    {
        [JsonConstructorAttribute]
        protected MediaFormats() { }
        public MediaFormats(List<string> audio = default, List<string> document = default, List<string> image = default, List<string> video = default)
        {
            if (audio == null)
            {
                throw new ArgumentNullException("audio is a required property for MediaFormats and cannot be null");
            }
            this.Audio = audio;
            if (document == null)
            {
                throw new ArgumentNullException("document is a required property for MediaFormats and cannot be null");
            }
            this.Document = document;
            if (image == null)
            {
                throw new ArgumentNullException("image is a required property for MediaFormats and cannot be null");
            }
            this.Image = image;
            if (video == null)
            {
                throw new ArgumentNullException("video is a required property for MediaFormats and cannot be null");
            }
            this.Video = video;
        }

        [DataMember(Name = "audio", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Audio { get; set; }

        [DataMember(Name = "document", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Document { get; set; }

        [DataMember(Name = "image", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Image { get; set; }

        [DataMember(Name = "video", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Video { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MediaFormats {\n");
            sb.Append("  Audio: ").Append(Audio).Append("\n");
            sb.Append("  Document: ").Append(Document).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
            sb.Append("  Video: ").Append(Video).Append("\n");
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
