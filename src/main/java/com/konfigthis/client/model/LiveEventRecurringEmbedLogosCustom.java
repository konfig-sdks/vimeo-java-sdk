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
 * A collection of information relating to custom logos in the embeddable player.
 */
@ApiModel(description = "A collection of information relating to custom logos in the embeddable player.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LiveEventRecurringEmbedLogosCustom {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_STICKY = "sticky";
  @SerializedName(SERIALIZED_NAME_STICKY)
  private Boolean sticky;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USE_LINK = "use_link";
  @SerializedName(SERIALIZED_NAME_USE_LINK)
  private Boolean useLink;

  public LiveEventRecurringEmbedLogosCustom() {
  }

  public LiveEventRecurringEmbedLogosCustom active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Whether the custom logo appears in the embeddable player.
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the custom logo appears in the embeddable player.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public LiveEventRecurringEmbedLogosCustom link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The URL that loads upon clicking the custom logo.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "http://example.com", required = true, value = "The URL that loads upon clicking the custom logo.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public LiveEventRecurringEmbedLogosCustom sticky(Boolean sticky) {
    
    
    
    
    this.sticky = sticky;
    return this;
  }

   /**
   * Whether the custom logo appears even when the player interface is hidden.
   * @return sticky
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the custom logo appears even when the player interface is hidden.")

  public Boolean getSticky() {
    return sticky;
  }


  public void setSticky(Boolean sticky) {
    
    
    
    this.sticky = sticky;
  }


  public LiveEventRecurringEmbedLogosCustom url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL source of the custom player logo.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "http://example.com", required = true, value = "The URL source of the custom player logo.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public LiveEventRecurringEmbedLogosCustom useLink(Boolean useLink) {
    
    
    
    
    this.useLink = useLink;
    return this;
  }

   /**
   * Whether the custom logo should use the URL link.
   * @return useLink
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the custom logo should use the URL link.")

  public Boolean getUseLink() {
    return useLink;
  }


  public void setUseLink(Boolean useLink) {
    
    
    
    this.useLink = useLink;
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
   * @return the LiveEventRecurringEmbedLogosCustom instance itself
   */
  public LiveEventRecurringEmbedLogosCustom putAdditionalProperty(String key, Object value) {
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
    LiveEventRecurringEmbedLogosCustom liveEventRecurringEmbedLogosCustom = (LiveEventRecurringEmbedLogosCustom) o;
    return Objects.equals(this.active, liveEventRecurringEmbedLogosCustom.active) &&
        Objects.equals(this.link, liveEventRecurringEmbedLogosCustom.link) &&
        Objects.equals(this.sticky, liveEventRecurringEmbedLogosCustom.sticky) &&
        Objects.equals(this.url, liveEventRecurringEmbedLogosCustom.url) &&
        Objects.equals(this.useLink, liveEventRecurringEmbedLogosCustom.useLink)&&
        Objects.equals(this.additionalProperties, liveEventRecurringEmbedLogosCustom.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, link, sticky, url, useLink, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEventRecurringEmbedLogosCustom {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    sticky: ").append(toIndentedString(sticky)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useLink: ").append(toIndentedString(useLink)).append("\n");
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
    openapiFields.add("link");
    openapiFields.add("sticky");
    openapiFields.add("url");
    openapiFields.add("use_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("sticky");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("use_link");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveEventRecurringEmbedLogosCustom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveEventRecurringEmbedLogosCustom.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveEventRecurringEmbedLogosCustom is not found in the empty JSON string", LiveEventRecurringEmbedLogosCustom.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LiveEventRecurringEmbedLogosCustom.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveEventRecurringEmbedLogosCustom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveEventRecurringEmbedLogosCustom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveEventRecurringEmbedLogosCustom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveEventRecurringEmbedLogosCustom.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveEventRecurringEmbedLogosCustom>() {
           @Override
           public void write(JsonWriter out, LiveEventRecurringEmbedLogosCustom value) throws IOException {
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
           public LiveEventRecurringEmbedLogosCustom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LiveEventRecurringEmbedLogosCustom instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LiveEventRecurringEmbedLogosCustom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveEventRecurringEmbedLogosCustom
  * @throws IOException if the JSON string is invalid with respect to LiveEventRecurringEmbedLogosCustom
  */
  public static LiveEventRecurringEmbedLogosCustom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveEventRecurringEmbedLogosCustom.class);
  }

 /**
  * Convert an instance of LiveEventRecurringEmbedLogosCustom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

