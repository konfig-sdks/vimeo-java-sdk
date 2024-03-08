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
import com.konfigthis.client.model.TrimmedVideoMetadata;
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
 * TrimmedVideo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrimmedVideo {
  public static final String SERIALIZED_NAME_CLIP_ID = "clip_id";
  @SerializedName(SERIALIZED_NAME_CLIP_ID)
  private Double clipId;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_CREATED_VERSION_ID = "created_version_id";
  @SerializedName(SERIALIZED_NAME_CREATED_VERSION_ID)
  private String createdVersionId;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_IS_CLIP_FINISHED_TRANSCODING = "is_clip_finished_transcoding";
  @SerializedName(SERIALIZED_NAME_IS_CLIP_FINISHED_TRANSCODING)
  private Boolean isClipFinishedTranscoding;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private TrimmedVideoMetadata metadata;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private String modifiedOn;

  public static final String SERIALIZED_NAME_ROOT_VERSION_ID = "root_version_id";
  @SerializedName(SERIALIZED_NAME_ROOT_VERSION_ID)
  private String rootVersionId;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_VERSION_QUALITY = "version_quality";
  @SerializedName(SERIALIZED_NAME_VERSION_QUALITY)
  private String versionQuality;

  public TrimmedVideo() {
  }

  public TrimmedVideo clipId(Double clipId) {
    
    
    
    
    this.clipId = clipId;
    return this;
  }

  public TrimmedVideo clipId(Integer clipId) {
    
    
    
    
    this.clipId = clipId.doubleValue();
    return this;
  }

   /**
   * The ID of the video. _This field is deprecated._
   * @return clipId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "258684937", required = true, value = "The ID of the video. _This field is deprecated._")

  public Double getClipId() {
    return clipId;
  }


  public void setClipId(Double clipId) {
    
    
    
    this.clipId = clipId;
  }


  public TrimmedVideo createdOn(String createdOn) {
    
    
    
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The time in ISO 8601 format when the trim was created.
   * @return createdOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time in ISO 8601 format when the trim was created.")

  public String getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(String createdOn) {
    
    
    
    this.createdOn = createdOn;
  }


  public TrimmedVideo createdVersionId(String createdVersionId) {
    
    
    
    
    this.createdVersionId = createdVersionId;
    return this;
  }

   /**
   * The most recent version of the trimmed video. _This field is deprecated._
   * @return createdVersionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12354", required = true, value = "The most recent version of the trimmed video. _This field is deprecated._")

  public String getCreatedVersionId() {
    return createdVersionId;
  }


  public void setCreatedVersionId(String createdVersionId) {
    
    
    
    this.createdVersionId = createdVersionId;
  }


  public TrimmedVideo end(String end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * The end of the trim from the last trim, in seconds.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5.0", required = true, value = "The end of the trim from the last trim, in seconds.")

  public String getEnd() {
    return end;
  }


  public void setEnd(String end) {
    
    
    
    this.end = end;
  }


  public TrimmedVideo isClipFinishedTranscoding(Boolean isClipFinishedTranscoding) {
    
    
    
    
    this.isClipFinishedTranscoding = isClipFinishedTranscoding;
    return this;
  }

   /**
   * Whether the transcoding jobs for the video file have finished. _This field is deprecated._
   * @return isClipFinishedTranscoding
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the transcoding jobs for the video file have finished. _This field is deprecated._")

  public Boolean getIsClipFinishedTranscoding() {
    return isClipFinishedTranscoding;
  }


  public void setIsClipFinishedTranscoding(Boolean isClipFinishedTranscoding) {
    
    
    
    this.isClipFinishedTranscoding = isClipFinishedTranscoding;
  }


  public TrimmedVideo metadata(TrimmedVideoMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrimmedVideoMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(TrimmedVideoMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public TrimmedVideo modifiedOn(String modifiedOn) {
    
    
    
    
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * The time in ISO 8601 format when the trim policy was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The time in ISO 8601 format when the trim policy was last modified.")

  public String getModifiedOn() {
    return modifiedOn;
  }


  public void setModifiedOn(String modifiedOn) {
    
    
    
    this.modifiedOn = modifiedOn;
  }


  public TrimmedVideo rootVersionId(String rootVersionId) {
    
    
    
    
    this.rootVersionId = rootVersionId;
    return this;
  }

   /**
   * The video version that is the source of the trimmed video. _This field is deprecated._
   * @return rootVersionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12354", required = true, value = "The video version that is the source of the trimmed video. _This field is deprecated._")

  public String getRootVersionId() {
    return rootVersionId;
  }


  public void setRootVersionId(String rootVersionId) {
    
    
    
    this.rootVersionId = rootVersionId;
  }


  public TrimmedVideo start(String start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * The start of the trim from the last trim, in seconds.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.0", required = true, value = "The start of the trim from the last trim, in seconds.")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    
    
    
    this.start = start;
  }


  public TrimmedVideo uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the player or the trim service. _This field is deprecated._
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://player.vimeo.com/video/1234", required = true, value = "The URI of the player or the trim service. _This field is deprecated._")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public TrimmedVideo versionQuality(String versionQuality) {
    
    
    
    
    this.versionQuality = versionQuality;
    return this;
  }

   /**
   * The quality of the root version video file.
   * @return versionQuality
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The quality of the root version video file.")

  public String getVersionQuality() {
    return versionQuality;
  }


  public void setVersionQuality(String versionQuality) {
    
    
    
    this.versionQuality = versionQuality;
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
   * @return the TrimmedVideo instance itself
   */
  public TrimmedVideo putAdditionalProperty(String key, Object value) {
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
    TrimmedVideo trimmedVideo = (TrimmedVideo) o;
    return Objects.equals(this.clipId, trimmedVideo.clipId) &&
        Objects.equals(this.createdOn, trimmedVideo.createdOn) &&
        Objects.equals(this.createdVersionId, trimmedVideo.createdVersionId) &&
        Objects.equals(this.end, trimmedVideo.end) &&
        Objects.equals(this.isClipFinishedTranscoding, trimmedVideo.isClipFinishedTranscoding) &&
        Objects.equals(this.metadata, trimmedVideo.metadata) &&
        Objects.equals(this.modifiedOn, trimmedVideo.modifiedOn) &&
        Objects.equals(this.rootVersionId, trimmedVideo.rootVersionId) &&
        Objects.equals(this.start, trimmedVideo.start) &&
        Objects.equals(this.uri, trimmedVideo.uri) &&
        Objects.equals(this.versionQuality, trimmedVideo.versionQuality)&&
        Objects.equals(this.additionalProperties, trimmedVideo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clipId, createdOn, createdVersionId, end, isClipFinishedTranscoding, metadata, modifiedOn, rootVersionId, start, uri, versionQuality, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrimmedVideo {\n");
    sb.append("    clipId: ").append(toIndentedString(clipId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdVersionId: ").append(toIndentedString(createdVersionId)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    isClipFinishedTranscoding: ").append(toIndentedString(isClipFinishedTranscoding)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    rootVersionId: ").append(toIndentedString(rootVersionId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    versionQuality: ").append(toIndentedString(versionQuality)).append("\n");
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
    openapiFields.add("clip_id");
    openapiFields.add("created_on");
    openapiFields.add("created_version_id");
    openapiFields.add("end");
    openapiFields.add("is_clip_finished_transcoding");
    openapiFields.add("metadata");
    openapiFields.add("modified_on");
    openapiFields.add("root_version_id");
    openapiFields.add("start");
    openapiFields.add("uri");
    openapiFields.add("version_quality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clip_id");
    openapiRequiredFields.add("created_on");
    openapiRequiredFields.add("created_version_id");
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("is_clip_finished_transcoding");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("modified_on");
    openapiRequiredFields.add("root_version_id");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("version_quality");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrimmedVideo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrimmedVideo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrimmedVideo is not found in the empty JSON string", TrimmedVideo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrimmedVideo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("created_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_on").toString()));
      }
      if (!jsonObj.get("created_version_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_version_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_version_id").toString()));
      }
      if (!jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      // validate the required field `metadata`
      TrimmedVideoMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      if (!jsonObj.get("modified_on").isJsonNull() && !jsonObj.get("modified_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_on").toString()));
      }
      if (!jsonObj.get("root_version_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `root_version_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("root_version_id").toString()));
      }
      if (!jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if (!jsonObj.get("version_quality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_quality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_quality").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrimmedVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrimmedVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrimmedVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrimmedVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<TrimmedVideo>() {
           @Override
           public void write(JsonWriter out, TrimmedVideo value) throws IOException {
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
           public TrimmedVideo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrimmedVideo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrimmedVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrimmedVideo
  * @throws IOException if the JSON string is invalid with respect to TrimmedVideo
  */
  public static TrimmedVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrimmedVideo.class);
  }

 /**
  * Convert an instance of TrimmedVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
