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
 * VideoSessionSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T02:10:33.826846Z[Etc/UTC]")
public class VideoSessionSession {
  public static final String SERIALIZED_NAME_ENDED_AT = "endedAt";
  @SerializedName(SERIALIZED_NAME_ENDED_AT)
  private OffsetDateTime endedAt;

  public static final String SERIALIZED_NAME_LOADED_AT = "loadedAt";
  @SerializedName(SERIALIZED_NAME_LOADED_AT)
  private OffsetDateTime loadedAt;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public VideoSessionSession() {
  }

  public VideoSessionSession endedAt(OffsetDateTime endedAt) {
    
    this.endedAt = endedAt;
    return this;
  }

   /**
   * When the video session ended, presented in ISO-8601 format.
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-06-24T12:45:01.109Z", value = "When the video session ended, presented in ISO-8601 format.")

  public OffsetDateTime getEndedAt() {
    return endedAt;
  }


  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }


  public VideoSessionSession loadedAt(OffsetDateTime loadedAt) {
    
    this.loadedAt = loadedAt;
    return this;
  }

   /**
   * When the video session started, presented in ISO-8601 format.
   * @return loadedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-06-24T11:45:01.109Z", value = "When the video session started, presented in ISO-8601 format.")

  public OffsetDateTime getLoadedAt() {
    return loadedAt;
  }


  public void setLoadedAt(OffsetDateTime loadedAt) {
    this.loadedAt = loadedAt;
  }


  public VideoSessionSession sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The unique identifier for the session that you can use to track what happens during it.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "psEmFwGQUAXR2lFHj5nDOpy", value = "The unique identifier for the session that you can use to track what happens during it.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSessionSession videoSessionSession = (VideoSessionSession) o;
    return Objects.equals(this.endedAt, videoSessionSession.endedAt) &&
        Objects.equals(this.loadedAt, videoSessionSession.loadedAt) &&
        Objects.equals(this.sessionId, videoSessionSession.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endedAt, loadedAt, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSessionSession {\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    loadedAt: ").append(toIndentedString(loadedAt)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    openapiFields.add("endedAt");
    openapiFields.add("loadedAt");
    openapiFields.add("sessionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoSessionSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoSessionSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoSessionSession is not found in the empty JSON string", VideoSessionSession.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VideoSessionSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideoSessionSession` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sessionId") != null && !jsonObj.get("sessionId").isJsonNull()) && !jsonObj.get("sessionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoSessionSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoSessionSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoSessionSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoSessionSession.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoSessionSession>() {
           @Override
           public void write(JsonWriter out, VideoSessionSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideoSessionSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideoSessionSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoSessionSession
  * @throws IOException if the JSON string is invalid with respect to VideoSessionSession
  */
  public static VideoSessionSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoSessionSession.class);
  }

 /**
  * Convert an instance of VideoSessionSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

