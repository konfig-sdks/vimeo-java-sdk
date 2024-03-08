/*
 * Vimeo API
 * Build something great. Vimeo's API supports flexible, high-quality video integration with your custom apps.
 *
 * The version of the OpenAPI document: 3.4
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * EditChapterRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EditChapterRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ACTIVE_THUMBNAIL_URI = "active_thumbnail_uri";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THUMBNAIL_URI)
  private String activeThumbnailUri;

  public static final String SERIALIZED_NAME_TIMECODE = "timecode";
  @SerializedName(SERIALIZED_NAME_TIMECODE)
  private Double timecode;

  public EditChapterRequest() {
  }

  public EditChapterRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the chapter.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chapter 1", value = "The title of the chapter.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public EditChapterRequest activeThumbnailUri(String activeThumbnailUri) {
    
    
    
    
    this.activeThumbnailUri = activeThumbnailUri;
    return this;
  }

   /**
   * The URI of the chapter&#39;s active thumbnail.
   * @return activeThumbnailUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/videos/12345678/chapters/12345/pictures/24kjh4h4g38175db9f59fae9f7g9ekhg", value = "The URI of the chapter's active thumbnail.")

  public String getActiveThumbnailUri() {
    return activeThumbnailUri;
  }


  public void setActiveThumbnailUri(String activeThumbnailUri) {
    
    
    
    this.activeThumbnailUri = activeThumbnailUri;
  }


  public EditChapterRequest timecode(Double timecode) {
    
    
    
    
    this.timecode = timecode;
    return this;
  }

  public EditChapterRequest timecode(Integer timecode) {
    
    
    
    
    this.timecode = timecode.doubleValue();
    return this;
  }

   /**
   * The timecode of the chapter in seconds from the start of the video.
   * @return timecode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "140", value = "The timecode of the chapter in seconds from the start of the video.")

  public Double getTimecode() {
    return timecode;
  }


  public void setTimecode(Double timecode) {
    
    
    
    this.timecode = timecode;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EditChapterRequest instance itself
   */
  public EditChapterRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditChapterRequest editChapterRequest = (EditChapterRequest) o;
    return Objects.equals(this.title, editChapterRequest.title) &&
        Objects.equals(this.activeThumbnailUri, editChapterRequest.activeThumbnailUri) &&
        Objects.equals(this.timecode, editChapterRequest.timecode)&&
        Objects.equals(this.additionalProperties, editChapterRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, activeThumbnailUri, timecode, additionalProperties);
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
    sb.append("class EditChapterRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    activeThumbnailUri: ").append(toIndentedString(activeThumbnailUri)).append("\n");
    sb.append("    timecode: ").append(toIndentedString(timecode)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("active_thumbnail_uri");
    openapiFields.add("timecode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EditChapterRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EditChapterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditChapterRequest is not found in the empty JSON string", EditChapterRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonNull() && (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("active_thumbnail_uri") != null && !jsonObj.get("active_thumbnail_uri").isJsonNull()) && !jsonObj.get("active_thumbnail_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active_thumbnail_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active_thumbnail_uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditChapterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditChapterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditChapterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditChapterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EditChapterRequest>() {
           @Override
           public void write(JsonWriter out, EditChapterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EditChapterRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EditChapterRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EditChapterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EditChapterRequest
  * @throws IOException if the JSON string is invalid with respect to EditChapterRequest
  */
  public static EditChapterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditChapterRequest.class);
  }

 /**
  * Convert an instance of EditChapterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

