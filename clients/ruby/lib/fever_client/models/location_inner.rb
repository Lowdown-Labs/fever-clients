require 'date'
require 'time'

module FeverClient
  module LocationInner
    class << self
      def openapi_any_of
        [
          :'Integer',
          :'String'
        ]
      end

      def build(data)
        openapi_any_of.each do |klass|
          begin
            next if klass == :AnyType
            return find_and_cast_into_type(klass, data)
          rescue
          end
        end

        openapi_any_of.include?(:AnyType) ? data : nil
      end

      private

      SchemaMismatchError = Class.new(StandardError)

      def find_and_cast_into_type(klass, data)
        return if data.nil?

        case klass.to_s
        when 'Boolean'
          return data if data.instance_of?(TrueClass) || data.instance_of?(FalseClass)
        when 'Float'
          return data if data.instance_of?(Float)
        when 'Integer'
          return data if data.instance_of?(Integer)
        when 'Time'
          return Time.parse(data)
        when 'Date'
          return Date.iso8601(data)
        when 'String'
          return data if data.instance_of?(String)
        when 'Object' # "type: object"
          return data if data.instance_of?(Hash)
        when /\AArray<(?<sub_type>.+)>\z/ # "type: array"
          if data.instance_of?(Array)
            sub_type = Regexp.last_match[:sub_type]
            return data.map { |item| find_and_cast_into_type(sub_type, item) }
          end
        when /\AHash<String, (?<sub_type>.+)>\z/ # "type: object" with "additionalProperties: { ... }"
          if data.instance_of?(Hash) && data.keys.all? { |k| k.instance_of?(Symbol) || k.instance_of?(String) }
            sub_type = Regexp.last_match[:sub_type]
            return data.each_with_object({}) { |(k, v), hsh| hsh[k] = find_and_cast_into_type(sub_type, v) }
          end
        else
          const = FeverClient.const_get(klass)
          if const
            if const.respond_to?(:openapi_any_of)
              model = const.build(data)
              return model if model
            else
              raise if const.respond_to?(:acceptable_attributes) && !(data.keys - const.acceptable_attributes).empty?
              model = const.build_from_hash(data)
              return model if model
            end
          end
        end

        raise
      rescue
        raise SchemaMismatchError, "#{data} doesn't match the #{klass} type"
      end
    end
  end

end
