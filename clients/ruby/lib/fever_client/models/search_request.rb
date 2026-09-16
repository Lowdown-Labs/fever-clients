require 'date'
require 'time'

module FeverClient
  class SearchRequest < ApiModelBase
    attr_accessor :after

    attr_accessor :before

    attr_accessor :collapse_duplicates

    attr_accessor :customer_id

    attr_accessor :device

    attr_accessor :dupe_threshold

    attr_accessor :exclude_tags

    attr_accessor :image

    attr_accessor :image_blob_id

    attr_accessor :include_tags

    attr_accessor :indexed_res

    attr_accessor :k

    attr_accessor :kind

    attr_accessor :max_height

    attr_accessor :max_width

    attr_accessor :min_score

    attr_accessor :near

    attr_accessor :sort

    attr_accessor :text

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
        :'after' => :'after',
        :'before' => :'before',
        :'collapse_duplicates' => :'collapse_duplicates',
        :'customer_id' => :'customer_id',
        :'device' => :'device',
        :'dupe_threshold' => :'dupe_threshold',
        :'exclude_tags' => :'exclude_tags',
        :'image' => :'image',
        :'image_blob_id' => :'image_blob_id',
        :'include_tags' => :'include_tags',
        :'indexed_res' => :'indexed_res',
        :'k' => :'k',
        :'kind' => :'kind',
        :'max_height' => :'max_height',
        :'max_width' => :'max_width',
        :'min_score' => :'min_score',
        :'near' => :'near',
        :'sort' => :'sort',
        :'text' => :'text'
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
        :'after' => :'String',
        :'before' => :'String',
        :'collapse_duplicates' => :'Boolean',
        :'customer_id' => :'String',
        :'device' => :'String',
        :'dupe_threshold' => :'Float',
        :'exclude_tags' => :'Array<String>',
        :'image' => :'String',
        :'image_blob_id' => :'Integer',
        :'include_tags' => :'Array<String>',
        :'indexed_res' => :'Integer',
        :'k' => :'Integer',
        :'kind' => :'String',
        :'max_height' => :'Integer',
        :'max_width' => :'Integer',
        :'min_score' => :'Float',
        :'near' => :'Array<Float>',
        :'sort' => :'String',
        :'text' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'after',
        :'before',
        :'customer_id',
        :'device',
        :'dupe_threshold',
        :'exclude_tags',
        :'image',
        :'image_blob_id',
        :'include_tags',
        :'indexed_res',
        :'kind',
        :'max_height',
        :'max_width',
        :'near',
        :'sort',
        :'text'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::SearchRequest` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::SearchRequest`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'after')
        self.after = attributes[:'after']
      end

      if attributes.key?(:'before')
        self.before = attributes[:'before']
      end

      if attributes.key?(:'collapse_duplicates')
        self.collapse_duplicates = attributes[:'collapse_duplicates']
      else
        self.collapse_duplicates = true
      end

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'device')
        self.device = attributes[:'device']
      end

      if attributes.key?(:'dupe_threshold')
        self.dupe_threshold = attributes[:'dupe_threshold']
      end

      if attributes.key?(:'exclude_tags')
        if (value = attributes[:'exclude_tags']).is_a?(Array)
          self.exclude_tags = value
        end
      end

      if attributes.key?(:'image')
        self.image = attributes[:'image']
      end

      if attributes.key?(:'image_blob_id')
        self.image_blob_id = attributes[:'image_blob_id']
      end

      if attributes.key?(:'include_tags')
        if (value = attributes[:'include_tags']).is_a?(Array)
          self.include_tags = value
        end
      end

      if attributes.key?(:'indexed_res')
        self.indexed_res = attributes[:'indexed_res']
      end

      if attributes.key?(:'k')
        self.k = attributes[:'k']
      else
        self.k = 10
      end

      if attributes.key?(:'kind')
        self.kind = attributes[:'kind']
      end

      if attributes.key?(:'max_height')
        self.max_height = attributes[:'max_height']
      end

      if attributes.key?(:'max_width')
        self.max_width = attributes[:'max_width']
      end

      if attributes.key?(:'min_score')
        self.min_score = attributes[:'min_score']
      else
        self.min_score = 0.0
      end

      if attributes.key?(:'near')
        if (value = attributes[:'near']).is_a?(Array)
          self.near = value
        end
      end

      if attributes.key?(:'sort')
        self.sort = attributes[:'sort']
      end

      if attributes.key?(:'text')
        self.text = attributes[:'text']
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      kind_validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      return false unless kind_validator.valid?(@kind)
      sort_validator = EnumAttributeValidator.new('String', ["relevance", "distance"])
      return false unless sort_validator.valid?(@sort)
      true
    end

    def kind=(kind)
      validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      unless validator.valid?(kind)
        fail ArgumentError, "invalid value for \"kind\", must be one of #{validator.allowable_values}."
      end
      @kind = kind
    end

    def sort=(sort)
      validator = EnumAttributeValidator.new('String', ["relevance", "distance"])
      unless validator.valid?(sort)
        fail ArgumentError, "invalid value for \"sort\", must be one of #{validator.allowable_values}."
      end
      @sort = sort
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          after == o.after &&
          before == o.before &&
          collapse_duplicates == o.collapse_duplicates &&
          customer_id == o.customer_id &&
          device == o.device &&
          dupe_threshold == o.dupe_threshold &&
          exclude_tags == o.exclude_tags &&
          image == o.image &&
          image_blob_id == o.image_blob_id &&
          include_tags == o.include_tags &&
          indexed_res == o.indexed_res &&
          k == o.k &&
          kind == o.kind &&
          max_height == o.max_height &&
          max_width == o.max_width &&
          min_score == o.min_score &&
          near == o.near &&
          sort == o.sort &&
          text == o.text
    end

    def eql?(o)
      self == o
    end

    def hash
      [after, before, collapse_duplicates, customer_id, device, dupe_threshold, exclude_tags, image, image_blob_id, include_tags, indexed_res, k, kind, max_height, max_width, min_score, near, sort, text].hash
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
