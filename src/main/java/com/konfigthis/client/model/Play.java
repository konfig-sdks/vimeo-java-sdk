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
import com.konfigthis.client.model.HlsDashVideoFile;
import com.konfigthis.client.model.PlayProgressiveInner;
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
 * Play
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Play {
  public static final String SERIALIZED_NAME_DASH = "dash";
  @SerializedName(SERIALIZED_NAME_DASH)
  private HlsDashVideoFile dash;

  public static final String SERIALIZED_NAME_HLS = "hls";
  @SerializedName(SERIALIZED_NAME_HLS)
  private HlsDashVideoFile hls;

  public static final String SERIALIZED_NAME_PROGRESSIVE = "progressive";
  @SerializedName(SERIALIZED_NAME_PROGRESSIVE)
  private List<PlayProgressiveInner> progressive = null;

  /**
   * The play status of the video.  Option descriptions:  * &#x60;playable&#x60; - The video is playable.  * &#x60;purchase_required&#x60; - The video must be purchased.  * &#x60;restricted&#x60; - Playback for the video is restricted.  * &#x60;unavailable&#x60; - The video is unavailable. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PLAYABLE("playable"),
    
    PURCHASE_REQUIRED("purchase_required"),
    
    RESTRICTED("restricted"),
    
    UNAVAILABLE("unavailable");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public Play() {
  }

  public Play dash(HlsDashVideoFile dash) {
    
    
    
    
    this.dash = dash;
    return this;
  }

   /**
   * The DASH video file.
   * @return dash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DASH video file.")

  public HlsDashVideoFile getDash() {
    return dash;
  }


  public void setDash(HlsDashVideoFile dash) {
    
    
    
    this.dash = dash;
  }


  public Play hls(HlsDashVideoFile hls) {
    
    
    
    
    this.hls = hls;
    return this;
  }

   /**
   * The HLS video file.
   * @return hls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HLS video file.")

  public HlsDashVideoFile getHls() {
    return hls;
  }


  public void setHls(HlsDashVideoFile hls) {
    
    
    
    this.hls = hls;
  }


  public Play progressive(List<PlayProgressiveInner> progressive) {
    
    
    
    
    this.progressive = progressive;
    return this;
  }

  public Play addProgressiveItem(PlayProgressiveInner progressiveItem) {
    if (this.progressive == null) {
      this.progressive = new ArrayList<>();
    }
    this.progressive.add(progressiveItem);
    return this;
  }

   /**
   * The progressive video files.
   * @return progressive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The progressive video files.")

  public List<PlayProgressiveInner> getProgressive() {
    return progressive;
  }


  public void setProgressive(List<PlayProgressiveInner> progressive) {
    
    
    
    this.progressive = progressive;
  }


  public Play status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The play status of the video.  Option descriptions:  * &#x60;playable&#x60; - The video is playable.  * &#x60;purchase_required&#x60; - The video must be purchased.  * &#x60;restricted&#x60; - Playback for the video is restricted.  * &#x60;unavailable&#x60; - The video is unavailable. 
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PLAYABLE", required = true, value = "The play status of the video.  Option descriptions:  * `playable` - The video is playable.  * `purchase_required` - The video must be purchased.  * `restricted` - Playback for the video is restricted.  * `unavailable` - The video is unavailable. ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
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
   * @return the Play instance itself
   */
  public Play putAdditionalProperty(String key, Object value) {
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
    Play play = (Play) o;
    return Objects.equals(this.dash, play.dash) &&
        Objects.equals(this.hls, play.hls) &&
        Objects.equals(this.progressive, play.progressive) &&
        Objects.equals(this.status, play.status)&&
        Objects.equals(this.additionalProperties, play.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dash, hls, progressive, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Play {\n");
    sb.append("    dash: ").append(toIndentedString(dash)).append("\n");
    sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
    sb.append("    progressive: ").append(toIndentedString(progressive)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("dash");
    openapiFields.add("hls");
    openapiFields.add("progressive");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Play
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Play.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Play is not found in the empty JSON string", Play.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Play.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `dash`
      if (jsonObj.get("dash") != null && !jsonObj.get("dash").isJsonNull()) {
        HlsDashVideoFile.validateJsonObject(jsonObj.getAsJsonObject("dash"));
      }
      // validate the optional field `hls`
      if (jsonObj.get("hls") != null && !jsonObj.get("hls").isJsonNull()) {
        HlsDashVideoFile.validateJsonObject(jsonObj.getAsJsonObject("hls"));
      }
      if (jsonObj.get("progressive") != null && !jsonObj.get("progressive").isJsonNull()) {
        JsonArray jsonArrayprogressive = jsonObj.getAsJsonArray("progressive");
        if (jsonArrayprogressive != null) {
          // ensure the json data is an array
          if (!jsonObj.get("progressive").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `progressive` to be an array in the JSON string but got `%s`", jsonObj.get("progressive").toString()));
          }

          // validate the optional field `progressive` (array)
          for (int i = 0; i < jsonArrayprogressive.size(); i++) {
            PlayProgressiveInner.validateJsonObject(jsonArrayprogressive.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Play.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Play' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Play> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Play.class));

       return (TypeAdapter<T>) new TypeAdapter<Play>() {
           @Override
           public void write(JsonWriter out, Play value) throws IOException {
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
           public Play read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Play instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Play given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Play
  * @throws IOException if the JSON string is invalid with respect to Play
  */
  public static Play fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Play.class);
  }

 /**
  * Convert an instance of Play to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

