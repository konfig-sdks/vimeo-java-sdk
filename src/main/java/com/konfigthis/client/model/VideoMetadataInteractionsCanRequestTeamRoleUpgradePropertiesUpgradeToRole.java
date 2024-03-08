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
 * An object containing data on the value of **upgrade_to_role** and whether it&#39;s required for the interaction.
 */
@ApiModel(description = "An object containing data on the value of **upgrade_to_role** and whether it's required for the interaction.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole {
  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole() {
  }

  public VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * Whether the upgrade role must be sent to achieve the desired action.
   * @return required
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the upgrade role must be sent to achieve the desired action.")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
  }


  public VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole value(Double value) {
    
    
    
    
    this.value = value;
    return this;
  }

  public VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole value(Integer value) {
    
    
    
    
    this.value = value.doubleValue();
    return this;
  }

   /**
   * The value of the team role to which the user should be upgraded.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value of the team role to which the user should be upgraded.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    
    
    
    this.value = value;
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
   * @return the VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole instance itself
   */
  public VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole putAdditionalProperty(String key, Object value) {
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
    VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole videoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole = (VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole) o;
    return Objects.equals(this.required, videoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.required) &&
        Objects.equals(this.value, videoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.value)&&
        Objects.equals(this.additionalProperties, videoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("required");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("required");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole is not found in the empty JSON string", VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole>() {
           @Override
           public void write(JsonWriter out, VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole value) throws IOException {
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
           public VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole
  * @throws IOException if the JSON string is invalid with respect to VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole
  */
  public static VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole.class);
  }

 /**
  * Convert an instance of VideoMetadataInteractionsCanRequestTeamRoleUpgradePropertiesUpgradeToRole to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

