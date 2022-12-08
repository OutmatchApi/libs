/*
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outmatchapi.testing_api_video;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outmatchapi.testing_api_video.Metadata;
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
 * VideoUpdatePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:16:40.712267Z[Etc/UTC]")
public class VideoUpdatePayload {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<Metadata> metadata = null;

  public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4Support";
  @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
  private Boolean mp4Support;

  public static final String SERIALIZED_NAME_PANORAMIC = "panoramic";
  @SerializedName(SERIALIZED_NAME_PANORAMIC)
  private Boolean panoramic;

  public static final String SERIALIZED_NAME_PLAYER_ID = "playerId";
  @SerializedName(SERIALIZED_NAME_PLAYER_ID)
  private String playerId;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public VideoUpdatePayload() {
  }

  public VideoUpdatePayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A brief description of the video.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A film about good books.", value = "A brief description of the video.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VideoUpdatePayload metadata(List<Metadata> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public VideoUpdatePayload addMetadataItem(Metadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.")

  public List<Metadata> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }


  public VideoUpdatePayload mp4Support(Boolean mp4Support) {
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * Whether the player supports the mp4 format.
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the player supports the mp4 format.")

  public Boolean getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Boolean mp4Support) {
    this.mp4Support = mp4Support;
  }


  public VideoUpdatePayload panoramic(Boolean panoramic) {
    
    this.panoramic = panoramic;
    return this;
  }

   /**
   * Whether the video is a 360 degree or immersive video.
   * @return panoramic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the video is a 360 degree or immersive video.")

  public Boolean getPanoramic() {
    return panoramic;
  }


  public void setPanoramic(Boolean panoramic) {
    this.panoramic = panoramic;
  }


  public VideoUpdatePayload playerId(String playerId) {
    
    this.playerId = playerId;
    return this;
  }

   /**
   * The unique ID for the player you want to associate with your video.
   * @return playerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pl4k0jvEUuaTdRAEjQ4Jfrgz", value = "The unique ID for the player you want to associate with your video.")

  public String getPlayerId() {
    return playerId;
  }


  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }


  public VideoUpdatePayload _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public VideoUpdatePayload tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public VideoUpdatePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"maths\", \"string theory\", \"video\"]", value = "A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public VideoUpdatePayload title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title you want to use for your video.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title you want to use for your video.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoUpdatePayload videoUpdatePayload = (VideoUpdatePayload) o;
    return Objects.equals(this.description, videoUpdatePayload.description) &&
        Objects.equals(this.metadata, videoUpdatePayload.metadata) &&
        Objects.equals(this.mp4Support, videoUpdatePayload.mp4Support) &&
        Objects.equals(this.panoramic, videoUpdatePayload.panoramic) &&
        Objects.equals(this.playerId, videoUpdatePayload.playerId) &&
        Objects.equals(this._public, videoUpdatePayload._public) &&
        Objects.equals(this.tags, videoUpdatePayload.tags) &&
        Objects.equals(this.title, videoUpdatePayload.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metadata, mp4Support, panoramic, playerId, _public, tags, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoUpdatePayload {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
    sb.append("    panoramic: ").append(toIndentedString(panoramic)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("metadata");
    openapiFields.add("mp4Support");
    openapiFields.add("panoramic");
    openapiFields.add("playerId");
    openapiFields.add("public");
    openapiFields.add("tags");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoUpdatePayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoUpdatePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoUpdatePayload is not found in the empty JSON string", VideoUpdatePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VideoUpdatePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideoUpdatePayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            Metadata.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("playerId") != null && !jsonObj.get("playerId").isJsonNull()) && !jsonObj.get("playerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoUpdatePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoUpdatePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoUpdatePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoUpdatePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoUpdatePayload>() {
           @Override
           public void write(JsonWriter out, VideoUpdatePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideoUpdatePayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideoUpdatePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoUpdatePayload
  * @throws IOException if the JSON string is invalid with respect to VideoUpdatePayload
  */
  public static VideoUpdatePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoUpdatePayload.class);
  }

 /**
  * Convert an instance of VideoUpdatePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
