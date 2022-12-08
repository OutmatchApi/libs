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
import com.outmatchapi.slack.ObjsBotProfile;
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
 * ChatScheduleMessageSuccessSchemaMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ChatScheduleMessageSuccessSchemaMessage {
  public static final String SERIALIZED_NAME_BOT_ID = "bot_id";
  @SerializedName(SERIALIZED_NAME_BOT_ID)
  private String botId;

  public static final String SERIALIZED_NAME_BOT_PROFILE = "bot_profile";
  @SerializedName(SERIALIZED_NAME_BOT_PROFILE)
  private ObjsBotProfile botProfile;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public ChatScheduleMessageSuccessSchemaMessage() {
  }

  public ChatScheduleMessageSuccessSchemaMessage botId(String botId) {
    
    this.botId = botId;
    return this;
  }

   /**
   * Get botId
   * @return botId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBotId() {
    return botId;
  }


  public void setBotId(String botId) {
    this.botId = botId;
  }


  public ChatScheduleMessageSuccessSchemaMessage botProfile(ObjsBotProfile botProfile) {
    
    this.botProfile = botProfile;
    return this;
  }

   /**
   * Get botProfile
   * @return botProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsBotProfile getBotProfile() {
    return botProfile;
  }


  public void setBotProfile(ObjsBotProfile botProfile) {
    this.botProfile = botProfile;
  }


  public ChatScheduleMessageSuccessSchemaMessage team(String team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    this.team = team;
  }


  public ChatScheduleMessageSuccessSchemaMessage text(String text) {
    
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


  public ChatScheduleMessageSuccessSchemaMessage type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ChatScheduleMessageSuccessSchemaMessage user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public ChatScheduleMessageSuccessSchemaMessage username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatScheduleMessageSuccessSchemaMessage chatScheduleMessageSuccessSchemaMessage = (ChatScheduleMessageSuccessSchemaMessage) o;
    return Objects.equals(this.botId, chatScheduleMessageSuccessSchemaMessage.botId) &&
        Objects.equals(this.botProfile, chatScheduleMessageSuccessSchemaMessage.botProfile) &&
        Objects.equals(this.team, chatScheduleMessageSuccessSchemaMessage.team) &&
        Objects.equals(this.text, chatScheduleMessageSuccessSchemaMessage.text) &&
        Objects.equals(this.type, chatScheduleMessageSuccessSchemaMessage.type) &&
        Objects.equals(this.user, chatScheduleMessageSuccessSchemaMessage.user) &&
        Objects.equals(this.username, chatScheduleMessageSuccessSchemaMessage.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, botProfile, team, text, type, user, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatScheduleMessageSuccessSchemaMessage {\n");
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botProfile: ").append(toIndentedString(botProfile)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("bot_id");
    openapiFields.add("bot_profile");
    openapiFields.add("team");
    openapiFields.add("text");
    openapiFields.add("type");
    openapiFields.add("user");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bot_id");
    openapiRequiredFields.add("team");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChatScheduleMessageSuccessSchemaMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChatScheduleMessageSuccessSchemaMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatScheduleMessageSuccessSchemaMessage is not found in the empty JSON string", ChatScheduleMessageSuccessSchemaMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChatScheduleMessageSuccessSchemaMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatScheduleMessageSuccessSchemaMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatScheduleMessageSuccessSchemaMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("bot_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_id").toString()));
      }
      // validate the optional field `bot_profile`
      if (jsonObj.get("bot_profile") != null && !jsonObj.get("bot_profile").isJsonNull()) {
        ObjsBotProfile.validateJsonObject(jsonObj.getAsJsonObject("bot_profile"));
      }
      if (!jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatScheduleMessageSuccessSchemaMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatScheduleMessageSuccessSchemaMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatScheduleMessageSuccessSchemaMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatScheduleMessageSuccessSchemaMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatScheduleMessageSuccessSchemaMessage>() {
           @Override
           public void write(JsonWriter out, ChatScheduleMessageSuccessSchemaMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatScheduleMessageSuccessSchemaMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatScheduleMessageSuccessSchemaMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatScheduleMessageSuccessSchemaMessage
  * @throws IOException if the JSON string is invalid with respect to ChatScheduleMessageSuccessSchemaMessage
  */
  public static ChatScheduleMessageSuccessSchemaMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatScheduleMessageSuccessSchemaMessage.class);
  }

 /**
  * Convert an instance of ChatScheduleMessageSuccessSchemaMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

