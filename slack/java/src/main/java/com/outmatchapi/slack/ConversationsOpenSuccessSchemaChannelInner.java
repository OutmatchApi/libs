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
import com.outmatchapi.slack.ConversationsOpenSuccessSchemaChannelInnerAnyOf;
import com.outmatchapi.slack.ObjsConversationInner;
import com.outmatchapi.slack.ObjsMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
public class ConversationsOpenSuccessSchemaChannelInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ConversationsOpenSuccessSchemaChannelInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConversationsOpenSuccessSchemaChannelInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConversationsOpenSuccessSchemaChannelInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConversationsOpenSuccessSchemaChannelInnerAnyOf> adapterConversationsOpenSuccessSchemaChannelInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(ConversationsOpenSuccessSchemaChannelInnerAnyOf.class));
            final TypeAdapter<List&lt;ObjsConversationInner&gt;> adapterList&lt;ObjsConversationInner&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;ObjsConversationInner&gt;.class));

            return (TypeAdapter<T>) new TypeAdapter<ConversationsOpenSuccessSchemaChannelInner>() {
                @Override
                public void write(JsonWriter out, ConversationsOpenSuccessSchemaChannelInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ConversationsOpenSuccessSchemaChannelInnerAnyOf`
                    if (value.getActualInstance() instanceof ConversationsOpenSuccessSchemaChannelInnerAnyOf) {
                        JsonObject obj = adapterConversationsOpenSuccessSchemaChannelInnerAnyOf.toJsonTree((ConversationsOpenSuccessSchemaChannelInnerAnyOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;ObjsConversationInner&gt;`
                    if (value.getActualInstance() instanceof List&lt;ObjsConversationInner&gt;) {
                        JsonObject obj = adapterList&lt;ObjsConversationInner&gt;.toJsonTree((List&lt;ObjsConversationInner&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ConversationsOpenSuccessSchemaChannelInnerAnyOf, List<ObjsConversationInner>");
                }

                @Override
                public ConversationsOpenSuccessSchemaChannelInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize ConversationsOpenSuccessSchemaChannelInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConversationsOpenSuccessSchemaChannelInnerAnyOf.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ConversationsOpenSuccessSchemaChannelInnerAnyOf'");
                        ConversationsOpenSuccessSchemaChannelInner ret = new ConversationsOpenSuccessSchemaChannelInner();
                        ret.setActualInstance(adapterConversationsOpenSuccessSchemaChannelInnerAnyOf.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ConversationsOpenSuccessSchemaChannelInnerAnyOf'", e);
                    }

                    // deserialize List<ObjsConversationInner>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;ObjsConversationInner&gt;.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'List<ObjsConversationInner>'");
                        ConversationsOpenSuccessSchemaChannelInner ret = new ConversationsOpenSuccessSchemaChannelInner();
                        ret.setActualInstance(adapterList&lt;ObjsConversationInner&gt;.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'List<ObjsConversationInner>'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ConversationsOpenSuccessSchemaChannelInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ConversationsOpenSuccessSchemaChannelInner() {
        super("anyOf", Boolean.FALSE);
    }

    public ConversationsOpenSuccessSchemaChannelInner(ConversationsOpenSuccessSchemaChannelInnerAnyOf o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ConversationsOpenSuccessSchemaChannelInner(List<ObjsConversationInner> o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConversationsOpenSuccessSchemaChannelInnerAnyOf", new GenericType<ConversationsOpenSuccessSchemaChannelInnerAnyOf>() {
        });
        schemas.put("List<ObjsConversationInner>", new GenericType<List<ObjsConversationInner>>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ConversationsOpenSuccessSchemaChannelInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ConversationsOpenSuccessSchemaChannelInnerAnyOf, List<ObjsConversationInner>
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ConversationsOpenSuccessSchemaChannelInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<ObjsConversationInner>) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ConversationsOpenSuccessSchemaChannelInnerAnyOf, List<ObjsConversationInner>");
    }

    /**
     * Get the actual instance, which can be the following:
     * ConversationsOpenSuccessSchemaChannelInnerAnyOf, List<ObjsConversationInner>
     *
     * @return The actual instance (ConversationsOpenSuccessSchemaChannelInnerAnyOf, List<ObjsConversationInner>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConversationsOpenSuccessSchemaChannelInnerAnyOf`. If the actual instance is not `ConversationsOpenSuccessSchemaChannelInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConversationsOpenSuccessSchemaChannelInnerAnyOf`
     * @throws ClassCastException if the instance is not `ConversationsOpenSuccessSchemaChannelInnerAnyOf`
     */
    public ConversationsOpenSuccessSchemaChannelInnerAnyOf getConversationsOpenSuccessSchemaChannelInnerAnyOf() throws ClassCastException {
        return (ConversationsOpenSuccessSchemaChannelInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<ObjsConversationInner>`. If the actual instance is not `List<ObjsConversationInner>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<ObjsConversationInner>`
     * @throws ClassCastException if the instance is not `List<ObjsConversationInner>`
     */
    public List<ObjsConversationInner> getList<ObjsConversationInner>() throws ClassCastException {
        return (List<ObjsConversationInner>)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationsOpenSuccessSchemaChannelInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with ConversationsOpenSuccessSchemaChannelInnerAnyOf
    try {
      ConversationsOpenSuccessSchemaChannelInnerAnyOf.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with List<ObjsConversationInner>
    try {
      List<ObjsConversationInner>.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ConversationsOpenSuccessSchemaChannelInner with anyOf schemas: ConversationsOpenSuccessSchemaChannelInnerAnyOf, List<ObjsConversationInner>. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ConversationsOpenSuccessSchemaChannelInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationsOpenSuccessSchemaChannelInner
  * @throws IOException if the JSON string is invalid with respect to ConversationsOpenSuccessSchemaChannelInner
  */
  public static ConversationsOpenSuccessSchemaChannelInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsOpenSuccessSchemaChannelInner.class);
  }

 /**
  * Convert an instance of ConversationsOpenSuccessSchemaChannelInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

