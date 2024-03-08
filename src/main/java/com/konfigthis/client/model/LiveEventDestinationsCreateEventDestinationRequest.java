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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * LiveEventDestinationsCreateEventDestinationRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LiveEventDestinationsCreateEventDestinationRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  /**
   * The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * &#x60;CONNECTIONS&#x60; - The privacy setting is &#x60;CONNECTIONS&#x60; for LinkedIn.  * &#x60;PUBLIC&#x60; - The privacy setting is &#x60;PUBLIC&#x60; for LinkedIn.  * &#x60;all_friends&#x60; - The privacy setting is &#x60;all_friends&#x60; for Facebook.  * &#x60;everyone&#x60; - The privacy setting is &#x60;everyone&#x60; for Facebook.  * &#x60;private&#x60; - The privacy setting is &#x60;private&#x60; for YouTube.  * &#x60;public&#x60; - The privacy setting is &#x60;public&#x60; for YouTube.  * &#x60;self&#x60; - The privacy setting is &#x60;self&#x60; for Facebook.  * &#x60;unlisted&#x60; - The privacy setting is &#x60;unlisted&#x60; for YouTube. 
   */
  @JsonAdapter(PrivacyEnum.Adapter.class)
 public enum PrivacyEnum {
    CONNECTIONS("CONNECTIONS"),
    
    PUBLIC("PUBLIC"),
    
    ALL_FRIENDS("all_friends"),
    
    EVERYONE("everyone"),
    
    PRIVATE("private"),
    
    PUBLIC("public"),
    
    SELF("self"),
    
    UNLISTED("unlisted");

    private String value;

    PrivacyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivacyEnum fromValue(String value) {
      for (PrivacyEnum b : PrivacyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PrivacyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivacyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivacyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PrivacyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private PrivacyEnum privacy;

  public static final String SERIALIZED_NAME_PROVIDER_DESTINATION_ID = "provider_destination_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_DESTINATION_ID)
  private String providerDestinationId;

  public static final String SERIALIZED_NAME_PROVIDER_VIDEO_ID = "provider_video_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_VIDEO_ID)
  private String providerVideoId;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduled_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private Double scheduledAt;

  /**
   * The service to simulcast to.  Option descriptions:  * &#x60;custom_rtmp&#x60; - Simulcast to a custom service.  * &#x60;facebook&#x60; - Simulcast to Facebook Live.  * &#x60;linkedin&#x60; - Simulcast to LinkedIn Live.  * &#x60;youtube&#x60; - Simulcast to YouTube Live. 
   */
  @JsonAdapter(ServiceNameEnum.Adapter.class)
 public enum ServiceNameEnum {
    CUSTOM_RTMP("custom_rtmp"),
    
    FACEBOOK("facebook"),
    
    LINKEDIN("linkedin"),
    
    YOUTUBE("youtube");

    private String value;

    ServiceNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceNameEnum fromValue(String value) {
      for (ServiceNameEnum b : ServiceNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServiceNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private ServiceNameEnum serviceName;

  public static final String SERIALIZED_NAME_STREAM_KEY = "stream_key";
  @SerializedName(SERIALIZED_NAME_STREAM_KEY)
  private String streamKey;

  public static final String SERIALIZED_NAME_STREAM_URL = "stream_url";
  @SerializedName(SERIALIZED_NAME_STREAM_URL)
  private String streamUrl;

  /**
   * The type of the simulcast destination.  Option descriptions:  * &#x60;channel&#x60; - The destination is a YouTube channel.  * &#x60;custom&#x60; - The destination is custom.  * &#x60;organization&#x60; - The destination is a LinkedIn organization.  * &#x60;page&#x60; - The destination is a Facebook page.  * &#x60;profile&#x60; - The destination is a Facebook or LinkedIn profile. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CHANNEL("channel"),
    
    CUSTOM("custom"),
    
    ORGANIZATION("organization"),
    
    PAGE("page"),
    
    PROFILE("profile");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public LiveEventDestinationsCreateEventDestinationRequest() {
  }

  public LiveEventDestinationsCreateEventDestinationRequest displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The title to display for the simulcast.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My channel", required = true, value = "The title to display for the simulcast.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public LiveEventDestinationsCreateEventDestinationRequest isEnabled(Boolean isEnabled) {
    
    
    
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether the destination is enabled for simulcasting.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the destination is enabled for simulcasting.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    
    
    
    this.isEnabled = isEnabled;
  }


  public LiveEventDestinationsCreateEventDestinationRequest privacy(PrivacyEnum privacy) {
    
    
    
    
    this.privacy = privacy;
    return this;
  }

   /**
   * The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * &#x60;CONNECTIONS&#x60; - The privacy setting is &#x60;CONNECTIONS&#x60; for LinkedIn.  * &#x60;PUBLIC&#x60; - The privacy setting is &#x60;PUBLIC&#x60; for LinkedIn.  * &#x60;all_friends&#x60; - The privacy setting is &#x60;all_friends&#x60; for Facebook.  * &#x60;everyone&#x60; - The privacy setting is &#x60;everyone&#x60; for Facebook.  * &#x60;private&#x60; - The privacy setting is &#x60;private&#x60; for YouTube.  * &#x60;public&#x60; - The privacy setting is &#x60;public&#x60; for YouTube.  * &#x60;self&#x60; - The privacy setting is &#x60;self&#x60; for Facebook.  * &#x60;unlisted&#x60; - The privacy setting is &#x60;unlisted&#x60; for YouTube. 
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLIC", value = "The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * `CONNECTIONS` - The privacy setting is `CONNECTIONS` for LinkedIn.  * `PUBLIC` - The privacy setting is `PUBLIC` for LinkedIn.  * `all_friends` - The privacy setting is `all_friends` for Facebook.  * `everyone` - The privacy setting is `everyone` for Facebook.  * `private` - The privacy setting is `private` for YouTube.  * `public` - The privacy setting is `public` for YouTube.  * `self` - The privacy setting is `self` for Facebook.  * `unlisted` - The privacy setting is `unlisted` for YouTube. ")

  public PrivacyEnum getPrivacy() {
    return privacy;
  }


  public void setPrivacy(PrivacyEnum privacy) {
    
    
    
    this.privacy = privacy;
  }


  public LiveEventDestinationsCreateEventDestinationRequest providerDestinationId(String providerDestinationId) {
    
    
    
    
    this.providerDestinationId = providerDestinationId;
    return this;
  }

   /**
   * The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.
   * @return providerDestinationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bda55c6b3ba4", value = "The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.")

  public String getProviderDestinationId() {
    return providerDestinationId;
  }


  public void setProviderDestinationId(String providerDestinationId) {
    
    
    
    this.providerDestinationId = providerDestinationId;
  }


  public LiveEventDestinationsCreateEventDestinationRequest providerVideoId(String providerVideoId) {
    
    
    
    
    this.providerVideoId = providerVideoId;
    return this;
  }

   /**
   * The ID of the scheduled video.
   * @return providerVideoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6817807391346708000", value = "The ID of the scheduled video.")

  public String getProviderVideoId() {
    return providerVideoId;
  }


  public void setProviderVideoId(String providerVideoId) {
    
    
    
    this.providerVideoId = providerVideoId;
  }


  public LiveEventDestinationsCreateEventDestinationRequest scheduledAt(Double scheduledAt) {
    
    
    
    
    this.scheduledAt = scheduledAt;
    return this;
  }

  public LiveEventDestinationsCreateEventDestinationRequest scheduledAt(Integer scheduledAt) {
    
    
    
    
    this.scheduledAt = scheduledAt.doubleValue();
    return this;
  }

   /**
   * The time in Unix timestamp format when live streaming is scheduled to start.
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1625754461", value = "The time in Unix timestamp format when live streaming is scheduled to start.")

  public Double getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(Double scheduledAt) {
    
    
    
    this.scheduledAt = scheduledAt;
  }


  public LiveEventDestinationsCreateEventDestinationRequest serviceName(ServiceNameEnum serviceName) {
    
    
    
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * The service to simulcast to.  Option descriptions:  * &#x60;custom_rtmp&#x60; - Simulcast to a custom service.  * &#x60;facebook&#x60; - Simulcast to Facebook Live.  * &#x60;linkedin&#x60; - Simulcast to LinkedIn Live.  * &#x60;youtube&#x60; - Simulcast to YouTube Live. 
   * @return serviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "YOUTUBE", required = true, value = "The service to simulcast to.  Option descriptions:  * `custom_rtmp` - Simulcast to a custom service.  * `facebook` - Simulcast to Facebook Live.  * `linkedin` - Simulcast to LinkedIn Live.  * `youtube` - Simulcast to YouTube Live. ")

  public ServiceNameEnum getServiceName() {
    return serviceName;
  }


  public void setServiceName(ServiceNameEnum serviceName) {
    
    
    
    this.serviceName = serviceName;
  }


  public LiveEventDestinationsCreateEventDestinationRequest streamKey(String streamKey) {
    
    
    
    
    this.streamKey = streamKey;
    return this;
  }

   /**
   * The RTMP stream key.
   * @return streamKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da056692-ba63-4749-a6eb-a476a22b3acd", value = "The RTMP stream key.")

  public String getStreamKey() {
    return streamKey;
  }


  public void setStreamKey(String streamKey) {
    
    
    
    this.streamKey = streamKey;
  }


  public LiveEventDestinationsCreateEventDestinationRequest streamUrl(String streamUrl) {
    
    
    
    
    this.streamUrl = streamUrl;
    return this;
  }

   /**
   * The RTMP URL for receiving the video stream.
   * @return streamUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rtmp://mycooldomain.com/live", value = "The RTMP URL for receiving the video stream.")

  public String getStreamUrl() {
    return streamUrl;
  }


  public void setStreamUrl(String streamUrl) {
    
    
    
    this.streamUrl = streamUrl;
  }


  public LiveEventDestinationsCreateEventDestinationRequest type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of the simulcast destination.  Option descriptions:  * &#x60;channel&#x60; - The destination is a YouTube channel.  * &#x60;custom&#x60; - The destination is custom.  * &#x60;organization&#x60; - The destination is a LinkedIn organization.  * &#x60;page&#x60; - The destination is a Facebook page.  * &#x60;profile&#x60; - The destination is a Facebook or LinkedIn profile. 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CHANNEL", required = true, value = "The type of the simulcast destination.  Option descriptions:  * `channel` - The destination is a YouTube channel.  * `custom` - The destination is custom.  * `organization` - The destination is a LinkedIn organization.  * `page` - The destination is a Facebook page.  * `profile` - The destination is a Facebook or LinkedIn profile. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the LiveEventDestinationsCreateEventDestinationRequest instance itself
   */
  public LiveEventDestinationsCreateEventDestinationRequest putAdditionalProperty(String key, Object value) {
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
    LiveEventDestinationsCreateEventDestinationRequest liveEventDestinationsCreateEventDestinationRequest = (LiveEventDestinationsCreateEventDestinationRequest) o;
    return Objects.equals(this.displayName, liveEventDestinationsCreateEventDestinationRequest.displayName) &&
        Objects.equals(this.isEnabled, liveEventDestinationsCreateEventDestinationRequest.isEnabled) &&
        Objects.equals(this.privacy, liveEventDestinationsCreateEventDestinationRequest.privacy) &&
        Objects.equals(this.providerDestinationId, liveEventDestinationsCreateEventDestinationRequest.providerDestinationId) &&
        Objects.equals(this.providerVideoId, liveEventDestinationsCreateEventDestinationRequest.providerVideoId) &&
        Objects.equals(this.scheduledAt, liveEventDestinationsCreateEventDestinationRequest.scheduledAt) &&
        Objects.equals(this.serviceName, liveEventDestinationsCreateEventDestinationRequest.serviceName) &&
        Objects.equals(this.streamKey, liveEventDestinationsCreateEventDestinationRequest.streamKey) &&
        Objects.equals(this.streamUrl, liveEventDestinationsCreateEventDestinationRequest.streamUrl) &&
        Objects.equals(this.type, liveEventDestinationsCreateEventDestinationRequest.type)&&
        Objects.equals(this.additionalProperties, liveEventDestinationsCreateEventDestinationRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, isEnabled, privacy, providerDestinationId, providerVideoId, scheduledAt, serviceName, streamKey, streamUrl, type, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEventDestinationsCreateEventDestinationRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    providerDestinationId: ").append(toIndentedString(providerDestinationId)).append("\n");
    sb.append("    providerVideoId: ").append(toIndentedString(providerVideoId)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    streamUrl: ").append(toIndentedString(streamUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("display_name");
    openapiFields.add("is_enabled");
    openapiFields.add("privacy");
    openapiFields.add("provider_destination_id");
    openapiFields.add("provider_video_id");
    openapiFields.add("scheduled_at");
    openapiFields.add("service_name");
    openapiFields.add("stream_key");
    openapiFields.add("stream_url");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("display_name");
    openapiRequiredFields.add("service_name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveEventDestinationsCreateEventDestinationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveEventDestinationsCreateEventDestinationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveEventDestinationsCreateEventDestinationRequest is not found in the empty JSON string", LiveEventDestinationsCreateEventDestinationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LiveEventDestinationsCreateEventDestinationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) && !jsonObj.get("privacy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy").toString()));
      }
      if ((jsonObj.get("provider_destination_id") != null && !jsonObj.get("provider_destination_id").isJsonNull()) && !jsonObj.get("provider_destination_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_destination_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_destination_id").toString()));
      }
      if (!jsonObj.get("provider_video_id").isJsonNull() && (jsonObj.get("provider_video_id") != null && !jsonObj.get("provider_video_id").isJsonNull()) && !jsonObj.get("provider_video_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_video_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_video_id").toString()));
      }
      if (!jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
      if ((jsonObj.get("stream_key") != null && !jsonObj.get("stream_key").isJsonNull()) && !jsonObj.get("stream_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_key").toString()));
      }
      if ((jsonObj.get("stream_url") != null && !jsonObj.get("stream_url").isJsonNull()) && !jsonObj.get("stream_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_url").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveEventDestinationsCreateEventDestinationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveEventDestinationsCreateEventDestinationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveEventDestinationsCreateEventDestinationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveEventDestinationsCreateEventDestinationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveEventDestinationsCreateEventDestinationRequest>() {
           @Override
           public void write(JsonWriter out, LiveEventDestinationsCreateEventDestinationRequest value) throws IOException {
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
           public LiveEventDestinationsCreateEventDestinationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LiveEventDestinationsCreateEventDestinationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LiveEventDestinationsCreateEventDestinationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveEventDestinationsCreateEventDestinationRequest
  * @throws IOException if the JSON string is invalid with respect to LiveEventDestinationsCreateEventDestinationRequest
  */
  public static LiveEventDestinationsCreateEventDestinationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveEventDestinationsCreateEventDestinationRequest.class);
  }

 /**
  * Convert an instance of LiveEventDestinationsCreateEventDestinationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

