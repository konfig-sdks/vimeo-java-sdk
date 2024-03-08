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
 * VideosTextTracksAddTextTrackRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideosTextTracksAddTextTrackRequest {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATED = "is_auto_generated";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATED)
  private Boolean isAutoGenerated;

  public static final String SERIALIZED_NAME_IS_EDITED = "is_edited";
  @SerializedName(SERIALIZED_NAME_IS_EDITED)
  private Boolean isEdited;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The type of text track.  Option descriptions:  * &#x60;captions&#x60; - The text track is the captions type.  * &#x60;chapters&#x60; - The text track is the chapters type.  * &#x60;descriptions&#x60; - The text track is the descriptions type.  * &#x60;metadata&#x60; - The text track is the metadata type.  * &#x60;subtitles&#x60; - The text track is the subtitles type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CAPTIONS("captions"),
    
    CHAPTERS("chapters"),
    
    DESCRIPTIONS("descriptions"),
    
    METADATA("metadata"),
    
    SUBTITLES("subtitles");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public VideosTextTracksAddTextTrackRequest() {
  }

  public VideosTextTracksAddTextTrackRequest active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Whether the current text track is the *active text track,* or the one that appears in the player. Only one text track per language and type can be active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the current text track is the *active text track,* or the one that appears in the player. Only one text track per language and type can be active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public VideosTextTracksAddTextTrackRequest isAutoGenerated(Boolean isAutoGenerated) {
    
    
    
    
    this.isAutoGenerated = isAutoGenerated;
    return this;
  }

   /**
   * Whether the text track was uploaded automatically by the Seshat audio annotation management platform.
   * @return isAutoGenerated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the text track was uploaded automatically by the Seshat audio annotation management platform.")

  public Boolean getIsAutoGenerated() {
    return isAutoGenerated;
  }


  public void setIsAutoGenerated(Boolean isAutoGenerated) {
    
    
    
    this.isAutoGenerated = isAutoGenerated;
  }


  public VideosTextTracksAddTextTrackRequest isEdited(Boolean isEdited) {
    
    
    
    
    this.isEdited = isEdited;
    return this;
  }

   /**
   * Whether the text track was uploaded by the Seshat audio annotation management platform after the user edited their transcript.
   * @return isEdited
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the text track was uploaded by the Seshat audio annotation management platform after the user edited their transcript.")

  public Boolean getIsEdited() {
    return isEdited;
  }


  public void setIsEdited(Boolean isEdited) {
    
    
    
    this.isEdited = isEdited;
  }


  public VideosTextTracksAddTextTrackRequest language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * The language of the text track. For a full list of supported languages, use the [&#x60;/languages?filter&#x3D;texttracks&#x60;](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint.
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "en-US", required = true, value = "The language of the text track. For a full list of supported languages, use the [`/languages?filter=texttracks`](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public VideosTextTracksAddTextTrackRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the text track.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Commentary", required = true, value = "The name of the text track.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public VideosTextTracksAddTextTrackRequest type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of text track.  Option descriptions:  * &#x60;captions&#x60; - The text track is the captions type.  * &#x60;chapters&#x60; - The text track is the chapters type.  * &#x60;descriptions&#x60; - The text track is the descriptions type.  * &#x60;metadata&#x60; - The text track is the metadata type.  * &#x60;subtitles&#x60; - The text track is the subtitles type. 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of text track.  Option descriptions:  * `captions` - The text track is the captions type.  * `chapters` - The text track is the chapters type.  * `descriptions` - The text track is the descriptions type.  * `metadata` - The text track is the metadata type.  * `subtitles` - The text track is the subtitles type. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the VideosTextTracksAddTextTrackRequest instance itself
   */
  public VideosTextTracksAddTextTrackRequest putAdditionalProperty(String key, Object value) {
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
    VideosTextTracksAddTextTrackRequest videosTextTracksAddTextTrackRequest = (VideosTextTracksAddTextTrackRequest) o;
    return Objects.equals(this.active, videosTextTracksAddTextTrackRequest.active) &&
        Objects.equals(this.isAutoGenerated, videosTextTracksAddTextTrackRequest.isAutoGenerated) &&
        Objects.equals(this.isEdited, videosTextTracksAddTextTrackRequest.isEdited) &&
        Objects.equals(this.language, videosTextTracksAddTextTrackRequest.language) &&
        Objects.equals(this.name, videosTextTracksAddTextTrackRequest.name) &&
        Objects.equals(this.type, videosTextTracksAddTextTrackRequest.type)&&
        Objects.equals(this.additionalProperties, videosTextTracksAddTextTrackRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, isAutoGenerated, isEdited, language, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideosTextTracksAddTextTrackRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    isAutoGenerated: ").append(toIndentedString(isAutoGenerated)).append("\n");
    sb.append("    isEdited: ").append(toIndentedString(isEdited)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("is_auto_generated");
    openapiFields.add("is_edited");
    openapiFields.add("language");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideosTextTracksAddTextTrackRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideosTextTracksAddTextTrackRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideosTextTracksAddTextTrackRequest is not found in the empty JSON string", VideosTextTracksAddTextTrackRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VideosTextTracksAddTextTrackRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideosTextTracksAddTextTrackRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideosTextTracksAddTextTrackRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideosTextTracksAddTextTrackRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideosTextTracksAddTextTrackRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VideosTextTracksAddTextTrackRequest>() {
           @Override
           public void write(JsonWriter out, VideosTextTracksAddTextTrackRequest value) throws IOException {
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
           public VideosTextTracksAddTextTrackRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideosTextTracksAddTextTrackRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideosTextTracksAddTextTrackRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideosTextTracksAddTextTrackRequest
  * @throws IOException if the JSON string is invalid with respect to VideosTextTracksAddTextTrackRequest
  */
  public static VideosTextTracksAddTextTrackRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideosTextTracksAddTextTrackRequest.class);
  }

 /**
  * Convert an instance of VideosTextTracksAddTextTrackRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
