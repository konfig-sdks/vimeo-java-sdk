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
import com.konfigthis.client.model.DisabledVideoPropertiesAddToCollection;
import com.konfigthis.client.model.DisabledVideoPropertiesDownload;
import com.konfigthis.client.model.DisabledVideoPropertiesDuplicate;
import com.konfigthis.client.model.DisabledVideoPropertiesEditPrivacy;
import com.konfigthis.client.model.DisabledVideoPropertiesEmbed;
import com.konfigthis.client.model.DisabledVideoPropertiesEmbedPresets;
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
 * DisabledVideoProperties
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DisabledVideoProperties {
  public static final String SERIALIZED_NAME_ADD_TO_COLLECTION = "add_to_collection";
  @SerializedName(SERIALIZED_NAME_ADD_TO_COLLECTION)
  private DisabledVideoPropertiesAddToCollection addToCollection;

  public static final String SERIALIZED_NAME_DOWNLOAD = "download";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD)
  private DisabledVideoPropertiesDownload download;

  public static final String SERIALIZED_NAME_DUPLICATE = "duplicate";
  @SerializedName(SERIALIZED_NAME_DUPLICATE)
  private DisabledVideoPropertiesDuplicate duplicate;

  public static final String SERIALIZED_NAME_EDIT_PRIVACY = "edit_privacy";
  @SerializedName(SERIALIZED_NAME_EDIT_PRIVACY)
  private DisabledVideoPropertiesEditPrivacy editPrivacy;

  public static final String SERIALIZED_NAME_EMBED = "embed";
  @SerializedName(SERIALIZED_NAME_EMBED)
  private DisabledVideoPropertiesEmbed embed;

  public static final String SERIALIZED_NAME_EMBED_PRESETS = "embed_presets";
  @SerializedName(SERIALIZED_NAME_EMBED_PRESETS)
  private DisabledVideoPropertiesEmbedPresets embedPresets;

  public DisabledVideoProperties() {
  }

  public DisabledVideoProperties addToCollection(DisabledVideoPropertiesAddToCollection addToCollection) {
    
    
    
    
    this.addToCollection = addToCollection;
    return this;
  }

   /**
   * Get addToCollection
   * @return addToCollection
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DisabledVideoPropertiesAddToCollection getAddToCollection() {
    return addToCollection;
  }


  public void setAddToCollection(DisabledVideoPropertiesAddToCollection addToCollection) {
    
    
    
    this.addToCollection = addToCollection;
  }


  public DisabledVideoProperties download(DisabledVideoPropertiesDownload download) {
    
    
    
    
    this.download = download;
    return this;
  }

   /**
   * Get download
   * @return download
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DisabledVideoPropertiesDownload getDownload() {
    return download;
  }


  public void setDownload(DisabledVideoPropertiesDownload download) {
    
    
    
    this.download = download;
  }


  public DisabledVideoProperties duplicate(DisabledVideoPropertiesDuplicate duplicate) {
    
    
    
    
    this.duplicate = duplicate;
    return this;
  }

   /**
   * Get duplicate
   * @return duplicate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DisabledVideoPropertiesDuplicate getDuplicate() {
    return duplicate;
  }


  public void setDuplicate(DisabledVideoPropertiesDuplicate duplicate) {
    
    
    
    this.duplicate = duplicate;
  }


  public DisabledVideoProperties editPrivacy(DisabledVideoPropertiesEditPrivacy editPrivacy) {
    
    
    
    
    this.editPrivacy = editPrivacy;
    return this;
  }

   /**
   * Get editPrivacy
   * @return editPrivacy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DisabledVideoPropertiesEditPrivacy getEditPrivacy() {
    return editPrivacy;
  }


  public void setEditPrivacy(DisabledVideoPropertiesEditPrivacy editPrivacy) {
    
    
    
    this.editPrivacy = editPrivacy;
  }


  public DisabledVideoProperties embed(DisabledVideoPropertiesEmbed embed) {
    
    
    
    
    this.embed = embed;
    return this;
  }

   /**
   * Get embed
   * @return embed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DisabledVideoPropertiesEmbed getEmbed() {
    return embed;
  }


  public void setEmbed(DisabledVideoPropertiesEmbed embed) {
    
    
    
    this.embed = embed;
  }


  public DisabledVideoProperties embedPresets(DisabledVideoPropertiesEmbedPresets embedPresets) {
    
    
    
    
    this.embedPresets = embedPresets;
    return this;
  }

   /**
   * Get embedPresets
   * @return embedPresets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DisabledVideoPropertiesEmbedPresets getEmbedPresets() {
    return embedPresets;
  }


  public void setEmbedPresets(DisabledVideoPropertiesEmbedPresets embedPresets) {
    
    
    
    this.embedPresets = embedPresets;
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
   * @return the DisabledVideoProperties instance itself
   */
  public DisabledVideoProperties putAdditionalProperty(String key, Object value) {
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
    DisabledVideoProperties disabledVideoProperties = (DisabledVideoProperties) o;
    return Objects.equals(this.addToCollection, disabledVideoProperties.addToCollection) &&
        Objects.equals(this.download, disabledVideoProperties.download) &&
        Objects.equals(this.duplicate, disabledVideoProperties.duplicate) &&
        Objects.equals(this.editPrivacy, disabledVideoProperties.editPrivacy) &&
        Objects.equals(this.embed, disabledVideoProperties.embed) &&
        Objects.equals(this.embedPresets, disabledVideoProperties.embedPresets)&&
        Objects.equals(this.additionalProperties, disabledVideoProperties.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addToCollection, download, duplicate, editPrivacy, embed, embedPresets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisabledVideoProperties {\n");
    sb.append("    addToCollection: ").append(toIndentedString(addToCollection)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
    sb.append("    editPrivacy: ").append(toIndentedString(editPrivacy)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    embedPresets: ").append(toIndentedString(embedPresets)).append("\n");
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
    openapiFields.add("add_to_collection");
    openapiFields.add("download");
    openapiFields.add("duplicate");
    openapiFields.add("edit_privacy");
    openapiFields.add("embed");
    openapiFields.add("embed_presets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("add_to_collection");
    openapiRequiredFields.add("download");
    openapiRequiredFields.add("duplicate");
    openapiRequiredFields.add("edit_privacy");
    openapiRequiredFields.add("embed");
    openapiRequiredFields.add("embed_presets");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisabledVideoProperties
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DisabledVideoProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisabledVideoProperties is not found in the empty JSON string", DisabledVideoProperties.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DisabledVideoProperties.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `add_to_collection`
      DisabledVideoPropertiesAddToCollection.validateJsonObject(jsonObj.getAsJsonObject("add_to_collection"));
      // validate the required field `download`
      DisabledVideoPropertiesDownload.validateJsonObject(jsonObj.getAsJsonObject("download"));
      // validate the required field `duplicate`
      DisabledVideoPropertiesDuplicate.validateJsonObject(jsonObj.getAsJsonObject("duplicate"));
      // validate the required field `edit_privacy`
      DisabledVideoPropertiesEditPrivacy.validateJsonObject(jsonObj.getAsJsonObject("edit_privacy"));
      // validate the required field `embed`
      DisabledVideoPropertiesEmbed.validateJsonObject(jsonObj.getAsJsonObject("embed"));
      // validate the required field `embed_presets`
      DisabledVideoPropertiesEmbedPresets.validateJsonObject(jsonObj.getAsJsonObject("embed_presets"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisabledVideoProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisabledVideoProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisabledVideoProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisabledVideoProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<DisabledVideoProperties>() {
           @Override
           public void write(JsonWriter out, DisabledVideoProperties value) throws IOException {
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
           public DisabledVideoProperties read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DisabledVideoProperties instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DisabledVideoProperties given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisabledVideoProperties
  * @throws IOException if the JSON string is invalid with respect to DisabledVideoProperties
  */
  public static DisabledVideoProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisabledVideoProperties.class);
  }

 /**
  * Convert an instance of DisabledVideoProperties to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

