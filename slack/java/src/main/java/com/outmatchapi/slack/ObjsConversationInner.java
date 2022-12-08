/*
 * Slack Web API
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outmatchapi.slack;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outmatchapi.slack.ConversationIMChannelObjectFromConversationsMethods;
import com.outmatchapi.slack.ConversationIMChannelObjectFromConversationsMethodsSharesInner;
import com.outmatchapi.slack.ConversationMPIMObject;
import com.outmatchapi.slack.ConversationObject;
import com.outmatchapi.slack.ConversationObjectDisplayCounts;
import com.outmatchapi.slack.ConversationObjectParentConversationInner;
import com.outmatchapi.slack.ObjsChannelLatestInner;
import com.outmatchapi.slack.ObjsChannelPurpose;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import invalidPackageName.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ObjsConversationInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ObjsConversationInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ObjsConversationInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ObjsConversationInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConversationIMChannelObjectFromConversationsMethods> adapterConversationIMChannelObjectFromConversationsMethods = gson.getDelegateAdapter(this, TypeToken.get(ConversationIMChannelObjectFromConversationsMethods.class));
            final TypeAdapter<ConversationMPIMObject> adapterConversationMPIMObject = gson.getDelegateAdapter(this, TypeToken.get(ConversationMPIMObject.class));
            final TypeAdapter<ConversationObject> adapterConversationObject = gson.getDelegateAdapter(this, TypeToken.get(ConversationObject.class));

            return (TypeAdapter<T>) new TypeAdapter<ObjsConversationInner>() {
                @Override
                public void write(JsonWriter out, ObjsConversationInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ConversationIMChannelObjectFromConversationsMethods`
                    if (value.getActualInstance() instanceof ConversationIMChannelObjectFromConversationsMethods) {
                        JsonObject obj = adapterConversationIMChannelObjectFromConversationsMethods.toJsonTree((ConversationIMChannelObjectFromConversationsMethods)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ConversationMPIMObject`
                    if (value.getActualInstance() instanceof ConversationMPIMObject) {
                        JsonObject obj = adapterConversationMPIMObject.toJsonTree((ConversationMPIMObject)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ConversationObject`
                    if (value.getActualInstance() instanceof ConversationObject) {
                        JsonObject obj = adapterConversationObject.toJsonTree((ConversationObject)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ConversationIMChannelObjectFromConversationsMethods, ConversationMPIMObject, ConversationObject");
                }

                @Override
                public ObjsConversationInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize ConversationIMChannelObjectFromConversationsMethods
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConversationIMChannelObjectFromConversationsMethods.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ConversationIMChannelObjectFromConversationsMethods'");
                        ObjsConversationInner ret = new ObjsConversationInner();
                        ret.setActualInstance(adapterConversationIMChannelObjectFromConversationsMethods.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ConversationIMChannelObjectFromConversationsMethods'", e);
                    }

                    // deserialize ConversationMPIMObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConversationMPIMObject.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ConversationMPIMObject'");
                        ObjsConversationInner ret = new ObjsConversationInner();
                        ret.setActualInstance(adapterConversationMPIMObject.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ConversationMPIMObject'", e);
                    }

                    // deserialize ConversationObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConversationObject.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ConversationObject'");
                        ObjsConversationInner ret = new ObjsConversationInner();
                        ret.setActualInstance(adapterConversationObject.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ConversationObject'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ObjsConversationInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ObjsConversationInner() {
        super("anyOf", Boolean.FALSE);
    }

    public ObjsConversationInner(ConversationIMChannelObjectFromConversationsMethods o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ObjsConversationInner(ConversationMPIMObject o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ObjsConversationInner(ConversationObject o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConversationIMChannelObjectFromConversationsMethods", new GenericType<ConversationIMChannelObjectFromConversationsMethods>() {
        });
        schemas.put("ConversationMPIMObject", new GenericType<ConversationMPIMObject>() {
        });
        schemas.put("ConversationObject", new GenericType<ConversationObject>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ObjsConversationInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ConversationIMChannelObjectFromConversationsMethods, ConversationMPIMObject, ConversationObject
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ConversationIMChannelObjectFromConversationsMethods) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ConversationMPIMObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ConversationObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ConversationIMChannelObjectFromConversationsMethods, ConversationMPIMObject, ConversationObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * ConversationIMChannelObjectFromConversationsMethods, ConversationMPIMObject, ConversationObject
     *
     * @return The actual instance (ConversationIMChannelObjectFromConversationsMethods, ConversationMPIMObject, ConversationObject)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConversationIMChannelObjectFromConversationsMethods`. If the actual instance is not `ConversationIMChannelObjectFromConversationsMethods`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConversationIMChannelObjectFromConversationsMethods`
     * @throws ClassCastException if the instance is not `ConversationIMChannelObjectFromConversationsMethods`
     */
    public ConversationIMChannelObjectFromConversationsMethods getConversationIMChannelObjectFromConversationsMethods() throws ClassCastException {
        return (ConversationIMChannelObjectFromConversationsMethods)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConversationMPIMObject`. If the actual instance is not `ConversationMPIMObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConversationMPIMObject`
     * @throws ClassCastException if the instance is not `ConversationMPIMObject`
     */
    public ConversationMPIMObject getConversationMPIMObject() throws ClassCastException {
        return (ConversationMPIMObject)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConversationObject`. If the actual instance is not `ConversationObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConversationObject`
     * @throws ClassCastException if the instance is not `ConversationObject`
     */
    public ConversationObject getConversationObject() throws ClassCastException {
        return (ConversationObject)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjsConversationInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with ConversationIMChannelObjectFromConversationsMethods
    try {
      ConversationIMChannelObjectFromConversationsMethods.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ConversationMPIMObject
    try {
      ConversationMPIMObject.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ConversationObject
    try {
      ConversationObject.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ObjsConversationInner with anyOf schemas: ConversationIMChannelObjectFromConversationsMethods, ConversationMPIMObject, ConversationObject. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ObjsConversationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjsConversationInner
  * @throws IOException if the JSON string is invalid with respect to ObjsConversationInner
  */
  public static ObjsConversationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjsConversationInner.class);
  }

 /**
  * Convert an instance of ObjsConversationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

