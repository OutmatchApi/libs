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
import com.outmatchapi.slack.DefsOkFalse;
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
 * Schema for error response from admin.conversations.create
 */
@ApiModel(description = "Schema for error response from admin.conversations.create")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class AdminConversationsCreateErrorSchema {
  /**
   * Gets or Sets error
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
  public enum ErrorEnum {
    FEATURE_NOT_ENABLED("feature_not_enabled"),
    
    NAME_TAKEN("name_taken"),
    
    RESTRICTED_ACTION("restricted_action"),
    
    TEAM_NOT_FOUND("team_not_found"),
    
    INVALID_TEAM("invalid_team"),
    
    INVALID_NAME("invalid_name"),
    
    COULD_NOT_CREATE_CHANNEL("could_not_create_channel"),
    
    TEAM_ID_OR_ORG_REQUIRED("team_id_or_org_required");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorEnum error;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkFalse ok;

  public AdminConversationsCreateErrorSchema() {
  }

  public AdminConversationsCreateErrorSchema error(ErrorEnum error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ErrorEnum getError() {
    return error;
  }


  public void setError(ErrorEnum error) {
    this.error = error;
  }


  public AdminConversationsCreateErrorSchema ok(DefsOkFalse ok) {
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DefsOkFalse getOk() {
    return ok;
  }


  public void setOk(DefsOkFalse ok) {
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
    AdminConversationsCreateErrorSchema adminConversationsCreateErrorSchema = (AdminConversationsCreateErrorSchema) o;
    return Objects.equals(this.error, adminConversationsCreateErrorSchema.error) &&
        Objects.equals(this.ok, adminConversationsCreateErrorSchema.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminConversationsCreateErrorSchema {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("ok");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdminConversationsCreateErrorSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdminConversationsCreateErrorSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminConversationsCreateErrorSchema is not found in the empty JSON string", AdminConversationsCreateErrorSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdminConversationsCreateErrorSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminConversationsCreateErrorSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdminConversationsCreateErrorSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminConversationsCreateErrorSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminConversationsCreateErrorSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminConversationsCreateErrorSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminConversationsCreateErrorSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminConversationsCreateErrorSchema>() {
           @Override
           public void write(JsonWriter out, AdminConversationsCreateErrorSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminConversationsCreateErrorSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdminConversationsCreateErrorSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdminConversationsCreateErrorSchema
  * @throws IOException if the JSON string is invalid with respect to AdminConversationsCreateErrorSchema
  */
  public static AdminConversationsCreateErrorSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminConversationsCreateErrorSchema.class);
  }

 /**
  * Convert an instance of AdminConversationsCreateErrorSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

