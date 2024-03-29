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
 * PresetSettingsButtons
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PresetSettingsButtons {
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

  public static final String SERIALIZED_NAME_REACTION = "reaction";
  @SerializedName(SERIALIZED_NAME_REACTION)
  private Boolean reaction;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Boolean share;

  public static final String SERIALIZED_NAME_VOTE = "vote";
  @SerializedName(SERIALIZED_NAME_VOTE)
  private Boolean vote;

  public static final String SERIALIZED_NAME_WATCHLATER = "watchlater";
  @SerializedName(SERIALIZED_NAME_WATCHLATER)
  private Boolean watchlater;

  public PresetSettingsButtons() {
  }

  public PresetSettingsButtons embed(Boolean embed) {
    
    
    
    
    this.embed = embed;
    return this;
  }

   /**
   * Whether the preset includes &#x60;Embed&#x60; button settings.
   * @return embed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `Embed` button settings.")

  public Boolean getEmbed() {
    return embed;
  }


  public void setEmbed(Boolean embed) {
    
    
    
    this.embed = embed;
  }


  public PresetSettingsButtons fullscreen(Boolean fullscreen) {
    
    
    
    
    this.fullscreen = fullscreen;
    return this;
  }

   /**
   * Whether the preset includes &#x60;Fullscreen&#x60; button settings.
   * @return fullscreen
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `Fullscreen` button settings.")

  public Boolean getFullscreen() {
    return fullscreen;
  }


  public void setFullscreen(Boolean fullscreen) {
    
    
    
    this.fullscreen = fullscreen;
  }


  public PresetSettingsButtons hd(Boolean hd) {
    
    
    
    
    this.hd = hd;
    return this;
  }

   /**
   * Whether the preset includes &#x60;HD&#x60; button settings.
   * @return hd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `HD` button settings.")

  public Boolean getHd() {
    return hd;
  }


  public void setHd(Boolean hd) {
    
    
    
    this.hd = hd;
  }


  public PresetSettingsButtons like(Boolean like) {
    
    
    
    
    this.like = like;
    return this;
  }

   /**
   * Whether the preset includes &#x60;Like&#x60; button settings.
   * @return like
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `Like` button settings.")

  public Boolean getLike() {
    return like;
  }


  public void setLike(Boolean like) {
    
    
    
    this.like = like;
  }


  public PresetSettingsButtons reaction(Boolean reaction) {
    
    
    
    
    this.reaction = reaction;
    return this;
  }

   /**
   * Whether the preset includes &#x60;Reaction&#x60; button settings.
   * @return reaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `Reaction` button settings.")

  public Boolean getReaction() {
    return reaction;
  }


  public void setReaction(Boolean reaction) {
    
    
    
    this.reaction = reaction;
  }


  public PresetSettingsButtons share(Boolean share) {
    
    
    
    
    this.share = share;
    return this;
  }

   /**
   * Whether the present includes &#x60;Share&#x60; button settings.
   * @return share
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the present includes `Share` button settings.")

  public Boolean getShare() {
    return share;
  }


  public void setShare(Boolean share) {
    
    
    
    this.share = share;
  }


  public PresetSettingsButtons vote(Boolean vote) {
    
    
    
    
    this.vote = vote;
    return this;
  }

   /**
   * Whether the preset includes &#x60;Vote&#x60; button settings.
   * @return vote
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `Vote` button settings.")

  public Boolean getVote() {
    return vote;
  }


  public void setVote(Boolean vote) {
    
    
    
    this.vote = vote;
  }


  public PresetSettingsButtons watchlater(Boolean watchlater) {
    
    
    
    
    this.watchlater = watchlater;
    return this;
  }

   /**
   * Whether the preset includes &#x60;Watch Later&#x60; button settings.
   * @return watchlater
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the preset includes `Watch Later` button settings.")

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
   * @return the PresetSettingsButtons instance itself
   */
  public PresetSettingsButtons putAdditionalProperty(String key, Object value) {
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
    PresetSettingsButtons presetSettingsButtons = (PresetSettingsButtons) o;
    return Objects.equals(this.embed, presetSettingsButtons.embed) &&
        Objects.equals(this.fullscreen, presetSettingsButtons.fullscreen) &&
        Objects.equals(this.hd, presetSettingsButtons.hd) &&
        Objects.equals(this.like, presetSettingsButtons.like) &&
        Objects.equals(this.reaction, presetSettingsButtons.reaction) &&
        Objects.equals(this.share, presetSettingsButtons.share) &&
        Objects.equals(this.vote, presetSettingsButtons.vote) &&
        Objects.equals(this.watchlater, presetSettingsButtons.watchlater)&&
        Objects.equals(this.additionalProperties, presetSettingsButtons.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embed, fullscreen, hd, like, reaction, share, vote, watchlater, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresetSettingsButtons {\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    fullscreen: ").append(toIndentedString(fullscreen)).append("\n");
    sb.append("    hd: ").append(toIndentedString(hd)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
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
    openapiFields.add("reaction");
    openapiFields.add("share");
    openapiFields.add("vote");
    openapiFields.add("watchlater");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("embed");
    openapiRequiredFields.add("fullscreen");
    openapiRequiredFields.add("hd");
    openapiRequiredFields.add("like");
    openapiRequiredFields.add("reaction");
    openapiRequiredFields.add("share");
    openapiRequiredFields.add("vote");
    openapiRequiredFields.add("watchlater");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PresetSettingsButtons
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PresetSettingsButtons.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PresetSettingsButtons is not found in the empty JSON string", PresetSettingsButtons.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PresetSettingsButtons.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PresetSettingsButtons.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PresetSettingsButtons' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PresetSettingsButtons> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PresetSettingsButtons.class));

       return (TypeAdapter<T>) new TypeAdapter<PresetSettingsButtons>() {
           @Override
           public void write(JsonWriter out, PresetSettingsButtons value) throws IOException {
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
           public PresetSettingsButtons read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PresetSettingsButtons instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PresetSettingsButtons given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PresetSettingsButtons
  * @throws IOException if the JSON string is invalid with respect to PresetSettingsButtons
  */
  public static PresetSettingsButtons fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PresetSettingsButtons.class);
  }

 /**
  * Convert an instance of PresetSettingsButtons to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

