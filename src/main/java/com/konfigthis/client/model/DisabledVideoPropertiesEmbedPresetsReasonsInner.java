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
 * DisabledVideoPropertiesEmbedPresetsReasonsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DisabledVideoPropertiesEmbedPresetsReasonsInner {
  /**
   * The icon that represents the reason why embed presets are disabled.  Option descriptions:  * &#x60;clock&#x60; - The reason is represented by a clock icon.  * &#x60;create&#x60; - The reason is represented by a create icon.  * &#x60;image&#x60; - The reason is represented by an image icon.  * &#x60;theme&#x60; - The reason is represented by a theme icon. 
   */
  @JsonAdapter(IconEnum.Adapter.class)
 public enum IconEnum {
    CLOCK("clock"),
    
    CREATE("create"),
    
    IMAGE("image"),
    
    THEME("theme");

    private String value;

    IconEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IconEnum fromValue(String value) {
      for (IconEnum b : IconEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IconEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IconEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IconEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private IconEnum icon;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public DisabledVideoPropertiesEmbedPresetsReasonsInner() {
  }

  public DisabledVideoPropertiesEmbedPresetsReasonsInner icon(IconEnum icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * The icon that represents the reason why embed presets are disabled.  Option descriptions:  * &#x60;clock&#x60; - The reason is represented by a clock icon.  * &#x60;create&#x60; - The reason is represented by a create icon.  * &#x60;image&#x60; - The reason is represented by an image icon.  * &#x60;theme&#x60; - The reason is represented by a theme icon. 
   * @return icon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CLOCK", required = true, value = "The icon that represents the reason why embed presets are disabled.  Option descriptions:  * `clock` - The reason is represented by a clock icon.  * `create` - The reason is represented by a create icon.  * `image` - The reason is represented by an image icon.  * `theme` - The reason is represented by a theme icon. ")

  public IconEnum getIcon() {
    return icon;
  }


  public void setIcon(IconEnum icon) {
    
    
    
    this.icon = icon;
  }


  public DisabledVideoPropertiesEmbedPresetsReasonsInner message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * A user-deliverable message of why embed presets are disabled.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Pro template", required = true, value = "A user-deliverable message of why embed presets are disabled.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
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
   * @return the DisabledVideoPropertiesEmbedPresetsReasonsInner instance itself
   */
  public DisabledVideoPropertiesEmbedPresetsReasonsInner putAdditionalProperty(String key, Object value) {
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
    DisabledVideoPropertiesEmbedPresetsReasonsInner disabledVideoPropertiesEmbedPresetsReasonsInner = (DisabledVideoPropertiesEmbedPresetsReasonsInner) o;
    return Objects.equals(this.icon, disabledVideoPropertiesEmbedPresetsReasonsInner.icon) &&
        Objects.equals(this.message, disabledVideoPropertiesEmbedPresetsReasonsInner.message)&&
        Objects.equals(this.additionalProperties, disabledVideoPropertiesEmbedPresetsReasonsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisabledVideoPropertiesEmbedPresetsReasonsInner {\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("icon");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("icon");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisabledVideoPropertiesEmbedPresetsReasonsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DisabledVideoPropertiesEmbedPresetsReasonsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisabledVideoPropertiesEmbedPresetsReasonsInner is not found in the empty JSON string", DisabledVideoPropertiesEmbedPresetsReasonsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DisabledVideoPropertiesEmbedPresetsReasonsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisabledVideoPropertiesEmbedPresetsReasonsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisabledVideoPropertiesEmbedPresetsReasonsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisabledVideoPropertiesEmbedPresetsReasonsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisabledVideoPropertiesEmbedPresetsReasonsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DisabledVideoPropertiesEmbedPresetsReasonsInner>() {
           @Override
           public void write(JsonWriter out, DisabledVideoPropertiesEmbedPresetsReasonsInner value) throws IOException {
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
           public DisabledVideoPropertiesEmbedPresetsReasonsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DisabledVideoPropertiesEmbedPresetsReasonsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DisabledVideoPropertiesEmbedPresetsReasonsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisabledVideoPropertiesEmbedPresetsReasonsInner
  * @throws IOException if the JSON string is invalid with respect to DisabledVideoPropertiesEmbedPresetsReasonsInner
  */
  public static DisabledVideoPropertiesEmbedPresetsReasonsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisabledVideoPropertiesEmbedPresetsReasonsInner.class);
  }

 /**
  * Convert an instance of DisabledVideoPropertiesEmbedPresetsReasonsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
