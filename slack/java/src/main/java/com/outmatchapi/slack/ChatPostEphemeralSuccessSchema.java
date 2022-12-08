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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import invalidPackageName.JSON;

/**
 * Schema for successful response from chat.postEphemeral method
 */
@ApiModel(description = "Schema for successful response from chat.postEphemeral method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ChatPostEphemeralSuccessSchema {
  public static final String SERIALIZED_NAME_MESSAGE_TS = "message_ts";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TS)
  private String messageTs;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public ChatPostEphemeralSuccessSchema() {
  }

  public ChatPostEphemeralSuccessSchema messageTs(String messageTs) {
    
    this.messageTs = messageTs;
    return this;
  }

   /**
   * Get messageTs
   * @return messageTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessageTs() {
    return messageTs;
  }


  public void setMessageTs(String messageTs) {
    this.messageTs = messageTs;
  }


  public ChatPostEphemeralSuccessSchema ok(DefsOkTrue ok) {
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DefsOkTrue getOk() {
    return ok;
  }


  public void setOk(DefsOkTrue ok) {
    this.ok = ok;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatPostEphemeralSuccessSchema chatPostEphemeralSuccessSchema = (ChatPostEphemeralSuccessSchema) o;
    return Objects.equals(this.messageTs, chatPostEphemeralSuccessSchema.messageTs) &&
        Objects.equals(this.ok, chatPostEphemeralSuccessSchema.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageTs, ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatPostEphemeralSuccessSchema {\n");
    sb.append("    messageTs: ").append(toIndentedString(messageTs)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("message_ts");
    openapiFields.add("ok");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message_ts");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChatPostEphemeralSuccessSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChatPostEphemeralSuccessSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatPostEphemeralSuccessSchema is not found in the empty JSON string", ChatPostEphemeralSuccessSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChatPostEphemeralSuccessSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatPostEphemeralSuccessSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatPostEphemeralSuccessSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("message_ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_ts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatPostEphemeralSuccessSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatPostEphemeralSuccessSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatPostEphemeralSuccessSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatPostEphemeralSuccessSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatPostEphemeralSuccessSchema>() {
           @Override
           public void write(JsonWriter out, ChatPostEphemeralSuccessSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatPostEphemeralSuccessSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatPostEphemeralSuccessSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatPostEphemeralSuccessSchema
  * @throws IOException if the JSON string is invalid with respect to ChatPostEphemeralSuccessSchema
  */
  public static ChatPostEphemeralSuccessSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatPostEphemeralSuccessSchema.class);
  }

 /**
  * Convert an instance of ChatPostEphemeralSuccessSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
