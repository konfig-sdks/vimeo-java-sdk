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
import com.konfigthis.client.model.WebinarEmailContent;
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
 * The email customization details for the webinar reminder email, which goes out 24 hours before the event.
 */
@ApiModel(description = "The email customization details for the webinar reminder email, which goes out 24 hours before the event.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarEmailSettingsEmailEventReminder24Hrs {
  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private WebinarEmailContent custom;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private WebinarEmailContent _default;

  public WebinarEmailSettingsEmailEventReminder24Hrs() {
  }

  public WebinarEmailSettingsEmailEventReminder24Hrs custom(WebinarEmailContent custom) {
    
    
    
    
    this.custom = custom;
    return this;
  }

   /**
   * The email custom details for the webinar reminder email, which goes out 24 hours before the event.
   * @return custom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email custom details for the webinar reminder email, which goes out 24 hours before the event.")

  public WebinarEmailContent getCustom() {
    return custom;
  }


  public void setCustom(WebinarEmailContent custom) {
    
    
    
    this.custom = custom;
  }


  public WebinarEmailSettingsEmailEventReminder24Hrs _default(WebinarEmailContent _default) {
    
    
    
    
    this._default = _default;
    return this;
  }

   /**
   * The email default details for the webinar reminder email, which goes out 24 hours before the event.
   * @return _default
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email default details for the webinar reminder email, which goes out 24 hours before the event.")

  public WebinarEmailContent getDefault() {
    return _default;
  }


  public void setDefault(WebinarEmailContent _default) {
    
    
    
    this._default = _default;
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
   * @return the WebinarEmailSettingsEmailEventReminder24Hrs instance itself
   */
  public WebinarEmailSettingsEmailEventReminder24Hrs putAdditionalProperty(String key, Object value) {
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
    WebinarEmailSettingsEmailEventReminder24Hrs webinarEmailSettingsEmailEventReminder24Hrs = (WebinarEmailSettingsEmailEventReminder24Hrs) o;
    return Objects.equals(this.custom, webinarEmailSettingsEmailEventReminder24Hrs.custom) &&
        Objects.equals(this._default, webinarEmailSettingsEmailEventReminder24Hrs._default)&&
        Objects.equals(this.additionalProperties, webinarEmailSettingsEmailEventReminder24Hrs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, _default, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarEmailSettingsEmailEventReminder24Hrs {\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
    openapiFields.add("custom");
    openapiFields.add("default");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("custom");
    openapiRequiredFields.add("default");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarEmailSettingsEmailEventReminder24Hrs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarEmailSettingsEmailEventReminder24Hrs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarEmailSettingsEmailEventReminder24Hrs is not found in the empty JSON string", WebinarEmailSettingsEmailEventReminder24Hrs.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebinarEmailSettingsEmailEventReminder24Hrs.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `custom`
      WebinarEmailContent.validateJsonObject(jsonObj.getAsJsonObject("custom"));
      // validate the required field `default`
      WebinarEmailContent.validateJsonObject(jsonObj.getAsJsonObject("default"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarEmailSettingsEmailEventReminder24Hrs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarEmailSettingsEmailEventReminder24Hrs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarEmailSettingsEmailEventReminder24Hrs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarEmailSettingsEmailEventReminder24Hrs.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarEmailSettingsEmailEventReminder24Hrs>() {
           @Override
           public void write(JsonWriter out, WebinarEmailSettingsEmailEventReminder24Hrs value) throws IOException {
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
           public WebinarEmailSettingsEmailEventReminder24Hrs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarEmailSettingsEmailEventReminder24Hrs instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarEmailSettingsEmailEventReminder24Hrs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarEmailSettingsEmailEventReminder24Hrs
  * @throws IOException if the JSON string is invalid with respect to WebinarEmailSettingsEmailEventReminder24Hrs
  */
  public static WebinarEmailSettingsEmailEventReminder24Hrs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarEmailSettingsEmailEventReminder24Hrs.class);
  }

 /**
  * Convert an instance of WebinarEmailSettingsEmailEventReminder24Hrs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

