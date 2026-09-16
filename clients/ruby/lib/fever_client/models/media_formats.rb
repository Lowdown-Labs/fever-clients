require 'date'
require 'time'

module FeverClient
  class MediaFormats < ApiModelBase
    attr_accessor :audio

    attr_accessor :document

    attr_accessor :image

    attr_accessor :video

    def self.attribute_map
      {
        :'audio' => :'audio',
        :'document' => :'document',
        :'image' => :'image',
        :'video' => :'video'
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
        :'audio' => :'Array<String>',
        :'document' => :'Array<String>',
        :'image' => :'Array<String>',
        :'video' => :'Array<String>'
      }
    end

    def self.openapi_nullable
      Set.new([
      ])
    end

    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FeverClient::MediaFormats` initialize method"
      end

      acceptable_attribute_map = self.class.acceptable_attribute_map
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!acceptable_attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FeverClient::MediaFormats`. Please check the name to make sure it's valid. List of attributes: " + acceptable_attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'audio')
        if (value = attributes[:'audio']).is_a?(Array)
          self.audio = value
        end
      else
        self.audio = nil
      end

      if attributes.key?(:'document')
        if (value = attributes[:'document']).is_a?(Array)
          self.document = value
        end
      else
        self.document = nil
      end

      if attributes.key?(:'image')
        if (value = attributes[:'image']).is_a?(Array)
          self.image = value
        end
      else
        self.image = nil
      end

      if attributes.key?(:'video')
        if (value = attributes[:'video']).is_a?(Array)
          self.video = value
        end
      else
        self.video = nil
      end
    end

    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @audio.nil?
        invalid_properties.push('invalid value for "audio", audio cannot be nil.')
      end

      if @document.nil?
        invalid_properties.push('invalid value for "document", document cannot be nil.')
      end

      if @image.nil?
        invalid_properties.push('invalid value for "image", image cannot be nil.')
      end

      if @video.nil?
        invalid_properties.push('invalid value for "video", video cannot be nil.')
      end

      invalid_properties
    end

    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @audio.nil?
      return false if @document.nil?
      return false if @image.nil?
      return false if @video.nil?
      true
    end

    def audio=(audio)
      if audio.nil?
        fail ArgumentError, 'audio cannot be nil'
      end

      @audio = audio
    end

    def document=(document)
      if document.nil?
        fail ArgumentError, 'document cannot be nil'
      end

      @document = document
    end

    def image=(image)
      if image.nil?
        fail ArgumentError, 'image cannot be nil'
      end

      @image = image
    end

    def video=(video)
      if video.nil?
        fail ArgumentError, 'video cannot be nil'
      end

      @video = video
    end

    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          audio == o.audio &&
          document == o.document &&
          image == o.image &&
          video == o.video
    end

    def eql?(o)
      self == o
    end

    def hash
      [audio, document, image, video].hash
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
