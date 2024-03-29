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
import com.konfigthis.client.model.CategoryMetadata;
import com.konfigthis.client.model.CategoryParent;
import com.konfigthis.client.model.CategorySubcategoriesInner;
import com.konfigthis.client.model.Picture;
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
 * Category
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Category {
  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private Picture icon;

  public static final String SERIALIZED_NAME_IS_DEPRECATED = "is_deprecated";
  @SerializedName(SERIALIZED_NAME_IS_DEPRECATED)
  private Boolean isDeprecated;

  public static final String SERIALIZED_NAME_LAST_VIDEO_FEATURED_TIME = "last_video_featured_time";
  @SerializedName(SERIALIZED_NAME_LAST_VIDEO_FEATURED_TIME)
  private String lastVideoFeaturedTime;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private CategoryMetadata metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private CategoryParent parent;

  public static final String SERIALIZED_NAME_PICTURES = "pictures";
  @SerializedName(SERIALIZED_NAME_PICTURES)
  private Picture pictures;

  public static final String SERIALIZED_NAME_RESOURCE_KEY = "resource_key";
  @SerializedName(SERIALIZED_NAME_RESOURCE_KEY)
  private String resourceKey;

  public static final String SERIALIZED_NAME_SUBCATEGORIES = "subcategories";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORIES)
  private List<CategorySubcategoriesInner> subcategories = null;

  public static final String SERIALIZED_NAME_TOP_LEVEL = "top_level";
  @SerializedName(SERIALIZED_NAME_TOP_LEVEL)
  private Boolean topLevel;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public Category() {
  }

  public Category icon(Picture icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * The active icon for the category.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The active icon for the category.")

  public Picture getIcon() {
    return icon;
  }


  public void setIcon(Picture icon) {
    
    
    
    this.icon = icon;
  }


  public Category isDeprecated(Boolean isDeprecated) {
    
    
    
    
    this.isDeprecated = isDeprecated;
    return this;
  }

   /**
   * Whether the category is deprecated and should not be used for new categorization.
   * @return isDeprecated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether the category is deprecated and should not be used for new categorization.")

  public Boolean getIsDeprecated() {
    return isDeprecated;
  }


  public void setIsDeprecated(Boolean isDeprecated) {
    
    
    
    this.isDeprecated = isDeprecated;
  }


  public Category lastVideoFeaturedTime(String lastVideoFeaturedTime) {
    
    
    
    
    this.lastVideoFeaturedTime = lastVideoFeaturedTime;
    return this;
  }

   /**
   * The most recent time in ISO 8601 format when the video was featured.
   * @return lastVideoFeaturedTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2017-05-17T17:46:09+00:00", required = true, value = "The most recent time in ISO 8601 format when the video was featured.")

  public String getLastVideoFeaturedTime() {
    return lastVideoFeaturedTime;
  }


  public void setLastVideoFeaturedTime(String lastVideoFeaturedTime) {
    
    
    
    this.lastVideoFeaturedTime = lastVideoFeaturedTime;
  }


  public Category link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The URL to access the category in a browser.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://vimeo.com/categories/animation", required = true, value = "The URL to access the category in a browser.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public Category metadata(CategoryMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CategoryMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(CategoryMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public Category name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The display name that identifies the category.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Animation", required = true, value = "The display name that identifies the category.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public Category parent(CategoryParent parent) {
    
    
    
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CategoryParent getParent() {
    return parent;
  }


  public void setParent(CategoryParent parent) {
    
    
    
    this.parent = parent;
  }


  public Category pictures(Picture pictures) {
    
    
    
    
    this.pictures = pictures;
    return this;
  }

   /**
   * The active picture for this category. The default shows vertical color bars.
   * @return pictures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The active picture for this category. The default shows vertical color bars.")

  public Picture getPictures() {
    return pictures;
  }


  public void setPictures(Picture pictures) {
    
    
    
    this.pictures = pictures;
  }


  public Category resourceKey(String resourceKey) {
    
    
    
    
    this.resourceKey = resourceKey;
    return this;
  }

   /**
   * The resource key of the category.
   * @return resourceKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "e5595241643259c658ed6c85ca82985a6341edc7", required = true, value = "The resource key of the category.")

  public String getResourceKey() {
    return resourceKey;
  }


  public void setResourceKey(String resourceKey) {
    
    
    
    this.resourceKey = resourceKey;
  }


  public Category subcategories(List<CategorySubcategoriesInner> subcategories) {
    
    
    
    
    this.subcategories = subcategories;
    return this;
  }

  public Category addSubcategoriesItem(CategorySubcategoriesInner subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

   /**
   * All the subcategories that belong to the category, if the current category is a top-level parent.
   * @return subcategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All the subcategories that belong to the category, if the current category is a top-level parent.")

  public List<CategorySubcategoriesInner> getSubcategories() {
    return subcategories;
  }


  public void setSubcategories(List<CategorySubcategoriesInner> subcategories) {
    
    
    
    this.subcategories = subcategories;
  }


  public Category topLevel(Boolean topLevel) {
    
    
    
    
    this.topLevel = topLevel;
    return this;
  }

   /**
   * Whether the category isn&#39;t a subcategory of another category.
   * @return topLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the category isn't a subcategory of another category.")

  public Boolean getTopLevel() {
    return topLevel;
  }


  public void setTopLevel(Boolean topLevel) {
    
    
    
    this.topLevel = topLevel;
  }


  public Category uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The unique identifier to access the category resource.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/categories/animation", required = true, value = "The unique identifier to access the category resource.")

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
   * @return the Category instance itself
   */
  public Category putAdditionalProperty(String key, Object value) {
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
    Category category = (Category) o;
    return Objects.equals(this.icon, category.icon) &&
        Objects.equals(this.isDeprecated, category.isDeprecated) &&
        Objects.equals(this.lastVideoFeaturedTime, category.lastVideoFeaturedTime) &&
        Objects.equals(this.link, category.link) &&
        Objects.equals(this.metadata, category.metadata) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.parent, category.parent) &&
        Objects.equals(this.pictures, category.pictures) &&
        Objects.equals(this.resourceKey, category.resourceKey) &&
        Objects.equals(this.subcategories, category.subcategories) &&
        Objects.equals(this.topLevel, category.topLevel) &&
        Objects.equals(this.uri, category.uri)&&
        Objects.equals(this.additionalProperties, category.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, isDeprecated, lastVideoFeaturedTime, link, metadata, name, parent, pictures, resourceKey, subcategories, topLevel, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    isDeprecated: ").append(toIndentedString(isDeprecated)).append("\n");
    sb.append("    lastVideoFeaturedTime: ").append(toIndentedString(lastVideoFeaturedTime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
    sb.append("    topLevel: ").append(toIndentedString(topLevel)).append("\n");
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
    openapiFields.add("icon");
    openapiFields.add("is_deprecated");
    openapiFields.add("last_video_featured_time");
    openapiFields.add("link");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("parent");
    openapiFields.add("pictures");
    openapiFields.add("resource_key");
    openapiFields.add("subcategories");
    openapiFields.add("top_level");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_deprecated");
    openapiRequiredFields.add("last_video_featured_time");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("parent");
    openapiRequiredFields.add("pictures");
    openapiRequiredFields.add("resource_key");
    openapiRequiredFields.add("top_level");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Category
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Category.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Category is not found in the empty JSON string", Category.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Category.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `icon`
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) {
        Picture.validateJsonObject(jsonObj.getAsJsonObject("icon"));
      }
      if (!jsonObj.get("last_video_featured_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_video_featured_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_video_featured_time").toString()));
      }
      if (!jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // validate the required field `metadata`
      CategoryMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `parent`
      CategoryParent.validateJsonObject(jsonObj.getAsJsonObject("parent"));
      // validate the required field `pictures`
      Picture.validateJsonObject(jsonObj.getAsJsonObject("pictures"));
      if (!jsonObj.get("resource_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_key").toString()));
      }
      if (jsonObj.get("subcategories") != null && !jsonObj.get("subcategories").isJsonNull()) {
        JsonArray jsonArraysubcategories = jsonObj.getAsJsonArray("subcategories");
        if (jsonArraysubcategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subcategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subcategories` to be an array in the JSON string but got `%s`", jsonObj.get("subcategories").toString()));
          }

          // validate the optional field `subcategories` (array)
          for (int i = 0; i < jsonArraysubcategories.size(); i++) {
            CategorySubcategoriesInner.validateJsonObject(jsonArraysubcategories.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Category.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Category' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Category> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Category.class));

       return (TypeAdapter<T>) new TypeAdapter<Category>() {
           @Override
           public void write(JsonWriter out, Category value) throws IOException {
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
           public Category read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Category instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Category given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Category
  * @throws IOException if the JSON string is invalid with respect to Category
  */
  public static Category fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Category.class);
  }

 /**
  * Convert an instance of Category to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

