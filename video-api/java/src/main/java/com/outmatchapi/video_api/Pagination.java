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
import com.outmatchapi.video_api.PaginationLink;
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
 * Pagination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T02:10:33.826846Z[Etc/UTC]")
public class Pagination {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "currentPage";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_ITEMS = "currentPageItems";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_ITEMS)
  private Integer currentPageItems;

  public static final String SERIALIZED_NAME_ITEMS_TOTAL = "itemsTotal";
  @SerializedName(SERIALIZED_NAME_ITEMS_TOTAL)
  private Integer itemsTotal;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<PaginationLink> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGES_TOTAL = "pagesTotal";
  @SerializedName(SERIALIZED_NAME_PAGES_TOTAL)
  private Integer pagesTotal;

  public Pagination() {
  }

  
  public Pagination(
     Integer currentPage, 
     Integer currentPageItems, 
     Integer itemsTotal, 
     Integer pageSize, 
     Integer pagesTotal
  ) {
    this();
    this.currentPage = currentPage;
    this.currentPageItems = currentPageItems;
    this.itemsTotal = itemsTotal;
    this.pageSize = pageSize;
    this.pagesTotal = pagesTotal;
  }

   /**
   * The current page index.
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current page index.")

  public Integer getCurrentPage() {
    return currentPage;
  }




   /**
   * The number of items on the current page.
   * @return currentPageItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items on the current page.")

  public Integer getCurrentPageItems() {
    return currentPageItems;
  }




   /**
   * Total number of items that exist.
   * @return itemsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of items that exist.")

  public Integer getItemsTotal() {
    return itemsTotal;
  }




  public Pagination links(List<PaginationLink> links) {
    
    this.links = links;
    return this;
  }

  public Pagination addLinksItem(PaginationLink linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PaginationLink> getLinks() {
    return links;
  }


  public void setLinks(List<PaginationLink> links) {
    this.links = links;
  }


   /**
   * Maximum number of item per page.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of item per page.")

  public Integer getPageSize() {
    return pageSize;
  }




   /**
   * Number of items listed in the current page.
   * @return pagesTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of items listed in the current page.")

  public Integer getPagesTotal() {
    return pagesTotal;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.currentPage, pagination.currentPage) &&
        Objects.equals(this.currentPageItems, pagination.currentPageItems) &&
        Objects.equals(this.itemsTotal, pagination.itemsTotal) &&
        Objects.equals(this.links, pagination.links) &&
        Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.pagesTotal, pagination.pagesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, currentPageItems, itemsTotal, links, pageSize, pagesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    currentPageItems: ").append(toIndentedString(currentPageItems)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
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
    openapiFields.add("currentPage");
    openapiFields.add("currentPageItems");
    openapiFields.add("itemsTotal");
    openapiFields.add("links");
    openapiFields.add("pageSize");
    openapiFields.add("pagesTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("links");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Pagination
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Pagination.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pagination is not found in the empty JSON string", Pagination.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Pagination.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Pagination` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Pagination.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        PaginationLink.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Pagination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pagination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pagination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pagination.class));

       return (TypeAdapter<T>) new TypeAdapter<Pagination>() {
           @Override
           public void write(JsonWriter out, Pagination value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Pagination read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Pagination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Pagination
  * @throws IOException if the JSON string is invalid with respect to Pagination
  */
  public static Pagination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pagination.class);
  }

 /**
  * Convert an instance of Pagination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

