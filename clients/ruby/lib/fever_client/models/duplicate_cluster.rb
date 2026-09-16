require 'date'
require 'time'

module FeverClient
  class DuplicateCluster < ApiModelBase
    attr_accessor :member_customers

    attr_accessor :members

    attr_accessor :size

    attr_accessor :tightness

    def self.attribute_map
      {
        :'member_customers' => :'member_customers',
        :'members' => :'members',
        :'size' => :'size',
        :'tightness' => :'tightness'
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
        :'member_customers' => :'Array<String>',
        :'members' => :'Array<Integer>',
        :'size' => :'Integer',
        :'tightness' => :'Float'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::DuplicateCluster` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::DuplicateCluster`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'member_customers')
        if (value = attributes[:'member_customers']).is_a?(Array)
          self.member_customers = value
        end
      end

      if attributes.key?(:'members')
        if (value = attributes[:'members']).is_a?(Array)
          self.members = value
        end
      else
        self.members = nil
      end

      if attributes.key?(:'size')
        self.size = attributes[:'size']
      else
        self.size = nil
      end

      if attributes.key?(:'tightness')
        self.tightness = attributes[:'tightness']
      else
        self.tightness = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @members.nil?
        invalid_properties.push('invalid value for "members", members cannot be nil.')
      end

      if @size.nil?
        invalid_properties.push('invalid value for "size", size cannot be nil.')
      end

      if @tightness.nil?
        invalid_properties.push('invalid value for "tightness", tightness cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @members.nil?
      return false if @size.nil?
      return false if @tightness.nil?
      true
    end

    def members=(members)
      if members.nil?
        fail ArgumentError, 'members cannot be nil'
      end

      @members = members
    end

    def size=(size)
      if size.nil?
        fail ArgumentError, 'size cannot be nil'
      end

      @size = size
    end

    def tightness=(tightness)
      if tightness.nil?
        fail ArgumentError, 'tightness cannot be nil'
      end

      @tightness = tightness
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          member_customers == o.member_customers &&
          members == o.members &&
          size == o.size &&
          tightness == o.tightness
    end

    def eql?(o)
      self == o
    end

    def hash
      [member_customers, members, size, tightness].hash
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
