require 'date'
require 'time'

module FeverClient
  class DuplicatesRequest < ApiModelBase
    attr_accessor :customer_id

    attr_accessor :customer_ids

    attr_accessor :limit

    attr_accessor :threshold

    def self.attribute_map
      {
        :'customer_id' => :'customer_id',
        :'customer_ids' => :'customer_ids',
        :'limit' => :'limit',
        :'threshold' => :'threshold'
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
        :'customer_ids' => :'Array<String>',
        :'limit' => :'Integer',
        :'threshold' => :'Float'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'customer_id',
        :'customer_ids',
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::DuplicatesRequest` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::DuplicatesRequest`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'customer_ids')
        if (value = attributes[:'customer_ids']).is_a?(Array)
          self.customer_ids = value
        end
      end

      if attributes.key?(:'limit')
        self.limit = attributes[:'limit']
      else
        self.limit = 500
      end

      if attributes.key?(:'threshold')
        self.threshold = attributes[:'threshold']
      else
        self.threshold = 0.92
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if !@limit.nil? && @limit > 5000
        invalid_properties.push('invalid value for "limit", must be smaller than or equal to 5000.')
      end

      if !@limit.nil? && @limit < 1
        invalid_properties.push('invalid value for "limit", must be greater than or equal to 1.')
      end

      if !@threshold.nil? && @threshold > 1.0
        invalid_properties.push('invalid value for "threshold", must be smaller than or equal to 1.0.')
      end

      if !@threshold.nil? && @threshold < 0.0
        invalid_properties.push('invalid value for "threshold", must be greater than or equal to 0.0.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if !@limit.nil? && @limit > 5000
      return false if !@limit.nil? && @limit < 1
      return false if !@threshold.nil? && @threshold > 1.0
      return false if !@threshold.nil? && @threshold < 0.0
      true
    end

    def limit=(limit)
      if limit.nil?
        fail ArgumentError, 'limit cannot be nil'
      end

      if limit > 5000
        fail ArgumentError, 'invalid value for "limit", must be smaller than or equal to 5000.'
      end

      if limit < 1
        fail ArgumentError, 'invalid value for "limit", must be greater than or equal to 1.'
      end

      @limit = limit
    end

    def threshold=(threshold)
      if threshold.nil?
        fail ArgumentError, 'threshold cannot be nil'
      end

      if threshold > 1.0
        fail ArgumentError, 'invalid value for "threshold", must be smaller than or equal to 1.0.'
      end

      if threshold < 0.0
        fail ArgumentError, 'invalid value for "threshold", must be greater than or equal to 0.0.'
      end

      @threshold = threshold
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          customer_id == o.customer_id &&
          customer_ids == o.customer_ids &&
          limit == o.limit &&
          threshold == o.threshold
    end

    def eql?(o)
      self == o
    end

    def hash
      [customer_id, customer_ids, limit, threshold].hash
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
