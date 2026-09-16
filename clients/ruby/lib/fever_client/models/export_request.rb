require 'date'
require 'time'

module FeverClient
  class ExportRequest < ApiModelBase
    attr_accessor :customer_id

    attr_accessor :format

    attr_accessor :kind

    attr_accessor :s3_uri

    attr_accessor :tag

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
        :'customer_id' => :'customer_id',
        :'format' => :'format',
        :'kind' => :'kind',
        :'s3_uri' => :'s3_uri',
        :'tag' => :'tag'
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
        :'customer_id' => :'String',
        :'format' => :'String',
        :'kind' => :'String',
        :'s3_uri' => :'String',
        :'tag' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'customer_id',
        :'kind',
        :'tag'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::ExportRequest` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::ExportRequest`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'format')
        self.format = attributes[:'format']
      else
        self.format = 'ndjson'
      end

      if attributes.key?(:'kind')
        self.kind = attributes[:'kind']
      end

      if attributes.key?(:'s3_uri')
        self.s3_uri = attributes[:'s3_uri']
      else
        self.s3_uri = nil
      end

      if attributes.key?(:'tag')
        self.tag = attributes[:'tag']
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @s3_uri.nil?
        invalid_properties.push('invalid value for "s3_uri", s3_uri cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      format_validator = EnumAttributeValidator.new('String', ["ndjson", "parquet"])
      return false unless format_validator.valid?(@format)
      kind_validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      return false unless kind_validator.valid?(@kind)
      return false if @s3_uri.nil?
      true
    end

    def format=(format)
      validator = EnumAttributeValidator.new('String', ["ndjson", "parquet"])
      unless validator.valid?(format)
        fail ArgumentError, "invalid value for \"format\", must be one of #{validator.allowable_values}."
      end
      @format = format
    end

    def kind=(kind)
      validator = EnumAttributeValidator.new('String', ["image", "video", "audio", "pdf", "doc", "note"])
      unless validator.valid?(kind)
        fail ArgumentError, "invalid value for \"kind\", must be one of #{validator.allowable_values}."
      end
      @kind = kind
    end

    def s3_uri=(s3_uri)
      if s3_uri.nil?
        fail ArgumentError, 's3_uri cannot be nil'
      end

      @s3_uri = s3_uri
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          customer_id == o.customer_id &&
          format == o.format &&
          kind == o.kind &&
          s3_uri == o.s3_uri &&
          tag == o.tag
    end

    def eql?(o)
      self == o
    end

    def hash
      [customer_id, format, kind, s3_uri, tag].hash
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
