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
 * Quality
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T00:34:33.415753Z[Etc/UTC]")
public class Quality {
  /**
   * The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
   */
  @JsonAdapter(QualityEnum.Adapter.class)
  public enum QualityEnum {
    _240P("240p"),
    
    _360P("360p"),
    
    _480P("480p"),
    
    _720P("720p"),
    
    _1080P("1080p"),
    
    _2160P("2160p");

    private String value;

    QualityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private QualityEnum quality;

  /**
   * The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WAITING("waiting"),
    
    ENCODING("encoding"),
    
    ENCODED("encoded"),
    
    FAILED("failed");

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

  public Quality() {
  }

  public Quality quality(QualityEnum quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "720p", value = "The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.")

  public QualityEnum getQuality() {
    return quality;
  }


  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }


  public Quality status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.")

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
    Quality quality = (Quality) o;
    return Objects.equals(this.quality, quality.quality) &&
        Objects.equals(this.status, quality.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quality {\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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
    openapiFields.add("quality");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Quality
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Quality.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Quality is not found in the empty JSON string", Quality.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Quality.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Quality` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("quality") != null && !jsonObj.get("quality").isJsonNull()) && !jsonObj.get("quality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quality").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Quality.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Quality' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Quality> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Quality.class));

       return (TypeAdapter<T>) new TypeAdapter<Quality>() {
           @Override
           public void write(JsonWriter out, Quality value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Quality read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Quality given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Quality
  * @throws IOException if the JSON string is invalid with respect to Quality
  */
  public static Quality fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Quality.class);
  }

 /**
  * Convert an instance of Quality to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

