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
    [DataContract(Name = "SearchRequest")]
    public partial class SearchRequest : IValidatableObject
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
        public enum SortEnum
        {
            [EnumMember(Value = "relevance")]
            Relevance = 1,

            [EnumMember(Value = "distance")]
            Distance = 2
        }

        [DataMember(Name = "sort", EmitDefaultValue = true)]
        public SortEnum? Sort { get; set; }
        public SearchRequest(string after = default, string before = default, bool collapseDuplicates = true, string customerId = default, string device = default, decimal? dupeThreshold = default, List<string> excludeTags = default, string image = default, int? imageBlobId = default, List<string> includeTags = default, int? indexedRes = default, int k = 10, KindEnum? kind = default, int? maxHeight = default, int? maxWidth = default, decimal minScore = 0.0M, List<decimal> near = default, SortEnum? sort = default, string text = default)
        {
            this.After = after;
            this.Before = before;
            this.CollapseDuplicates = collapseDuplicates;
            this.CustomerId = customerId;
            this.Device = device;
            this.DupeThreshold = dupeThreshold;
            this.ExcludeTags = excludeTags;
            this.Image = image;
            this.ImageBlobId = imageBlobId;
            this.IncludeTags = includeTags;
            this.IndexedRes = indexedRes;
            this.K = k;
            this.Kind = kind;
            this.MaxHeight = maxHeight;
            this.MaxWidth = maxWidth;
            this.MinScore = minScore;
            this.Near = near;
            this.Sort = sort;
            this.Text = text;
        }

        [DataMember(Name = "after", EmitDefaultValue = true)]
        public string After { get; set; }

        [DataMember(Name = "before", EmitDefaultValue = true)]
        public string Before { get; set; }

        [DataMember(Name = "collapse_duplicates", EmitDefaultValue = true)]
        public bool CollapseDuplicates { get; set; }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "device", EmitDefaultValue = true)]
        public string Device { get; set; }

        [DataMember(Name = "dupe_threshold", EmitDefaultValue = true)]
        public decimal? DupeThreshold { get; set; }

        [DataMember(Name = "exclude_tags", EmitDefaultValue = true)]
        public List<string> ExcludeTags { get; set; }

        [DataMember(Name = "image", EmitDefaultValue = true)]
        public string Image { get; set; }

        [DataMember(Name = "image_blob_id", EmitDefaultValue = true)]
        public int? ImageBlobId { get; set; }

        [DataMember(Name = "include_tags", EmitDefaultValue = true)]
        public List<string> IncludeTags { get; set; }

        [DataMember(Name = "indexed_res", EmitDefaultValue = true)]
        public int? IndexedRes { get; set; }

        [DataMember(Name = "k", EmitDefaultValue = false)]
        public int K { get; set; }

        [DataMember(Name = "max_height", EmitDefaultValue = true)]
        public int? MaxHeight { get; set; }

        [DataMember(Name = "max_width", EmitDefaultValue = true)]
        public int? MaxWidth { get; set; }

        [DataMember(Name = "min_score", EmitDefaultValue = false)]
        public decimal MinScore { get; set; }

        [DataMember(Name = "near", EmitDefaultValue = true)]
        public List<decimal> Near { get; set; }

        [DataMember(Name = "text", EmitDefaultValue = true)]
        public string Text { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchRequest {\n");
            sb.Append("  After: ").Append(After).Append("\n");
            sb.Append("  Before: ").Append(Before).Append("\n");
            sb.Append("  CollapseDuplicates: ").Append(CollapseDuplicates).Append("\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  Device: ").Append(Device).Append("\n");
            sb.Append("  DupeThreshold: ").Append(DupeThreshold).Append("\n");
            sb.Append("  ExcludeTags: ").Append(ExcludeTags).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
            sb.Append("  ImageBlobId: ").Append(ImageBlobId).Append("\n");
            sb.Append("  IncludeTags: ").Append(IncludeTags).Append("\n");
            sb.Append("  IndexedRes: ").Append(IndexedRes).Append("\n");
            sb.Append("  K: ").Append(K).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  MaxHeight: ").Append(MaxHeight).Append("\n");
            sb.Append("  MaxWidth: ").Append(MaxWidth).Append("\n");
            sb.Append("  MinScore: ").Append(MinScore).Append("\n");
            sb.Append("  Near: ").Append(Near).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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
