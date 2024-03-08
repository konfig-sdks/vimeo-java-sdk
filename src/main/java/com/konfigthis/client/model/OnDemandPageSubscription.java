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
 * Information about subscribing to the On Demand page, if subscription is enabled.
 */
@ApiModel(description = "Information about subscribing to the On Demand page, if subscription is enabled.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OnDemandPageSubscription {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Object price;

  public OnDemandPageSubscription() {
  }

  public OnDemandPageSubscription active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Whether the On Demand product is active.
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the On Demand product is active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public OnDemandPageSubscription link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The link to the On Demand product.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://vimeo.com/ondemand/darbyforever", required = true, value = "The link to the On Demand product.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
  }


  public OnDemandPageSubscription period(String period) {
    
    
    
    
    this.period = period;
    return this;
  }

   /**
   * The On Demand product&#39;s rental period.
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The On Demand product's rental period.")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    
    
    
    this.period = period;
  }


  public OnDemandPageSubscription price(Object price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * The accepted currencies and respective pricing for the On Demand product.
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The accepted currencies and respective pricing for the On Demand product.")

  public Object getPrice() {
    return price;
  }


  public void setPrice(Object price) {
    
    
    
    this.price = price;
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
   * @return the OnDemandPageSubscription instance itself
   */
  public OnDemandPageSubscription putAdditionalProperty(String key, Object value) {
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
    OnDemandPageSubscription onDemandPageSubscription = (OnDemandPageSubscription) o;
    return Objects.equals(this.active, onDemandPageSubscription.active) &&
        Objects.equals(this.link, onDemandPageSubscription.link) &&
        Objects.equals(this.period, onDemandPageSubscription.period) &&
        Objects.equals(this.price, onDemandPageSubscription.price)&&
        Objects.equals(this.additionalProperties, onDemandPageSubscription.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, link, period, price, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnDemandPageSubscription {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("period");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("price");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnDemandPageSubscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnDemandPageSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnDemandPageSubscription is not found in the empty JSON string", OnDemandPageSubscription.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OnDemandPageSubscription.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("link").isJsonNull() && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnDemandPageSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnDemandPageSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnDemandPageSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnDemandPageSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<OnDemandPageSubscription>() {
           @Override
           public void write(JsonWriter out, OnDemandPageSubscription value) throws IOException {
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
           public OnDemandPageSubscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnDemandPageSubscription instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OnDemandPageSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnDemandPageSubscription
  * @throws IOException if the JSON string is invalid with respect to OnDemandPageSubscription
  */
  public static OnDemandPageSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnDemandPageSubscription.class);
  }

 /**
  * Convert an instance of OnDemandPageSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

