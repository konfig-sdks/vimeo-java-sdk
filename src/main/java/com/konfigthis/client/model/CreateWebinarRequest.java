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
import com.konfigthis.client.model.CreateWebinarRequestEmailSettings;
import com.konfigthis.client.model.CreateWebinarRequestPrivacy;
import com.konfigthis.client.model.CreateWebinarRequestSchedule;
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
 * CreateWebinarRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateWebinarRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMAIL_SETTINGS = "email_settings";
  @SerializedName(SERIALIZED_NAME_EMAIL_SETTINGS)
  private CreateWebinarRequestEmailSettings emailSettings;

  public static final String SERIALIZED_NAME_FOLDER_URI = "folder_uri";
  @SerializedName(SERIALIZED_NAME_FOLDER_URI)
  private Double folderUri;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private CreateWebinarRequestPrivacy privacy;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private CreateWebinarRequestSchedule schedule;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public CreateWebinarRequest() {
  }

  public CreateWebinarRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of the webinar.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Interviews Daily", required = true, value = "The title of the webinar.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public CreateWebinarRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the webinar.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "In this episode, we interview a surprise guest", value = "The description of the webinar.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CreateWebinarRequest emailSettings(CreateWebinarRequestEmailSettings emailSettings) {
    
    
    
    
    this.emailSettings = emailSettings;
    return this;
  }

   /**
   * Get emailSettings
   * @return emailSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateWebinarRequestEmailSettings getEmailSettings() {
    return emailSettings;
  }


  public void setEmailSettings(CreateWebinarRequestEmailSettings emailSettings) {
    
    
    
    this.emailSettings = emailSettings;
  }


  public CreateWebinarRequest folderUri(Double folderUri) {
    
    
    
    
    this.folderUri = folderUri;
    return this;
  }

  public CreateWebinarRequest folderUri(Integer folderUri) {
    
    
    
    
    this.folderUri = folderUri.doubleValue();
    return this;
  }

   /**
   * The URI of the webinar&#39;s folder.
   * @return folderUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The URI of the webinar's folder.")

  public Double getFolderUri() {
    return folderUri;
  }


  public void setFolderUri(Double folderUri) {
    
    
    
    this.folderUri = folderUri;
  }


  public CreateWebinarRequest password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The password when **privacy.view** is &#x60;password&#x60;. Anyone with the password can view the videos generated by streaming to the webinar event.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gogo", value = "The password when **privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the webinar event.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public CreateWebinarRequest privacy(CreateWebinarRequestPrivacy privacy) {
    
    
    
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateWebinarRequestPrivacy getPrivacy() {
    return privacy;
  }


  public void setPrivacy(CreateWebinarRequestPrivacy privacy) {
    
    
    
    this.privacy = privacy;
  }


  public CreateWebinarRequest schedule(CreateWebinarRequestSchedule schedule) {
    
    
    
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateWebinarRequestSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(CreateWebinarRequestSchedule schedule) {
    
    
    
    this.schedule = schedule;
  }


  public CreateWebinarRequest timeZone(String timeZone) {
    
    
    
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/New_York", value = "The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar.")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    
    
    
    this.timeZone = timeZone;
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
   * @return the CreateWebinarRequest instance itself
   */
  public CreateWebinarRequest putAdditionalProperty(String key, Object value) {
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
    CreateWebinarRequest createWebinarRequest = (CreateWebinarRequest) o;
    return Objects.equals(this.title, createWebinarRequest.title) &&
        Objects.equals(this.description, createWebinarRequest.description) &&
        Objects.equals(this.emailSettings, createWebinarRequest.emailSettings) &&
        Objects.equals(this.folderUri, createWebinarRequest.folderUri) &&
        Objects.equals(this.password, createWebinarRequest.password) &&
        Objects.equals(this.privacy, createWebinarRequest.privacy) &&
        Objects.equals(this.schedule, createWebinarRequest.schedule) &&
        Objects.equals(this.timeZone, createWebinarRequest.timeZone)&&
        Objects.equals(this.additionalProperties, createWebinarRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, emailSettings, folderUri, password, privacy, schedule, timeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebinarRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("email_settings");
    openapiFields.add("folder_uri");
    openapiFields.add("password");
    openapiFields.add("privacy");
    openapiFields.add("schedule");
    openapiFields.add("time_zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateWebinarRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateWebinarRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWebinarRequest is not found in the empty JSON string", CreateWebinarRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateWebinarRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `email_settings`
      if (jsonObj.get("email_settings") != null && !jsonObj.get("email_settings").isJsonNull()) {
        CreateWebinarRequestEmailSettings.validateJsonObject(jsonObj.getAsJsonObject("email_settings"));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // validate the optional field `privacy`
      if (jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) {
        CreateWebinarRequestPrivacy.validateJsonObject(jsonObj.getAsJsonObject("privacy"));
      }
      // validate the optional field `schedule`
      if (jsonObj.get("schedule") != null && !jsonObj.get("schedule").isJsonNull()) {
        CreateWebinarRequestSchedule.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
      }
      if ((jsonObj.get("time_zone") != null && !jsonObj.get("time_zone").isJsonNull()) && !jsonObj.get("time_zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWebinarRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWebinarRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWebinarRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWebinarRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWebinarRequest>() {
           @Override
           public void write(JsonWriter out, CreateWebinarRequest value) throws IOException {
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
           public CreateWebinarRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateWebinarRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateWebinarRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateWebinarRequest
  * @throws IOException if the JSON string is invalid with respect to CreateWebinarRequest
  */
  public static CreateWebinarRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWebinarRequest.class);
  }

 /**
  * Convert an instance of CreateWebinarRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

