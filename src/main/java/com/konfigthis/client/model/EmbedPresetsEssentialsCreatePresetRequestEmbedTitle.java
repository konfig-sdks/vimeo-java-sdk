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
 * EmbedPresetsEssentialsCreatePresetRequestEmbedTitle
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmbedPresetsEssentialsCreatePresetRequestEmbedTitle {
  /**
   * How to handle the video title in the title bar of the embeddable player.  Option descriptions:  * &#x60;hide&#x60; - Hide the video title.  * &#x60;show&#x60; - Show the video title.  * &#x60;user&#x60; - Enable the user to decide. 
   */
  @JsonAdapter(NameEnum.Adapter.class)
 public enum NameEnum {
    HIDE("hide"),
    
    SHOW("show"),
    
    USER("user");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * How to handle the owner information in the title bar of the embeddable player.  Option descriptions:  * &#x60;hide&#x60; - Hide the owner info.  * &#x60;show&#x60; - Show the owner info.  * &#x60;user&#x60; - Enable the user to decide. 
   */
  @JsonAdapter(OwnerEnum.Adapter.class)
 public enum OwnerEnum {
    HIDE("hide"),
    
    SHOW("show"),
    
    USER("user");

    private String value;

    OwnerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerEnum fromValue(String value) {
      for (OwnerEnum b : OwnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OwnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OwnerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private OwnerEnum owner;

  /**
   * How to handle the owner portrait in the title bar of the embeddable player.  Option descriptions:  * &#x60;hide&#x60; - Hide the portrait.  * &#x60;show&#x60; - Show the portrait.  * &#x60;user&#x60; - Enable the user to decide. 
   */
  @JsonAdapter(PortraitEnum.Adapter.class)
 public enum PortraitEnum {
    HIDE("hide"),
    
    SHOW("show"),
    
    USER("user");

    private String value;

    PortraitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PortraitEnum fromValue(String value) {
      for (PortraitEnum b : PortraitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PortraitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PortraitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PortraitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PortraitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PORTRAIT = "portrait";
  @SerializedName(SERIALIZED_NAME_PORTRAIT)
  private PortraitEnum portrait;

  public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle() {
  }

  public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle name(NameEnum name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * How to handle the video title in the title bar of the embeddable player.  Option descriptions:  * &#x60;hide&#x60; - Hide the video title.  * &#x60;show&#x60; - Show the video title.  * &#x60;user&#x60; - Enable the user to decide. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How to handle the video title in the title bar of the embeddable player.  Option descriptions:  * `hide` - Hide the video title.  * `show` - Show the video title.  * `user` - Enable the user to decide. ")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    
    
    
    this.name = name;
  }


  public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle owner(OwnerEnum owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * How to handle the owner information in the title bar of the embeddable player.  Option descriptions:  * &#x60;hide&#x60; - Hide the owner info.  * &#x60;show&#x60; - Show the owner info.  * &#x60;user&#x60; - Enable the user to decide. 
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How to handle the owner information in the title bar of the embeddable player.  Option descriptions:  * `hide` - Hide the owner info.  * `show` - Show the owner info.  * `user` - Enable the user to decide. ")

  public OwnerEnum getOwner() {
    return owner;
  }


  public void setOwner(OwnerEnum owner) {
    
    
    
    this.owner = owner;
  }


  public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle portrait(PortraitEnum portrait) {
    
    
    
    
    this.portrait = portrait;
    return this;
  }

   /**
   * How to handle the owner portrait in the title bar of the embeddable player.  Option descriptions:  * &#x60;hide&#x60; - Hide the portrait.  * &#x60;show&#x60; - Show the portrait.  * &#x60;user&#x60; - Enable the user to decide. 
   * @return portrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How to handle the owner portrait in the title bar of the embeddable player.  Option descriptions:  * `hide` - Hide the portrait.  * `show` - Show the portrait.  * `user` - Enable the user to decide. ")

  public PortraitEnum getPortrait() {
    return portrait;
  }


  public void setPortrait(PortraitEnum portrait) {
    
    
    
    this.portrait = portrait;
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
   * @return the EmbedPresetsEssentialsCreatePresetRequestEmbedTitle instance itself
   */
  public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle putAdditionalProperty(String key, Object value) {
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
    EmbedPresetsEssentialsCreatePresetRequestEmbedTitle embedPresetsEssentialsCreatePresetRequestEmbedTitle = (EmbedPresetsEssentialsCreatePresetRequestEmbedTitle) o;
    return Objects.equals(this.name, embedPresetsEssentialsCreatePresetRequestEmbedTitle.name) &&
        Objects.equals(this.owner, embedPresetsEssentialsCreatePresetRequestEmbedTitle.owner) &&
        Objects.equals(this.portrait, embedPresetsEssentialsCreatePresetRequestEmbedTitle.portrait)&&
        Objects.equals(this.additionalProperties, embedPresetsEssentialsCreatePresetRequestEmbedTitle.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, owner, portrait, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbedPresetsEssentialsCreatePresetRequestEmbedTitle {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    portrait: ").append(toIndentedString(portrait)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("owner");
    openapiFields.add("portrait");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmbedPresetsEssentialsCreatePresetRequestEmbedTitle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmbedPresetsEssentialsCreatePresetRequestEmbedTitle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmbedPresetsEssentialsCreatePresetRequestEmbedTitle is not found in the empty JSON string", EmbedPresetsEssentialsCreatePresetRequestEmbedTitle.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("portrait") != null && !jsonObj.get("portrait").isJsonNull()) && !jsonObj.get("portrait").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portrait` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portrait").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmbedPresetsEssentialsCreatePresetRequestEmbedTitle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmbedPresetsEssentialsCreatePresetRequestEmbedTitle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmbedPresetsEssentialsCreatePresetRequestEmbedTitle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmbedPresetsEssentialsCreatePresetRequestEmbedTitle.class));

       return (TypeAdapter<T>) new TypeAdapter<EmbedPresetsEssentialsCreatePresetRequestEmbedTitle>() {
           @Override
           public void write(JsonWriter out, EmbedPresetsEssentialsCreatePresetRequestEmbedTitle value) throws IOException {
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
           public EmbedPresetsEssentialsCreatePresetRequestEmbedTitle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmbedPresetsEssentialsCreatePresetRequestEmbedTitle instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmbedPresetsEssentialsCreatePresetRequestEmbedTitle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmbedPresetsEssentialsCreatePresetRequestEmbedTitle
  * @throws IOException if the JSON string is invalid with respect to EmbedPresetsEssentialsCreatePresetRequestEmbedTitle
  */
  public static EmbedPresetsEssentialsCreatePresetRequestEmbedTitle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmbedPresetsEssentialsCreatePresetRequestEmbedTitle.class);
  }

 /**
  * Convert an instance of EmbedPresetsEssentialsCreatePresetRequestEmbedTitle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

