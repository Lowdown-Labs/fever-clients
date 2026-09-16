require 'date'
require 'time'

module FeverClient
  class IngestMedia < ApiModelBase
    attr_accessor :caption

    attr_accessor :customer_id

    attr_accessor :data

    attr_accessor :metadata

    attr_accessor :strip_exif

    attr_accessor :tags

    attr_accessor :url

    def self.attribute_map
      {
        :'caption' => :'caption',
        :'customer_id' => :'customer_id',
        :'data' => :'data',
        :'metadata' => :'metadata',
        :'strip_exif' => :'strip_exif',
        :'tags' => :'tags',
        :'url' => :'url'
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
        :'caption' => :'String',
        :'customer_id' => :'String',
        :'data' => :'String',
        :'metadata' => :'Hash<String, Object>',
        :'strip_exif' => :'Boolean',
        :'tags' => :'Array<String>',
        :'url' => :'String'
      }
    end

    def self.openapi_nullable
      Set.new([
        :'caption',
        :'customer_id',
        :'data',
        :'metadata',
        :'tags',
        :'url'
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::IngestMedia` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::IngestMedia`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'caption')
        self.caption = attributes[:'caption']
      end

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'data')
        self.data = attributes[:'data']
      end

      if attributes.key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.key?(:'strip_exif')
        self.strip_exif = attributes[:'strip_exif']
      else
        self.strip_exif = false
      end

      if attributes.key?(:'tags')
        if (value = attributes[:'tags']).is_a?(Array)
          self.tags = value
        end
      end

      if attributes.key?(:'url')
        self.url = attributes[:'url']
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      true
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          caption == o.caption &&
          customer_id == o.customer_id &&
          data == o.data &&
          metadata == o.metadata &&
          strip_exif == o.strip_exif &&
          tags == o.tags &&
          url == o.url
    end

    def eql?(o)
      self == o
    end

    def hash
      [caption, customer_id, data, metadata, strip_exif, tags, url].hash
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
