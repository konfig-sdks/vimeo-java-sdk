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
import com.konfigthis.client.model.DisabledVideoPropertiesDuplicateReasonsInner;
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
 * An object that represents the reason why duplication is disabled for the video.
 */
@ApiModel(description = "An object that represents the reason why duplication is disabled for the video.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DisabledVideoPropertiesDuplicate {
  public static final String SERIALIZED_NAME_ENABLE_LINK = "enable_link";
  @SerializedName(SERIALIZED_NAME_ENABLE_LINK)
  private String enableLink;

  public static final String SERIALIZED_NAME_KEY_PATH = "key_path";
  @SerializedName(SERIALIZED_NAME_KEY_PATH)
  private String keyPath;

  /**
   * The capability required to activate duplication.  Option descriptions:  * &#x60;basic&#x60; - The user must have at least a Vimeo Basic account.  * &#x60;business&#x60; - The user must have at least a Vimeo Business account.  * &#x60;enterprise&#x60; - The user must have at least a Vimeo Enterprise account.  * &#x60;live_business&#x60; - The user must have at least a Vimeo Business Live account.  * &#x60;live_premium&#x60; - The user must have at least a Vimeo Premium account.  * &#x60;live_pro&#x60; - The user must have at least a Vimeo Pro Live account.  * &#x60;plus&#x60; - The user must have at least a Vimeo Plus account.  * &#x60;pro&#x60; - The user must have at least a Vimeo Pro account.  * &#x60;pro_unlimited&#x60; - The user must have at least a Vimeo Pro Unlimited account.  * &#x60;producer&#x60; - The user must have at least a Vimeo Producer account. 
   */
  @JsonAdapter(MinTierForCapabilityEnum.Adapter.class)
 public enum MinTierForCapabilityEnum {
    BASIC("basic"),
    
    BUSINESS("business"),
    
    ENTERPRISE("enterprise"),
    
    LIVE_BUSINESS("live_business"),
    
    LIVE_PREMIUM("live_premium"),
    
    LIVE_PRO("live_pro"),
    
    PLUS("plus"),
    
    PRO("pro"),
    
    PRO_UNLIMITED("pro_unlimited"),
    
    PRODUCER("producer");

    private String value;

    MinTierForCapabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MinTierForCapabilityEnum fromValue(String value) {
      for (MinTierForCapabilityEnum b : MinTierForCapabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MinTierForCapabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinTierForCapabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinTierForCapabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MinTierForCapabilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MIN_TIER_FOR_CAPABILITY = "min_tier_for_capability";
  @SerializedName(SERIALIZED_NAME_MIN_TIER_FOR_CAPABILITY)
  private MinTierForCapabilityEnum minTierForCapability;

  public static final String SERIALIZED_NAME_REASONS = "reasons";
  @SerializedName(SERIALIZED_NAME_REASONS)
  private List<DisabledVideoPropertiesDuplicateReasonsInner> reasons = new ArrayList<>();

  public DisabledVideoPropertiesDuplicate() {
  }

  public DisabledVideoPropertiesDuplicate enableLink(String enableLink) {
    
    
    
    
    this.enableLink = enableLink;
    return this;
  }

   /**
   * The relative link to upgrade to duplication.
   * @return enableLink
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/store/pro", required = true, value = "The relative link to upgrade to duplication.")

  public String getEnableLink() {
    return enableLink;
  }


  public void setEnableLink(String enableLink) {
    
    
    
    this.enableLink = enableLink;
  }


  public DisabledVideoPropertiesDuplicate keyPath(String keyPath) {
    
    
    
    
    this.keyPath = keyPath;
    return this;
  }

   /**
   * The path to the duplicate object in the video response.
   * @return keyPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path to the duplicate object in the video response.")

  public String getKeyPath() {
    return keyPath;
  }


  public void setKeyPath(String keyPath) {
    
    
    
    this.keyPath = keyPath;
  }


  public DisabledVideoPropertiesDuplicate minTierForCapability(MinTierForCapabilityEnum minTierForCapability) {
    
    
    
    
    this.minTierForCapability = minTierForCapability;
    return this;
  }

   /**
   * The capability required to activate duplication.  Option descriptions:  * &#x60;basic&#x60; - The user must have at least a Vimeo Basic account.  * &#x60;business&#x60; - The user must have at least a Vimeo Business account.  * &#x60;enterprise&#x60; - The user must have at least a Vimeo Enterprise account.  * &#x60;live_business&#x60; - The user must have at least a Vimeo Business Live account.  * &#x60;live_premium&#x60; - The user must have at least a Vimeo Premium account.  * &#x60;live_pro&#x60; - The user must have at least a Vimeo Pro Live account.  * &#x60;plus&#x60; - The user must have at least a Vimeo Plus account.  * &#x60;pro&#x60; - The user must have at least a Vimeo Pro account.  * &#x60;pro_unlimited&#x60; - The user must have at least a Vimeo Pro Unlimited account.  * &#x60;producer&#x60; - The user must have at least a Vimeo Producer account. 
   * @return minTierForCapability
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PRO", required = true, value = "The capability required to activate duplication.  Option descriptions:  * `basic` - The user must have at least a Vimeo Basic account.  * `business` - The user must have at least a Vimeo Business account.  * `enterprise` - The user must have at least a Vimeo Enterprise account.  * `live_business` - The user must have at least a Vimeo Business Live account.  * `live_premium` - The user must have at least a Vimeo Premium account.  * `live_pro` - The user must have at least a Vimeo Pro Live account.  * `plus` - The user must have at least a Vimeo Plus account.  * `pro` - The user must have at least a Vimeo Pro account.  * `pro_unlimited` - The user must have at least a Vimeo Pro Unlimited account.  * `producer` - The user must have at least a Vimeo Producer account. ")

  public MinTierForCapabilityEnum getMinTierForCapability() {
    return minTierForCapability;
  }


  public void setMinTierForCapability(MinTierForCapabilityEnum minTierForCapability) {
    
    
    
    this.minTierForCapability = minTierForCapability;
  }


  public DisabledVideoPropertiesDuplicate reasons(List<DisabledVideoPropertiesDuplicateReasonsInner> reasons) {
    
    
    
    
    this.reasons = reasons;
    return this;
  }

  public DisabledVideoPropertiesDuplicate addReasonsItem(DisabledVideoPropertiesDuplicateReasonsInner reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * The reasons why duplication is disabled for the video.
   * @return reasons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The reasons why duplication is disabled for the video.")

  public List<DisabledVideoPropertiesDuplicateReasonsInner> getReasons() {
    return reasons;
  }


  public void setReasons(List<DisabledVideoPropertiesDuplicateReasonsInner> reasons) {
    
    
    
    this.reasons = reasons;
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
   * @return the DisabledVideoPropertiesDuplicate instance itself
   */
  public DisabledVideoPropertiesDuplicate putAdditionalProperty(String key, Object value) {
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
    DisabledVideoPropertiesDuplicate disabledVideoPropertiesDuplicate = (DisabledVideoPropertiesDuplicate) o;
    return Objects.equals(this.enableLink, disabledVideoPropertiesDuplicate.enableLink) &&
        Objects.equals(this.keyPath, disabledVideoPropertiesDuplicate.keyPath) &&
        Objects.equals(this.minTierForCapability, disabledVideoPropertiesDuplicate.minTierForCapability) &&
        Objects.equals(this.reasons, disabledVideoPropertiesDuplicate.reasons)&&
        Objects.equals(this.additionalProperties, disabledVideoPropertiesDuplicate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableLink, keyPath, minTierForCapability, reasons, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisabledVideoPropertiesDuplicate {\n");
    sb.append("    enableLink: ").append(toIndentedString(enableLink)).append("\n");
    sb.append("    keyPath: ").append(toIndentedString(keyPath)).append("\n");
    sb.append("    minTierForCapability: ").append(toIndentedString(minTierForCapability)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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
    openapiFields.add("enable_link");
    openapiFields.add("key_path");
    openapiFields.add("min_tier_for_capability");
    openapiFields.add("reasons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enable_link");
    openapiRequiredFields.add("key_path");
    openapiRequiredFields.add("min_tier_for_capability");
    openapiRequiredFields.add("reasons");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisabledVideoPropertiesDuplicate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DisabledVideoPropertiesDuplicate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisabledVideoPropertiesDuplicate is not found in the empty JSON string", DisabledVideoPropertiesDuplicate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DisabledVideoPropertiesDuplicate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("enable_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable_link").toString()));
      }
      if (!jsonObj.get("key_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_path").toString()));
      }
      if (!jsonObj.get("min_tier_for_capability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_tier_for_capability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_tier_for_capability").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("reasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasons` to be an array in the JSON string but got `%s`", jsonObj.get("reasons").toString()));
      }

      JsonArray jsonArrayreasons = jsonObj.getAsJsonArray("reasons");
      // validate the required field `reasons` (array)
      for (int i = 0; i < jsonArrayreasons.size(); i++) {
        DisabledVideoPropertiesDuplicateReasonsInner.validateJsonObject(jsonArrayreasons.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisabledVideoPropertiesDuplicate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisabledVideoPropertiesDuplicate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisabledVideoPropertiesDuplicate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisabledVideoPropertiesDuplicate.class));

       return (TypeAdapter<T>) new TypeAdapter<DisabledVideoPropertiesDuplicate>() {
           @Override
           public void write(JsonWriter out, DisabledVideoPropertiesDuplicate value) throws IOException {
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
           public DisabledVideoPropertiesDuplicate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DisabledVideoPropertiesDuplicate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DisabledVideoPropertiesDuplicate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisabledVideoPropertiesDuplicate
  * @throws IOException if the JSON string is invalid with respect to DisabledVideoPropertiesDuplicate
  */
  public static DisabledVideoPropertiesDuplicate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisabledVideoPropertiesDuplicate.class);
  }

 /**
  * Convert an instance of DisabledVideoPropertiesDuplicate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

