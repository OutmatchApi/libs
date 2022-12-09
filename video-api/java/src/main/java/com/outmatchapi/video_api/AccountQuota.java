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
 * Deprecated
 */
@ApiModel(description = "Deprecated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T02:10:33.826846Z[Etc/UTC]")
public class AccountQuota {
  public static final String SERIALIZED_NAME_QUOTA_REMAINING = "quotaRemaining";
  @SerializedName(SERIALIZED_NAME_QUOTA_REMAINING)
  private BigDecimal quotaRemaining;

  public static final String SERIALIZED_NAME_QUOTA_TOTAL = "quotaTotal";
  @SerializedName(SERIALIZED_NAME_QUOTA_TOTAL)
  private BigDecimal quotaTotal;

  public static final String SERIALIZED_NAME_QUOTA_USED = "quotaUsed";
  @SerializedName(SERIALIZED_NAME_QUOTA_USED)
  private BigDecimal quotaUsed;

  public AccountQuota() {
  }

  public AccountQuota quotaRemaining(BigDecimal quotaRemaining) {
    
    this.quotaRemaining = quotaRemaining;
    return this;
  }

   /**
   * Deprecated
   * @return quotaRemaining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public BigDecimal getQuotaRemaining() {
    return quotaRemaining;
  }


  public void setQuotaRemaining(BigDecimal quotaRemaining) {
    this.quotaRemaining = quotaRemaining;
  }


  public AccountQuota quotaTotal(BigDecimal quotaTotal) {
    
    this.quotaTotal = quotaTotal;
    return this;
  }

   /**
   * Deprecated
   * @return quotaTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public BigDecimal getQuotaTotal() {
    return quotaTotal;
  }


  public void setQuotaTotal(BigDecimal quotaTotal) {
    this.quotaTotal = quotaTotal;
  }


  public AccountQuota quotaUsed(BigDecimal quotaUsed) {
    
    this.quotaUsed = quotaUsed;
    return this;
  }

   /**
   * Deprecated
   * @return quotaUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public BigDecimal getQuotaUsed() {
    return quotaUsed;
  }


  public void setQuotaUsed(BigDecimal quotaUsed) {
    this.quotaUsed = quotaUsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountQuota accountQuota = (AccountQuota) o;
    return Objects.equals(this.quotaRemaining, accountQuota.quotaRemaining) &&
        Objects.equals(this.quotaTotal, accountQuota.quotaTotal) &&
        Objects.equals(this.quotaUsed, accountQuota.quotaUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaRemaining, quotaTotal, quotaUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountQuota {\n");
    sb.append("    quotaRemaining: ").append(toIndentedString(quotaRemaining)).append("\n");
    sb.append("    quotaTotal: ").append(toIndentedString(quotaTotal)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
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
    openapiFields.add("quotaRemaining");
    openapiFields.add("quotaTotal");
    openapiFields.add("quotaUsed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountQuota
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountQuota.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountQuota is not found in the empty JSON string", AccountQuota.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountQuota.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountQuota` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountQuota.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountQuota' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountQuota> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountQuota.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountQuota>() {
           @Override
           public void write(JsonWriter out, AccountQuota value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountQuota read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountQuota given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountQuota
  * @throws IOException if the JSON string is invalid with respect to AccountQuota
  */
  public static AccountQuota fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountQuota.class);
  }

 /**
  * Convert an instance of AccountQuota to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

