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
 * Information about the video&#39;s versions.
 */
@ApiModel(description = "Information about the video's versions.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideoMetadataConnectionsVersions {
  public static final String SERIALIZED_NAME_CURRENT_URI = "current_uri";
  @SerializedName(SERIALIZED_NAME_CURRENT_URI)
  private String currentUri;

  public static final String SERIALIZED_NAME_HAS_INTERACTIVE = "has_interactive";
  @SerializedName(SERIALIZED_NAME_HAS_INTERACTIVE)
  private Boolean hasInteractive;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN_VARIABLE_FRAME_RESOLUTION = "origin_variable_frame_resolution";
  @SerializedName(SERIALIZED_NAME_ORIGIN_VARIABLE_FRAME_RESOLUTION)
  private Boolean originVariableFrameResolution;

  public static final String SERIALIZED_NAME_RESOURCE_KEY = "resource_key";
  @SerializedName(SERIALIZED_NAME_RESOURCE_KEY)
  private String resourceKey;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public VideoMetadataConnectionsVersions() {
  }

  public VideoMetadataConnectionsVersions currentUri(String currentUri) {
    
    
    
    
    this.currentUri = currentUri;
    return this;
  }

   /**
   * The URI of the current version of the video.
   * @return currentUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/videos/258684937/versions/12345", value = "The URI of the current version of the video.")

  public String getCurrentUri() {
    return currentUri;
  }


  public void setCurrentUri(String currentUri) {
    
    
    
    this.currentUri = currentUri;
  }


  public VideoMetadataConnectionsVersions hasInteractive(Boolean hasInteractive) {
    
    
    
    
    this.hasInteractive = hasInteractive;
    return this;
  }

   /**
   * Whether the video has interactive capability.
   * @return hasInteractive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether the video has interactive capability.")

  public Boolean getHasInteractive() {
    return hasInteractive;
  }


  public void setHasInteractive(Boolean hasInteractive) {
    
    
    
    this.hasInteractive = hasInteractive;
  }


  public VideoMetadataConnectionsVersions options(List<String> options) {
    
    
    
    
    this.options = options;
    return this;
  }

  public VideoMetadataConnectionsVersions addOptionsItem(String optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * An array of HTTP methods permitted on this URI.
   * @return options
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of HTTP methods permitted on this URI.")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    
    
    
    this.options = options;
  }


  public VideoMetadataConnectionsVersions originVariableFrameResolution(Boolean originVariableFrameResolution) {
    
    
    
    
    this.originVariableFrameResolution = originVariableFrameResolution;
    return this;
  }

   /**
   * Whether the video has unified resolution. If the value of this field is &#x60;false&#x60;, the video requires transcoding.
   * @return originVariableFrameResolution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether the video has unified resolution. If the value of this field is `false`, the video requires transcoding.")

  public Boolean getOriginVariableFrameResolution() {
    return originVariableFrameResolution;
  }


  public void setOriginVariableFrameResolution(Boolean originVariableFrameResolution) {
    
    
    
    this.originVariableFrameResolution = originVariableFrameResolution;
  }


  public VideoMetadataConnectionsVersions resourceKey(String resourceKey) {
    
    
    
    
    this.resourceKey = resourceKey;
    return this;
  }

   /**
   * The resource key string of the current version of the video.
   * @return resourceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bac1033deba2310ebba2caec33c23e4beea67aba", value = "The resource key string of the current version of the video.")

  public String getResourceKey() {
    return resourceKey;
  }


  public void setResourceKey(String resourceKey) {
    
    
    
    this.resourceKey = resourceKey;
  }


  public VideoMetadataConnectionsVersions total(Double total) {
    
    
    
    
    this.total = total;
    return this;
  }

  public VideoMetadataConnectionsVersions total(Integer total) {
    
    
    
    
    this.total = total.doubleValue();
    return this;
  }

   /**
   * The total number of versions on this connection.
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "The total number of versions on this connection.")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    
    
    
    this.total = total;
  }


  public VideoMetadataConnectionsVersions uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The API URI that resolves to the connection data.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/videos/258684937/versions", required = true, value = "The API URI that resolves to the connection data.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
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
   * @return the VideoMetadataConnectionsVersions instance itself
   */
  public VideoMetadataConnectionsVersions putAdditionalProperty(String key, Object value) {
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
    VideoMetadataConnectionsVersions videoMetadataConnectionsVersions = (VideoMetadataConnectionsVersions) o;
    return Objects.equals(this.currentUri, videoMetadataConnectionsVersions.currentUri) &&
        Objects.equals(this.hasInteractive, videoMetadataConnectionsVersions.hasInteractive) &&
        Objects.equals(this.options, videoMetadataConnectionsVersions.options) &&
        Objects.equals(this.originVariableFrameResolution, videoMetadataConnectionsVersions.originVariableFrameResolution) &&
        Objects.equals(this.resourceKey, videoMetadataConnectionsVersions.resourceKey) &&
        Objects.equals(this.total, videoMetadataConnectionsVersions.total) &&
        Objects.equals(this.uri, videoMetadataConnectionsVersions.uri)&&
        Objects.equals(this.additionalProperties, videoMetadataConnectionsVersions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentUri, hasInteractive, options, originVariableFrameResolution, resourceKey, total, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoMetadataConnectionsVersions {\n");
    sb.append("    currentUri: ").append(toIndentedString(currentUri)).append("\n");
    sb.append("    hasInteractive: ").append(toIndentedString(hasInteractive)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    originVariableFrameResolution: ").append(toIndentedString(originVariableFrameResolution)).append("\n");
    sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("current_uri");
    openapiFields.add("has_interactive");
    openapiFields.add("options");
    openapiFields.add("origin_variable_frame_resolution");
    openapiFields.add("resource_key");
    openapiFields.add("total");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("has_interactive");
    openapiRequiredFields.add("options");
    openapiRequiredFields.add("origin_variable_frame_resolution");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoMetadataConnectionsVersions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoMetadataConnectionsVersions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoMetadataConnectionsVersions is not found in the empty JSON string", VideoMetadataConnectionsVersions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VideoMetadataConnectionsVersions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("current_uri") != null && !jsonObj.get("current_uri").isJsonNull()) && !jsonObj.get("current_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_uri").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("options") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
      if ((jsonObj.get("resource_key") != null && !jsonObj.get("resource_key").isJsonNull()) && !jsonObj.get("resource_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_key").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoMetadataConnectionsVersions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoMetadataConnectionsVersions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoMetadataConnectionsVersions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoMetadataConnectionsVersions.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoMetadataConnectionsVersions>() {
           @Override
           public void write(JsonWriter out, VideoMetadataConnectionsVersions value) throws IOException {
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
           public VideoMetadataConnectionsVersions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideoMetadataConnectionsVersions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideoMetadataConnectionsVersions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoMetadataConnectionsVersions
  * @throws IOException if the JSON string is invalid with respect to VideoMetadataConnectionsVersions
  */
  public static VideoMetadataConnectionsVersions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoMetadataConnectionsVersions.class);
  }

 /**
  * Convert an instance of VideoMetadataConnectionsVersions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

