/*
 * Svix API
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.4.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outmatchapi.apitest;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outmatchapi.apitest.MessageAttemptTriggerType;
import com.outmatchapi.apitest.MessageStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * MessageAttemptEndpointOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-29T16:17:45.360553Z[Etc/UTC]")
public class MessageAttemptEndpointOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MSG_ID = "msgId";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;

  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "responseStatusCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private Integer responseStatusCode;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MessageStatus status;

  public static final String SERIALIZED_NAME_TRIGGER_TYPE = "triggerType";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TYPE)
  private MessageAttemptTriggerType triggerType;

  public MessageAttemptEndpointOut() {
  }

  public MessageAttemptEndpointOut id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MessageAttemptEndpointOut msgId(String msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * Get msgId
   * @return msgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "")

  public String getMsgId() {
    return msgId;
  }


  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  public MessageAttemptEndpointOut endpointId(String endpointId) {
    
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "")

  public String getEndpointId() {
    return endpointId;
  }


  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  public MessageAttemptEndpointOut response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{}", required = true, value = "")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  public MessageAttemptEndpointOut responseStatusCode(Integer responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * Get responseStatusCode
   * @return responseStatusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "")

  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public MessageAttemptEndpointOut timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public MessageAttemptEndpointOut status(MessageStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageStatus getStatus() {
    return status;
  }


  public void setStatus(MessageStatus status) {
    this.status = status;
  }


  public MessageAttemptEndpointOut triggerType(MessageAttemptTriggerType triggerType) {
    
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Get triggerType
   * @return triggerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageAttemptTriggerType getTriggerType() {
    return triggerType;
  }


  public void setTriggerType(MessageAttemptTriggerType triggerType) {
    this.triggerType = triggerType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAttemptEndpointOut messageAttemptEndpointOut = (MessageAttemptEndpointOut) o;
    return Objects.equals(this.id, messageAttemptEndpointOut.id) &&
        Objects.equals(this.msgId, messageAttemptEndpointOut.msgId) &&
        Objects.equals(this.endpointId, messageAttemptEndpointOut.endpointId) &&
        Objects.equals(this.response, messageAttemptEndpointOut.response) &&
        Objects.equals(this.responseStatusCode, messageAttemptEndpointOut.responseStatusCode) &&
        Objects.equals(this.timestamp, messageAttemptEndpointOut.timestamp) &&
        Objects.equals(this.status, messageAttemptEndpointOut.status) &&
        Objects.equals(this.triggerType, messageAttemptEndpointOut.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, msgId, endpointId, response, responseStatusCode, timestamp, status, triggerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAttemptEndpointOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("msgId");
    openapiFields.add("endpointId");
    openapiFields.add("response");
    openapiFields.add("responseStatusCode");
    openapiFields.add("timestamp");
    openapiFields.add("status");
    openapiFields.add("triggerType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("msgId");
    openapiRequiredFields.add("endpointId");
    openapiRequiredFields.add("response");
    openapiRequiredFields.add("responseStatusCode");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("triggerType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageAttemptEndpointOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MessageAttemptEndpointOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageAttemptEndpointOut is not found in the empty JSON string", MessageAttemptEndpointOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageAttemptEndpointOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageAttemptEndpointOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageAttemptEndpointOut.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("msgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msgId").toString()));
      }
      if (!jsonObj.get("endpointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointId").toString()));
      }
      if (!jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageAttemptEndpointOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageAttemptEndpointOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageAttemptEndpointOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageAttemptEndpointOut.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageAttemptEndpointOut>() {
           @Override
           public void write(JsonWriter out, MessageAttemptEndpointOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageAttemptEndpointOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageAttemptEndpointOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageAttemptEndpointOut
  * @throws IOException if the JSON string is invalid with respect to MessageAttemptEndpointOut
  */
  public static MessageAttemptEndpointOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageAttemptEndpointOut.class);
  }

 /**
  * Convert an instance of MessageAttemptEndpointOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

