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
 * SubscriptionItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SubscriptionItemsInner {
  public static final String SERIALIZED_NAME_BILLING_PLAN_ID = "billing_plan_id";
  @SerializedName(SERIALIZED_NAME_BILLING_PLAN_ID)
  private String billingPlanId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_PROMO_CODE = "promo_code";
  @SerializedName(SERIALIZED_NAME_PROMO_CODE)
  private String promoCode;

  public static final String SERIALIZED_NAME_PROMO_CODE_ID = "promo_code_id";
  @SerializedName(SERIALIZED_NAME_PROMO_CODE_ID)
  private String promoCodeId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_SYNCED_AT = "synced_at";
  @SerializedName(SERIALIZED_NAME_SYNCED_AT)
  private String syncedAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public SubscriptionItemsInner() {
  }

  public SubscriptionItemsInner billingPlanId(String billingPlanId) {
    
    
    
    
    this.billingPlanId = billingPlanId;
    return this;
  }

   /**
   * The ID of the billing plan for the subscription item.
   * @return billingPlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "abc12345", required = true, value = "The ID of the billing plan for the subscription item.")

  public String getBillingPlanId() {
    return billingPlanId;
  }


  public void setBillingPlanId(String billingPlanId) {
    
    
    
    this.billingPlanId = billingPlanId;
  }


  public SubscriptionItemsInner createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time in 8601 format when the subscription item was created.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-01T00:00:00Z", required = true, value = "The time in 8601 format when the subscription item was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public SubscriptionItemsInner id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the subscription item.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "abc12345", required = true, value = "The ID of the subscription item.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SubscriptionItemsInner metadata(Object metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata of the subscription item.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metadata of the subscription item.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    
    
    
    this.metadata = metadata;
  }


  public SubscriptionItemsInner promoCode(String promoCode) {
    
    
    
    
    this.promoCode = promoCode;
    return this;
  }

   /**
   * The promotional code for the subscription item.
   * @return promoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc12345", value = "The promotional code for the subscription item.")

  public String getPromoCode() {
    return promoCode;
  }


  public void setPromoCode(String promoCode) {
    
    
    
    this.promoCode = promoCode;
  }


  public SubscriptionItemsInner promoCodeId(String promoCodeId) {
    
    
    
    
    this.promoCodeId = promoCodeId;
    return this;
  }

   /**
   * The ID of the promotional code for the subscription item.
   * @return promoCodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc12345", value = "The ID of the promotional code for the subscription item.")

  public String getPromoCodeId() {
    return promoCodeId;
  }


  public void setPromoCodeId(String promoCodeId) {
    
    
    
    this.promoCodeId = promoCodeId;
  }


  public SubscriptionItemsInner quantity(Double quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

  public SubscriptionItemsInner quantity(Integer quantity) {
    
    
    
    
    this.quantity = quantity.doubleValue();
    return this;
  }

   /**
   * The quantity of the subscription item.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The quantity of the subscription item.")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    
    
    
    this.quantity = quantity;
  }


  public SubscriptionItemsInner syncedAt(String syncedAt) {
    
    
    
    
    this.syncedAt = syncedAt;
    return this;
  }

   /**
   * The time in 8601 format when the subscription item was synced.
   * @return syncedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-01T00:00:00Z", required = true, value = "The time in 8601 format when the subscription item was synced.")

  public String getSyncedAt() {
    return syncedAt;
  }


  public void setSyncedAt(String syncedAt) {
    
    
    
    this.syncedAt = syncedAt;
  }


  public SubscriptionItemsInner updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time in 8601 format when the subscription item was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-01T00:00:00Z", required = true, value = "The time in 8601 format when the subscription item was updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the SubscriptionItemsInner instance itself
   */
  public SubscriptionItemsInner putAdditionalProperty(String key, Object value) {
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
    SubscriptionItemsInner subscriptionItemsInner = (SubscriptionItemsInner) o;
    return Objects.equals(this.billingPlanId, subscriptionItemsInner.billingPlanId) &&
        Objects.equals(this.createdAt, subscriptionItemsInner.createdAt) &&
        Objects.equals(this.id, subscriptionItemsInner.id) &&
        Objects.equals(this.metadata, subscriptionItemsInner.metadata) &&
        Objects.equals(this.promoCode, subscriptionItemsInner.promoCode) &&
        Objects.equals(this.promoCodeId, subscriptionItemsInner.promoCodeId) &&
        Objects.equals(this.quantity, subscriptionItemsInner.quantity) &&
        Objects.equals(this.syncedAt, subscriptionItemsInner.syncedAt) &&
        Objects.equals(this.updatedAt, subscriptionItemsInner.updatedAt)&&
        Objects.equals(this.additionalProperties, subscriptionItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPlanId, createdAt, id, metadata, promoCode, promoCodeId, quantity, syncedAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionItemsInner {\n");
    sb.append("    billingPlanId: ").append(toIndentedString(billingPlanId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    promoCodeId: ").append(toIndentedString(promoCodeId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    syncedAt: ").append(toIndentedString(syncedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("billing_plan_id");
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("metadata");
    openapiFields.add("promo_code");
    openapiFields.add("promo_code_id");
    openapiFields.add("quantity");
    openapiFields.add("synced_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billing_plan_id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("synced_at");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubscriptionItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionItemsInner is not found in the empty JSON string", SubscriptionItemsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionItemsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("billing_plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_plan_id").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("promo_code") != null && !jsonObj.get("promo_code").isJsonNull()) && !jsonObj.get("promo_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_code").toString()));
      }
      if ((jsonObj.get("promo_code_id") != null && !jsonObj.get("promo_code_id").isJsonNull()) && !jsonObj.get("promo_code_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_code_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_code_id").toString()));
      }
      if (!jsonObj.get("synced_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `synced_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("synced_at").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionItemsInner>() {
           @Override
           public void write(JsonWriter out, SubscriptionItemsInner value) throws IOException {
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
           public SubscriptionItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubscriptionItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubscriptionItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionItemsInner
  * @throws IOException if the JSON string is invalid with respect to SubscriptionItemsInner
  */
  public static SubscriptionItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionItemsInner.class);
  }

 /**
  * Convert an instance of SubscriptionItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
