require 'date'
require 'time'

module FeverClient
  class SearchHit < ApiModelBase
    attr_accessor :blob_id

    attr_accessor :caption

    attr_accessor :customer_id

    attr_accessor :duplicate_count

    attr_accessor :duplicates

    attr_accessor :geo_label

    attr_accessor :headline

    attr_accessor :height

    attr_accessor :kind

    attr_accessor :media_ref

    attr_accessor :metadata

    attr_accessor :score

    attr_accessor :score_type

    attr_accessor :seek_ms

    attr_accessor :span

    attr_accessor :span_headline

    attr_accessor :tags

    attr_accessor :width

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
        :'customer_id' => :'customer_id',
        :'duplicate_count' => :'duplicate_count',
        :'duplicates' => :'duplicates',
        :'geo_label' => :'geo_label',
        :'headline' => :'headline',
        :'height' => :'height',
        :'kind' => :'kind',
        :'media_ref' => :'media_ref',
        :'metadata' => :'metadata',
        :'score' => :'score',
        :'score_type' => :'score_type',
        :'seek_ms' => :'seek_ms',
        :'span' => :'span',
        :'span_headline' => :'span_headline',
        :'tags' => :'tags',
        :'width' => :'width'
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
        :'customer_id' => :'String',
        :'duplicate_count' => :'Integer',
        :'duplicates' => :'Array<Integer>',
        :'geo_label' => :'String',
        :'headline' => :'String',
        :'height' => :'Integer',
        :'kind' => :'String',
        :'media_ref' => :'String',
        :'metadata' => :'Hash<String, Object>',
        :'score' => :'Float',
        :'score_type' => :'String',
        :'seek_ms' => :'Integer',
        :'span' => :'MediaSpan',
        :'span_headline' => :'String',
        :'tags' => :'Array<String>',
        :'width' => :'Integer'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'caption',
        :'customer_id',
        :'geo_label',
        :'headline',
        :'height',
        :'kind',
        :'media_ref',
        :'metadata',
        :'seek_ms',
        :'span',
        :'span_headline',
        :'width'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::SearchHit` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::SearchHit`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
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

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'duplicate_count')
        self.duplicate_count = attributes[:'duplicate_count']
      else
        self.duplicate_count = 0
      end

      if attributes.key?(:'duplicates')
        if (value = attributes[:'duplicates']).is_a?(Array)
          self.duplicates = value
        end
      end

      if attributes.key?(:'geo_label')
        self.geo_label = attributes[:'geo_label']
      end

      if attributes.key?(:'headline')
        self.headline = attributes[:'headline']
      end

      if attributes.key?(:'height')
        self.height = attributes[:'height']
      end

      if attributes.key?(:'kind')
        self.kind = attributes[:'kind']
      end

      if attributes.key?(:'media_ref')
        self.media_ref = attributes[:'media_ref']
      end

      if attributes.key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.key?(:'score')
        self.score = attributes[:'score']
      else
        self.score = nil
      end

      if attributes.key?(:'score_type')
        self.score_type = attributes[:'score_type']
      else
        self.score_type = nil
      end

      if attributes.key?(:'seek_ms')
        self.seek_ms = attributes[:'seek_ms']
      end

      if attributes.key?(:'span')
        self.span = attributes[:'span']
      end

      if attributes.key?(:'span_headline')
        self.span_headline = attributes[:'span_headline']
      end

      if attributes.key?(:'tags')
        if (value = attributes[:'tags']).is_a?(Array)
          self.tags = value
        end
      end

      if attributes.key?(:'width')
        self.width = attributes[:'width']
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @blob_id.nil?
        invalid_properties.push('invalid value for "blob_id", blob_id cannot be nil.')
      end

      if @score.nil?
        invalid_properties.push('invalid value for "score", score cannot be nil.')
      end

      if @score_type.nil?
        invalid_properties.push('invalid value for "score_type", score_type cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @blob_id.nil?
      kind_validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      return false unless kind_validator.valid?(@kind)
      return false if @score.nil?
      return false if @score_type.nil?
      score_type_validator = EnumAttributeValidator.new('String', ["cosine", "cosine+lex", "rrf", "rerank"])
      return false unless score_type_validator.valid?(@score_type)
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

    def score=(score)
      if score.nil?
        fail ArgumentError, 'score cannot be nil'
      end

      @score = score
    end

    def score_type=(score_type)
      validator = EnumAttributeValidator.new('String', ["cosine", "cosine+lex", "rrf", "rerank"])
      unless validator.valid?(score_type)
        fail ArgumentError, "invalid value for \"score_type\", must be one of #{validator.allowable_values}."
      end
      @score_type = score_type
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          blob_id == o.blob_id &&
          caption == o.caption &&
          customer_id == o.customer_id &&
          duplicate_count == o.duplicate_count &&
          duplicates == o.duplicates &&
          geo_label == o.geo_label &&
          headline == o.headline &&
          height == o.height &&
          kind == o.kind &&
          media_ref == o.media_ref &&
          metadata == o.metadata &&
          score == o.score &&
          score_type == o.score_type &&
          seek_ms == o.seek_ms &&
          span == o.span &&
          span_headline == o.span_headline &&
          tags == o.tags &&
          width == o.width
    end

    def eql?(o)
      self == o
    end

    def hash
      [blob_id, caption, customer_id, duplicate_count, duplicates, geo_label, headline, height, kind, media_ref, metadata, score, score_type, seek_ms, span, span_headline, tags, width].hash
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
