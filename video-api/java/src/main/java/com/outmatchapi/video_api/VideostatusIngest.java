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
import com.outmatchapi.video_api.BytesRange;
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
 * Details about the capturing, transferring, and storing of your video for use immediately or in the future.
 */
@ApiModel(description = "Details about the capturing, transferring, and storing of your video for use immediately or in the future.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T02:10:33.826846Z[Etc/UTC]")
public class VideostatusIngest {
  public static final String SERIALIZED_NAME_FILESIZE = "filesize";
  @SerializedName(SERIALIZED_NAME_FILESIZE)
  private Integer filesize;

  public static final String SERIALIZED_NAME_RECEIVED_BYTES = "receivedBytes";
  @SerializedName(SERIALIZED_NAME_RECEIVED_BYTES)
  private List<BytesRange> receivedBytes = null;

  /**
   * There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    MISSING("missing"),
    
    UPLOADING("uploading"),
    
    UPLOADED("uploaded");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public VideostatusIngest() {
  }

  public VideostatusIngest filesize(Integer filesize) {
    
    this.filesize = filesize;
    return this;
  }

   /**
   * The size of your file in bytes.
   * @return filesize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200000", value = "The size of your file in bytes.")

  public Integer getFilesize() {
    return filesize;
  }


  public void setFilesize(Integer filesize) {
    this.filesize = filesize;
  }


  public VideostatusIngest receivedBytes(List<BytesRange> receivedBytes) {
    
    this.receivedBytes = receivedBytes;
    return this;
  }

  public VideostatusIngest addReceivedBytesItem(BytesRange receivedBytesItem) {
    if (this.receivedBytes == null) {
      this.receivedBytes = new ArrayList<>();
    }
    this.receivedBytes.add(receivedBytesItem);
    return this;
  }

   /**
   * The total number of bytes received, listed for each chunk of the upload.
   * @return receivedBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of bytes received, listed for each chunk of the upload.")

  public List<BytesRange> getReceivedBytes() {
    return receivedBytes;
  }


  public void setReceivedBytes(List<BytesRange> receivedBytes) {
    this.receivedBytes = receivedBytes;
  }


  public VideostatusIngest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "uploaded", value = "There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideostatusIngest videostatusIngest = (VideostatusIngest) o;
    return Objects.equals(this.filesize, videostatusIngest.filesize) &&
        Objects.equals(this.receivedBytes, videostatusIngest.receivedBytes) &&
        Objects.equals(this.status, videostatusIngest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesize, receivedBytes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideostatusIngest {\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
    sb.append("    receivedBytes: ").append(toIndentedString(receivedBytes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("filesize");
    openapiFields.add("receivedBytes");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideostatusIngest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideostatusIngest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideostatusIngest is not found in the empty JSON string", VideostatusIngest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VideostatusIngest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideostatusIngest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("receivedBytes") != null && !jsonObj.get("receivedBytes").isJsonNull()) {
        JsonArray jsonArrayreceivedBytes = jsonObj.getAsJsonArray("receivedBytes");
        if (jsonArrayreceivedBytes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("receivedBytes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `receivedBytes` to be an array in the JSON string but got `%s`", jsonObj.get("receivedBytes").toString()));
          }

          // validate the optional field `receivedBytes` (array)
          for (int i = 0; i < jsonArrayreceivedBytes.size(); i++) {
            BytesRange.validateJsonObject(jsonArrayreceivedBytes.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideostatusIngest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideostatusIngest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideostatusIngest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideostatusIngest.class));

       return (TypeAdapter<T>) new TypeAdapter<VideostatusIngest>() {
           @Override
           public void write(JsonWriter out, VideostatusIngest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideostatusIngest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideostatusIngest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideostatusIngest
  * @throws IOException if the JSON string is invalid with respect to VideostatusIngest
  */
  public static VideostatusIngest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideostatusIngest.class);
  }

 /**
  * Convert an instance of VideostatusIngest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

