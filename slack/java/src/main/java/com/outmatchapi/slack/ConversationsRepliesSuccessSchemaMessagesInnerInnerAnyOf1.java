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
import com.outmatchapi.slack.ObjsUserProfileShort;
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
 * ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 {
  public static final String SERIALIZED_NAME_IS_STARRED = "is_starred";
  @SerializedName(SERIALIZED_NAME_IS_STARRED)
  private Boolean isStarred;

  public static final String SERIALIZED_NAME_PARENT_USER_ID = "parent_user_id";
  @SerializedName(SERIALIZED_NAME_PARENT_USER_ID)
  private String parentUserId;

  public static final String SERIALIZED_NAME_SOURCE_TEAM = "source_team";
  @SerializedName(SERIALIZED_NAME_SOURCE_TEAM)
  private String sourceTeam;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_THREAD_TS = "thread_ts";
  @SerializedName(SERIALIZED_NAME_THREAD_TS)
  private String threadTs;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private String ts;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_USER_PROFILE = "user_profile";
  @SerializedName(SERIALIZED_NAME_USER_PROFILE)
  private ObjsUserProfileShort userProfile;

  public static final String SERIALIZED_NAME_USER_TEAM = "user_team";
  @SerializedName(SERIALIZED_NAME_USER_TEAM)
  private String userTeam;

  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1() {
  }

  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 isStarred(Boolean isStarred) {
    
    this.isStarred = isStarred;
    return this;
  }

   /**
   * Get isStarred
   * @return isStarred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsStarred() {
    return isStarred;
  }


  public void setIsStarred(Boolean isStarred) {
    this.isStarred = isStarred;
  }


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 parentUserId(String parentUserId) {
    
    this.parentUserId = parentUserId;
    return this;
  }

   /**
   * Get parentUserId
   * @return parentUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getParentUserId() {
    return parentUserId;
  }


  public void setParentUserId(String parentUserId) {
    this.parentUserId = parentUserId;
  }


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 sourceTeam(String sourceTeam) {
    
    this.sourceTeam = sourceTeam;
    return this;
  }

   /**
   * Get sourceTeam
   * @return sourceTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceTeam() {
    return sourceTeam;
  }


  public void setSourceTeam(String sourceTeam) {
    this.sourceTeam = sourceTeam;
  }


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 team(String team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    this.team = team;
  }


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 text(String text) {
    
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


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 threadTs(String threadTs) {
    
    this.threadTs = threadTs;
    return this;
  }

   /**
   * Get threadTs
   * @return threadTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThreadTs() {
    return threadTs;
  }


  public void setThreadTs(String threadTs) {
    this.threadTs = threadTs;
  }


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 ts(String ts) {
    
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


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 type(String type) {
    
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


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 user(String user) {
    
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


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 userProfile(ObjsUserProfileShort userProfile) {
    
    this.userProfile = userProfile;
    return this;
  }

   /**
   * Get userProfile
   * @return userProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsUserProfileShort getUserProfile() {
    return userProfile;
  }


  public void setUserProfile(ObjsUserProfileShort userProfile) {
    this.userProfile = userProfile;
  }


  public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 userTeam(String userTeam) {
    
    this.userTeam = userTeam;
    return this;
  }

   /**
   * Get userTeam
   * @return userTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserTeam() {
    return userTeam;
  }


  public void setUserTeam(String userTeam) {
    this.userTeam = userTeam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 = (ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1) o;
    return Objects.equals(this.isStarred, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.isStarred) &&
        Objects.equals(this.parentUserId, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.parentUserId) &&
        Objects.equals(this.sourceTeam, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.sourceTeam) &&
        Objects.equals(this.team, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.team) &&
        Objects.equals(this.text, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.text) &&
        Objects.equals(this.threadTs, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.threadTs) &&
        Objects.equals(this.ts, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.ts) &&
        Objects.equals(this.type, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.type) &&
        Objects.equals(this.user, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.user) &&
        Objects.equals(this.userProfile, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.userProfile) &&
        Objects.equals(this.userTeam, conversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.userTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isStarred, parentUserId, sourceTeam, team, text, threadTs, ts, type, user, userProfile, userTeam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 {\n");
    sb.append("    isStarred: ").append(toIndentedString(isStarred)).append("\n");
    sb.append("    parentUserId: ").append(toIndentedString(parentUserId)).append("\n");
    sb.append("    sourceTeam: ").append(toIndentedString(sourceTeam)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    threadTs: ").append(toIndentedString(threadTs)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    userTeam: ").append(toIndentedString(userTeam)).append("\n");
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
    openapiFields.add("is_starred");
    openapiFields.add("parent_user_id");
    openapiFields.add("source_team");
    openapiFields.add("team");
    openapiFields.add("text");
    openapiFields.add("thread_ts");
    openapiFields.add("ts");
    openapiFields.add("type");
    openapiFields.add("user");
    openapiFields.add("user_profile");
    openapiFields.add("user_team");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parent_user_id");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("thread_ts");
    openapiRequiredFields.add("ts");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 is not found in the empty JSON string", ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("parent_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_user_id").toString()));
      }
      if ((jsonObj.get("source_team") != null && !jsonObj.get("source_team").isJsonNull()) && !jsonObj.get("source_team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_team").toString()));
      }
      if ((jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) && !jsonObj.get("team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("thread_ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thread_ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thread_ts").toString()));
      }
      if (!jsonObj.get("ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ts").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      // validate the optional field `user_profile`
      if (jsonObj.get("user_profile") != null && !jsonObj.get("user_profile").isJsonNull()) {
        ObjsUserProfileShort.validateJsonObject(jsonObj.getAsJsonObject("user_profile"));
      }
      if ((jsonObj.get("user_team") != null && !jsonObj.get("user_team").isJsonNull()) && !jsonObj.get("user_team").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_team` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_team").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1>() {
           @Override
           public void write(JsonWriter out, ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1
  * @throws IOException if the JSON string is invalid with respect to ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1
  */
  public static ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.class);
  }

 /**
  * Convert an instance of ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
