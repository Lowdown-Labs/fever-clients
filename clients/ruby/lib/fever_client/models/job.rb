require 'date'
require 'time'

module FeverClient
  class Job < ApiModelBase
    attr_accessor :done

    attr_accessor :error

    attr_accessor :id

    attr_accessor :skipped

    attr_accessor :status

    attr_accessor :total

    def self.attribute_map
      {
        :'done' => :'done',
        :'error' => :'error',
        :'id' => :'id',
        :'skipped' => :'skipped',
        :'status' => :'status',
        :'total' => :'total'
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
        :'done' => :'Integer',
        :'error' => :'String',
        :'id' => :'Integer',
        :'skipped' => :'Integer',
        :'status' => :'String',
        :'total' => :'Integer'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'error',
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::Job` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::Job`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'done')
        self.done = attributes[:'done']
      else
        self.done = 0
      end

      if attributes.key?(:'error')
        self.error = attributes[:'error']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      else
        self.id = nil
      end

      if attributes.key?(:'skipped')
        self.skipped = attributes[:'skipped']
      else
        self.skipped = 0
      end

      if attributes.key?(:'status')
        self.status = attributes[:'status']
      else
        self.status = nil
      end

      if attributes.key?(:'total')
        self.total = attributes[:'total']
      else
        self.total = 0
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      if @status.nil?
        invalid_properties.push('invalid value for "status", status cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @id.nil?
      return false if @status.nil?
      true
    end

    def id=(id)
      if id.nil?
        fail ArgumentError, 'id cannot be nil'
      end

      @id = id
    end

    def status=(status)
      if status.nil?
        fail ArgumentError, 'status cannot be nil'
      end

      @status = status
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          done == o.done &&
          error == o.error &&
          id == o.id &&
          skipped == o.skipped &&
          status == o.status &&
          total == o.total
    end

    def eql?(o)
      self == o
    end

    def hash
      [done, error, id, skipped, status, total].hash
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
