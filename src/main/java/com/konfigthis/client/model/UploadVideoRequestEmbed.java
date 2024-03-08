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
import com.konfigthis.client.model.EmbedPresetsEssentialsCreatePresetRequestEmbedTitle;
import com.konfigthis.client.model.UploadVideoRequestEmbedButtons;
import com.konfigthis.client.model.UploadVideoRequestEmbedLogos;
import com.konfigthis.client.model.VideosUploadsBeginVideoUploadProcessRequestEmbedEndScreen;
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
 * UploadVideoRequestEmbed
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadVideoRequestEmbed {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private EmbedPresetsEssentialsCreatePresetRequestEmbedTitle title;

  public static final String SERIALIZED_NAME_BUTTONS = "buttons";
  @SerializedName(SERIALIZED_NAME_BUTTONS)
  private UploadVideoRequestEmbedButtons buttons;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_END_SCREEN = "end_screen";
  @SerializedName(SERIALIZED_NAME_END_SCREEN)
  private VideosUploadsBeginVideoUploadProcessRequestEmbedEndScreen endScreen;

  public static final String SERIALIZED_NAME_LOGOS = "logos";
  @SerializedName(SERIALIZED_NAME_LOGOS)
  private UploadVideoRequestEmbedLogos logos;

  public static final String SERIALIZED_NAME_PLAYBAR = "playbar";
  @SerializedName(SERIALIZED_NAME_PLAYBAR)
  private Boolean playbar;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private Boolean volume;

  public UploadVideoRequestEmbed() {
  }

  public UploadVideoRequestEmbed title(EmbedPresetsEssentialsCreatePresetRequestEmbedTitle title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle getTitle() {
    return title;
  }


  public void setTitle(EmbedPresetsEssentialsCreatePresetRequestEmbedTitle title) {
    
    
    
    this.title = title;
  }


  public UploadVideoRequestEmbed buttons(UploadVideoRequestEmbedButtons buttons) {
    
    
    
    
    this.buttons = buttons;
    return this;
  }

   /**
   * Get buttons
   * @return buttons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadVideoRequestEmbedButtons getButtons() {
    return buttons;
  }


  public void setButtons(UploadVideoRequestEmbedButtons buttons) {
    
    
    
    this.buttons = buttons;
  }


  public UploadVideoRequestEmbed color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * The main color of the embeddable player.
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#1ab7ea", value = "The main color of the embeddable player.")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public UploadVideoRequestEmbed endScreen(VideosUploadsBeginVideoUploadProcessRequestEmbedEndScreen endScreen) {
    
    
    
    
    this.endScreen = endScreen;
    return this;
  }

   /**
   * Get endScreen
   * @return endScreen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideosUploadsBeginVideoUploadProcessRequestEmbedEndScreen getEndScreen() {
    return endScreen;
  }


  public void setEndScreen(VideosUploadsBeginVideoUploadProcessRequestEmbedEndScreen endScreen) {
    
    
    
    this.endScreen = endScreen;
  }


  public UploadVideoRequestEmbed logos(UploadVideoRequestEmbedLogos logos) {
    
    
    
    
    this.logos = logos;
    return this;
  }

   /**
   * Get logos
   * @return logos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadVideoRequestEmbedLogos getLogos() {
    return logos;
  }


  public void setLogos(UploadVideoRequestEmbedLogos logos) {
    
    
    
    this.logos = logos;
  }


  public UploadVideoRequestEmbed playbar(Boolean playbar) {
    
    
    
    
    this.playbar = playbar;
    return this;
  }

   /**
   * Whether to show the playbar on the embeddable player.
   * @return playbar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the playbar on the embeddable player.")

  public Boolean getPlaybar() {
    return playbar;
  }


  public void setPlaybar(Boolean playbar) {
    
    
    
    this.playbar = playbar;
  }


  public UploadVideoRequestEmbed volume(Boolean volume) {
    
    
    
    
    this.volume = volume;
    return this;
  }

   /**
   * Whether to show the volume selector on the embeddable player.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to show the volume selector on the embeddable player.")

  public Boolean getVolume() {
    return volume;
  }


  public void setVolume(Boolean volume) {
    
    
    
    this.volume = volume;
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
   * @return the UploadVideoRequestEmbed instance itself
   */
  public UploadVideoRequestEmbed putAdditionalProperty(String key, Object value) {
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
    UploadVideoRequestEmbed uploadVideoRequestEmbed = (UploadVideoRequestEmbed) o;
    return Objects.equals(this.title, uploadVideoRequestEmbed.title) &&
        Objects.equals(this.buttons, uploadVideoRequestEmbed.buttons) &&
        Objects.equals(this.color, uploadVideoRequestEmbed.color) &&
        Objects.equals(this.endScreen, uploadVideoRequestEmbed.endScreen) &&
        Objects.equals(this.logos, uploadVideoRequestEmbed.logos) &&
        Objects.equals(this.playbar, uploadVideoRequestEmbed.playbar) &&
        Objects.equals(this.volume, uploadVideoRequestEmbed.volume)&&
        Objects.equals(this.additionalProperties, uploadVideoRequestEmbed.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, buttons, color, endScreen, logos, playbar, volume, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadVideoRequestEmbed {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    endScreen: ").append(toIndentedString(endScreen)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
    sb.append("    playbar: ").append(toIndentedString(playbar)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("buttons");
    openapiFields.add("color");
    openapiFields.add("end_screen");
    openapiFields.add("logos");
    openapiFields.add("playbar");
    openapiFields.add("volume");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadVideoRequestEmbed
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadVideoRequestEmbed.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadVideoRequestEmbed is not found in the empty JSON string", UploadVideoRequestEmbed.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        EmbedPresetsEssentialsCreatePresetRequestEmbedTitle.validateJsonObject(jsonObj.getAsJsonObject("title"));
      }
      // validate the optional field `buttons`
      if (jsonObj.get("buttons") != null && !jsonObj.get("buttons").isJsonNull()) {
        UploadVideoRequestEmbedButtons.validateJsonObject(jsonObj.getAsJsonObject("buttons"));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the optional field `end_screen`
      if (jsonObj.get("end_screen") != null && !jsonObj.get("end_screen").isJsonNull()) {
        VideosUploadsBeginVideoUploadProcessRequestEmbedEndScreen.validateJsonObject(jsonObj.getAsJsonObject("end_screen"));
      }
      // validate the optional field `logos`
      if (jsonObj.get("logos") != null && !jsonObj.get("logos").isJsonNull()) {
        UploadVideoRequestEmbedLogos.validateJsonObject(jsonObj.getAsJsonObject("logos"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadVideoRequestEmbed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadVideoRequestEmbed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadVideoRequestEmbed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadVideoRequestEmbed.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadVideoRequestEmbed>() {
           @Override
           public void write(JsonWriter out, UploadVideoRequestEmbed value) throws IOException {
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
           public UploadVideoRequestEmbed read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UploadVideoRequestEmbed instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UploadVideoRequestEmbed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadVideoRequestEmbed
  * @throws IOException if the JSON string is invalid with respect to UploadVideoRequestEmbed
  */
  public static UploadVideoRequestEmbed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadVideoRequestEmbed.class);
  }

 /**
  * Convert an instance of UploadVideoRequestEmbed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

