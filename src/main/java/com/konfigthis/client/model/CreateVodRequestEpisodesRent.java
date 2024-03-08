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
import com.konfigthis.client.model.CreateVodRequestEpisodesRentPrice;
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
 * CreateVodRequestEpisodesRent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateVodRequestEpisodesRent {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  /**
   * The rental period of the episode.  Option descriptions:  * &#x60;1 week&#x60; - The episode can be rented for a maximum of 1 week.  * &#x60;1 year&#x60; - The episode can be rented for a maximum of 1 year.  * &#x60;24 hour&#x60; - The episode can be rented for a maximum of 24 hours.  * &#x60;3 month&#x60; - The episode can be rented for a maximum of 3 months.  * &#x60;30 day&#x60; - The episode can be rented for a maximum of 30 days.  * &#x60;48 hour&#x60; - The episode can be rented for a maximum of 48 hours.  * &#x60;6 month&#x60; - The episode can be rented for a maximum of 6 months.  * &#x60;72 hour&#x60; - The episode can be rented for a maximum of 72 hours. 
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
 public enum PeriodEnum {
    _1_WEEK("1 week"),
    
    _1_YEAR("1 year"),
    
    _24_HOUR("24 hour"),
    
    _3_MONTH("3 month"),
    
    _30_DAY("30 day"),
    
    _48_HOUR("48 hour"),
    
    _6_MONTH("6 month"),
    
    _72_HOUR("72 hour");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String value) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private PeriodEnum period;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CreateVodRequestEpisodesRentPrice price;

  public CreateVodRequestEpisodesRent() {
  }

  public CreateVodRequestEpisodesRent active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Whether episodes can be rented.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether episodes can be rented.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public CreateVodRequestEpisodesRent period(PeriodEnum period) {
    
    
    
    
    this.period = period;
    return this;
  }

   /**
   * The rental period of the episode.  Option descriptions:  * &#x60;1 week&#x60; - The episode can be rented for a maximum of 1 week.  * &#x60;1 year&#x60; - The episode can be rented for a maximum of 1 year.  * &#x60;24 hour&#x60; - The episode can be rented for a maximum of 24 hours.  * &#x60;3 month&#x60; - The episode can be rented for a maximum of 3 months.  * &#x60;30 day&#x60; - The episode can be rented for a maximum of 30 days.  * &#x60;48 hour&#x60; - The episode can be rented for a maximum of 48 hours.  * &#x60;6 month&#x60; - The episode can be rented for a maximum of 6 months.  * &#x60;72 hour&#x60; - The episode can be rented for a maximum of 72 hours. 
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rental period of the episode.  Option descriptions:  * `1 week` - The episode can be rented for a maximum of 1 week.  * `1 year` - The episode can be rented for a maximum of 1 year.  * `24 hour` - The episode can be rented for a maximum of 24 hours.  * `3 month` - The episode can be rented for a maximum of 3 months.  * `30 day` - The episode can be rented for a maximum of 30 days.  * `48 hour` - The episode can be rented for a maximum of 48 hours.  * `6 month` - The episode can be rented for a maximum of 6 months.  * `72 hour` - The episode can be rented for a maximum of 72 hours. ")

  public PeriodEnum getPeriod() {
    return period;
  }


  public void setPeriod(PeriodEnum period) {
    
    
    
    this.period = period;
  }


  public CreateVodRequestEpisodesRent price(CreateVodRequestEpisodesRentPrice price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateVodRequestEpisodesRentPrice getPrice() {
    return price;
  }


  public void setPrice(CreateVodRequestEpisodesRentPrice price) {
    
    
    
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
   * @return the CreateVodRequestEpisodesRent instance itself
   */
  public CreateVodRequestEpisodesRent putAdditionalProperty(String key, Object value) {
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
    CreateVodRequestEpisodesRent createVodRequestEpisodesRent = (CreateVodRequestEpisodesRent) o;
    return Objects.equals(this.active, createVodRequestEpisodesRent.active) &&
        Objects.equals(this.period, createVodRequestEpisodesRent.period) &&
        Objects.equals(this.price, createVodRequestEpisodesRent.price)&&
        Objects.equals(this.additionalProperties, createVodRequestEpisodesRent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, period, price, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVodRequestEpisodesRent {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("period");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateVodRequestEpisodesRent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateVodRequestEpisodesRent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateVodRequestEpisodesRent is not found in the empty JSON string", CreateVodRequestEpisodesRent.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CreateVodRequestEpisodesRentPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateVodRequestEpisodesRent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateVodRequestEpisodesRent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateVodRequestEpisodesRent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateVodRequestEpisodesRent.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateVodRequestEpisodesRent>() {
           @Override
           public void write(JsonWriter out, CreateVodRequestEpisodesRent value) throws IOException {
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
           public CreateVodRequestEpisodesRent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateVodRequestEpisodesRent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateVodRequestEpisodesRent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateVodRequestEpisodesRent
  * @throws IOException if the JSON string is invalid with respect to CreateVodRequestEpisodesRent
  */
  public static CreateVodRequestEpisodesRent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateVodRequestEpisodesRent.class);
  }

 /**
  * Convert an instance of CreateVodRequestEpisodesRent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

