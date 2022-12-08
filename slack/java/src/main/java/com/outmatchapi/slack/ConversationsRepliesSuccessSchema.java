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
import com.outmatchapi.slack.ConversationsRepliesSuccessSchemaMessagesInnerInner;
import com.outmatchapi.slack.DefsOkTrue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Schema for successful response from conversations.replies method
 */
@ApiModel(description = "Schema for successful response from conversations.replies method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ConversationsRepliesSuccessSchema {
  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<List<ConversationsRepliesSuccessSchemaMessagesInnerInner>> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public ConversationsRepliesSuccessSchema() {
  }

  public ConversationsRepliesSuccessSchema hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public ConversationsRepliesSuccessSchema messages(List<List<ConversationsRepliesSuccessSchemaMessagesInnerInner>> messages) {
    
    this.messages = messages;
    return this;
  }

  public ConversationsRepliesSuccessSchema addMessagesItem(List<ConversationsRepliesSuccessSchemaMessagesInnerInner> messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<List<ConversationsRepliesSuccessSchemaMessagesInnerInner>> getMessages() {
    return messages;
  }


  public void setMessages(List<List<ConversationsRepliesSuccessSchemaMessagesInnerInner>> messages) {
    this.messages = messages;
  }


  public ConversationsRepliesSuccessSchema ok(DefsOkTrue ok) {
    
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
    ConversationsRepliesSuccessSchema conversationsRepliesSuccessSchema = (ConversationsRepliesSuccessSchema) o;
    return Objects.equals(this.hasMore, conversationsRepliesSuccessSchema.hasMore) &&
        Objects.equals(this.messages, conversationsRepliesSuccessSchema.messages) &&
        Objects.equals(this.ok, conversationsRepliesSuccessSchema.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, messages, ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsRepliesSuccessSchema {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
    openapiFields.add("has_more");
    openapiFields.add("messages");
    openapiFields.add("ok");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationsRepliesSuccessSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConversationsRepliesSuccessSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationsRepliesSuccessSchema is not found in the empty JSON string", ConversationsRepliesSuccessSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationsRepliesSuccessSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationsRepliesSuccessSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConversationsRepliesSuccessSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("messages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationsRepliesSuccessSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationsRepliesSuccessSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationsRepliesSuccessSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationsRepliesSuccessSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationsRepliesSuccessSchema>() {
           @Override
           public void write(JsonWriter out, ConversationsRepliesSuccessSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationsRepliesSuccessSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationsRepliesSuccessSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationsRepliesSuccessSchema
  * @throws IOException if the JSON string is invalid with respect to ConversationsRepliesSuccessSchema
  */
  public static ConversationsRepliesSuccessSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsRepliesSuccessSchema.class);
  }

 /**
  * Convert an instance of ConversationsRepliesSuccessSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

