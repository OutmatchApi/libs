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
 * Schema for successful response from dnd.setSnooze method
 */
@ApiModel(description = "Schema for successful response from dnd.setSnooze method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class DndSetSnoozeSchema {
  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public static final String SERIALIZED_NAME_SNOOZE_ENABLED = "snooze_enabled";
  @SerializedName(SERIALIZED_NAME_SNOOZE_ENABLED)
  private Boolean snoozeEnabled;

  public static final String SERIALIZED_NAME_SNOOZE_ENDTIME = "snooze_endtime";
  @SerializedName(SERIALIZED_NAME_SNOOZE_ENDTIME)
  private Integer snoozeEndtime;

  public static final String SERIALIZED_NAME_SNOOZE_REMAINING = "snooze_remaining";
  @SerializedName(SERIALIZED_NAME_SNOOZE_REMAINING)
  private Integer snoozeRemaining;

  public DndSetSnoozeSchema() {
  }

  public DndSetSnoozeSchema ok(DefsOkTrue ok) {
    
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


  public DndSetSnoozeSchema snoozeEnabled(Boolean snoozeEnabled) {
    
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Get snoozeEnabled
   * @return snoozeEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSnoozeEnabled() {
    return snoozeEnabled;
  }


  public void setSnoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
  }


  public DndSetSnoozeSchema snoozeEndtime(Integer snoozeEndtime) {
    
    this.snoozeEndtime = snoozeEndtime;
    return this;
  }

   /**
   * Get snoozeEndtime
   * @return snoozeEndtime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSnoozeEndtime() {
    return snoozeEndtime;
  }


  public void setSnoozeEndtime(Integer snoozeEndtime) {
    this.snoozeEndtime = snoozeEndtime;
  }


  public DndSetSnoozeSchema snoozeRemaining(Integer snoozeRemaining) {
    
    this.snoozeRemaining = snoozeRemaining;
    return this;
  }

   /**
   * Get snoozeRemaining
   * @return snoozeRemaining
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSnoozeRemaining() {
    return snoozeRemaining;
  }


  public void setSnoozeRemaining(Integer snoozeRemaining) {
    this.snoozeRemaining = snoozeRemaining;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DndSetSnoozeSchema dndSetSnoozeSchema = (DndSetSnoozeSchema) o;
    return Objects.equals(this.ok, dndSetSnoozeSchema.ok) &&
        Objects.equals(this.snoozeEnabled, dndSetSnoozeSchema.snoozeEnabled) &&
        Objects.equals(this.snoozeEndtime, dndSetSnoozeSchema.snoozeEndtime) &&
        Objects.equals(this.snoozeRemaining, dndSetSnoozeSchema.snoozeRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, snoozeEnabled, snoozeEndtime, snoozeRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DndSetSnoozeSchema {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    snoozeEndtime: ").append(toIndentedString(snoozeEndtime)).append("\n");
    sb.append("    snoozeRemaining: ").append(toIndentedString(snoozeRemaining)).append("\n");
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
    openapiFields.add("snooze_enabled");
    openapiFields.add("snooze_endtime");
    openapiFields.add("snooze_remaining");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ok");
    openapiRequiredFields.add("snooze_enabled");
    openapiRequiredFields.add("snooze_endtime");
    openapiRequiredFields.add("snooze_remaining");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DndSetSnoozeSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DndSetSnoozeSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DndSetSnoozeSchema is not found in the empty JSON string", DndSetSnoozeSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DndSetSnoozeSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DndSetSnoozeSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DndSetSnoozeSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DndSetSnoozeSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DndSetSnoozeSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DndSetSnoozeSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DndSetSnoozeSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<DndSetSnoozeSchema>() {
           @Override
           public void write(JsonWriter out, DndSetSnoozeSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DndSetSnoozeSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DndSetSnoozeSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DndSetSnoozeSchema
  * @throws IOException if the JSON string is invalid with respect to DndSetSnoozeSchema
  */
  public static DndSetSnoozeSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DndSetSnoozeSchema.class);
  }

 /**
  * Convert an instance of DndSetSnoozeSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

