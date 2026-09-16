require 'date'
require 'time'

module FeverClient
  class QueryRequest < ApiModelBase
    attr_accessor :row_limit

    attr_accessor :sql

    def self.attribute_map
      {
        :'row_limit' => :'row_limit',
        :'sql' => :'sql'
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
        :'row_limit' => :'Integer',
        :'sql' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::QueryRequest` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::QueryRequest`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'row_limit')
        self.row_limit = attributes[:'row_limit']
      else
        self.row_limit = 200
      end

      if attributes.key?(:'sql')
        self.sql = attributes[:'sql']
      else
        self.sql = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if !@row_limit.nil? && @row_limit > 1000
        invalid_properties.push('invalid value for "row_limit", must be smaller than or equal to 1000.')
      end

      if !@row_limit.nil? && @row_limit < 1
        invalid_properties.push('invalid value for "row_limit", must be greater than or equal to 1.')
      end

      if @sql.nil?
        invalid_properties.push('invalid value for "sql", sql cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if !@row_limit.nil? && @row_limit > 1000
      return false if !@row_limit.nil? && @row_limit < 1
      return false if @sql.nil?
      true
    end

    def row_limit=(row_limit)
      if row_limit.nil?
        fail ArgumentError, 'row_limit cannot be nil'
      end

      if row_limit > 1000
        fail ArgumentError, 'invalid value for "row_limit", must be smaller than or equal to 1000.'
      end

      if row_limit < 1
        fail ArgumentError, 'invalid value for "row_limit", must be greater than or equal to 1.'
      end

      @row_limit = row_limit
    end

    def sql=(sql)
      if sql.nil?
        fail ArgumentError, 'sql cannot be nil'
      end

      @sql = sql
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          row_limit == o.row_limit &&
          sql == o.sql
    end

    def eql?(o)
      self == o
    end

    def hash
      [row_limit, sql].hash
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
