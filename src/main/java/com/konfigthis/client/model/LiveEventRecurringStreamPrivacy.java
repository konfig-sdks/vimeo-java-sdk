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
 * The initial privacy settings of videos generated by streaming to the event as well as the embed privacy of the entire collection.
 */
@ApiModel(description = "The initial privacy settings of videos generated by streaming to the event as well as the embed privacy of the entire collection.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LiveEventRecurringStreamPrivacy {
  /**
   * The event&#39;s embed permission setting.  Option descriptions:  * &#x60;private&#x60; - The event can&#39;t be embedded on any domain.  * &#x60;public&#x60; - The event can be embedded on any domain.  * &#x60;whitelist&#x60; - The event can be embedded on whitelisted domains only. 
   */
  @JsonAdapter(EmbedEnum.Adapter.class)
 public enum EmbedEnum {
    PRIVATE("private"),
    
    PUBLIC("public"),
    
    WHITELIST("whitelist");

    private String value;

    EmbedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmbedEnum fromValue(String value) {
      for (EmbedEnum b : EmbedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmbedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmbedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmbedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmbedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMBED = "embed";
  @SerializedName(SERIALIZED_NAME_EMBED)
  private EmbedEnum embed;

  public static final String SERIALIZED_NAME_UNLISTED_HASH = "unlisted_hash";
  @SerializedName(SERIALIZED_NAME_UNLISTED_HASH)
  private String unlistedHash;

  /**
   * The general privacy setting for generated videos and the embed privacy of the entire collection.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the videos. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;embed_only&#x60; - The videos don&#39;t appear on Vimeo, but they can be embedded elsewhere.  * &#x60;nobody&#x60; - Only the event owner can access the videos. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the videos.  * &#x60;unlisted&#x60; - Only those with the private link can access the videos. 
   */
  @JsonAdapter(ViewEnum.Adapter.class)
 public enum ViewEnum {
    ANYBODY("anybody"),
    
    EMBED_ONLY("embed_only"),
    
    NOBODY("nobody"),
    
    PASSWORD("password"),
    
    UNLISTED("unlisted");

    private String value;

    ViewEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewEnum fromValue(String value) {
      for (ViewEnum b : ViewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private ViewEnum view;

  public LiveEventRecurringStreamPrivacy() {
  }

  public LiveEventRecurringStreamPrivacy embed(EmbedEnum embed) {
    
    
    
    
    this.embed = embed;
    return this;
  }

   /**
   * The event&#39;s embed permission setting.  Option descriptions:  * &#x60;private&#x60; - The event can&#39;t be embedded on any domain.  * &#x60;public&#x60; - The event can be embedded on any domain.  * &#x60;whitelist&#x60; - The event can be embedded on whitelisted domains only. 
   * @return embed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PUBLIC", required = true, value = "The event's embed permission setting.  Option descriptions:  * `private` - The event can't be embedded on any domain.  * `public` - The event can be embedded on any domain.  * `whitelist` - The event can be embedded on whitelisted domains only. ")

  public EmbedEnum getEmbed() {
    return embed;
  }


  public void setEmbed(EmbedEnum embed) {
    
    
    
    this.embed = embed;
  }


  public LiveEventRecurringStreamPrivacy unlistedHash(String unlistedHash) {
    
    
    
    
    this.unlistedHash = unlistedHash;
    return this;
  }

   /**
   * The hash for unlisted events.
   * @return unlistedHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1a2b3c4d5e", required = true, value = "The hash for unlisted events.")

  public String getUnlistedHash() {
    return unlistedHash;
  }


  public void setUnlistedHash(String unlistedHash) {
    
    
    
    this.unlistedHash = unlistedHash;
  }


  public LiveEventRecurringStreamPrivacy view(ViewEnum view) {
    
    
    
    
    this.view = view;
    return this;
  }

   /**
   * The general privacy setting for generated videos and the embed privacy of the entire collection.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the videos. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;embed_only&#x60; - The videos don&#39;t appear on Vimeo, but they can be embedded elsewhere.  * &#x60;nobody&#x60; - Only the event owner can access the videos. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the videos.  * &#x60;unlisted&#x60; - Only those with the private link can access the videos. 
   * @return view
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ANYBODY", required = true, value = "The general privacy setting for generated videos and the embed privacy of the entire collection.  Option descriptions:  * `anybody` - Anyone can access the videos. This privacy setting appears as `Public` on the Vimeo front end.  * `embed_only` - The videos don't appear on Vimeo, but they can be embedded elsewhere.  * `nobody` - Only the event owner can access the videos. This privacy setting appears as `Private` on the Vimeo front end.  * `password` - Only those with the password can access the videos.  * `unlisted` - Only those with the private link can access the videos. ")

  public ViewEnum getView() {
    return view;
  }


  public void setView(ViewEnum view) {
    
    
    
    this.view = view;
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
   * @return the LiveEventRecurringStreamPrivacy instance itself
   */
  public LiveEventRecurringStreamPrivacy putAdditionalProperty(String key, Object value) {
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
    LiveEventRecurringStreamPrivacy liveEventRecurringStreamPrivacy = (LiveEventRecurringStreamPrivacy) o;
    return Objects.equals(this.embed, liveEventRecurringStreamPrivacy.embed) &&
        Objects.equals(this.unlistedHash, liveEventRecurringStreamPrivacy.unlistedHash) &&
        Objects.equals(this.view, liveEventRecurringStreamPrivacy.view)&&
        Objects.equals(this.additionalProperties, liveEventRecurringStreamPrivacy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embed, unlistedHash, view, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEventRecurringStreamPrivacy {\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    unlistedHash: ").append(toIndentedString(unlistedHash)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
    openapiFields.add("unlisted_hash");
    openapiFields.add("view");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("embed");
    openapiRequiredFields.add("unlisted_hash");
    openapiRequiredFields.add("view");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveEventRecurringStreamPrivacy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveEventRecurringStreamPrivacy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveEventRecurringStreamPrivacy is not found in the empty JSON string", LiveEventRecurringStreamPrivacy.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LiveEventRecurringStreamPrivacy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("embed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embed").toString()));
      }
      if (!jsonObj.get("unlisted_hash").isJsonNull() && !jsonObj.get("unlisted_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unlisted_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unlisted_hash").toString()));
      }
      if (!jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveEventRecurringStreamPrivacy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveEventRecurringStreamPrivacy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveEventRecurringStreamPrivacy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveEventRecurringStreamPrivacy.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveEventRecurringStreamPrivacy>() {
           @Override
           public void write(JsonWriter out, LiveEventRecurringStreamPrivacy value) throws IOException {
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
           public LiveEventRecurringStreamPrivacy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LiveEventRecurringStreamPrivacy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LiveEventRecurringStreamPrivacy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveEventRecurringStreamPrivacy
  * @throws IOException if the JSON string is invalid with respect to LiveEventRecurringStreamPrivacy
  */
  public static LiveEventRecurringStreamPrivacy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveEventRecurringStreamPrivacy.class);
  }

 /**
  * Convert an instance of LiveEventRecurringStreamPrivacy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

