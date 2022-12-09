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
import com.outmatchapi.apivideo.Quality;
import com.outmatchapi.apivideo.VideostatusEncodingMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * VideostatusEncoding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T00:34:33.415753Z[Etc/UTC]")
public class VideostatusEncoding {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private VideostatusEncodingMetadata metadata;

  public static final String SERIALIZED_NAME_PLAYABLE = "playable";
  @SerializedName(SERIALIZED_NAME_PLAYABLE)
  private Boolean playable;

  public static final String SERIALIZED_NAME_QUALITIES = "qualities";
  @SerializedName(SERIALIZED_NAME_QUALITIES)
  private List<Quality> qualities = null;

  public VideostatusEncoding() {
  }

  public VideostatusEncoding metadata(VideostatusEncodingMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideostatusEncodingMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(VideostatusEncodingMetadata metadata) {
    this.metadata = metadata;
  }


  public VideostatusEncoding playable(Boolean playable) {
    
    this.playable = playable;
    return this;
  }

   /**
   * Whether the video is playable or not.
   * @return playable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the video is playable or not.")

  public Boolean getPlayable() {
    return playable;
  }


  public void setPlayable(Boolean playable) {
    this.playable = playable;
  }


  public VideostatusEncoding qualities(List<Quality> qualities) {
    
    this.qualities = qualities;
    return this;
  }

  public VideostatusEncoding addQualitiesItem(Quality qualitiesItem) {
    if (this.qualities == null) {
      this.qualities = new ArrayList<>();
    }
    this.qualities.add(qualitiesItem);
    return this;
  }

   /**
   * Available qualities the video can be viewed in.
   * @return qualities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available qualities the video can be viewed in.")

  public List<Quality> getQualities() {
    return qualities;
  }


  public void setQualities(List<Quality> qualities) {
    this.qualities = qualities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideostatusEncoding videostatusEncoding = (VideostatusEncoding) o;
    return Objects.equals(this.metadata, videostatusEncoding.metadata) &&
        Objects.equals(this.playable, videostatusEncoding.playable) &&
        Objects.equals(this.qualities, videostatusEncoding.qualities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, playable, qualities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideostatusEncoding {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    playable: ").append(toIndentedString(playable)).append("\n");
    sb.append("    qualities: ").append(toIndentedString(qualities)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("playable");
    openapiFields.add("qualities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideostatusEncoding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideostatusEncoding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideostatusEncoding is not found in the empty JSON string", VideostatusEncoding.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VideostatusEncoding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideostatusEncoding` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        VideostatusEncodingMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      if (jsonObj.get("qualities") != null && !jsonObj.get("qualities").isJsonNull()) {
        JsonArray jsonArrayqualities = jsonObj.getAsJsonArray("qualities");
        if (jsonArrayqualities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("qualities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `qualities` to be an array in the JSON string but got `%s`", jsonObj.get("qualities").toString()));
          }

          // validate the optional field `qualities` (array)
          for (int i = 0; i < jsonArrayqualities.size(); i++) {
            Quality.validateJsonObject(jsonArrayqualities.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideostatusEncoding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideostatusEncoding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideostatusEncoding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideostatusEncoding.class));

       return (TypeAdapter<T>) new TypeAdapter<VideostatusEncoding>() {
           @Override
           public void write(JsonWriter out, VideostatusEncoding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideostatusEncoding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideostatusEncoding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideostatusEncoding
  * @throws IOException if the JSON string is invalid with respect to VideostatusEncoding
  */
  public static VideostatusEncoding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideostatusEncoding.class);
  }

 /**
  * Convert an instance of VideostatusEncoding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

