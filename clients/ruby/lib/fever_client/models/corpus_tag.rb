require 'date'
require 'time'

module FeverClient
  class CorpusTag < ApiModelBase
    attr_accessor :count

    attr_accessor :tag

    def self.attribute_map
      {
        :'count' => :'count',
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
        :'count' => :'Integer',
        :'tag' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::CorpusTag` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::CorpusTag`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'count')
        self.count = attributes[:'count']
      else
        self.count = nil
      end

      if attributes.key?(:'tag')
        self.tag = attributes[:'tag']
      else
        self.tag = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @count.nil?
        invalid_properties.push('invalid value for "count", count cannot be nil.')
      end

      if @tag.nil?
        invalid_properties.push('invalid value for "tag", tag cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @count.nil?
      return false if @tag.nil?
      true
    end

    def count=(count)
      if count.nil?
        fail ArgumentError, 'count cannot be nil'
      end

      @count = count
    end

    def tag=(tag)
      if tag.nil?
        fail ArgumentError, 'tag cannot be nil'
      end

      @tag = tag
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          count == o.count &&
          tag == o.tag
    end

    def eql?(o)
      self == o
    end

    def hash
      [count, tag].hash
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
