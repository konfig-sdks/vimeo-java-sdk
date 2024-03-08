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
 * VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner {
  public static final String SERIALIZED_NAME_PITCH = "pitch";
  @SerializedName(SERIALIZED_NAME_PITCH)
  private Double pitch;

  public static final String SERIALIZED_NAME_ROLL = "roll";
  @SerializedName(SERIALIZED_NAME_ROLL)
  private Double roll;

  public static final String SERIALIZED_NAME_TIME_CODE = "time_code";
  @SerializedName(SERIALIZED_NAME_TIME_CODE)
  private Double timeCode;

  public static final String SERIALIZED_NAME_YAW = "yaw";
  @SerializedName(SERIALIZED_NAME_YAW)
  private Double yaw;

  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner() {
  }

  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner pitch(Double pitch) {
    
    
    
    
    this.pitch = pitch;
    return this;
  }

  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner pitch(Integer pitch) {
    
    
    
    
    this.pitch = pitch.doubleValue();
    return this;
  }

   /**
   * The 360 director timeline pitch. This value must be between &#x60;−90&#x60; and &#x60;90&#x60;, and it&#39;s required only when **spatial.director_timeline** is defined.
   * @return pitch
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "70", required = true, value = "The 360 director timeline pitch. This value must be between `−90` and `90`, and it's required only when **spatial.director_timeline** is defined.")

  public Double getPitch() {
    return pitch;
  }


  public void setPitch(Double pitch) {
    
    
    
    this.pitch = pitch;
  }


  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner roll(Double roll) {
    
    
    
    
    this.roll = roll;
    return this;
  }

  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner roll(Integer roll) {
    
    
    
    
    this.roll = roll.doubleValue();
    return this;
  }

   /**
   * The 360 director timeline roll.
   * @return roll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 360 director timeline roll.")

  public Double getRoll() {
    return roll;
  }


  public void setRoll(Double roll) {
    
    
    
    this.roll = roll;
  }


  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner timeCode(Double timeCode) {
    
    
    
    
    this.timeCode = timeCode;
    return this;
  }

  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner timeCode(Integer timeCode) {
    
    
    
    
    this.timeCode = timeCode.doubleValue();
    return this;
  }

   /**
   * The 360 director timeline time code. This field is required only when **spatial.director_timeline** is defined.
   * @return timeCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The 360 director timeline time code. This field is required only when **spatial.director_timeline** is defined.")

  public Double getTimeCode() {
    return timeCode;
  }


  public void setTimeCode(Double timeCode) {
    
    
    
    this.timeCode = timeCode;
  }


  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner yaw(Double yaw) {
    
    
    
    
    this.yaw = yaw;
    return this;
  }

  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner yaw(Integer yaw) {
    
    
    
    
    this.yaw = yaw.doubleValue();
    return this;
  }

   /**
   * The 360 director timeline yaw. This value must be between &#x60;0&#x60; and &#x60;360&#x60;, and it&#39;s required only when **spatial.director_timeline** is defined.
   * @return yaw
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "125", required = true, value = "The 360 director timeline yaw. This value must be between `0` and `360`, and it's required only when **spatial.director_timeline** is defined.")

  public Double getYaw() {
    return yaw;
  }


  public void setYaw(Double yaw) {
    
    
    
    this.yaw = yaw;
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
   * @return the VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner instance itself
   */
  public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner putAdditionalProperty(String key, Object value) {
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
    VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner videosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner = (VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner) o;
    return Objects.equals(this.pitch, videosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.pitch) &&
        Objects.equals(this.roll, videosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.roll) &&
        Objects.equals(this.timeCode, videosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.timeCode) &&
        Objects.equals(this.yaw, videosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.yaw)&&
        Objects.equals(this.additionalProperties, videosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitch, roll, timeCode, yaw, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner {\n");
    sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
    sb.append("    roll: ").append(toIndentedString(roll)).append("\n");
    sb.append("    timeCode: ").append(toIndentedString(timeCode)).append("\n");
    sb.append("    yaw: ").append(toIndentedString(yaw)).append("\n");
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
    openapiFields.add("pitch");
    openapiFields.add("roll");
    openapiFields.add("time_code");
    openapiFields.add("yaw");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pitch");
    openapiRequiredFields.add("time_code");
    openapiRequiredFields.add("yaw");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner is not found in the empty JSON string", VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.class));

       return (TypeAdapter<T>) new TypeAdapter<VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner>() {
           @Override
           public void write(JsonWriter out, VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner value) throws IOException {
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
           public VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner
  * @throws IOException if the JSON string is invalid with respect to VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner
  */
  public static VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.class);
  }

 /**
  * Convert an instance of VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

