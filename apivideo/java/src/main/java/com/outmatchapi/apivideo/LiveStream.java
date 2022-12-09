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
import com.outmatchapi.apivideo.LiveStreamAssets;
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
 * LiveStream
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T00:34:33.415753Z[Etc/UTC]")
public class LiveStream {
  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private LiveStreamAssets assets;

  public static final String SERIALIZED_NAME_BROADCASTING = "broadcasting";
  @SerializedName(SERIALIZED_NAME_BROADCASTING)
  private Boolean broadcasting;

  public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "liveStreamId";
  @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
  private String liveStreamId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private String playerId;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private Boolean record;

  public static final String SERIALIZED_NAME_STREAM_KEY = "streamKey";
  @SerializedName(SERIALIZED_NAME_STREAM_KEY)
  private String streamKey;

  public LiveStream() {
  }

  public LiveStream assets(LiveStreamAssets assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamAssets getAssets() {
    return assets;
  }


  public void setAssets(LiveStreamAssets assets) {
    this.assets = assets;
  }


  public LiveStream broadcasting(Boolean broadcasting) {
    
    this.broadcasting = broadcasting;
    return this;
  }

   /**
   * Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not.
   * @return broadcasting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not.")

  public Boolean getBroadcasting() {
    return broadcasting;
  }


  public void setBroadcasting(Boolean broadcasting) {
    this.broadcasting = broadcasting;
  }


  public LiveStream liveStreamId(String liveStreamId) {
    
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * The unique identifier for the live stream. Live stream IDs begin with \&quot;li.\&quot;
   * @return liveStreamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "li400mYKSgQ6xs7taUeSaEKr", value = "The unique identifier for the live stream. Live stream IDs begin with \"li.\"")

  public String getLiveStreamId() {
    return liveStreamId;
  }


  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }


  public LiveStream name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of your live stream.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Live Stream", value = "The name of your live stream.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LiveStream playerId(String playerId) {
    
    this.playerId = playerId;
    return this;
  }

   /**
   * The unique identifier for the player.
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pl45d5vFFGrfdsdsd156dGhh", value = "The unique identifier for the player.")

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  public LiveStream _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public LiveStream record(Boolean record) {
    
    this.record = record;
    return this;
  }

   /**
   * Whether you are recording or not.
   * @return record
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether you are recording or not.")

  public Boolean getRecord() {
    return record;
  }


  public void setRecord(Boolean record) {
    this.record = record;
  }


  public LiveStream streamKey(String streamKey) {
    
    this.streamKey = streamKey;
    return this;
  }

   /**
   * The unique, private stream key that you use to begin streaming.
   * @return streamKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cc1b4df0-d1c5-4064-a8f9-9f0368385135", value = "The unique, private stream key that you use to begin streaming.")

  public String getStreamKey() {
    return streamKey;
  }


  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStream liveStream = (LiveStream) o;
    return Objects.equals(this.assets, liveStream.assets) &&
        Objects.equals(this.broadcasting, liveStream.broadcasting) &&
        Objects.equals(this.liveStreamId, liveStream.liveStreamId) &&
        Objects.equals(this.name, liveStream.name) &&
        Objects.equals(this.playerId, liveStream.playerId) &&
        Objects.equals(this._public, liveStream._public) &&
        Objects.equals(this.record, liveStream.record) &&
        Objects.equals(this.streamKey, liveStream.streamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, broadcasting, liveStreamId, name, playerId, _public, record, streamKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStream {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    broadcasting: ").append(toIndentedString(broadcasting)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
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
    openapiFields.add("assets");
    openapiFields.add("broadcasting");
    openapiFields.add("liveStreamId");
    openapiFields.add("name");
    openapiFields.add("playerId");
    openapiFields.add("public");
    openapiFields.add("record");
    openapiFields.add("streamKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveStream
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveStream.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveStream is not found in the empty JSON string", LiveStream.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LiveStream.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiveStream` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        LiveStreamAssets.validateJsonObject(jsonObj.getAsJsonObject("assets"));
      }
      if ((jsonObj.get("liveStreamId") != null && !jsonObj.get("liveStreamId").isJsonNull()) && !jsonObj.get("liveStreamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liveStreamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liveStreamId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("playerId") != null && !jsonObj.get("playerId").isJsonNull()) && !jsonObj.get("playerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playerId").toString()));
      }
      if ((jsonObj.get("streamKey") != null && !jsonObj.get("streamKey").isJsonNull()) && !jsonObj.get("streamKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streamKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streamKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveStream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveStream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveStream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveStream.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveStream>() {
           @Override
           public void write(JsonWriter out, LiveStream value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiveStream read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiveStream given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveStream
  * @throws IOException if the JSON string is invalid with respect to LiveStream
  */
  public static LiveStream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveStream.class);
  }

 /**
  * Convert an instance of LiveStream to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

