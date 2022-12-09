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
import com.outmatchapi.apivideo.Pagination;
import com.outmatchapi.apivideo.Webhook;
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
 * WebhooksListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T00:34:33.415753Z[Etc/UTC]")
public class WebhooksListResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Webhook> data = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private Pagination pagination;

  public WebhooksListResponse() {
  }

  public WebhooksListResponse data(List<Webhook> data) {
    
    this.data = data;
    return this;
  }

  public WebhooksListResponse addDataItem(Webhook dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Webhook> getData() {
    return data;
  }


  public void setData(List<Webhook> data) {
    this.data = data;
  }


  public WebhooksListResponse pagination(Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pagination getPagination() {
    return pagination;
  }


  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksListResponse webhooksListResponse = (WebhooksListResponse) o;
    return Objects.equals(this.data, webhooksListResponse.data) &&
        Objects.equals(this.pagination, webhooksListResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("pagination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksListResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhooksListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksListResponse is not found in the empty JSON string", WebhooksListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhooksListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhooksListResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            Webhook.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `pagination`
      if (jsonObj.get("pagination") != null && !jsonObj.get("pagination").isJsonNull()) {
        Pagination.validateJsonObject(jsonObj.getAsJsonObject("pagination"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksListResponse>() {
           @Override
           public void write(JsonWriter out, WebhooksListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhooksListResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhooksListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksListResponse
  * @throws IOException if the JSON string is invalid with respect to WebhooksListResponse
  */
  public static WebhooksListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksListResponse.class);
  }

 /**
  * Convert an instance of WebhooksListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

