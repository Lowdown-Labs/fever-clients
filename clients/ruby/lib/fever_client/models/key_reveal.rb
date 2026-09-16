require 'date'
require 'time'

module FeverClient
  class KeyReveal < ApiModelBase
    attr_accessor :api_key

    attr_accessor :customer_id

    attr_accessor :id

    attr_accessor :name

    attr_accessor :role

    def self.attribute_map
      {
        :'api_key' => :'api_key',
        :'customer_id' => :'customer_id',
        :'id' => :'id',
        :'name' => :'name',
        :'role' => :'role'
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
        :'api_key' => :'String',
        :'customer_id' => :'String',
        :'id' => :'Integer',
        :'name' => :'String',
        :'role' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'customer_id',
        :'name',
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::KeyReveal` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::KeyReveal`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'api_key')
        self.api_key = attributes[:'api_key']
      else
        self.api_key = nil
      end

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      else
        self.id = nil
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'role')
        self.role = attributes[:'role']
      else
        self.role = 'scoped'
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @api_key.nil?
        invalid_properties.push('invalid value for "api_key", api_key cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @api_key.nil?
      return false if @id.nil?
      true
    end

    def api_key=(api_key)
      if api_key.nil?
        fail ArgumentError, 'api_key cannot be nil'
      end

      @api_key = api_key
    end

    def id=(id)
      if id.nil?
        fail ArgumentError, 'id cannot be nil'
      end

      @id = id
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          api_key == o.api_key &&
          customer_id == o.customer_id &&
          id == o.id &&
          name == o.name &&
          role == o.role
    end

    def eql?(o)
      self == o
    end

    def hash
      [api_key, customer_id, id, name, role].hash
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
