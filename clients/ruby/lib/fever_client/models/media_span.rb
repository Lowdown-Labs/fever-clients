require 'date'
require 'time'

module FeverClient
  class MediaSpan < ApiModelBase
    attr_accessor :end_ms

    attr_accessor :start_ms

    attr_accessor :text

    def self.attribute_map
      {
        :'end_ms' => :'end_ms',
        :'start_ms' => :'start_ms',
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
        :'end_ms' => :'Integer',
        :'start_ms' => :'Integer',
        :'text' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'text'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::MediaSpan` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::MediaSpan`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'end_ms')
        self.end_ms = attributes[:'end_ms']
      else
        self.end_ms = nil
      end

      if attributes.key?(:'start_ms')
        self.start_ms = attributes[:'start_ms']
      else
        self.start_ms = nil
      end

      if attributes.key?(:'text')
        self.text = attributes[:'text']
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @end_ms.nil?
        invalid_properties.push('invalid value for "end_ms", end_ms cannot be nil.')
      end

      if @start_ms.nil?
        invalid_properties.push('invalid value for "start_ms", start_ms cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @end_ms.nil?
      return false if @start_ms.nil?
      true
    end

    def end_ms=(end_ms)
      if end_ms.nil?
        fail ArgumentError, 'end_ms cannot be nil'
      end

      @end_ms = end_ms
    end

    def start_ms=(start_ms)
      if start_ms.nil?
        fail ArgumentError, 'start_ms cannot be nil'
      end

      @start_ms = start_ms
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          end_ms == o.end_ms &&
          start_ms == o.start_ms &&
          text == o.text
    end

    def eql?(o)
      self == o
    end

    def hash
      [end_ms, start_ms, text].hash
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
