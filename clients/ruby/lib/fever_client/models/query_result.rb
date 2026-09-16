require 'date'
require 'time'

module FeverClient
  class QueryResult < ApiModelBase
    attr_accessor :columns

    attr_accessor :rows

    attr_accessor :truncated

    def self.attribute_map
      {
        :'columns' => :'columns',
        :'rows' => :'rows',
        :'truncated' => :'truncated'
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
        :'columns' => :'Array<String>',
        :'rows' => :'Array<Array<Object>>',
        :'truncated' => :'Boolean'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::QueryResult` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::QueryResult`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'columns')
        if (value = attributes[:'columns']).is_a?(Array)
          self.columns = value
        end
      else
        self.columns = nil
      end

      if attributes.key?(:'rows')
        if (value = attributes[:'rows']).is_a?(Array)
          self.rows = value
        end
      else
        self.rows = nil
      end

      if attributes.key?(:'truncated')
        self.truncated = attributes[:'truncated']
      else
        self.truncated = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @columns.nil?
        invalid_properties.push('invalid value for "columns", columns cannot be nil.')
      end

      if @rows.nil?
        invalid_properties.push('invalid value for "rows", rows cannot be nil.')
      end

      if @truncated.nil?
        invalid_properties.push('invalid value for "truncated", truncated cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @columns.nil?
      return false if @rows.nil?
      return false if @truncated.nil?
      true
    end

    def columns=(columns)
      if columns.nil?
        fail ArgumentError, 'columns cannot be nil'
      end

      @columns = columns
    end

    def rows=(rows)
      if rows.nil?
        fail ArgumentError, 'rows cannot be nil'
      end

      @rows = rows
    end

    def truncated=(truncated)
      if truncated.nil?
        fail ArgumentError, 'truncated cannot be nil'
      end

      @truncated = truncated
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          columns == o.columns &&
          rows == o.rows &&
          truncated == o.truncated
    end

    def eql?(o)
      self == o
    end

    def hash
      [columns, rows, truncated].hash
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
