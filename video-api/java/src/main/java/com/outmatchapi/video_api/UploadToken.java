/*
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outmatchapi.video_api;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * UploadToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T02:10:33.826846Z[Etc/UTC]")
public class UploadToken {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public UploadToken() {
  }

  public UploadToken createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the token was created, displayed in ISO-8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-16T08:25:51Z", value = "When the token was created, displayed in ISO-8601 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public UploadToken expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * When the token expires, displayed in ISO-8601 format.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-16T09:25:51Z", value = "When the token expires, displayed in ISO-8601 format.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public UploadToken token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The unique identifier for the token you will use to authenticate an upload.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "to1tcmSFHeYY5KzyhOqVKMKb", value = "The unique identifier for the token you will use to authenticate an upload.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public UploadToken ttl(Integer ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Time-to-live - how long the upload token is valid for.
   * minimum: 0
   * maximum: 2147483647
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time-to-live - how long the upload token is valid for.")

  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadToken uploadToken = (UploadToken) o;
    return Objects.equals(this.createdAt, uploadToken.createdAt) &&
        Objects.equals(this.expiresAt, uploadToken.expiresAt) &&
        Objects.equals(this.token, uploadToken.token) &&
        Objects.equals(this.ttl, uploadToken.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, expiresAt, token, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadToken {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("expiresAt");
    openapiFields.add("token");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadToken is not found in the empty JSON string", UploadToken.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UploadToken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadToken` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadToken.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadToken>() {
           @Override
           public void write(JsonWriter out, UploadToken value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadToken
  * @throws IOException if the JSON string is invalid with respect to UploadToken
  */
  public static UploadToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadToken.class);
  }

 /**
  * Convert an instance of UploadToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

