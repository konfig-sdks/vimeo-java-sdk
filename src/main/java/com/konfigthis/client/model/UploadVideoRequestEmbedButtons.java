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
 * UploadVideoRequestEmbedButtons
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadVideoRequestEmbedButtons {
  public static final String SERIALIZED_NAME_EMBED = "embed";
  @SerializedName(SERIALIZED_NAME_EMBED)
  private Boolean embed;

  public static final String SERIALIZED_NAME_FULLSCREEN = "fullscreen";
  @SerializedName(SERIALIZED_NAME_FULLSCREEN)
  private Boolean fullscreen;

  public static final String SERIALIZED_NAME_HD = "hd";
  @SerializedName(SERIALIZED_NAME_HD)
  private Boolean hd;

  public static final String SERIALIZED_NAME_LIKE = "like";
  @SerializedName(SERIALIZED_NAME_LIKE)
  private Boolean like;

  public static final String SERIALIZED_NAME_SCALING = "scaling";
  @SerializedName(SERIALIZED_NAME_SCALING)
  private Boolean scaling;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Boolean share;

  public static final String SERIALIZED_NAME_WATCHLATER = "watchlater";
  @SerializedName(SERIALIZED_NAME_WATCHLATER)
  private Boolean watchlater;

  public UploadVideoRequestEmbedButtons() {
  }

  public UploadVideoRequestEmbedButtons embed(Boolean embed) {
    
    
    
    
    this.embed = embed;
    return this;
  }

   /**
   * Whether to show the &#x60;embed&#x60; button on the embeddable player.
   * @return embed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `embed` button on the embeddable player.")

  public Boolean getEmbed() {
    return embed;
  }


  public void setEmbed(Boolean embed) {
    
    
    
    this.embed = embed;
  }


  public UploadVideoRequestEmbedButtons fullscreen(Boolean fullscreen) {
    
    
    
    
    this.fullscreen = fullscreen;
    return this;
  }

   /**
   * Whether to show the &#x60;fullscreen&#x60; button on the embeddable player.
   * @return fullscreen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `fullscreen` button on the embeddable player.")

  public Boolean getFullscreen() {
    return fullscreen;
  }


  public void setFullscreen(Boolean fullscreen) {
    
    
    
    this.fullscreen = fullscreen;
  }


  public UploadVideoRequestEmbedButtons hd(Boolean hd) {
    
    
    
    
    this.hd = hd;
    return this;
  }

   /**
   * Whether to show the &#x60;HD&#x60; button on the embeddable player.
   * @return hd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `HD` button on the embeddable player.")

  public Boolean getHd() {
    return hd;
  }


  public void setHd(Boolean hd) {
    
    
    
    this.hd = hd;
  }


  public UploadVideoRequestEmbedButtons like(Boolean like) {
    
    
    
    
    this.like = like;
    return this;
  }

   /**
   * Whether to show the &#x60;like&#x60; button on the embeddable player.
   * @return like
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `like` button on the embeddable player.")

  public Boolean getLike() {
    return like;
  }


  public void setLike(Boolean like) {
    
    
    
    this.like = like;
  }


  public UploadVideoRequestEmbedButtons scaling(Boolean scaling) {
    
    
    
    
    this.scaling = scaling;
    return this;
  }

   /**
   * Whether to show the &#x60;scaling&#x60; button on the embeddable player in fullscreen mode.
   * @return scaling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `scaling` button on the embeddable player in fullscreen mode.")

  public Boolean getScaling() {
    return scaling;
  }


  public void setScaling(Boolean scaling) {
    
    
    
    this.scaling = scaling;
  }


  public UploadVideoRequestEmbedButtons share(Boolean share) {
    
    
    
    
    this.share = share;
    return this;
  }

   /**
   * Whether to show the &#x60;share&#x60; button on the embeddable player.
   * @return share
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `share` button on the embeddable player.")

  public Boolean getShare() {
    return share;
  }


  public void setShare(Boolean share) {
    
    
    
    this.share = share;
  }


  public UploadVideoRequestEmbedButtons watchlater(Boolean watchlater) {
    
    
    
    
    this.watchlater = watchlater;
    return this;
  }

   /**
   * Whether to show the &#x60;watch later&#x60; button on the embeddable player.
   * @return watchlater
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the `watch later` button on the embeddable player.")

  public Boolean getWatchlater() {
    return watchlater;
  }


  public void setWatchlater(Boolean watchlater) {
    
    
    
    this.watchlater = watchlater;
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
   * @return the UploadVideoRequestEmbedButtons instance itself
   */
  public UploadVideoRequestEmbedButtons putAdditionalProperty(String key, Object value) {
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
    UploadVideoRequestEmbedButtons uploadVideoRequestEmbedButtons = (UploadVideoRequestEmbedButtons) o;
    return Objects.equals(this.embed, uploadVideoRequestEmbedButtons.embed) &&
        Objects.equals(this.fullscreen, uploadVideoRequestEmbedButtons.fullscreen) &&
        Objects.equals(this.hd, uploadVideoRequestEmbedButtons.hd) &&
        Objects.equals(this.like, uploadVideoRequestEmbedButtons.like) &&
        Objects.equals(this.scaling, uploadVideoRequestEmbedButtons.scaling) &&
        Objects.equals(this.share, uploadVideoRequestEmbedButtons.share) &&
        Objects.equals(this.watchlater, uploadVideoRequestEmbedButtons.watchlater)&&
        Objects.equals(this.additionalProperties, uploadVideoRequestEmbedButtons.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embed, fullscreen, hd, like, scaling, share, watchlater, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadVideoRequestEmbedButtons {\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    fullscreen: ").append(toIndentedString(fullscreen)).append("\n");
    sb.append("    hd: ").append(toIndentedString(hd)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
    sb.append("    scaling: ").append(toIndentedString(scaling)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    watchlater: ").append(toIndentedString(watchlater)).append("\n");
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
    openapiFields.add("embed");
    openapiFields.add("fullscreen");
    openapiFields.add("hd");
    openapiFields.add("like");
    openapiFields.add("scaling");
    openapiFields.add("share");
    openapiFields.add("watchlater");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadVideoRequestEmbedButtons
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadVideoRequestEmbedButtons.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadVideoRequestEmbedButtons is not found in the empty JSON string", UploadVideoRequestEmbedButtons.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadVideoRequestEmbedButtons.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadVideoRequestEmbedButtons' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadVideoRequestEmbedButtons> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadVideoRequestEmbedButtons.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadVideoRequestEmbedButtons>() {
           @Override
           public void write(JsonWriter out, UploadVideoRequestEmbedButtons value) throws IOException {
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
           public UploadVideoRequestEmbedButtons read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UploadVideoRequestEmbedButtons instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UploadVideoRequestEmbedButtons given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadVideoRequestEmbedButtons
  * @throws IOException if the JSON string is invalid with respect to UploadVideoRequestEmbedButtons
  */
  public static UploadVideoRequestEmbedButtons fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadVideoRequestEmbedButtons.class);
  }

 /**
  * Convert an instance of UploadVideoRequestEmbedButtons to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
