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
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOfTeam;
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
 * Schema for &#39;identity.basic&#39; scope
 */
@ApiModel(description = "Schema for 'identity.basic' scope")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class UsersIdentitySchemaInnerAnyOf {
  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private UsersIdentitySchemaInnerAnyOfTeam team;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private RtmConnectSchemaSelf user;

  public UsersIdentitySchemaInnerAnyOf() {
  }

  public UsersIdentitySchemaInnerAnyOf ok(DefsOkTrue ok) {
    
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


  public UsersIdentitySchemaInnerAnyOf team(UsersIdentitySchemaInnerAnyOfTeam team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UsersIdentitySchemaInnerAnyOfTeam getTeam() {
    return team;
  }


  public void setTeam(UsersIdentitySchemaInnerAnyOfTeam team) {
    this.team = team;
  }


  public UsersIdentitySchemaInnerAnyOf user(RtmConnectSchemaSelf user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RtmConnectSchemaSelf getUser() {
    return user;
  }


  public void setUser(RtmConnectSchemaSelf user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersIdentitySchemaInnerAnyOf usersIdentitySchemaInnerAnyOf = (UsersIdentitySchemaInnerAnyOf) o;
    return Objects.equals(this.ok, usersIdentitySchemaInnerAnyOf.ok) &&
        Objects.equals(this.team, usersIdentitySchemaInnerAnyOf.team) &&
        Objects.equals(this.user, usersIdentitySchemaInnerAnyOf.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, team, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersIdentitySchemaInnerAnyOf {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("ok");
    openapiFields.add("team");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ok");
    openapiRequiredFields.add("team");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersIdentitySchemaInnerAnyOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersIdentitySchemaInnerAnyOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersIdentitySchemaInnerAnyOf is not found in the empty JSON string", UsersIdentitySchemaInnerAnyOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersIdentitySchemaInnerAnyOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersIdentitySchemaInnerAnyOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersIdentitySchemaInnerAnyOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `team`
      UsersIdentitySchemaInnerAnyOfTeam.validateJsonObject(jsonObj.getAsJsonObject("team"));
      // validate the required field `user`
      RtmConnectSchemaSelf.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersIdentitySchemaInnerAnyOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersIdentitySchemaInnerAnyOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersIdentitySchemaInnerAnyOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersIdentitySchemaInnerAnyOf.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersIdentitySchemaInnerAnyOf>() {
           @Override
           public void write(JsonWriter out, UsersIdentitySchemaInnerAnyOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersIdentitySchemaInnerAnyOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersIdentitySchemaInnerAnyOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersIdentitySchemaInnerAnyOf
  * @throws IOException if the JSON string is invalid with respect to UsersIdentitySchemaInnerAnyOf
  */
  public static UsersIdentitySchemaInnerAnyOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersIdentitySchemaInnerAnyOf.class);
  }

 /**
  * Convert an instance of UsersIdentitySchemaInnerAnyOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
