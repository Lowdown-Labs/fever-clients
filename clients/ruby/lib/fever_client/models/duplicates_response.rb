require 'date'
require 'time'

module FeverClient
  class DuplicatesResponse < ApiModelBase
    attr_accessor :clusters

    attr_accessor :duplicate_clusters

    attr_accessor :total_duplicates

    def self.attribute_map
      {
        :'clusters' => :'clusters',
        :'duplicate_clusters' => :'duplicate_clusters',
        :'total_duplicates' => :'total_duplicates'
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
        :'clusters' => :'Integer',
        :'duplicate_clusters' => :'Array<DuplicateCluster>',
        :'total_duplicates' => :'Integer'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::DuplicatesResponse` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::DuplicatesResponse`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'clusters')
        self.clusters = attributes[:'clusters']
      else
        self.clusters = nil
      end

      if attributes.key?(:'duplicate_clusters')
        if (value = attributes[:'duplicate_clusters']).is_a?(Array)
          self.duplicate_clusters = value
        end
      end

      if attributes.key?(:'total_duplicates')
        self.total_duplicates = attributes[:'total_duplicates']
      else
        self.total_duplicates = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @clusters.nil?
        invalid_properties.push('invalid value for "clusters", clusters cannot be nil.')
      end

      if @total_duplicates.nil?
        invalid_properties.push('invalid value for "total_duplicates", total_duplicates cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @clusters.nil?
      return false if @total_duplicates.nil?
      true
    end

    def clusters=(clusters)
      if clusters.nil?
        fail ArgumentError, 'clusters cannot be nil'
      end

      @clusters = clusters
    end

    def total_duplicates=(total_duplicates)
      if total_duplicates.nil?
        fail ArgumentError, 'total_duplicates cannot be nil'
      end

      @total_duplicates = total_duplicates
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          clusters == o.clusters &&
          duplicate_clusters == o.duplicate_clusters &&
          total_duplicates == o.total_duplicates
    end

    def eql?(o)
      self == o
    end

    def hash
      [clusters, duplicate_clusters, total_duplicates].hash
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
