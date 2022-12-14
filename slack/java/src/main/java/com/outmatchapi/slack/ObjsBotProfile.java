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
import com.outmatchapi.slack.BotsInfoSchemaBotIcons;
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
 * ObjsBotProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ObjsBotProfile {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ICONS = "icons";
  @SerializedName(SERIALIZED_NAME_ICONS)
  private BotsInfoSchemaBotIcons icons;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private Integer updated;

  public ObjsBotProfile() {
  }

  public ObjsBotProfile appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ObjsBotProfile deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public ObjsBotProfile icons(BotsInfoSchemaBotIcons icons) {
    
    this.icons = icons;
    return this;
  }

   /**
   * Get icons
   * @return icons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BotsInfoSchemaBotIcons getIcons() {
    return icons;
  }


  public void setIcons(BotsInfoSchemaBotIcons icons) {
    this.icons = icons;
  }


  public ObjsBotProfile id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ObjsBotProfile name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ObjsBotProfile teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public ObjsBotProfile updated(Integer updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUpdated() {
    return updated;
  }


  public void setUpdated(Integer updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjsBotProfile objsBotProfile = (ObjsBotProfile) o;
    return Objects.equals(this.appId, objsBotProfile.appId) &&
        Objects.equals(this.deleted, objsBotProfile.deleted) &&
        Objects.equals(this.icons, objsBotProfile.icons) &&
        Objects.equals(this.id, objsBotProfile.id) &&
        Objects.equals(this.name, objsBotProfile.name) &&
        Objects.equals(this.teamId, objsBotProfile.teamId) &&
        Objects.equals(this.updated, objsBotProfile.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, deleted, icons, id, name, teamId, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjsBotProfile {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("deleted");
    openapiFields.add("icons");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("team_id");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("icons");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("team_id");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjsBotProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjsBotProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjsBotProfile is not found in the empty JSON string", ObjsBotProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ObjsBotProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObjsBotProfile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ObjsBotProfile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_id").toString()));
      }
      // validate the required field `icons`
      BotsInfoSchemaBotIcons.validateJsonObject(jsonObj.getAsJsonObject("icons"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjsBotProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjsBotProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjsBotProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjsBotProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjsBotProfile>() {
           @Override
           public void write(JsonWriter out, ObjsBotProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjsBotProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjsBotProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjsBotProfile
  * @throws IOException if the JSON string is invalid with respect to ObjsBotProfile
  */
  public static ObjsBotProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjsBotProfile.class);
  }

 /**
  * Convert an instance of ObjsBotProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

