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
 * Information about the folder&#39;s group access grants.
 */
@ApiModel(description = "Information about the folder's group access grants.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectMetadataConnectionsGroupFolderGrants {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public ProjectMetadataConnectionsGroupFolderGrants() {
  }

  public ProjectMetadataConnectionsGroupFolderGrants options(List<String> options) {
    
    
    
    
    this.options = options;
    return this;
  }

  public ProjectMetadataConnectionsGroupFolderGrants addOptionsItem(String optionsItem) {
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


  public ProjectMetadataConnectionsGroupFolderGrants total(Double total) {
    
    
    
    
    this.total = total;
    return this;
  }

  public ProjectMetadataConnectionsGroupFolderGrants total(Integer total) {
    
    
    
    
    this.total = total.doubleValue();
    return this;
  }

   /**
   * The total number of group access grants on this connection.
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The total number of group access grants on this connection.")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    
    
    
    this.total = total;
  }


  public ProjectMetadataConnectionsGroupFolderGrants uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The API URI that resolves to the connection data.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/users/152184/folders/98765/group_folder_grants", required = true, value = "The API URI that resolves to the connection data.")

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
   * @return the ProjectMetadataConnectionsGroupFolderGrants instance itself
   */
  public ProjectMetadataConnectionsGroupFolderGrants putAdditionalProperty(String key, Object value) {
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
    ProjectMetadataConnectionsGroupFolderGrants projectMetadataConnectionsGroupFolderGrants = (ProjectMetadataConnectionsGroupFolderGrants) o;
    return Objects.equals(this.options, projectMetadataConnectionsGroupFolderGrants.options) &&
        Objects.equals(this.total, projectMetadataConnectionsGroupFolderGrants.total) &&
        Objects.equals(this.uri, projectMetadataConnectionsGroupFolderGrants.uri)&&
        Objects.equals(this.additionalProperties, projectMetadataConnectionsGroupFolderGrants.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, total, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMetadataConnectionsGroupFolderGrants {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("options");
    openapiFields.add("total");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("options");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectMetadataConnectionsGroupFolderGrants
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectMetadataConnectionsGroupFolderGrants.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectMetadataConnectionsGroupFolderGrants is not found in the empty JSON string", ProjectMetadataConnectionsGroupFolderGrants.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectMetadataConnectionsGroupFolderGrants.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("options") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectMetadataConnectionsGroupFolderGrants.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectMetadataConnectionsGroupFolderGrants' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectMetadataConnectionsGroupFolderGrants> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectMetadataConnectionsGroupFolderGrants.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectMetadataConnectionsGroupFolderGrants>() {
           @Override
           public void write(JsonWriter out, ProjectMetadataConnectionsGroupFolderGrants value) throws IOException {
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
           public ProjectMetadataConnectionsGroupFolderGrants read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectMetadataConnectionsGroupFolderGrants instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectMetadataConnectionsGroupFolderGrants given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectMetadataConnectionsGroupFolderGrants
  * @throws IOException if the JSON string is invalid with respect to ProjectMetadataConnectionsGroupFolderGrants
  */
  public static ProjectMetadataConnectionsGroupFolderGrants fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectMetadataConnectionsGroupFolderGrants.class);
  }

 /**
  * Convert an instance of ProjectMetadataConnectionsGroupFolderGrants to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

