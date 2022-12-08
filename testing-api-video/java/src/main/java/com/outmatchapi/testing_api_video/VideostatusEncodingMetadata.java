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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
 * VideostatusEncodingMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:16:40.712267Z[Etc/UTC]")
public class VideostatusEncodingMetadata {
  public static final String SERIALIZED_NAME_ASPECT_RATIO = "aspectRatio";
  @SerializedName(SERIALIZED_NAME_ASPECT_RATIO)
  private String aspectRatio;

  public static final String SERIALIZED_NAME_AUDIO_CODEC = "audioCodec";
  @SerializedName(SERIALIZED_NAME_AUDIO_CODEC)
  private String audioCodec;

  public static final String SERIALIZED_NAME_BITRATE = "bitrate";
  @SerializedName(SERIALIZED_NAME_BITRATE)
  private BigDecimal bitrate;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_FRAMERATE = "framerate";
  @SerializedName(SERIALIZED_NAME_FRAMERATE)
  private Integer framerate;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_SAMPLERATE = "samplerate";
  @SerializedName(SERIALIZED_NAME_SAMPLERATE)
  private Integer samplerate;

  public static final String SERIALIZED_NAME_VIDEO_CODEC = "videoCodec";
  @SerializedName(SERIALIZED_NAME_VIDEO_CODEC)
  private String videoCodec;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public VideostatusEncodingMetadata() {
  }

  public VideostatusEncodingMetadata aspectRatio(String aspectRatio) {
    
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * Get aspectRatio
   * @return aspectRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAspectRatio() {
    return aspectRatio;
  }


  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public VideostatusEncodingMetadata audioCodec(String audioCodec) {
    
    this.audioCodec = audioCodec;
    return this;
  }

   /**
   * The method used to compress and decompress digital audio for your video.
   * @return audioCodec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The method used to compress and decompress digital audio for your video.")

  public String getAudioCodec() {
    return audioCodec;
  }


  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }


  public VideostatusEncodingMetadata bitrate(BigDecimal bitrate) {
    
    this.bitrate = bitrate;
    return this;
  }

   /**
   * The number of bits processed per second.
   * @return bitrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of bits processed per second.")

  public BigDecimal getBitrate() {
    return bitrate;
  }


  public void setBitrate(BigDecimal bitrate) {
    this.bitrate = bitrate;
  }


  public VideostatusEncodingMetadata duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The length of the video.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of the video.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public VideostatusEncodingMetadata framerate(Integer framerate) {
    
    this.framerate = framerate;
    return this;
  }

   /**
   * The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second (fps).
   * @return framerate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second (fps).")

  public Integer getFramerate() {
    return framerate;
  }


  public void setFramerate(Integer framerate) {
    this.framerate = framerate;
  }


  public VideostatusEncodingMetadata height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of the video in pixels.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of the video in pixels.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public VideostatusEncodingMetadata samplerate(Integer samplerate) {
    
    this.samplerate = samplerate;
    return this;
  }

   /**
   * How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the higher the frequencies that can be recorded. They are presented in this API using hertz.
   * @return samplerate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48000", value = "How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the higher the frequencies that can be recorded. They are presented in this API using hertz.")

  public Integer getSamplerate() {
    return samplerate;
  }


  public void setSamplerate(Integer samplerate) {
    this.samplerate = samplerate;
  }


  public VideostatusEncodingMetadata videoCodec(String videoCodec) {
    
    this.videoCodec = videoCodec;
    return this;
  }

   /**
   * The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec library. 
   * @return videoCodec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec library. ")

  public String getVideoCodec() {
    return videoCodec;
  }


  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }


  public VideostatusEncodingMetadata width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width of the video in pixels.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the video in pixels.")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideostatusEncodingMetadata videostatusEncodingMetadata = (VideostatusEncodingMetadata) o;
    return Objects.equals(this.aspectRatio, videostatusEncodingMetadata.aspectRatio) &&
        Objects.equals(this.audioCodec, videostatusEncodingMetadata.audioCodec) &&
        Objects.equals(this.bitrate, videostatusEncodingMetadata.bitrate) &&
        Objects.equals(this.duration, videostatusEncodingMetadata.duration) &&
        Objects.equals(this.framerate, videostatusEncodingMetadata.framerate) &&
        Objects.equals(this.height, videostatusEncodingMetadata.height) &&
        Objects.equals(this.samplerate, videostatusEncodingMetadata.samplerate) &&
        Objects.equals(this.videoCodec, videostatusEncodingMetadata.videoCodec) &&
        Objects.equals(this.width, videostatusEncodingMetadata.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatio, audioCodec, bitrate, duration, framerate, height, samplerate, videoCodec, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideostatusEncodingMetadata {\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    framerate: ").append(toIndentedString(framerate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    samplerate: ").append(toIndentedString(samplerate)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("aspectRatio");
    openapiFields.add("audioCodec");
    openapiFields.add("bitrate");
    openapiFields.add("duration");
    openapiFields.add("framerate");
    openapiFields.add("height");
    openapiFields.add("samplerate");
    openapiFields.add("videoCodec");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideostatusEncodingMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideostatusEncodingMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideostatusEncodingMetadata is not found in the empty JSON string", VideostatusEncodingMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VideostatusEncodingMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideostatusEncodingMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("aspectRatio") != null && !jsonObj.get("aspectRatio").isJsonNull()) && !jsonObj.get("aspectRatio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aspectRatio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aspectRatio").toString()));
      }
      if ((jsonObj.get("audioCodec") != null && !jsonObj.get("audioCodec").isJsonNull()) && !jsonObj.get("audioCodec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audioCodec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audioCodec").toString()));
      }
      if ((jsonObj.get("videoCodec") != null && !jsonObj.get("videoCodec").isJsonNull()) && !jsonObj.get("videoCodec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoCodec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("videoCodec").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideostatusEncodingMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideostatusEncodingMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideostatusEncodingMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideostatusEncodingMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<VideostatusEncodingMetadata>() {
           @Override
           public void write(JsonWriter out, VideostatusEncodingMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideostatusEncodingMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideostatusEncodingMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideostatusEncodingMetadata
  * @throws IOException if the JSON string is invalid with respect to VideostatusEncodingMetadata
  */
  public static VideostatusEncodingMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideostatusEncodingMetadata.class);
  }

 /**
  * Convert an instance of VideostatusEncodingMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
