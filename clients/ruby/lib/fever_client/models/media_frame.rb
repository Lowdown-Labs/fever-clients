require 'date'
require 'time'

module FeverClient
  class MediaFrame < ApiModelBase
    attr_accessor :frame_no

    attr_accessor :ts_ms

    def self.attribute_map
      {
        :'frame_no' => :'frame_no',
        :'ts_ms' => :'ts_ms'
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
        :'frame_no' => :'Integer',
        :'ts_ms' => :'Integer'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::MediaFrame` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::MediaFrame`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'frame_no')
        self.frame_no = attributes[:'frame_no']
      else
        self.frame_no = nil
      end

      if attributes.key?(:'ts_ms')
        self.ts_ms = attributes[:'ts_ms']
      else
        self.ts_ms = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @frame_no.nil?
        invalid_properties.push('invalid value for "frame_no", frame_no cannot be nil.')
      end

      if @ts_ms.nil?
        invalid_properties.push('invalid value for "ts_ms", ts_ms cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @frame_no.nil?
      return false if @ts_ms.nil?
      true
    end

    def frame_no=(frame_no)
      if frame_no.nil?
        fail ArgumentError, 'frame_no cannot be nil'
      end

      @frame_no = frame_no
    end

    def ts_ms=(ts_ms)
      if ts_ms.nil?
        fail ArgumentError, 'ts_ms cannot be nil'
      end

      @ts_ms = ts_ms
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          frame_no == o.frame_no &&
          ts_ms == o.ts_ms
    end

    def eql?(o)
      self == o
    end

    def hash
      [frame_no, ts_ms].hash
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
