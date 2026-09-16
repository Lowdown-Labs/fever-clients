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
    [DataContract(Name = "MediaInfo")]
    public partial class MediaInfo : IValidatableObject
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
        [JsonConstructorAttribute]
        protected MediaInfo() { }
        public MediaInfo(int blobId = default, string caption = default, DateTime? capturedAt = default, string customerId = default, string device = default, string externalRef = default, int frameCount = 0, decimal? gpsLat = default, decimal? gpsLon = default, KindEnum? kind = default, Dictionary<string, Object> metadata = default, string ocrText = default, decimal? synthetic = default, List<string> tags = default, int transcriptSegments = 0)
        {
            this.BlobId = blobId;
            this.Caption = caption;
            this.CapturedAt = capturedAt;
            this.CustomerId = customerId;
            this.Device = device;
            this.ExternalRef = externalRef;
            this.FrameCount = frameCount;
            this.GpsLat = gpsLat;
            this.GpsLon = gpsLon;
            this.Kind = kind;
            this.Metadata = metadata;
            this.OcrText = ocrText;
            this.Synthetic = synthetic;
            this.Tags = tags;
            this.TranscriptSegments = transcriptSegments;
        }

        [DataMember(Name = "blob_id", IsRequired = true, EmitDefaultValue = true)]
        public int BlobId { get; set; }

        [DataMember(Name = "caption", EmitDefaultValue = true)]
        public string Caption { get; set; }

        [DataMember(Name = "captured_at", EmitDefaultValue = true)]
        public DateTime? CapturedAt { get; set; }

        [DataMember(Name = "customer_id", EmitDefaultValue = true)]
        public string CustomerId { get; set; }

        [DataMember(Name = "device", EmitDefaultValue = true)]
        public string Device { get; set; }

        [DataMember(Name = "external_ref", EmitDefaultValue = true)]
        public string ExternalRef { get; set; }

        [DataMember(Name = "frame_count", EmitDefaultValue = false)]
        public int FrameCount { get; set; }

        [DataMember(Name = "gps_lat", EmitDefaultValue = true)]
        public decimal? GpsLat { get; set; }

        [DataMember(Name = "gps_lon", EmitDefaultValue = true)]
        public decimal? GpsLon { get; set; }

        [DataMember(Name = "metadata", EmitDefaultValue = true)]
        public Dictionary<string, Object> Metadata { get; set; }

        [DataMember(Name = "ocr_text", EmitDefaultValue = true)]
        public string OcrText { get; set; }

        [DataMember(Name = "synthetic", EmitDefaultValue = true)]
        public decimal? Synthetic { get; set; }

        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<string> Tags { get; set; }

        [DataMember(Name = "transcript_segments", EmitDefaultValue = false)]
        public int TranscriptSegments { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MediaInfo {\n");
            sb.Append("  BlobId: ").Append(BlobId).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  CapturedAt: ").Append(CapturedAt).Append("\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  Device: ").Append(Device).Append("\n");
            sb.Append("  ExternalRef: ").Append(ExternalRef).Append("\n");
            sb.Append("  FrameCount: ").Append(FrameCount).Append("\n");
            sb.Append("  GpsLat: ").Append(GpsLat).Append("\n");
            sb.Append("  GpsLon: ").Append(GpsLon).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  OcrText: ").Append(OcrText).Append("\n");
            sb.Append("  Synthetic: ").Append(Synthetic).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  TranscriptSegments: ").Append(TranscriptSegments).Append("\n");
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
