require 'date'
require 'time'

module FeverClient
  class IngestSource < ApiModelBase
    attr_accessor :customer_id

    attr_accessor :s3_uri

    attr_accessor :target_res

    def self.attribute_map
      {
        :'customer_id' => :'customer_id',
        :'s3_uri' => :'s3_uri',
        :'target_res' => :'target_res'
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
        :'s3_uri' => :'String',
        :'target_res' => :'Integer'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'customer_id',
        :'target_res'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::IngestSource` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::IngestSource`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'s3_uri')
        self.s3_uri = attributes[:'s3_uri']
      else
        self.s3_uri = nil
      end

      if attributes.key?(:'target_res')
        self.target_res = attributes[:'target_res']
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @s3_uri.nil?
        invalid_properties.push('invalid value for "s3_uri", s3_uri cannot be nil.')
      end

      if !@target_res.nil? && @target_res > 4096
        invalid_properties.push('invalid value for "target_res", must be smaller than or equal to 4096.')
      end

      if !@target_res.nil? && @target_res < 64
        invalid_properties.push('invalid value for "target_res", must be greater than or equal to 64.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @s3_uri.nil?
      return false if !@target_res.nil? && @target_res > 4096
      return false if !@target_res.nil? && @target_res < 64
      true
    end

    def s3_uri=(s3_uri)
      if s3_uri.nil?
        fail ArgumentError, 's3_uri cannot be nil'
      end

      @s3_uri = s3_uri
    end

    def target_res=(target_res)
      if !target_res.nil? && target_res > 4096
        fail ArgumentError, 'invalid value for "target_res", must be smaller than or equal to 4096.'
      end

      if !target_res.nil? && target_res < 64
        fail ArgumentError, 'invalid value for "target_res", must be greater than or equal to 64.'
      end

      @target_res = target_res
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          customer_id == o.customer_id &&
          s3_uri == o.s3_uri &&
          target_res == o.target_res
    end

    def eql?(o)
      self == o
    end

    def hash
      [customer_id, s3_uri, target_res].hash
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
