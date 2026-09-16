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
    [DataContract(Name = "SearchHit")]
    public partial class SearchHit : IValidatableObject
    {
        [JsonConverter(typeof(StringEnumConverter))]
        public enum KindEnum
        {
            [EnumMember(Value = "image")]
            Image = 1,

            [EnumMember(Value = "video")]
            Video = 2,

            [EnumMember(Value = "audio")]
            Audio = 3,

            [EnumMember(Value = "pdf")]
            Pdf = 4,

            [EnumMember(Value = "doc")]
            Doc = 5,

            [EnumMember(Value = "note")]
            Note = 6
        }

        [DataMember(Name = "kind", EmitDefaultValue = true)]
        public KindEnum? Kind { get; set; }
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ScoreTypeEnum
        {
            [EnumMember(Value = "cosine")]
            Cosine = 1,

            [EnumMember(Value = "cosine+lex")]
            Cosinelex = 2,

            [EnumMember(Value = "rrf")]
            Rrf = 3,

            [EnumMember(Value = "rerank")]
            Rerank = 4
        }

        [DataMember(Name = "score_type", IsRequired = true, EmitDefaultValue = true)]
        public ScoreTypeEnum ScoreType { get; set; }
        [JsonConstructorAttribute]
        protected SearchHit() { }
        public SearchHit(int blobId = default, string caption = default, string customerId = default, int duplicateCount = 0, List<int> duplicates = default, string geoLabel = default, string headline = default, int? height = default, KindEnum? kind = default, string mediaRef = default, Dictionary<string, Object> metadata = default, decimal score = default, ScoreTypeEnum scoreType = default, int? seekMs = default, MediaSpan span = default, string spanHeadline = default, List<string> tags = default, int? width = default)
        {
            this.BlobId = blobId;
            this.Score = score;
            this.ScoreType = scoreType;
            this.Caption = caption;
            this.CustomerId = customerId;
            this.DuplicateCount = duplicateCount;
            this.Duplicates = duplicates;
            this.GeoLabel = geoLabel;
            this.Headline = headline;
            this.Height = height;
            this.Kind = kind;
            this.MediaRef = mediaRef;
            this.Metadata = metadata;
            this.SeekMs = seekMs;
            this.Span = span;
            this.SpanHeadline = spanHeadline;
            this.Tags = tags;
            this.Width = width;
        }

        [DataMember(Name = "blob_id", IsRequired = true, EmitDefaultValue = true)]
        public int BlobId { get; set; }

        [DataMember(Name = "caption", EmitDefaultValue = true)]
        public string Caption { get; set; }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "duplicate_count", EmitDefaultValue = false)]
        public int DuplicateCount { get; set; }

        [DataMember(Name = "duplicates", EmitDefaultValue = false)]
        public List<int> Duplicates { get; set; }

        [DataMember(Name = "geo_label", EmitDefaultValue = true)]
        public string GeoLabel { get; set; }

        [DataMember(Name = "headline", EmitDefaultValue = true)]
        public string Headline { get; set; }

        [DataMember(Name = "height", EmitDefaultValue = true)]
        public int? Height { get; set; }

        [DataMember(Name = "media_ref", EmitDefaultValue = true)]
        public string MediaRef { get; set; }

        [DataMember(Name = "metadata", EmitDefaultValue = true)]
        public Dictionary<string, Object> Metadata { get; set; }

        [DataMember(Name = "score", IsRequired = true, EmitDefaultValue = true)]
        public decimal Score { get; set; }

        [DataMember(Name = "seek_ms", EmitDefaultValue = true)]
        public int? SeekMs { get; set; }

        [DataMember(Name = "span", EmitDefaultValue = true)]
        public MediaSpan Span { get; set; }

        [DataMember(Name = "span_headline", EmitDefaultValue = true)]
        public string SpanHeadline { get; set; }

        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<string> Tags { get; set; }

        [DataMember(Name = "width", EmitDefaultValue = true)]
        public int? Width { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchHit {\n");
            sb.Append("  BlobId: ").Append(BlobId).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  DuplicateCount: ").Append(DuplicateCount).Append("\n");
            sb.Append("  Duplicates: ").Append(Duplicates).Append("\n");
            sb.Append("  GeoLabel: ").Append(GeoLabel).Append("\n");
            sb.Append("  Headline: ").Append(Headline).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  MediaRef: ").Append(MediaRef).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
            sb.Append("  ScoreType: ").Append(ScoreType).Append("\n");
            sb.Append("  SeekMs: ").Append(SeekMs).Append("\n");
            sb.Append("  Span: ").Append(Span).Append("\n");
            sb.Append("  SpanHeadline: ").Append(SpanHeadline).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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
