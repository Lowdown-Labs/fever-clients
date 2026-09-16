require 'date'
require 'time'

module FeverClient
  class ValidationError < ApiModelBase
    attr_accessor :ctx

    attr_accessor :input

    attr_accessor :loc

    attr_accessor :msg

    attr_accessor :type

    def self.attribute_map
      {
        :'ctx' => :'ctx',
        :'input' => :'input',
        :'loc' => :'loc',
        :'msg' => :'msg',
        :'type' => :'type'
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
        :'ctx' => :'Object',
        :'input' => :'Object',
        :'loc' => :'Array<LocationInner>',
        :'msg' => :'String',
        :'type' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'input',
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::ValidationError` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::ValidationError`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'ctx')
        self.ctx = attributes[:'ctx']
      end

      if attributes.key?(:'input')
        self.input = attributes[:'input']
      end

      if attributes.key?(:'loc')
        if (value = attributes[:'loc']).is_a?(Array)
          self.loc = value
        end
      else
        self.loc = nil
      end

      if attributes.key?(:'msg')
        self.msg = attributes[:'msg']
      else
        self.msg = nil
      end

      if attributes.key?(:'type')
        self.type = attributes[:'type']
      else
        self.type = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @loc.nil?
        invalid_properties.push('invalid value for "loc", loc cannot be nil.')
      end

      if @msg.nil?
        invalid_properties.push('invalid value for "msg", msg cannot be nil.')
      end

      if @type.nil?
        invalid_properties.push('invalid value for "type", type cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @loc.nil?
      return false if @msg.nil?
      return false if @type.nil?
      true
    end

    def loc=(loc)
      if loc.nil?
        fail ArgumentError, 'loc cannot be nil'
      end

      @loc = loc
    end

    def msg=(msg)
      if msg.nil?
        fail ArgumentError, 'msg cannot be nil'
      end

      @msg = msg
    end

    def type=(type)
      if type.nil?
        fail ArgumentError, 'type cannot be nil'
      end

      @type = type
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          ctx == o.ctx &&
          input == o.input &&
          loc == o.loc &&
          msg == o.msg &&
          type == o.type
    end

    def eql?(o)
      self == o
    end

    def hash
      [ctx, input, loc, msg, type].hash
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
