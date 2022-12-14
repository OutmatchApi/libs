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


package com.outmatchapi.apivideo;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outmatchapi.apivideo.LiveStreamSessionClient;
import com.outmatchapi.apivideo.LiveStreamSessionDevice;
import com.outmatchapi.apivideo.LiveStreamSessionLocation;
import com.outmatchapi.apivideo.LiveStreamSessionReferrer;
import com.outmatchapi.apivideo.LiveStreamSessionSession;
import com.outmatchapi.apivideo.VideoSessionOs;
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
 * LiveStreamSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T00:34:33.415753Z[Etc/UTC]")
public class LiveStreamSession {
  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private LiveStreamSessionClient client;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private LiveStreamSessionDevice device;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LiveStreamSessionLocation location;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private VideoSessionOs os;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private LiveStreamSessionReferrer referrer;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private LiveStreamSessionSession session;

  public LiveStreamSession() {
  }

  public LiveStreamSession client(LiveStreamSessionClient client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamSessionClient getClient() {
    return client;
  }


  public void setClient(LiveStreamSessionClient client) {
    this.client = client;
  }


  public LiveStreamSession device(LiveStreamSessionDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamSessionDevice getDevice() {
    return device;
  }


  public void setDevice(LiveStreamSessionDevice device) {
    this.device = device;
  }


  public LiveStreamSession location(LiveStreamSessionLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamSessionLocation getLocation() {
    return location;
  }


  public void setLocation(LiveStreamSessionLocation location) {
    this.location = location;
  }


  public LiveStreamSession os(VideoSessionOs os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoSessionOs getOs() {
    return os;
  }


  public void setOs(VideoSessionOs os) {
    this.os = os;
  }


  public LiveStreamSession referrer(LiveStreamSessionReferrer referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamSessionReferrer getReferrer() {
    return referrer;
  }


  public void setReferrer(LiveStreamSessionReferrer referrer) {
    this.referrer = referrer;
  }


  public LiveStreamSession session(LiveStreamSessionSession session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamSessionSession getSession() {
    return session;
  }


  public void setSession(LiveStreamSessionSession session) {
    this.session = session;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamSession liveStreamSession = (LiveStreamSession) o;
    return Objects.equals(this.client, liveStreamSession.client) &&
        Objects.equals(this.device, liveStreamSession.device) &&
        Objects.equals(this.location, liveStreamSession.location) &&
        Objects.equals(this.os, liveStreamSession.os) &&
        Objects.equals(this.referrer, liveStreamSession.referrer) &&
        Objects.equals(this.session, liveStreamSession.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, device, location, os, referrer, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamSession {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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
    openapiFields.add("client");
    openapiFields.add("device");
    openapiFields.add("location");
    openapiFields.add("os");
    openapiFields.add("referrer");
    openapiFields.add("session");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveStreamSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveStreamSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveStreamSession is not found in the empty JSON string", LiveStreamSession.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LiveStreamSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiveStreamSession` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `client`
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) {
        LiveStreamSessionClient.validateJsonObject(jsonObj.getAsJsonObject("client"));
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        LiveStreamSessionDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LiveStreamSessionLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `os`
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) {
        VideoSessionOs.validateJsonObject(jsonObj.getAsJsonObject("os"));
      }
      // validate the optional field `referrer`
      if (jsonObj.get("referrer") != null && !jsonObj.get("referrer").isJsonNull()) {
        LiveStreamSessionReferrer.validateJsonObject(jsonObj.getAsJsonObject("referrer"));
      }
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        LiveStreamSessionSession.validateJsonObject(jsonObj.getAsJsonObject("session"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveStreamSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveStreamSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveStreamSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveStreamSession.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveStreamSession>() {
           @Override
           public void write(JsonWriter out, LiveStreamSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiveStreamSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiveStreamSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveStreamSession
  * @throws IOException if the JSON string is invalid with respect to LiveStreamSession
  */
  public static LiveStreamSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveStreamSession.class);
  }

 /**
  * Convert an instance of LiveStreamSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

