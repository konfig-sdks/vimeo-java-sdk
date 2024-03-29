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
 * The preferences for emails that are sent about the webinar. _This field is deprecated._
 */
@ApiModel(description = "The preferences for emails that are sent about the webinar. _This field is deprecated._")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences {
  public static final String SERIALIZED_NAME_EMAIL_EVENT_REMINDER15_MIN = "email_event_reminder_15_min";
  @SerializedName(SERIALIZED_NAME_EMAIL_EVENT_REMINDER15_MIN)
  private Boolean emailEventReminder15Min;

  public static final String SERIALIZED_NAME_EMAIL_EVENT_REMINDER1_HRS = "email_event_reminder_1_hrs";
  @SerializedName(SERIALIZED_NAME_EMAIL_EVENT_REMINDER1_HRS)
  private Boolean emailEventReminder1Hrs;

  public static final String SERIALIZED_NAME_EMAIL_EVENT_REMINDER24_HRS = "email_event_reminder_24_hrs";
  @SerializedName(SERIALIZED_NAME_EMAIL_EVENT_REMINDER24_HRS)
  private Boolean emailEventReminder24Hrs;

  public static final String SERIALIZED_NAME_EMAIL_POST_EVENT_NO_SHOW_THANK_YOU = "email_post_event_no_show_thank_you";
  @SerializedName(SERIALIZED_NAME_EMAIL_POST_EVENT_NO_SHOW_THANK_YOU)
  private Boolean emailPostEventNoShowThankYou;

  public static final String SERIALIZED_NAME_EMAIL_POST_EVENT_THANK_YOU = "email_post_event_thank_you";
  @SerializedName(SERIALIZED_NAME_EMAIL_POST_EVENT_THANK_YOU)
  private Boolean emailPostEventThankYou;

  public static final String SERIALIZED_NAME_EMAIL_REGISTRATION_CONFIRMATION = "email_registration_confirmation";
  @SerializedName(SERIALIZED_NAME_EMAIL_REGISTRATION_CONFIRMATION)
  private Boolean emailRegistrationConfirmation;

  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences() {
  }

  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences emailEventReminder15Min(Boolean emailEventReminder15Min) {
    
    
    
    
    this.emailEventReminder15Min = emailEventReminder15Min;
    return this;
  }

   /**
   * Whether to send a reminder email 15 minutes before the webinar starts. _This field is deprecated._
   * @return emailEventReminder15Min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to send a reminder email 15 minutes before the webinar starts. _This field is deprecated._")

  public Boolean getEmailEventReminder15Min() {
    return emailEventReminder15Min;
  }


  public void setEmailEventReminder15Min(Boolean emailEventReminder15Min) {
    
    
    
    this.emailEventReminder15Min = emailEventReminder15Min;
  }


  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences emailEventReminder1Hrs(Boolean emailEventReminder1Hrs) {
    
    
    
    
    this.emailEventReminder1Hrs = emailEventReminder1Hrs;
    return this;
  }

   /**
   * Whether to send a reminder email 1 hour before the webinar starts. _This field is deprecated._
   * @return emailEventReminder1Hrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to send a reminder email 1 hour before the webinar starts. _This field is deprecated._")

  public Boolean getEmailEventReminder1Hrs() {
    return emailEventReminder1Hrs;
  }


  public void setEmailEventReminder1Hrs(Boolean emailEventReminder1Hrs) {
    
    
    
    this.emailEventReminder1Hrs = emailEventReminder1Hrs;
  }


  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences emailEventReminder24Hrs(Boolean emailEventReminder24Hrs) {
    
    
    
    
    this.emailEventReminder24Hrs = emailEventReminder24Hrs;
    return this;
  }

   /**
   * Whether to send a reminder email 24 hours before the webinar starts. _This field is deprecated._
   * @return emailEventReminder24Hrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to send a reminder email 24 hours before the webinar starts. _This field is deprecated._")

  public Boolean getEmailEventReminder24Hrs() {
    return emailEventReminder24Hrs;
  }


  public void setEmailEventReminder24Hrs(Boolean emailEventReminder24Hrs) {
    
    
    
    this.emailEventReminder24Hrs = emailEventReminder24Hrs;
  }


  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences emailPostEventNoShowThankYou(Boolean emailPostEventNoShowThankYou) {
    
    
    
    
    this.emailPostEventNoShowThankYou = emailPostEventNoShowThankYou;
    return this;
  }

   /**
   * Whether to send post-event thank-you emails to no-shows. _This field is deprecated._
   * @return emailPostEventNoShowThankYou
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to send post-event thank-you emails to no-shows. _This field is deprecated._")

  public Boolean getEmailPostEventNoShowThankYou() {
    return emailPostEventNoShowThankYou;
  }


  public void setEmailPostEventNoShowThankYou(Boolean emailPostEventNoShowThankYou) {
    
    
    
    this.emailPostEventNoShowThankYou = emailPostEventNoShowThankYou;
  }


  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences emailPostEventThankYou(Boolean emailPostEventThankYou) {
    
    
    
    
    this.emailPostEventThankYou = emailPostEventThankYou;
    return this;
  }

   /**
   * Whether to send post-event thank-you emails. _This field is deprecated._
   * @return emailPostEventThankYou
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to send post-event thank-you emails. _This field is deprecated._")

  public Boolean getEmailPostEventThankYou() {
    return emailPostEventThankYou;
  }


  public void setEmailPostEventThankYou(Boolean emailPostEventThankYou) {
    
    
    
    this.emailPostEventThankYou = emailPostEventThankYou;
  }


  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences emailRegistrationConfirmation(Boolean emailRegistrationConfirmation) {
    
    
    
    
    this.emailRegistrationConfirmation = emailRegistrationConfirmation;
    return this;
  }

   /**
   * Whether to send a registration confirmation email after webinar registration. _This field is deprecated._
   * @return emailRegistrationConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to send a registration confirmation email after webinar registration. _This field is deprecated._")

  public Boolean getEmailRegistrationConfirmation() {
    return emailRegistrationConfirmation;
  }


  public void setEmailRegistrationConfirmation(Boolean emailRegistrationConfirmation) {
    
    
    
    this.emailRegistrationConfirmation = emailRegistrationConfirmation;
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
   * @return the WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences instance itself
   */
  public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences putAdditionalProperty(String key, Object value) {
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
    WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences = (WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences) o;
    return Objects.equals(this.emailEventReminder15Min, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.emailEventReminder15Min) &&
        Objects.equals(this.emailEventReminder1Hrs, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.emailEventReminder1Hrs) &&
        Objects.equals(this.emailEventReminder24Hrs, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.emailEventReminder24Hrs) &&
        Objects.equals(this.emailPostEventNoShowThankYou, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.emailPostEventNoShowThankYou) &&
        Objects.equals(this.emailPostEventThankYou, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.emailPostEventThankYou) &&
        Objects.equals(this.emailRegistrationConfirmation, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.emailRegistrationConfirmation)&&
        Objects.equals(this.additionalProperties, webinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailEventReminder15Min, emailEventReminder1Hrs, emailEventReminder24Hrs, emailPostEventNoShowThankYou, emailPostEventThankYou, emailRegistrationConfirmation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences {\n");
    sb.append("    emailEventReminder15Min: ").append(toIndentedString(emailEventReminder15Min)).append("\n");
    sb.append("    emailEventReminder1Hrs: ").append(toIndentedString(emailEventReminder1Hrs)).append("\n");
    sb.append("    emailEventReminder24Hrs: ").append(toIndentedString(emailEventReminder24Hrs)).append("\n");
    sb.append("    emailPostEventNoShowThankYou: ").append(toIndentedString(emailPostEventNoShowThankYou)).append("\n");
    sb.append("    emailPostEventThankYou: ").append(toIndentedString(emailPostEventThankYou)).append("\n");
    sb.append("    emailRegistrationConfirmation: ").append(toIndentedString(emailRegistrationConfirmation)).append("\n");
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
    openapiFields.add("email_event_reminder_15_min");
    openapiFields.add("email_event_reminder_1_hrs");
    openapiFields.add("email_event_reminder_24_hrs");
    openapiFields.add("email_post_event_no_show_thank_you");
    openapiFields.add("email_post_event_thank_you");
    openapiFields.add("email_registration_confirmation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences is not found in the empty JSON string", WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences>() {
           @Override
           public void write(JsonWriter out, WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences value) throws IOException {
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
           public WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences
  * @throws IOException if the JSON string is invalid with respect to WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences
  */
  public static WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences.class);
  }

 /**
  * Convert an instance of WebinarEssentialsCreateWebinarRequestEmailSettingsEmailPreferences to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

