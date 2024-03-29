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
import com.konfigthis.client.model.User;
import com.konfigthis.client.model.Video;
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
 * UploadAttempt
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadAttempt {
  public static final String SERIALIZED_NAME_CLIP = "clip";
  @SerializedName(SERIALIZED_NAME_CLIP)
  private Video clip;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private String form;

  public static final String SERIALIZED_NAME_TICKET_ID = "ticket_id";
  @SerializedName(SERIALIZED_NAME_TICKET_ID)
  private String ticketId;

  public static final String SERIALIZED_NAME_UPLOAD_LINK = "upload_link";
  @SerializedName(SERIALIZED_NAME_UPLOAD_LINK)
  private String uploadLink;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public UploadAttempt() {
  }

  public UploadAttempt clip(Video clip) {
    
    
    
    
    this.clip = clip;
    return this;
  }

   /**
   * The video to upload.
   * @return clip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The video to upload.")

  public Video getClip() {
    return clip;
  }


  public void setClip(Video clip) {
    
    
    
    this.clip = clip;
  }


  public UploadAttempt form(String form) {
    
    
    
    
    this.form = form;
    return this;
  }

   /**
   * The HTML upload form.
   * @return form
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTML upload form.")

  public String getForm() {
    return form;
  }


  public void setForm(String form) {
    
    
    
    this.form = form;
  }


  public UploadAttempt ticketId(String ticketId) {
    
    
    
    
    this.ticketId = ticketId;
    return this;
  }

   /**
   * The ticket identifier string for the upload.
   * @return ticketId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3da5dac09", required = true, value = "The ticket identifier string for the upload.")

  public String getTicketId() {
    return ticketId;
  }


  public void setTicketId(String ticketId) {
    
    
    
    this.ticketId = ticketId;
  }


  public UploadAttempt uploadLink(String uploadLink) {
    
    
    
    
    this.uploadLink = uploadLink;
    return this;
  }

   /**
   * The upload URL.
   * @return uploadLink
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://123456.cloud.vimeo.com/upload?ticket_id=1234asdf", required = true, value = "The upload URL.")

  public String getUploadLink() {
    return uploadLink;
  }


  public void setUploadLink(String uploadLink) {
    
    
    
    this.uploadLink = uploadLink;
  }


  public UploadAttempt uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The upload URI.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/users/152184/uploads/12345", required = true, value = "The upload URI.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public UploadAttempt user(User user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * The owner of the uploaded video.
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The owner of the uploaded video.")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    
    
    
    this.user = user;
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
   * @return the UploadAttempt instance itself
   */
  public UploadAttempt putAdditionalProperty(String key, Object value) {
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
    UploadAttempt uploadAttempt = (UploadAttempt) o;
    return Objects.equals(this.clip, uploadAttempt.clip) &&
        Objects.equals(this.form, uploadAttempt.form) &&
        Objects.equals(this.ticketId, uploadAttempt.ticketId) &&
        Objects.equals(this.uploadLink, uploadAttempt.uploadLink) &&
        Objects.equals(this.uri, uploadAttempt.uri) &&
        Objects.equals(this.user, uploadAttempt.user)&&
        Objects.equals(this.additionalProperties, uploadAttempt.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clip, form, ticketId, uploadLink, uri, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAttempt {\n");
    sb.append("    clip: ").append(toIndentedString(clip)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    uploadLink: ").append(toIndentedString(uploadLink)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("clip");
    openapiFields.add("form");
    openapiFields.add("ticket_id");
    openapiFields.add("upload_link");
    openapiFields.add("uri");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ticket_id");
    openapiRequiredFields.add("upload_link");
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadAttempt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadAttempt.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadAttempt is not found in the empty JSON string", UploadAttempt.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadAttempt.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `clip`
      if (jsonObj.get("clip") != null && !jsonObj.get("clip").isJsonNull()) {
        Video.validateJsonObject(jsonObj.getAsJsonObject("clip"));
      }
      if ((jsonObj.get("form") != null && !jsonObj.get("form").isJsonNull()) && !jsonObj.get("form").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `form` to be a primitive type in the JSON string but got `%s`", jsonObj.get("form").toString()));
      }
      if (!jsonObj.get("ticket_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_id").toString()));
      }
      if (!jsonObj.get("upload_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_link").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      // validate the required field `user`
      User.validateJsonObject(jsonObj.getAsJsonObject("user"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadAttempt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadAttempt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadAttempt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadAttempt.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadAttempt>() {
           @Override
           public void write(JsonWriter out, UploadAttempt value) throws IOException {
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
           public UploadAttempt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UploadAttempt instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UploadAttempt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadAttempt
  * @throws IOException if the JSON string is invalid with respect to UploadAttempt
  */
  public static UploadAttempt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadAttempt.class);
  }

 /**
  * Convert an instance of UploadAttempt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

