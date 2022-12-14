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
import com.outmatchapi.slack.PinsListSuccessSchemaInnerAnyOfItemsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * PinsListSuccessSchemaInnerAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class PinsListSuccessSchemaInnerAnyOf {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private Set<PinsListSuccessSchemaInnerAnyOfItemsInner> items = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public PinsListSuccessSchemaInnerAnyOf() {
  }

  public PinsListSuccessSchemaInnerAnyOf items(Set<PinsListSuccessSchemaInnerAnyOfItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public PinsListSuccessSchemaInnerAnyOf addItemsItem(PinsListSuccessSchemaInnerAnyOfItemsInner itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<PinsListSuccessSchemaInnerAnyOfItemsInner> getItems() {
    return items;
  }


  public void setItems(Set<PinsListSuccessSchemaInnerAnyOfItemsInner> items) {
    this.items = items;
  }


  public PinsListSuccessSchemaInnerAnyOf ok(DefsOkTrue ok) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinsListSuccessSchemaInnerAnyOf pinsListSuccessSchemaInnerAnyOf = (PinsListSuccessSchemaInnerAnyOf) o;
    return Objects.equals(this.items, pinsListSuccessSchemaInnerAnyOf.items) &&
        Objects.equals(this.ok, pinsListSuccessSchemaInnerAnyOf.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinsListSuccessSchemaInnerAnyOf {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PinsListSuccessSchemaInnerAnyOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PinsListSuccessSchemaInnerAnyOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PinsListSuccessSchemaInnerAnyOf is not found in the empty JSON string", PinsListSuccessSchemaInnerAnyOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PinsListSuccessSchemaInnerAnyOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PinsListSuccessSchemaInnerAnyOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PinsListSuccessSchemaInnerAnyOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        PinsListSuccessSchemaInnerAnyOfItemsInner.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PinsListSuccessSchemaInnerAnyOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PinsListSuccessSchemaInnerAnyOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PinsListSuccessSchemaInnerAnyOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PinsListSuccessSchemaInnerAnyOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PinsListSuccessSchemaInnerAnyOf>() {
           @Override
           public void write(JsonWriter out, PinsListSuccessSchemaInnerAnyOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PinsListSuccessSchemaInnerAnyOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PinsListSuccessSchemaInnerAnyOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PinsListSuccessSchemaInnerAnyOf
  * @throws IOException if the JSON string is invalid with respect to PinsListSuccessSchemaInnerAnyOf
  */
  public static PinsListSuccessSchemaInnerAnyOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PinsListSuccessSchemaInnerAnyOf.class);
  }

 /**
  * Convert an instance of PinsListSuccessSchemaInnerAnyOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

