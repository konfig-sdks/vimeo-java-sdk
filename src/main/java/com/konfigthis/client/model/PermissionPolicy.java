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
 * PermissionPolicy
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PermissionPolicy {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_DISPLAY_DESCRIPTION = "display_description";
  @SerializedName(SERIALIZED_NAME_DISPLAY_DESCRIPTION)
  private String displayDescription;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private String modifiedOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERMISSION_ACTIONS = "permission_actions";
  @SerializedName(SERIALIZED_NAME_PERMISSION_ACTIONS)
  private Object permissionActions;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public PermissionPolicy() {
  }

  public PermissionPolicy createdOn(String createdOn) {
    
    
    
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The time at which the permission policy was created.
   * @return createdOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time at which the permission policy was created.")

  public String getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(String createdOn) {
    
    
    
    this.createdOn = createdOn;
  }


  public PermissionPolicy displayDescription(String displayDescription) {
    
    
    
    
    this.displayDescription = displayDescription;
    return this;
  }

   /**
   * The display description of the permission policy, translated where applicable.
   * @return displayDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The display description of the permission policy, translated where applicable.")

  public String getDisplayDescription() {
    return displayDescription;
  }


  public void setDisplayDescription(String displayDescription) {
    
    
    
    this.displayDescription = displayDescription;
  }


  public PermissionPolicy displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the permission policy, translated where applicable.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The display name of the permission policy, translated where applicable.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public PermissionPolicy modifiedOn(String modifiedOn) {
    
    
    
    
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * The time at which the permission policy was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The time at which the permission policy was last modified.")

  public String getModifiedOn() {
    return modifiedOn;
  }


  public void setModifiedOn(String modifiedOn) {
    
    
    
    this.modifiedOn = modifiedOn;
  }


  public PermissionPolicy name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the permission policy.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the permission policy.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PermissionPolicy permissionActions(Object permissionActions) {
    
    
    
    
    this.permissionActions = permissionActions;
    return this;
  }

   /**
   * The permission actions associated with the policy.
   * @return permissionActions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The permission actions associated with the policy.")

  public Object getPermissionActions() {
    return permissionActions;
  }


  public void setPermissionActions(Object permissionActions) {
    
    
    
    this.permissionActions = permissionActions;
  }


  public PermissionPolicy uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the permission policy.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/users/12345/permission_policies/56789", required = true, value = "The URI of the permission policy.")

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
   * @return the PermissionPolicy instance itself
   */
  public PermissionPolicy putAdditionalProperty(String key, Object value) {
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
    PermissionPolicy permissionPolicy = (PermissionPolicy) o;
    return Objects.equals(this.createdOn, permissionPolicy.createdOn) &&
        Objects.equals(this.displayDescription, permissionPolicy.displayDescription) &&
        Objects.equals(this.displayName, permissionPolicy.displayName) &&
        Objects.equals(this.modifiedOn, permissionPolicy.modifiedOn) &&
        Objects.equals(this.name, permissionPolicy.name) &&
        Objects.equals(this.permissionActions, permissionPolicy.permissionActions) &&
        Objects.equals(this.uri, permissionPolicy.uri)&&
        Objects.equals(this.additionalProperties, permissionPolicy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, displayDescription, displayName, modifiedOn, name, permissionActions, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionPolicy {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissionActions: ").append(toIndentedString(permissionActions)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("display_description");
    openapiFields.add("display_name");
    openapiFields.add("modified_on");
    openapiFields.add("name");
    openapiFields.add("permission_actions");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_on");
    openapiRequiredFields.add("display_description");
    openapiRequiredFields.add("display_name");
    openapiRequiredFields.add("modified_on");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("permission_actions");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PermissionPolicy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PermissionPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermissionPolicy is not found in the empty JSON string", PermissionPolicy.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PermissionPolicy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("created_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_on").toString()));
      }
      if (!jsonObj.get("display_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_description").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (!jsonObj.get("modified_on").isJsonNull() && !jsonObj.get("modified_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified_on").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermissionPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermissionPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermissionPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermissionPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<PermissionPolicy>() {
           @Override
           public void write(JsonWriter out, PermissionPolicy value) throws IOException {
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
           public PermissionPolicy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PermissionPolicy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PermissionPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermissionPolicy
  * @throws IOException if the JSON string is invalid with respect to PermissionPolicy
  */
  public static PermissionPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermissionPolicy.class);
  }

 /**
  * Convert an instance of PermissionPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

