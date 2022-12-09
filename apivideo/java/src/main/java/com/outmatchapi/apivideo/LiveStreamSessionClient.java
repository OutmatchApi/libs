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
 * What kind of browser the viewer is using for the live stream session.
 */
@ApiModel(description = "What kind of browser the viewer is using for the live stream session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T00:34:33.415753Z[Etc/UTC]")
public class LiveStreamSessionClient {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public LiveStreamSessionClient() {
  }

  public LiveStreamSessionClient name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the browser used to view the live stream session.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Firefox", value = "The name of the browser used to view the live stream session.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LiveStreamSessionClient type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of client used to view the live stream session.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "browser", value = "The type of client used to view the live stream session.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LiveStreamSessionClient version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the browser used to view the live stream session.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "67.0", value = "The version of the browser used to view the live stream session.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamSessionClient liveStreamSessionClient = (LiveStreamSessionClient) o;
    return Objects.equals(this.name, liveStreamSessionClient.name) &&
        Objects.equals(this.type, liveStreamSessionClient.type) &&
        Objects.equals(this.version, liveStreamSessionClient.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamSessionClient {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveStreamSessionClient
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveStreamSessionClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveStreamSessionClient is not found in the empty JSON string", LiveStreamSessionClient.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LiveStreamSessionClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LiveStreamSessionClient` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveStreamSessionClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveStreamSessionClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveStreamSessionClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveStreamSessionClient.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveStreamSessionClient>() {
           @Override
           public void write(JsonWriter out, LiveStreamSessionClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LiveStreamSessionClient read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LiveStreamSessionClient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveStreamSessionClient
  * @throws IOException if the JSON string is invalid with respect to LiveStreamSessionClient
  */
  public static LiveStreamSessionClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveStreamSessionClient.class);
  }

 /**
  * Convert an instance of LiveStreamSessionClient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

