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
 * OnDemandEssentialsCreatePageRequestRentPrice
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OnDemandEssentialsCreatePageRequestRentPrice {
  public static final String SERIALIZED_NAME_A_U_D = "AUD";
  @SerializedName(SERIALIZED_NAME_A_U_D)
  private Double AUD;

  public static final String SERIALIZED_NAME_C_A_D = "CAD";
  @SerializedName(SERIALIZED_NAME_C_A_D)
  private Double CAD;

  public static final String SERIALIZED_NAME_C_H_F = "CHF";
  @SerializedName(SERIALIZED_NAME_C_H_F)
  private Double CHF;

  public static final String SERIALIZED_NAME_D_K_K = "DKK";
  @SerializedName(SERIALIZED_NAME_D_K_K)
  private Double DKK;

  public static final String SERIALIZED_NAME_E_U_R = "EUR";
  @SerializedName(SERIALIZED_NAME_E_U_R)
  private Double EUR;

  public static final String SERIALIZED_NAME_G_B_P = "GBP";
  @SerializedName(SERIALIZED_NAME_G_B_P)
  private Double GBP;

  public static final String SERIALIZED_NAME_J_P_Y = "JPY";
  @SerializedName(SERIALIZED_NAME_J_P_Y)
  private Double JPY;

  public static final String SERIALIZED_NAME_K_R_W = "KRW";
  @SerializedName(SERIALIZED_NAME_K_R_W)
  private Double KRW;

  public static final String SERIALIZED_NAME_N_O_K = "NOK";
  @SerializedName(SERIALIZED_NAME_N_O_K)
  private Double NOK;

  public static final String SERIALIZED_NAME_P_L_N = "PLN";
  @SerializedName(SERIALIZED_NAME_P_L_N)
  private Double PLN;

  public static final String SERIALIZED_NAME_S_E_K = "SEK";
  @SerializedName(SERIALIZED_NAME_S_E_K)
  private Double SEK;

  public static final String SERIALIZED_NAME_U_S_D = "USD";
  @SerializedName(SERIALIZED_NAME_U_S_D)
  private Double USD;

  public OnDemandEssentialsCreatePageRequestRentPrice() {
  }

  public OnDemandEssentialsCreatePageRequestRentPrice AUD(Double AUD) {
    
    
    
    
    this.AUD = AUD;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice AUD(Integer AUD) {
    
    
    
    
    this.AUD = AUD.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Australian dollars.
   * @return AUD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Australian dollars.")

  public Double getAUD() {
    return AUD;
  }


  public void setAUD(Double AUD) {
    
    
    
    this.AUD = AUD;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice CAD(Double CAD) {
    
    
    
    
    this.CAD = CAD;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice CAD(Integer CAD) {
    
    
    
    
    this.CAD = CAD.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Canadian dollars.
   * @return CAD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Canadian dollars.")

  public Double getCAD() {
    return CAD;
  }


  public void setCAD(Double CAD) {
    
    
    
    this.CAD = CAD;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice CHF(Double CHF) {
    
    
    
    
    this.CHF = CHF;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice CHF(Integer CHF) {
    
    
    
    
    this.CHF = CHF.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Swiss francs.
   * @return CHF
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Swiss francs.")

  public Double getCHF() {
    return CHF;
  }


  public void setCHF(Double CHF) {
    
    
    
    this.CHF = CHF;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice DKK(Double DKK) {
    
    
    
    
    this.DKK = DKK;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice DKK(Integer DKK) {
    
    
    
    
    this.DKK = DKK.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Danish krone.
   * @return DKK
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Danish krone.")

  public Double getDKK() {
    return DKK;
  }


  public void setDKK(Double DKK) {
    
    
    
    this.DKK = DKK;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice EUR(Double EUR) {
    
    
    
    
    this.EUR = EUR;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice EUR(Integer EUR) {
    
    
    
    
    this.EUR = EUR.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in euros.
   * @return EUR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in euros.")

  public Double getEUR() {
    return EUR;
  }


  public void setEUR(Double EUR) {
    
    
    
    this.EUR = EUR;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice GBP(Double GBP) {
    
    
    
    
    this.GBP = GBP;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice GBP(Integer GBP) {
    
    
    
    
    this.GBP = GBP.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in British pounds.
   * @return GBP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in British pounds.")

  public Double getGBP() {
    return GBP;
  }


  public void setGBP(Double GBP) {
    
    
    
    this.GBP = GBP;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice JPY(Double JPY) {
    
    
    
    
    this.JPY = JPY;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice JPY(Integer JPY) {
    
    
    
    
    this.JPY = JPY.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Japanese yen.
   * @return JPY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Japanese yen.")

  public Double getJPY() {
    return JPY;
  }


  public void setJPY(Double JPY) {
    
    
    
    this.JPY = JPY;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice KRW(Double KRW) {
    
    
    
    
    this.KRW = KRW;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice KRW(Integer KRW) {
    
    
    
    
    this.KRW = KRW.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in South Korean won.
   * @return KRW
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in South Korean won.")

  public Double getKRW() {
    return KRW;
  }


  public void setKRW(Double KRW) {
    
    
    
    this.KRW = KRW;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice NOK(Double NOK) {
    
    
    
    
    this.NOK = NOK;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice NOK(Integer NOK) {
    
    
    
    
    this.NOK = NOK.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Norwegian krone.
   * @return NOK
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Norwegian krone.")

  public Double getNOK() {
    return NOK;
  }


  public void setNOK(Double NOK) {
    
    
    
    this.NOK = NOK;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice PLN(Double PLN) {
    
    
    
    
    this.PLN = PLN;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice PLN(Integer PLN) {
    
    
    
    
    this.PLN = PLN.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Polish zloty.
   * @return PLN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Polish zloty.")

  public Double getPLN() {
    return PLN;
  }


  public void setPLN(Double PLN) {
    
    
    
    this.PLN = PLN;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice SEK(Double SEK) {
    
    
    
    
    this.SEK = SEK;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice SEK(Integer SEK) {
    
    
    
    
    this.SEK = SEK.doubleValue();
    return this;
  }

   /**
   * The rental price of the video in Swedish krona.
   * @return SEK
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "The rental price of the video in Swedish krona.")

  public Double getSEK() {
    return SEK;
  }


  public void setSEK(Double SEK) {
    
    
    
    this.SEK = SEK;
  }


  public OnDemandEssentialsCreatePageRequestRentPrice USD(Double USD) {
    
    
    
    
    this.USD = USD;
    return this;
  }

  public OnDemandEssentialsCreatePageRequestRentPrice USD(Integer USD) {
    
    
    
    
    this.USD = USD.doubleValue();
    return this;
  }

   /**
   * When **type** is &#x60;film&#x60;, the rental price of the video in United States dollars. When **type** is &#x60;series&#x60;, the rental price of the entire collection in United States dollars.
   * @return USD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "When **type** is `film`, the rental price of the video in United States dollars. When **type** is `series`, the rental price of the entire collection in United States dollars.")

  public Double getUSD() {
    return USD;
  }


  public void setUSD(Double USD) {
    
    
    
    this.USD = USD;
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
   * @return the OnDemandEssentialsCreatePageRequestRentPrice instance itself
   */
  public OnDemandEssentialsCreatePageRequestRentPrice putAdditionalProperty(String key, Object value) {
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
    OnDemandEssentialsCreatePageRequestRentPrice onDemandEssentialsCreatePageRequestRentPrice = (OnDemandEssentialsCreatePageRequestRentPrice) o;
    return Objects.equals(this.AUD, onDemandEssentialsCreatePageRequestRentPrice.AUD) &&
        Objects.equals(this.CAD, onDemandEssentialsCreatePageRequestRentPrice.CAD) &&
        Objects.equals(this.CHF, onDemandEssentialsCreatePageRequestRentPrice.CHF) &&
        Objects.equals(this.DKK, onDemandEssentialsCreatePageRequestRentPrice.DKK) &&
        Objects.equals(this.EUR, onDemandEssentialsCreatePageRequestRentPrice.EUR) &&
        Objects.equals(this.GBP, onDemandEssentialsCreatePageRequestRentPrice.GBP) &&
        Objects.equals(this.JPY, onDemandEssentialsCreatePageRequestRentPrice.JPY) &&
        Objects.equals(this.KRW, onDemandEssentialsCreatePageRequestRentPrice.KRW) &&
        Objects.equals(this.NOK, onDemandEssentialsCreatePageRequestRentPrice.NOK) &&
        Objects.equals(this.PLN, onDemandEssentialsCreatePageRequestRentPrice.PLN) &&
        Objects.equals(this.SEK, onDemandEssentialsCreatePageRequestRentPrice.SEK) &&
        Objects.equals(this.USD, onDemandEssentialsCreatePageRequestRentPrice.USD)&&
        Objects.equals(this.additionalProperties, onDemandEssentialsCreatePageRequestRentPrice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AUD, CAD, CHF, DKK, EUR, GBP, JPY, KRW, NOK, PLN, SEK, USD, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnDemandEssentialsCreatePageRequestRentPrice {\n");
    sb.append("    AUD: ").append(toIndentedString(AUD)).append("\n");
    sb.append("    CAD: ").append(toIndentedString(CAD)).append("\n");
    sb.append("    CHF: ").append(toIndentedString(CHF)).append("\n");
    sb.append("    DKK: ").append(toIndentedString(DKK)).append("\n");
    sb.append("    EUR: ").append(toIndentedString(EUR)).append("\n");
    sb.append("    GBP: ").append(toIndentedString(GBP)).append("\n");
    sb.append("    JPY: ").append(toIndentedString(JPY)).append("\n");
    sb.append("    KRW: ").append(toIndentedString(KRW)).append("\n");
    sb.append("    NOK: ").append(toIndentedString(NOK)).append("\n");
    sb.append("    PLN: ").append(toIndentedString(PLN)).append("\n");
    sb.append("    SEK: ").append(toIndentedString(SEK)).append("\n");
    sb.append("    USD: ").append(toIndentedString(USD)).append("\n");
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
    openapiFields.add("AUD");
    openapiFields.add("CAD");
    openapiFields.add("CHF");
    openapiFields.add("DKK");
    openapiFields.add("EUR");
    openapiFields.add("GBP");
    openapiFields.add("JPY");
    openapiFields.add("KRW");
    openapiFields.add("NOK");
    openapiFields.add("PLN");
    openapiFields.add("SEK");
    openapiFields.add("USD");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnDemandEssentialsCreatePageRequestRentPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnDemandEssentialsCreatePageRequestRentPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnDemandEssentialsCreatePageRequestRentPrice is not found in the empty JSON string", OnDemandEssentialsCreatePageRequestRentPrice.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnDemandEssentialsCreatePageRequestRentPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnDemandEssentialsCreatePageRequestRentPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnDemandEssentialsCreatePageRequestRentPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnDemandEssentialsCreatePageRequestRentPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<OnDemandEssentialsCreatePageRequestRentPrice>() {
           @Override
           public void write(JsonWriter out, OnDemandEssentialsCreatePageRequestRentPrice value) throws IOException {
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
           public OnDemandEssentialsCreatePageRequestRentPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnDemandEssentialsCreatePageRequestRentPrice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OnDemandEssentialsCreatePageRequestRentPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnDemandEssentialsCreatePageRequestRentPrice
  * @throws IOException if the JSON string is invalid with respect to OnDemandEssentialsCreatePageRequestRentPrice
  */
  public static OnDemandEssentialsCreatePageRequestRentPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnDemandEssentialsCreatePageRequestRentPrice.class);
  }

 /**
  * Convert an instance of OnDemandEssentialsCreatePageRequestRentPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

