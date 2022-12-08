/*
 * Slack Web API
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outmatchapi.slack;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outmatchapi.slack.DefsOkTrue;
import com.outmatchapi.slack.ObjsPaging;
import com.outmatchapi.slack.ObjsResponseMetadataInner;
import com.outmatchapi.slack.ReactionsListSchemaItemsInnerInner;
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
 * Schema for successful response from reactions.list method
 */
@ApiModel(description = "Schema for successful response from reactions.list method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ReactionsListSchema {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<List<ReactionsListSchemaItemsInnerInner>> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public static final String SERIALIZED_NAME_PAGING = "paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private ObjsPaging paging;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private List<ObjsResponseMetadataInner> responseMetadata = null;

  public ReactionsListSchema() {
  }

  public ReactionsListSchema items(List<List<ReactionsListSchemaItemsInnerInner>> items) {
    
    this.items = items;
    return this;
  }

  public ReactionsListSchema addItemsItem(List<ReactionsListSchemaItemsInnerInner> itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<List<ReactionsListSchemaItemsInnerInner>> getItems() {
    return items;
  }


  public void setItems(List<List<ReactionsListSchemaItemsInnerInner>> items) {
    this.items = items;
  }


  public ReactionsListSchema ok(DefsOkTrue ok) {
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DefsOkTrue getOk() {
    return ok;
  }


  public void setOk(DefsOkTrue ok) {
    this.ok = ok;
  }


  public ReactionsListSchema paging(ObjsPaging paging) {
    
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsPaging getPaging() {
    return paging;
  }


  public void setPaging(ObjsPaging paging) {
    this.paging = paging;
  }


  public ReactionsListSchema responseMetadata(List<ObjsResponseMetadataInner> responseMetadata) {
    
    this.responseMetadata = responseMetadata;
    return this;
  }

  public ReactionsListSchema addResponseMetadataItem(ObjsResponseMetadataInner responseMetadataItem) {
    if (this.responseMetadata == null) {
      this.responseMetadata = new ArrayList<>();
    }
    this.responseMetadata.add(responseMetadataItem);
    return this;
  }

   /**
   * Get responseMetadata
   * @return responseMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjsResponseMetadataInner> getResponseMetadata() {
    return responseMetadata;
  }


  public void setResponseMetadata(List<ObjsResponseMetadataInner> responseMetadata) {
    this.responseMetadata = responseMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactionsListSchema reactionsListSchema = (ReactionsListSchema) o;
    return Objects.equals(this.items, reactionsListSchema.items) &&
        Objects.equals(this.ok, reactionsListSchema.ok) &&
        Objects.equals(this.paging, reactionsListSchema.paging) &&
        Objects.equals(this.responseMetadata, reactionsListSchema.responseMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, ok, paging, responseMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactionsListSchema {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    responseMetadata: ").append(toIndentedString(responseMetadata)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("ok");
    openapiFields.add("paging");
    openapiFields.add("response_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReactionsListSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReactionsListSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReactionsListSchema is not found in the empty JSON string", ReactionsListSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReactionsListSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReactionsListSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReactionsListSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("items") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }
      // validate the optional field `paging`
      if (jsonObj.get("paging") != null && !jsonObj.get("paging").isJsonNull()) {
        ObjsPaging.validateJsonObject(jsonObj.getAsJsonObject("paging"));
      }
      if (jsonObj.get("response_metadata") != null && !jsonObj.get("response_metadata").isJsonNull()) {
        JsonArray jsonArrayresponseMetadata = jsonObj.getAsJsonArray("response_metadata");
        if (jsonArrayresponseMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("response_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `response_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("response_metadata").toString()));
          }

          // validate the optional field `response_metadata` (array)
          for (int i = 0; i < jsonArrayresponseMetadata.size(); i++) {
            ObjsResponseMetadataInner.validateJsonObject(jsonArrayresponseMetadata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReactionsListSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReactionsListSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReactionsListSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReactionsListSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ReactionsListSchema>() {
           @Override
           public void write(JsonWriter out, ReactionsListSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReactionsListSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReactionsListSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReactionsListSchema
  * @throws IOException if the JSON string is invalid with respect to ReactionsListSchema
  */
  public static ReactionsListSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReactionsListSchema.class);
  }

 /**
  * Convert an instance of ReactionsListSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
