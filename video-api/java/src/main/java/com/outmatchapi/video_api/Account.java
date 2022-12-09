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
import com.outmatchapi.video_api.AccountQuota;
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
 * Account
 * @deprecated
 */
@Deprecated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-09T02:10:33.826846Z[Etc/UTC]")
public class Account {
  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;

  public static final String SERIALIZED_NAME_QUOTA = "quota";
  @SerializedName(SERIALIZED_NAME_QUOTA)
  private AccountQuota quota;

  public Account() {
  }

  public Account environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed here, as well as stats and features information. If you use your sandbox key, the environment is \&quot;sandbox.\&quot; If you use your production key, the environment is \&quot;production.\&quot;
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed here, as well as stats and features information. If you use your sandbox key, the environment is \"sandbox.\" If you use your production key, the environment is \"production.\"")

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public Account features(List<String> features) {
    
    this.features = features;
    return this;
  }

  public Account addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your player, stats.player_events - the ability to see statistics about how your player is being used, transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec.
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"app.dynamic_metadata, app.event_log\"]", value = "Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your player, stats.player_events - the ability to see statistics about how your player is being used, transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec.")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public Account quota(AccountQuota quota) {
    
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountQuota getQuota() {
    return quota;
  }


  public void setQuota(AccountQuota quota) {
    this.quota = quota;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.environment, account.environment) &&
        Objects.equals(this.features, account.features) &&
        Objects.equals(this.quota, account.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, features, quota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
    openapiFields.add("environment");
    openapiFields.add("features");
    openapiFields.add("quota");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Account.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Account` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }
      // validate the optional field `quota`
      if (jsonObj.get("quota") != null && !jsonObj.get("quota").isJsonNull()) {
        AccountQuota.validateJsonObject(jsonObj.getAsJsonObject("quota"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
