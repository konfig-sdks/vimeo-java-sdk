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
 * Location
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Location {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_ISO_CODE = "country_iso_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO_CODE)
  private String countryIsoCode;

  public static final String SERIALIZED_NAME_FORMATTED_ADDRESS = "formatted_address";
  @SerializedName(SERIALIZED_NAME_FORMATTED_ADDRESS)
  private String formattedAddress;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_NEIGHBORHOOD = "neighborhood";
  @SerializedName(SERIALIZED_NAME_NEIGHBORHOOD)
  private String neighborhood;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_ISO_CODE = "state_iso_code";
  @SerializedName(SERIALIZED_NAME_STATE_ISO_CODE)
  private String stateIsoCode;

  public static final String SERIALIZED_NAME_SUB_LOCALITY = "sub_locality";
  @SerializedName(SERIALIZED_NAME_SUB_LOCALITY)
  private String subLocality;

  public Location() {
  }

  public Location city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * The authenticated user&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York City", required = true, value = "The authenticated user's city.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public Location country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * The authenticated user&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States", required = true, value = "The authenticated user's country.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public Location countryIsoCode(String countryIsoCode) {
    
    
    
    
    this.countryIsoCode = countryIsoCode;
    return this;
  }

   /**
   * The ISO code of the authenticated user&#39;s country.
   * @return countryIsoCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "US", required = true, value = "The ISO code of the authenticated user's country.")

  public String getCountryIsoCode() {
    return countryIsoCode;
  }


  public void setCountryIsoCode(String countryIsoCode) {
    
    
    
    this.countryIsoCode = countryIsoCode;
  }


  public Location formattedAddress(String formattedAddress) {
    
    
    
    
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * The authenticated user&#39;s formatted address string.
   * @return formattedAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123 Street, NY", required = true, value = "The authenticated user's formatted address string.")

  public String getFormattedAddress() {
    return formattedAddress;
  }


  public void setFormattedAddress(String formattedAddress) {
    
    
    
    this.formattedAddress = formattedAddress;
  }


  public Location latitude(Double latitude) {
    
    
    
    
    this.latitude = latitude;
    return this;
  }

  public Location latitude(Integer latitude) {
    
    
    
    
    this.latitude = latitude.doubleValue();
    return this;
  }

   /**
   * The authenticated user&#39;s latitude.
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20.2960586", required = true, value = "The authenticated user's latitude.")

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    
    
    
    this.latitude = latitude;
  }


  public Location longitude(Double longitude) {
    
    
    
    
    this.longitude = longitude;
    return this;
  }

  public Location longitude(Integer longitude) {
    
    
    
    
    this.longitude = longitude.doubleValue();
    return this;
  }

   /**
   * The authenticated user&#39;s longitude.
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "185.8245392", required = true, value = "The authenticated user's longitude.")

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    
    
    
    this.longitude = longitude;
  }


  public Location neighborhood(String neighborhood) {
    
    
    
    
    this.neighborhood = neighborhood;
    return this;
  }

   /**
   * The authenticated user&#39;s neighborhood.
   * @return neighborhood
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Brooklyn", required = true, value = "The authenticated user's neighborhood.")

  public String getNeighborhood() {
    return neighborhood;
  }


  public void setNeighborhood(String neighborhood) {
    
    
    
    this.neighborhood = neighborhood;
  }


  public Location state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * The authenticated user&#39;s state.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York", required = true, value = "The authenticated user's state.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public Location stateIsoCode(String stateIsoCode) {
    
    
    
    
    this.stateIsoCode = stateIsoCode;
    return this;
  }

   /**
   * The ISO code of the authenticated user&#39;s state.
   * @return stateIsoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NY", required = true, value = "The ISO code of the authenticated user's state.")

  public String getStateIsoCode() {
    return stateIsoCode;
  }


  public void setStateIsoCode(String stateIsoCode) {
    
    
    
    this.stateIsoCode = stateIsoCode;
  }


  public Location subLocality(String subLocality) {
    
    
    
    
    this.subLocality = subLocality;
    return this;
  }

   /**
   * The authenticated user&#39;s sub-locality.
   * @return subLocality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Brooklyn", required = true, value = "The authenticated user's sub-locality.")

  public String getSubLocality() {
    return subLocality;
  }


  public void setSubLocality(String subLocality) {
    
    
    
    this.subLocality = subLocality;
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
   * @return the Location instance itself
   */
  public Location putAdditionalProperty(String key, Object value) {
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
    Location location = (Location) o;
    return Objects.equals(this.city, location.city) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.countryIsoCode, location.countryIsoCode) &&
        Objects.equals(this.formattedAddress, location.formattedAddress) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.neighborhood, location.neighborhood) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.stateIsoCode, location.stateIsoCode) &&
        Objects.equals(this.subLocality, location.subLocality)&&
        Objects.equals(this.additionalProperties, location.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, countryIsoCode, formattedAddress, latitude, longitude, neighborhood, state, stateIsoCode, subLocality, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryIsoCode: ").append(toIndentedString(countryIsoCode)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateIsoCode: ").append(toIndentedString(stateIsoCode)).append("\n");
    sb.append("    subLocality: ").append(toIndentedString(subLocality)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("country_iso_code");
    openapiFields.add("formatted_address");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("neighborhood");
    openapiFields.add("state");
    openapiFields.add("state_iso_code");
    openapiFields.add("sub_locality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("country_iso_code");
    openapiRequiredFields.add("formatted_address");
    openapiRequiredFields.add("latitude");
    openapiRequiredFields.add("longitude");
    openapiRequiredFields.add("neighborhood");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("state_iso_code");
    openapiRequiredFields.add("sub_locality");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Location
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Location.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Location is not found in the empty JSON string", Location.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Location.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("city").isJsonNull() && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("country").isJsonNull() && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("country_iso_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_iso_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_iso_code").toString()));
      }
      if (!jsonObj.get("formatted_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted_address").toString()));
      }
      if (!jsonObj.get("neighborhood").isJsonNull() && !jsonObj.get("neighborhood").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `neighborhood` to be a primitive type in the JSON string but got `%s`", jsonObj.get("neighborhood").toString()));
      }
      if (!jsonObj.get("state").isJsonNull() && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("state_iso_code").isJsonNull() && !jsonObj.get("state_iso_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_iso_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_iso_code").toString()));
      }
      if (!jsonObj.get("sub_locality").isJsonNull() && !jsonObj.get("sub_locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_locality").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Location.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Location' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Location> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Location.class));

       return (TypeAdapter<T>) new TypeAdapter<Location>() {
           @Override
           public void write(JsonWriter out, Location value) throws IOException {
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
           public Location read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Location instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Location given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Location
  * @throws IOException if the JSON string is invalid with respect to Location
  */
  public static Location fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Location.class);
  }

 /**
  * Convert an instance of Location to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
