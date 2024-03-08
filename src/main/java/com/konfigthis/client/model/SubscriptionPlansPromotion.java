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
import com.konfigthis.client.model.SubscriptionPlansPromotionPrice;
import com.konfigthis.client.model.SubscriptionPlansPromotionUri;
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
 * Information about the plan&#39;s promotion.
 */
@ApiModel(description = "Information about the plan's promotion.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SubscriptionPlansPromotion {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Double discount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private SubscriptionPlansPromotionPrice price;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private SubscriptionPlansPromotionUri uri;

  public SubscriptionPlansPromotion() {
  }

  public SubscriptionPlansPromotion code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * The promotion code.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The promotion code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public SubscriptionPlansPromotion discount(Double discount) {
    
    
    
    
    this.discount = discount;
    return this;
  }

  public SubscriptionPlansPromotion discount(Integer discount) {
    
    
    
    
    this.discount = discount.doubleValue();
    return this;
  }

   /**
   * The promotion discount percentage.
   * @return discount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The promotion discount percentage.")

  public Double getDiscount() {
    return discount;
  }


  public void setDiscount(Double discount) {
    
    
    
    this.discount = discount;
  }


  public SubscriptionPlansPromotion price(SubscriptionPlansPromotionPrice price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SubscriptionPlansPromotionPrice getPrice() {
    return price;
  }


  public void setPrice(SubscriptionPlansPromotionPrice price) {
    
    
    
    this.price = price;
  }


  public SubscriptionPlansPromotion uri(SubscriptionPlansPromotionUri uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SubscriptionPlansPromotionUri getUri() {
    return uri;
  }


  public void setUri(SubscriptionPlansPromotionUri uri) {
    
    
    
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
   * @return the SubscriptionPlansPromotion instance itself
   */
  public SubscriptionPlansPromotion putAdditionalProperty(String key, Object value) {
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
    SubscriptionPlansPromotion subscriptionPlansPromotion = (SubscriptionPlansPromotion) o;
    return Objects.equals(this.code, subscriptionPlansPromotion.code) &&
        Objects.equals(this.discount, subscriptionPlansPromotion.discount) &&
        Objects.equals(this.price, subscriptionPlansPromotion.price) &&
        Objects.equals(this.uri, subscriptionPlansPromotion.uri)&&
        Objects.equals(this.additionalProperties, subscriptionPlansPromotion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, discount, price, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlansPromotion {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("discount");
    openapiFields.add("price");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("discount");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionPlansPromotion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubscriptionPlansPromotion.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionPlansPromotion is not found in the empty JSON string", SubscriptionPlansPromotion.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionPlansPromotion.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the required field `price`
      SubscriptionPlansPromotionPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      // validate the required field `uri`
      SubscriptionPlansPromotionUri.validateJsonObject(jsonObj.getAsJsonObject("uri"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionPlansPromotion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionPlansPromotion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionPlansPromotion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionPlansPromotion.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionPlansPromotion>() {
           @Override
           public void write(JsonWriter out, SubscriptionPlansPromotion value) throws IOException {
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
           public SubscriptionPlansPromotion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubscriptionPlansPromotion instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubscriptionPlansPromotion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionPlansPromotion
  * @throws IOException if the JSON string is invalid with respect to SubscriptionPlansPromotion
  */
  public static SubscriptionPlansPromotion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionPlansPromotion.class);
  }

 /**
  * Convert an instance of SubscriptionPlansPromotion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
