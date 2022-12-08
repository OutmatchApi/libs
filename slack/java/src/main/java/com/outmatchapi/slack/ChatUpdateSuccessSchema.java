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
import com.outmatchapi.slack.MessageObject;
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
 * Schema for successful response of chat.update method
 */
@ApiModel(description = "Schema for successful response of chat.update method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ChatUpdateSuccessSchema {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private MessageObject message;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private String ts;

  public ChatUpdateSuccessSchema() {
  }

  public ChatUpdateSuccessSchema channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public ChatUpdateSuccessSchema message(MessageObject message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageObject getMessage() {
    return message;
  }


  public void setMessage(MessageObject message) {
    this.message = message;
  }


  public ChatUpdateSuccessSchema ok(DefsOkTrue ok) {
    
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


  public ChatUpdateSuccessSchema text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public ChatUpdateSuccessSchema ts(String ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTs() {
    return ts;
  }


  public void setTs(String ts) {
    this.ts = ts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatUpdateSuccessSchema chatUpdateSuccessSchema = (ChatUpdateSuccessSchema) o;
    return Objects.equals(this.channel, chatUpdateSuccessSchema.channel) &&
        Objects.equals(this.message, chatUpdateSuccessSchema.message) &&
        Objects.equals(this.ok, chatUpdateSuccessSchema.ok) &&
        Objects.equals(this.text, chatUpdateSuccessSchema.text) &&
        Objects.equals(this.ts, chatUpdateSuccessSchema.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, message, ok, text, ts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatUpdateSuccessSchema {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("message");
    openapiFields.add("ok");
    openapiFields.add("text");
    openapiFields.add("ts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("ok");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("ts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChatUpdateSuccessSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChatUpdateSuccessSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatUpdateSuccessSchema is not found in the empty JSON string", ChatUpdateSuccessSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChatUpdateSuccessSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatUpdateSuccessSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatUpdateSuccessSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      // validate the required field `message`
      MessageObject.validateJsonObject(jsonObj.getAsJsonObject("message"));
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatUpdateSuccessSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatUpdateSuccessSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatUpdateSuccessSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatUpdateSuccessSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatUpdateSuccessSchema>() {
           @Override
           public void write(JsonWriter out, ChatUpdateSuccessSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatUpdateSuccessSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatUpdateSuccessSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatUpdateSuccessSchema
  * @throws IOException if the JSON string is invalid with respect to ChatUpdateSuccessSchema
  */
  public static ChatUpdateSuccessSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatUpdateSuccessSchema.class);
  }

 /**
  * Convert an instance of ChatUpdateSuccessSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

