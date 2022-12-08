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
 * Generated from users.getPresence with shasum e7251aec575d8863f9e0eb38663ae9dc26655f65
 */
@ApiModel(description = "Generated from users.getPresence with shasum e7251aec575d8863f9e0eb38663ae9dc26655f65")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class APIMethodUsersGetPresence {
  public static final String SERIALIZED_NAME_AUTO_AWAY = "auto_away";
  @SerializedName(SERIALIZED_NAME_AUTO_AWAY)
  private Boolean autoAway;

  public static final String SERIALIZED_NAME_CONNECTION_COUNT = "connection_count";
  @SerializedName(SERIALIZED_NAME_CONNECTION_COUNT)
  private Integer connectionCount;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "last_activity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private Integer lastActivity;

  public static final String SERIALIZED_NAME_MANUAL_AWAY = "manual_away";
  @SerializedName(SERIALIZED_NAME_MANUAL_AWAY)
  private Boolean manualAway;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public static final String SERIALIZED_NAME_ONLINE = "online";
  @SerializedName(SERIALIZED_NAME_ONLINE)
  private Boolean online;

  public static final String SERIALIZED_NAME_PRESENCE = "presence";
  @SerializedName(SERIALIZED_NAME_PRESENCE)
  private String presence;

  public APIMethodUsersGetPresence() {
  }

  public APIMethodUsersGetPresence autoAway(Boolean autoAway) {
    
    this.autoAway = autoAway;
    return this;
  }

   /**
   * Get autoAway
   * @return autoAway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoAway() {
    return autoAway;
  }


  public void setAutoAway(Boolean autoAway) {
    this.autoAway = autoAway;
  }


  public APIMethodUsersGetPresence connectionCount(Integer connectionCount) {
    
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * Get connectionCount
   * @return connectionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getConnectionCount() {
    return connectionCount;
  }


  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }


  public APIMethodUsersGetPresence lastActivity(Integer lastActivity) {
    
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastActivity() {
    return lastActivity;
  }


  public void setLastActivity(Integer lastActivity) {
    this.lastActivity = lastActivity;
  }


  public APIMethodUsersGetPresence manualAway(Boolean manualAway) {
    
    this.manualAway = manualAway;
    return this;
  }

   /**
   * Get manualAway
   * @return manualAway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getManualAway() {
    return manualAway;
  }


  public void setManualAway(Boolean manualAway) {
    this.manualAway = manualAway;
  }


  public APIMethodUsersGetPresence ok(DefsOkTrue ok) {
    
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


  public APIMethodUsersGetPresence online(Boolean online) {
    
    this.online = online;
    return this;
  }

   /**
   * Get online
   * @return online
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOnline() {
    return online;
  }


  public void setOnline(Boolean online) {
    this.online = online;
  }


  public APIMethodUsersGetPresence presence(String presence) {
    
    this.presence = presence;
    return this;
  }

   /**
   * Get presence
   * @return presence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPresence() {
    return presence;
  }


  public void setPresence(String presence) {
    this.presence = presence;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the APIMethodUsersGetPresence instance itself
   */
  public APIMethodUsersGetPresence putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIMethodUsersGetPresence apIMethodUsersGetPresence = (APIMethodUsersGetPresence) o;
    return Objects.equals(this.autoAway, apIMethodUsersGetPresence.autoAway) &&
        Objects.equals(this.connectionCount, apIMethodUsersGetPresence.connectionCount) &&
        Objects.equals(this.lastActivity, apIMethodUsersGetPresence.lastActivity) &&
        Objects.equals(this.manualAway, apIMethodUsersGetPresence.manualAway) &&
        Objects.equals(this.ok, apIMethodUsersGetPresence.ok) &&
        Objects.equals(this.online, apIMethodUsersGetPresence.online) &&
        Objects.equals(this.presence, apIMethodUsersGetPresence.presence)&&
        Objects.equals(this.additionalProperties, apIMethodUsersGetPresence.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAway, connectionCount, lastActivity, manualAway, ok, online, presence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIMethodUsersGetPresence {\n");
    sb.append("    autoAway: ").append(toIndentedString(autoAway)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    manualAway: ").append(toIndentedString(manualAway)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("auto_away");
    openapiFields.add("connection_count");
    openapiFields.add("last_activity");
    openapiFields.add("manual_away");
    openapiFields.add("ok");
    openapiFields.add("online");
    openapiFields.add("presence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ok");
    openapiRequiredFields.add("presence");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIMethodUsersGetPresence
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIMethodUsersGetPresence.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIMethodUsersGetPresence is not found in the empty JSON string", APIMethodUsersGetPresence.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIMethodUsersGetPresence.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("presence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presence").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIMethodUsersGetPresence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIMethodUsersGetPresence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIMethodUsersGetPresence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIMethodUsersGetPresence.class));

       return (TypeAdapter<T>) new TypeAdapter<APIMethodUsersGetPresence>() {
           @Override
           public void write(JsonWriter out, APIMethodUsersGetPresence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public APIMethodUsersGetPresence read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             APIMethodUsersGetPresence instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIMethodUsersGetPresence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIMethodUsersGetPresence
  * @throws IOException if the JSON string is invalid with respect to APIMethodUsersGetPresence
  */
  public static APIMethodUsersGetPresence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIMethodUsersGetPresence.class);
  }

 /**
  * Convert an instance of APIMethodUsersGetPresence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
