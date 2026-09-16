require 'date'
require 'time'

module FeverClient
  class IngestedMedia < ApiModelBase
    attr_accessor :blob_id

    attr_accessor :external_ref

    def self.attribute_map
      {
        :'blob_id' => :'blob_id',
        :'external_ref' => :'external_ref'
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
        :'external_ref' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'external_ref'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::IngestedMedia` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::IngestedMedia`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'blob_id')
        self.blob_id = attributes[:'blob_id']
      else
        self.blob_id = nil
      end

      if attributes.key?(:'external_ref')
        self.external_ref = attributes[:'external_ref']
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
      true
    end

    def blob_id=(blob_id)
      if blob_id.nil?
        fail ArgumentError, 'blob_id cannot be nil'
      end

      @blob_id = blob_id
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          blob_id == o.blob_id &&
          external_ref == o.external_ref
    end

    def eql?(o)
      self == o
    end

    def hash
      [blob_id, external_ref].hash
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
