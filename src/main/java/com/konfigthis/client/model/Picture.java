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
import com.konfigthis.client.model.PictureSizesInner;
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
 * Picture
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Picture {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_BASE_LINK = "base_link";
  @SerializedName(SERIALIZED_NAME_BASE_LINK)
  private String baseLink;

  public static final String SERIALIZED_NAME_DEFAULT_PICTURE = "default_picture";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PICTURE)
  private Boolean defaultPicture;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_RESOURCE_KEY = "resource_key";
  @SerializedName(SERIALIZED_NAME_RESOURCE_KEY)
  private String resourceKey;

  public static final String SERIALIZED_NAME_SIZES = "sizes";
  @SerializedName(SERIALIZED_NAME_SIZES)
  private List<PictureSizesInner> sizes = new ArrayList<>();

  /**
   * The type of picture.  Option descriptions:  * &#x60;caution&#x60; - The picture isn&#39;t appropriate for all ages.  * &#x60;custom&#x60; - The picture is a custom video image.  * &#x60;default&#x60; - The picture is the default video image. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CAUTION("caution"),
    
    CUSTOM("custom"),
    
    DEFAULT("default");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public Picture() {
  }

  public Picture active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Whether the picture is currently active.
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the picture is currently active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public Picture baseLink(String baseLink) {
    
    
    
    
    this.baseLink = baseLink;
    return this;
  }

   /**
   * The base link to the image file, without any parameters.
   * @return baseLink
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://i.vimeocdn.com/video/1130929417-276se668248611ce41e6f7d438196e3412863bad9a5c3bcaf1a14453454cc5-d", required = true, value = "The base link to the image file, without any parameters.")

  public String getBaseLink() {
    return baseLink;
  }


  public void setBaseLink(String baseLink) {
    
    
    
    this.baseLink = baseLink;
  }


  public Picture defaultPicture(Boolean defaultPicture) {
    
    
    
    
    this.defaultPicture = defaultPicture;
    return this;
  }

   /**
   * Whether the picture is Vimeo&#39;s default.
   * @return defaultPicture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether the picture is Vimeo's default.")

  public Boolean getDefaultPicture() {
    return defaultPicture;
  }


  public void setDefaultPicture(Boolean defaultPicture) {
    
    
    
    this.defaultPicture = defaultPicture;
  }


  public Picture link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The upload URL of the picture. This field appears upon the initial creation of a picture resource.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The upload URL of the picture. This field appears upon the initial creation of a picture resource.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public Picture resourceKey(String resourceKey) {
    
    
    
    
    this.resourceKey = resourceKey;
    return this;
  }

   /**
   * The resource key string of the picture.
   * @return resourceKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "dc724af18fbdd4e59189f5fe768a5f8311527050", required = true, value = "The resource key string of the picture.")

  public String getResourceKey() {
    return resourceKey;
  }


  public void setResourceKey(String resourceKey) {
    
    
    
    this.resourceKey = resourceKey;
  }


  public Picture sizes(List<PictureSizesInner> sizes) {
    
    
    
    
    this.sizes = sizes;
    return this;
  }

  public Picture addSizesItem(PictureSizesInner sizesItem) {
    this.sizes.add(sizesItem);
    return this;
  }

   /**
   * An array containing reference information about all available image files.
   * @return sizes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array containing reference information about all available image files.")

  public List<PictureSizesInner> getSizes() {
    return sizes;
  }


  public void setSizes(List<PictureSizesInner> sizes) {
    
    
    
    this.sizes = sizes;
  }


  public Picture type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of picture.  Option descriptions:  * &#x60;caution&#x60; - The picture isn&#39;t appropriate for all ages.  * &#x60;custom&#x60; - The picture is a custom video image.  * &#x60;default&#x60; - The picture is the default video image. 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CAUTION", required = true, value = "The type of picture.  Option descriptions:  * `caution` - The picture isn't appropriate for all ages.  * `custom` - The picture is a custom video image.  * `default` - The picture is the default video image. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public Picture uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the picture.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/users/152184/pictures/12345", required = true, value = "The URI of the picture.")

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
   * @return the Picture instance itself
   */
  public Picture putAdditionalProperty(String key, Object value) {
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
    Picture picture = (Picture) o;
    return Objects.equals(this.active, picture.active) &&
        Objects.equals(this.baseLink, picture.baseLink) &&
        Objects.equals(this.defaultPicture, picture.defaultPicture) &&
        Objects.equals(this.link, picture.link) &&
        Objects.equals(this.resourceKey, picture.resourceKey) &&
        Objects.equals(this.sizes, picture.sizes) &&
        Objects.equals(this.type, picture.type) &&
        Objects.equals(this.uri, picture.uri)&&
        Objects.equals(this.additionalProperties, picture.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, baseLink, defaultPicture, link, resourceKey, sizes, type, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    baseLink: ").append(toIndentedString(baseLink)).append("\n");
    sb.append("    defaultPicture: ").append(toIndentedString(defaultPicture)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
    sb.append("    sizes: ").append(toIndentedString(sizes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("base_link");
    openapiFields.add("default_picture");
    openapiFields.add("link");
    openapiFields.add("resource_key");
    openapiFields.add("sizes");
    openapiFields.add("type");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("base_link");
    openapiRequiredFields.add("default_picture");
    openapiRequiredFields.add("resource_key");
    openapiRequiredFields.add("sizes");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Picture
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Picture.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Picture is not found in the empty JSON string", Picture.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Picture.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("base_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_link").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (!jsonObj.get("resource_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_key").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sizes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sizes` to be an array in the JSON string but got `%s`", jsonObj.get("sizes").toString()));
      }

      JsonArray jsonArraysizes = jsonObj.getAsJsonArray("sizes");
      // validate the required field `sizes` (array)
      for (int i = 0; i < jsonArraysizes.size(); i++) {
        PictureSizesInner.validateJsonObject(jsonArraysizes.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Picture.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Picture' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Picture> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Picture.class));

       return (TypeAdapter<T>) new TypeAdapter<Picture>() {
           @Override
           public void write(JsonWriter out, Picture value) throws IOException {
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
           public Picture read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Picture instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Picture given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Picture
  * @throws IOException if the JSON string is invalid with respect to Picture
  */
  public static Picture fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Picture.class);
  }

 /**
  * Convert an instance of Picture to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
