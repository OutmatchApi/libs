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
import com.outmatchapi.slack.ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Schema for error response from conversations.invite method
 */
@ApiModel(description = "Schema for error response from conversations.invite method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ConversationsInviteErrorSchema1 {
  public static final String SERIALIZED_NAME_CALLSTACK = "callstack";
  @SerializedName(SERIALIZED_NAME_CALLSTACK)
  private String callstack;

  /**
   * Gets or Sets error
   */
  @JsonAdapter(ErrorEnum.Adapter.class)
  public enum ErrorEnum {
    METHOD_NOT_SUPPORTED_FOR_CHANNEL_TYPE("method_not_supported_for_channel_type"),
    
    MISSING_SCOPE("missing_scope"),
    
    CHANNEL_NOT_FOUND("channel_not_found"),
    
    USER_NOT_FOUND("user_not_found"),
    
    NO_USER("no_user"),
    
    CANT_INVITE_SELF("cant_invite_self"),
    
    NOT_IN_CHANNEL("not_in_channel"),
    
    ALREADY_IN_CHANNEL("already_in_channel"),
    
    IS_ARCHIVED("is_archived"),
    
    CANT_INVITE("cant_invite"),
    
    TOO_MANY_USERS("too_many_users"),
    
    URA_MAX_CHANNELS("ura_max_channels"),
    
    NOT_AUTHED("not_authed"),
    
    INVALID_AUTH("invalid_auth"),
    
    ACCOUNT_INACTIVE("account_inactive"),
    
    USER_IS_BOT("user_is_bot"),
    
    USER_IS_RESTRICTED("user_is_restricted"),
    
    USER_IS_ULTRA_RESTRICTED("user_is_ultra_restricted"),
    
    INVALID_ARG_NAME("invalid_arg_name"),
    
    INVALID_ARRAY_ARG("invalid_array_arg"),
    
    INVALID_CHARSET("invalid_charset"),
    
    INVALID_FORM_DATA("invalid_form_data"),
    
    INVALID_POST_TYPE("invalid_post_type"),
    
    MISSING_POST_TYPE("missing_post_type"),
    
    INVALID_JSON("invalid_json"),
    
    JSON_NOT_OBJECT("json_not_object"),
    
    REQUEST_TIMEOUT("request_timeout"),
    
    UPGRADE_REQUIRED("upgrade_required"),
    
    TEAM_ADDED_TO_ORG("team_added_to_org"),
    
    MISSING_CHARSET("missing_charset"),
    
    SUPERFLUOUS_CHARSET("superfluous_charset");

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

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Set<ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner> errors = null;

  public static final String SERIALIZED_NAME_NEEDED = "needed";
  @SerializedName(SERIALIZED_NAME_NEEDED)
  private String needed;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkFalse ok;

  public static final String SERIALIZED_NAME_PROVIDED = "provided";
  @SerializedName(SERIALIZED_NAME_PROVIDED)
  private String provided;

  public ConversationsInviteErrorSchema1() {
  }

  public ConversationsInviteErrorSchema1 callstack(String callstack) {
    
    this.callstack = callstack;
    return this;
  }

   /**
   * Note: PHP callstack is only visible in dev/qa
   * @return callstack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Note: PHP callstack is only visible in dev/qa")

  public String getCallstack() {
    return callstack;
  }


  public void setCallstack(String callstack) {
    this.callstack = callstack;
  }


  public ConversationsInviteErrorSchema1 error(ErrorEnum error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ErrorEnum getError() {
    return error;
  }


  public void setError(ErrorEnum error) {
    this.error = error;
  }


  public ConversationsInviteErrorSchema1 errors(Set<ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public ConversationsInviteErrorSchema1 addErrorsItem(ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner errorsItem) {
    if (this.errors == null) {
      this.errors = new LinkedHashSet<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner> getErrors() {
    return errors;
  }


  public void setErrors(Set<ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner> errors) {
    this.errors = errors;
  }


  public ConversationsInviteErrorSchema1 needed(String needed) {
    
    this.needed = needed;
    return this;
  }

   /**
   * Get needed
   * @return needed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNeeded() {
    return needed;
  }


  public void setNeeded(String needed) {
    this.needed = needed;
  }


  public ConversationsInviteErrorSchema1 ok(DefsOkFalse ok) {
    
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


  public ConversationsInviteErrorSchema1 provided(String provided) {
    
    this.provided = provided;
    return this;
  }

   /**
   * Get provided
   * @return provided
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvided() {
    return provided;
  }


  public void setProvided(String provided) {
    this.provided = provided;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsInviteErrorSchema1 conversationsInviteErrorSchema1 = (ConversationsInviteErrorSchema1) o;
    return Objects.equals(this.callstack, conversationsInviteErrorSchema1.callstack) &&
        Objects.equals(this.error, conversationsInviteErrorSchema1.error) &&
        Objects.equals(this.errors, conversationsInviteErrorSchema1.errors) &&
        Objects.equals(this.needed, conversationsInviteErrorSchema1.needed) &&
        Objects.equals(this.ok, conversationsInviteErrorSchema1.ok) &&
        Objects.equals(this.provided, conversationsInviteErrorSchema1.provided);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callstack, error, errors, needed, ok, provided);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsInviteErrorSchema1 {\n");
    sb.append("    callstack: ").append(toIndentedString(callstack)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    needed: ").append(toIndentedString(needed)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    provided: ").append(toIndentedString(provided)).append("\n");
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
    openapiFields.add("callstack");
    openapiFields.add("error");
    openapiFields.add("errors");
    openapiFields.add("needed");
    openapiFields.add("ok");
    openapiFields.add("provided");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationsInviteErrorSchema1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConversationsInviteErrorSchema1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationsInviteErrorSchema1 is not found in the empty JSON string", ConversationsInviteErrorSchema1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationsInviteErrorSchema1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationsInviteErrorSchema1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConversationsInviteErrorSchema1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("callstack") != null && !jsonObj.get("callstack").isJsonNull()) && !jsonObj.get("callstack").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callstack` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callstack").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("needed") != null && !jsonObj.get("needed").isJsonNull()) && !jsonObj.get("needed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `needed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("needed").toString()));
      }
      if ((jsonObj.get("provided") != null && !jsonObj.get("provided").isJsonNull()) && !jsonObj.get("provided").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provided` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provided").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationsInviteErrorSchema1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationsInviteErrorSchema1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationsInviteErrorSchema1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationsInviteErrorSchema1.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationsInviteErrorSchema1>() {
           @Override
           public void write(JsonWriter out, ConversationsInviteErrorSchema1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationsInviteErrorSchema1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationsInviteErrorSchema1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationsInviteErrorSchema1
  * @throws IOException if the JSON string is invalid with respect to ConversationsInviteErrorSchema1
  */
  public static ConversationsInviteErrorSchema1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsInviteErrorSchema1.class);
  }

 /**
  * Convert an instance of ConversationsInviteErrorSchema1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
