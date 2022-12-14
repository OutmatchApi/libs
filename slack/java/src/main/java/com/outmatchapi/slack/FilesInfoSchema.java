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
import com.outmatchapi.slack.ObjsFile;
import com.outmatchapi.slack.ObjsPaging;
import com.outmatchapi.slack.ObjsResponseMetadataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Schema for successful response from files.info method
 */
@ApiModel(description = "Schema for successful response from files.info method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class FilesInfoSchema {
  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<Object> comments = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTENT_HTML = "content_html";
  @SerializedName(SERIALIZED_NAME_CONTENT_HTML)
  private Object contentHtml = null;

  public static final String SERIALIZED_NAME_EDITOR = "editor";
  @SerializedName(SERIALIZED_NAME_EDITOR)
  private String editor;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private ObjsFile _file;

  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private DefsOkTrue ok;

  public static final String SERIALIZED_NAME_PAGING = "paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private ObjsPaging paging;

  public static final String SERIALIZED_NAME_RESPONSE_METADATA = "response_metadata";
  @SerializedName(SERIALIZED_NAME_RESPONSE_METADATA)
  private List<ObjsResponseMetadataInner> responseMetadata = null;

  public FilesInfoSchema() {
  }

  public FilesInfoSchema comments(List<Object> comments) {
    
    this.comments = comments;
    return this;
  }

  public FilesInfoSchema addCommentsItem(Object commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getComments() {
    return comments;
  }


  public void setComments(List<Object> comments) {
    this.comments = comments;
  }


  public FilesInfoSchema contentHtml(Object contentHtml) {
    
    this.contentHtml = contentHtml;
    return this;
  }

   /**
   * Get contentHtml
   * @return contentHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContentHtml() {
    return contentHtml;
  }


  public void setContentHtml(Object contentHtml) {
    this.contentHtml = contentHtml;
  }


  public FilesInfoSchema editor(String editor) {
    
    this.editor = editor;
    return this;
  }

   /**
   * Get editor
   * @return editor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEditor() {
    return editor;
  }


  public void setEditor(String editor) {
    this.editor = editor;
  }


  public FilesInfoSchema _file(ObjsFile _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ObjsFile getFile() {
    return _file;
  }


  public void setFile(ObjsFile _file) {
    this._file = _file;
  }


  public FilesInfoSchema ok(DefsOkTrue ok) {
    
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


  public FilesInfoSchema paging(ObjsPaging paging) {
    
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


  public FilesInfoSchema responseMetadata(List<ObjsResponseMetadataInner> responseMetadata) {
    
    this.responseMetadata = responseMetadata;
    return this;
  }

  public FilesInfoSchema addResponseMetadataItem(ObjsResponseMetadataInner responseMetadataItem) {
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
    FilesInfoSchema filesInfoSchema = (FilesInfoSchema) o;
    return Objects.equals(this.comments, filesInfoSchema.comments) &&
        Objects.equals(this.contentHtml, filesInfoSchema.contentHtml) &&
        Objects.equals(this.editor, filesInfoSchema.editor) &&
        Objects.equals(this._file, filesInfoSchema._file) &&
        Objects.equals(this.ok, filesInfoSchema.ok) &&
        Objects.equals(this.paging, filesInfoSchema.paging) &&
        Objects.equals(this.responseMetadata, filesInfoSchema.responseMetadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, contentHtml, editor, _file, ok, paging, responseMetadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesInfoSchema {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contentHtml: ").append(toIndentedString(contentHtml)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("comments");
    openapiFields.add("content_html");
    openapiFields.add("editor");
    openapiFields.add("file");
    openapiFields.add("ok");
    openapiFields.add("paging");
    openapiFields.add("response_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("file");
    openapiRequiredFields.add("ok");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilesInfoSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FilesInfoSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilesInfoSchema is not found in the empty JSON string", FilesInfoSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FilesInfoSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilesInfoSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilesInfoSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("comments") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("comments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be an array in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if ((jsonObj.get("editor") != null && !jsonObj.get("editor").isJsonNull()) && !jsonObj.get("editor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editor").toString()));
      }
      // validate the required field `file`
      ObjsFile.validateJsonObject(jsonObj.getAsJsonObject("file"));
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
       if (!FilesInfoSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilesInfoSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilesInfoSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilesInfoSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<FilesInfoSchema>() {
           @Override
           public void write(JsonWriter out, FilesInfoSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilesInfoSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilesInfoSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilesInfoSchema
  * @throws IOException if the JSON string is invalid with respect to FilesInfoSchema
  */
  public static FilesInfoSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilesInfoSchema.class);
  }

 /**
  * Convert an instance of FilesInfoSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

