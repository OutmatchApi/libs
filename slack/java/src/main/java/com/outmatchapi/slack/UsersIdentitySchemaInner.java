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
import com.outmatchapi.slack.DefsOkTrue;
import com.outmatchapi.slack.RtmConnectSchemaSelf;
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf;
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf1;
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf2;
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf3;
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf3Team;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
public class UsersIdentitySchemaInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UsersIdentitySchemaInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UsersIdentitySchemaInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UsersIdentitySchemaInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UsersIdentitySchemaInnerAnyOf> adapterUsersIdentitySchemaInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(UsersIdentitySchemaInnerAnyOf.class));
            final TypeAdapter<UsersIdentitySchemaInnerAnyOf1> adapterUsersIdentitySchemaInnerAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(UsersIdentitySchemaInnerAnyOf1.class));
            final TypeAdapter<UsersIdentitySchemaInnerAnyOf2> adapterUsersIdentitySchemaInnerAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(UsersIdentitySchemaInnerAnyOf2.class));
            final TypeAdapter<UsersIdentitySchemaInnerAnyOf3> adapterUsersIdentitySchemaInnerAnyOf3 = gson.getDelegateAdapter(this, TypeToken.get(UsersIdentitySchemaInnerAnyOf3.class));

            return (TypeAdapter<T>) new TypeAdapter<UsersIdentitySchemaInner>() {
                @Override
                public void write(JsonWriter out, UsersIdentitySchemaInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UsersIdentitySchemaInnerAnyOf`
                    if (value.getActualInstance() instanceof UsersIdentitySchemaInnerAnyOf) {
                        JsonObject obj = adapterUsersIdentitySchemaInnerAnyOf.toJsonTree((UsersIdentitySchemaInnerAnyOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UsersIdentitySchemaInnerAnyOf1`
                    if (value.getActualInstance() instanceof UsersIdentitySchemaInnerAnyOf1) {
                        JsonObject obj = adapterUsersIdentitySchemaInnerAnyOf1.toJsonTree((UsersIdentitySchemaInnerAnyOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UsersIdentitySchemaInnerAnyOf2`
                    if (value.getActualInstance() instanceof UsersIdentitySchemaInnerAnyOf2) {
                        JsonObject obj = adapterUsersIdentitySchemaInnerAnyOf2.toJsonTree((UsersIdentitySchemaInnerAnyOf2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UsersIdentitySchemaInnerAnyOf3`
                    if (value.getActualInstance() instanceof UsersIdentitySchemaInnerAnyOf3) {
                        JsonObject obj = adapterUsersIdentitySchemaInnerAnyOf3.toJsonTree((UsersIdentitySchemaInnerAnyOf3)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: UsersIdentitySchemaInnerAnyOf, UsersIdentitySchemaInnerAnyOf1, UsersIdentitySchemaInnerAnyOf2, UsersIdentitySchemaInnerAnyOf3");
                }

                @Override
                public UsersIdentitySchemaInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize UsersIdentitySchemaInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsersIdentitySchemaInnerAnyOf.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'UsersIdentitySchemaInnerAnyOf'");
                        UsersIdentitySchemaInner ret = new UsersIdentitySchemaInner();
                        ret.setActualInstance(adapterUsersIdentitySchemaInnerAnyOf.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'UsersIdentitySchemaInnerAnyOf'", e);
                    }

                    // deserialize UsersIdentitySchemaInnerAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsersIdentitySchemaInnerAnyOf1.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'UsersIdentitySchemaInnerAnyOf1'");
                        UsersIdentitySchemaInner ret = new UsersIdentitySchemaInner();
                        ret.setActualInstance(adapterUsersIdentitySchemaInnerAnyOf1.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'UsersIdentitySchemaInnerAnyOf1'", e);
                    }

                    // deserialize UsersIdentitySchemaInnerAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsersIdentitySchemaInnerAnyOf2.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'UsersIdentitySchemaInnerAnyOf2'");
                        UsersIdentitySchemaInner ret = new UsersIdentitySchemaInner();
                        ret.setActualInstance(adapterUsersIdentitySchemaInnerAnyOf2.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'UsersIdentitySchemaInnerAnyOf2'", e);
                    }

                    // deserialize UsersIdentitySchemaInnerAnyOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsersIdentitySchemaInnerAnyOf3.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'UsersIdentitySchemaInnerAnyOf3'");
                        UsersIdentitySchemaInner ret = new UsersIdentitySchemaInner();
                        ret.setActualInstance(adapterUsersIdentitySchemaInnerAnyOf3.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'UsersIdentitySchemaInnerAnyOf3'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for UsersIdentitySchemaInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UsersIdentitySchemaInner() {
        super("anyOf", Boolean.FALSE);
    }

    public UsersIdentitySchemaInner(UsersIdentitySchemaInnerAnyOf o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UsersIdentitySchemaInner(UsersIdentitySchemaInnerAnyOf1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UsersIdentitySchemaInner(UsersIdentitySchemaInnerAnyOf2 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UsersIdentitySchemaInner(UsersIdentitySchemaInnerAnyOf3 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UsersIdentitySchemaInnerAnyOf", new GenericType<UsersIdentitySchemaInnerAnyOf>() {
        });
        schemas.put("UsersIdentitySchemaInnerAnyOf1", new GenericType<UsersIdentitySchemaInnerAnyOf1>() {
        });
        schemas.put("UsersIdentitySchemaInnerAnyOf2", new GenericType<UsersIdentitySchemaInnerAnyOf2>() {
        });
        schemas.put("UsersIdentitySchemaInnerAnyOf3", new GenericType<UsersIdentitySchemaInnerAnyOf3>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UsersIdentitySchemaInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * UsersIdentitySchemaInnerAnyOf, UsersIdentitySchemaInnerAnyOf1, UsersIdentitySchemaInnerAnyOf2, UsersIdentitySchemaInnerAnyOf3
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UsersIdentitySchemaInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UsersIdentitySchemaInnerAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UsersIdentitySchemaInnerAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UsersIdentitySchemaInnerAnyOf3) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UsersIdentitySchemaInnerAnyOf, UsersIdentitySchemaInnerAnyOf1, UsersIdentitySchemaInnerAnyOf2, UsersIdentitySchemaInnerAnyOf3");
    }

    /**
     * Get the actual instance, which can be the following:
     * UsersIdentitySchemaInnerAnyOf, UsersIdentitySchemaInnerAnyOf1, UsersIdentitySchemaInnerAnyOf2, UsersIdentitySchemaInnerAnyOf3
     *
     * @return The actual instance (UsersIdentitySchemaInnerAnyOf, UsersIdentitySchemaInnerAnyOf1, UsersIdentitySchemaInnerAnyOf2, UsersIdentitySchemaInnerAnyOf3)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UsersIdentitySchemaInnerAnyOf`. If the actual instance is not `UsersIdentitySchemaInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsersIdentitySchemaInnerAnyOf`
     * @throws ClassCastException if the instance is not `UsersIdentitySchemaInnerAnyOf`
     */
    public UsersIdentitySchemaInnerAnyOf getUsersIdentitySchemaInnerAnyOf() throws ClassCastException {
        return (UsersIdentitySchemaInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UsersIdentitySchemaInnerAnyOf1`. If the actual instance is not `UsersIdentitySchemaInnerAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsersIdentitySchemaInnerAnyOf1`
     * @throws ClassCastException if the instance is not `UsersIdentitySchemaInnerAnyOf1`
     */
    public UsersIdentitySchemaInnerAnyOf1 getUsersIdentitySchemaInnerAnyOf1() throws ClassCastException {
        return (UsersIdentitySchemaInnerAnyOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UsersIdentitySchemaInnerAnyOf2`. If the actual instance is not `UsersIdentitySchemaInnerAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsersIdentitySchemaInnerAnyOf2`
     * @throws ClassCastException if the instance is not `UsersIdentitySchemaInnerAnyOf2`
     */
    public UsersIdentitySchemaInnerAnyOf2 getUsersIdentitySchemaInnerAnyOf2() throws ClassCastException {
        return (UsersIdentitySchemaInnerAnyOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UsersIdentitySchemaInnerAnyOf3`. If the actual instance is not `UsersIdentitySchemaInnerAnyOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsersIdentitySchemaInnerAnyOf3`
     * @throws ClassCastException if the instance is not `UsersIdentitySchemaInnerAnyOf3`
     */
    public UsersIdentitySchemaInnerAnyOf3 getUsersIdentitySchemaInnerAnyOf3() throws ClassCastException {
        return (UsersIdentitySchemaInnerAnyOf3)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersIdentitySchemaInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with UsersIdentitySchemaInnerAnyOf
    try {
      UsersIdentitySchemaInnerAnyOf.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with UsersIdentitySchemaInnerAnyOf1
    try {
      UsersIdentitySchemaInnerAnyOf1.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with UsersIdentitySchemaInnerAnyOf2
    try {
      UsersIdentitySchemaInnerAnyOf2.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with UsersIdentitySchemaInnerAnyOf3
    try {
      UsersIdentitySchemaInnerAnyOf3.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for UsersIdentitySchemaInner with anyOf schemas: UsersIdentitySchemaInnerAnyOf, UsersIdentitySchemaInnerAnyOf1, UsersIdentitySchemaInnerAnyOf2, UsersIdentitySchemaInnerAnyOf3. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UsersIdentitySchemaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersIdentitySchemaInner
  * @throws IOException if the JSON string is invalid with respect to UsersIdentitySchemaInner
  */
  public static UsersIdentitySchemaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersIdentitySchemaInner.class);
  }

 /**
  * Convert an instance of UsersIdentitySchemaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

