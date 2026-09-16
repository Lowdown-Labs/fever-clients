package com.lowdownlabs.fever.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
@JsonDeserialize(using=LocationInner.LocationInnerDeserializer.class)
@JsonSerialize(using = LocationInner.LocationInnerSerializer.class)
public class LocationInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LocationInner.class.getName());

    public static class LocationInnerSerializer extends StdSerializer<LocationInner> {
        public LocationInnerSerializer(Class<LocationInner> t) {
            super(t);
        }

        public LocationInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(LocationInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class LocationInnerDeserializer extends StdDeserializer<LocationInner> {
        public LocationInnerDeserializer() {
            this(LocationInner.class);
        }

        public LocationInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public LocationInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = ctxt.readTree(jp);

            Object deserialized = null;
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Integer.class);
                LocationInner ret = new LocationInner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                log.log(Level.FINER, "Input data does not match 'LocationInner'", e);
            }

            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(String.class);
                LocationInner ret = new LocationInner();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                log.log(Level.FINER, "Input data does not match 'LocationInner'", e);
            }

            throw new IOException("Failed deserialization for LocationInner: no match found");
        }

        @Override
        public LocationInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "LocationInner cannot be null");
        }
    }

    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public LocationInner() {
        super("anyOf", Boolean.FALSE);
    }

    public LocationInner(Integer o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LocationInner(String o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Integer", Integer.class);
        schemas.put("String", String.class);
        JSON.registerDescendants(LocationInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return LocationInner.schemas;
    }

    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Integer.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Integer, String");
    }

    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    public Integer getInteger() throws ClassCastException {
        return (Integer)super.getActualInstance();
    }

    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      prefix = "";
    } else {
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    return null;
  }

}

