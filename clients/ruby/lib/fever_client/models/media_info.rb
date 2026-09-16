require 'date'
require 'time'

module FeverClient
  class MediaInfo < ApiModelBase
    attr_accessor :blob_id

    attr_accessor :caption

    attr_accessor :captured_at

    attr_accessor :customer_id

    attr_accessor :device

    attr_accessor :external_ref

    attr_accessor :frame_count

    attr_accessor :gps_lat

    attr_accessor :gps_lon

    attr_accessor :kind

    attr_accessor :metadata

    attr_accessor :ocr_text

    attr_accessor :synthetic

    attr_accessor :tags

    attr_accessor :transcript_segments

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    def self.attribute_map
      {
        :'blob_id' => :'blob_id',
        :'caption' => :'caption',
        :'captured_at' => :'captured_at',
        :'customer_id' => :'customer_id',
        :'device' => :'device',
        :'external_ref' => :'external_ref',
        :'frame_count' => :'frame_count',
        :'gps_lat' => :'gps_lat',
        :'gps_lon' => :'gps_lon',
        :'kind' => :'kind',
        :'metadata' => :'metadata',
        :'ocr_text' => :'ocr_text',
        :'synthetic' => :'synthetic',
        :'tags' => :'tags',
        :'transcript_segments' => :'transcript_segments'
      }
    end

    def self.acceptable_attribute_map
      attribute_map
    end

    def self.acceptable_attributes
      acceptable_attribute_map.values
    end

    def self.openapi_types
      {
        :'blob_id' => :'Integer',
        :'caption' => :'String',
        :'captured_at' => :'Time',
        :'customer_id' => :'String',
        :'device' => :'String',
        :'external_ref' => :'String',
        :'frame_count' => :'Integer',
        :'gps_lat' => :'Float',
        :'gps_lon' => :'Float',
        :'kind' => :'String',
        :'metadata' => :'Hash<String, Object>',
        :'ocr_text' => :'String',
        :'synthetic' => :'Float',
        :'tags' => :'Array<String>',
        :'transcript_segments' => :'Integer'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'caption',
        :'captured_at',
        :'customer_id',
        :'device',
        :'external_ref',
        :'gps_lat',
        :'gps_lon',
        :'kind',
        :'metadata',
        :'ocr_text',
        :'synthetic',
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::MediaInfo` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::MediaInfo`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'blob_id')
        self.blob_id = attributes[:'blob_id']
      else
        self.blob_id = nil
      end

      if attributes.key?(:'caption')
        self.caption = attributes[:'caption']
      end

      if attributes.key?(:'captured_at')
        self.captured_at = attributes[:'captured_at']
      end

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'device')
        self.device = attributes[:'device']
      end

      if attributes.key?(:'external_ref')
        self.external_ref = attributes[:'external_ref']
      end

      if attributes.key?(:'frame_count')
        self.frame_count = attributes[:'frame_count']
      else
        self.frame_count = 0
      end

      if attributes.key?(:'gps_lat')
        self.gps_lat = attributes[:'gps_lat']
      end

      if attributes.key?(:'gps_lon')
        self.gps_lon = attributes[:'gps_lon']
      end

      if attributes.key?(:'kind')
        self.kind = attributes[:'kind']
      end

      if attributes.key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.key?(:'ocr_text')
        self.ocr_text = attributes[:'ocr_text']
      end

      if attributes.key?(:'synthetic')
        self.synthetic = attributes[:'synthetic']
      end

      if attributes.key?(:'tags')
        if (value = attributes[:'tags']).is_a?(Array)
          self.tags = value
        end
      end

      if attributes.key?(:'transcript_segments')
        self.transcript_segments = attributes[:'transcript_segments']
      else
        self.transcript_segments = 0
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @blob_id.nil?
        invalid_properties.push('invalid value for "blob_id", blob_id cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @blob_id.nil?
      kind_validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      return false unless kind_validator.valid?(@kind)
      true
    end

    def blob_id=(blob_id)
      if blob_id.nil?
        fail ArgumentError, 'blob_id cannot be nil'
      end

      @blob_id = blob_id
    end

    def kind=(kind)
      validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      unless validator.valid?(kind)
        fail ArgumentError, "invalid value for \"kind\", must be one of #{validator.allowable_values}."
      end
      @kind = kind
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          blob_id == o.blob_id &&
          caption == o.caption &&
          captured_at == o.captured_at &&
          customer_id == o.customer_id &&
          device == o.device &&
          external_ref == o.external_ref &&
          frame_count == o.frame_count &&
          gps_lat == o.gps_lat &&
          gps_lon == o.gps_lon &&
          kind == o.kind &&
          metadata == o.metadata &&
          ocr_text == o.ocr_text &&
          synthetic == o.synthetic &&
          tags == o.tags &&
          transcript_segments == o.transcript_segments
    end

    def eql?(o)
      self == o
    end

    def hash
      [blob_id, caption, captured_at, customer_id, device, external_ref, frame_count, gps_lat, gps_lon, kind, metadata, ocr_text, synthetic, tags, transcript_segments].hash
    end

    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

  end

end
