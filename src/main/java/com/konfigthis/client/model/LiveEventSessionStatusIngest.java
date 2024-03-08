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
 * The ingest of the video.
 */
@ApiModel(description = "The ingest of the video.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LiveEventSessionStatusIngest {
  /**
   * The protocol used for this session.  Option descriptions:  * &#x60;dash&#x60; - The protocol is DASH.  * &#x60;rtmp&#x60; - The protocol is RTMP.  * &#x60;simple_live&#x60; - The protocol is Simplelive.  * &#x60;studio_cloud&#x60; - The protocol is StudioCloud.  * &#x60;unknown&#x60; - The protocol is unknown or not set.  * &#x60;webrtc&#x60; - The protocol is WebRTC. 
   */
  @JsonAdapter(EncoderTypeEnum.Adapter.class)
 public enum EncoderTypeEnum {
    DASH("dash"),
    
    RTMP("rtmp"),
    
    SIMPLE_LIVE("simple_live"),
    
    STUDIO_CLOUD("studio_cloud"),
    
    UNKNOWN("unknown"),
    
    WEBRTC("webrtc");

    private String value;

    EncoderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncoderTypeEnum fromValue(String value) {
      for (EncoderTypeEnum b : EncoderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncoderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncoderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncoderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncoderTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENCODER_TYPE = "encoder_type";
  @SerializedName(SERIALIZED_NAME_ENCODER_TYPE)
  private EncoderTypeEnum encoderType;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Double endTime;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Double height;

  public static final String SERIALIZED_NAME_IS_RTMP_SESSION = "is_rtmp_session";
  @SerializedName(SERIALIZED_NAME_IS_RTMP_SESSION)
  private Boolean isRtmpSession;

  public static final String SERIALIZED_NAME_IS_SCHEDULED_PLAYBACK = "is_scheduled_playback";
  @SerializedName(SERIALIZED_NAME_IS_SCHEDULED_PLAYBACK)
  private Boolean isScheduledPlayback;

  public static final String SERIALIZED_NAME_RTMP_EXPIRES_AT = "rtmp_expires_at";
  @SerializedName(SERIALIZED_NAME_RTMP_EXPIRES_AT)
  private String rtmpExpiresAt;

  public static final String SERIALIZED_NAME_RTMP_LINK = "rtmp_link";
  @SerializedName(SERIALIZED_NAME_RTMP_LINK)
  private String rtmpLink;

  public static final String SERIALIZED_NAME_RTMPS_LINK = "rtmps_link";
  @SerializedName(SERIALIZED_NAME_RTMPS_LINK)
  private String rtmpsLink;

  public static final String SERIALIZED_NAME_SCHEDULED_START_TIME = "scheduled_start_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_START_TIME)
  private String scheduledStartTime;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Double startTime;

  /**
   * The ingest status of the live video.  Option descriptions:  * &#x60;0&#x60; - There’s a live video, but no RMTP URL or key.  * &#x60;1&#x60; - There’s an RMTP URL and key, but the machine is provisioning.  * &#x60;2&#x60; - There’s an RMTP URL and key, and the machine is provisioned, but the stream hasn’t started yet.  * &#x60;3&#x60; - There’s an RMTP URL and key, and the machine is provisioned, but the stream didn’t start before the machine timed out.  * &#x60;4&#x60; - The stream has started and is currently underway.  * &#x60;5&#x60; - The stream has ended. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    _0("0"),
    
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STREAM_ENDED_REASON = "stream_ended_reason";
  @SerializedName(SERIALIZED_NAME_STREAM_ENDED_REASON)
  private Double streamEndedReason;

  public static final String SERIALIZED_NAME_STREAM_KEY = "stream_key";
  @SerializedName(SERIALIZED_NAME_STREAM_KEY)
  private String streamKey;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Double width;

  public LiveEventSessionStatusIngest() {
  }

  public LiveEventSessionStatusIngest encoderType(EncoderTypeEnum encoderType) {
    
    
    
    
    this.encoderType = encoderType;
    return this;
  }

   /**
   * The protocol used for this session.  Option descriptions:  * &#x60;dash&#x60; - The protocol is DASH.  * &#x60;rtmp&#x60; - The protocol is RTMP.  * &#x60;simple_live&#x60; - The protocol is Simplelive.  * &#x60;studio_cloud&#x60; - The protocol is StudioCloud.  * &#x60;unknown&#x60; - The protocol is unknown or not set.  * &#x60;webrtc&#x60; - The protocol is WebRTC. 
   * @return encoderType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RTMP", required = true, value = "The protocol used for this session.  Option descriptions:  * `dash` - The protocol is DASH.  * `rtmp` - The protocol is RTMP.  * `simple_live` - The protocol is Simplelive.  * `studio_cloud` - The protocol is StudioCloud.  * `unknown` - The protocol is unknown or not set.  * `webrtc` - The protocol is WebRTC. ")

  public EncoderTypeEnum getEncoderType() {
    return encoderType;
  }


  public void setEncoderType(EncoderTypeEnum encoderType) {
    
    
    
    this.encoderType = encoderType;
  }


  public LiveEventSessionStatusIngest endTime(Double endTime) {
    
    
    
    
    this.endTime = endTime;
    return this;
  }

  public LiveEventSessionStatusIngest endTime(Integer endTime) {
    
    
    
    
    this.endTime = endTime.doubleValue();
    return this;
  }

   /**
   * The timestamp in UTC format when the live stream ended.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1612451704", required = true, value = "The timestamp in UTC format when the live stream ended.")

  public Double getEndTime() {
    return endTime;
  }


  public void setEndTime(Double endTime) {
    
    
    
    this.endTime = endTime;
  }


  public LiveEventSessionStatusIngest height(Double height) {
    
    
    
    
    this.height = height;
    return this;
  }

  public LiveEventSessionStatusIngest height(Integer height) {
    
    
    
    
    this.height = height.doubleValue();
    return this;
  }

   /**
   * The height of the live video in pixels.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", required = true, value = "The height of the live video in pixels.")

  public Double getHeight() {
    return height;
  }


  public void setHeight(Double height) {
    
    
    
    this.height = height;
  }


  public LiveEventSessionStatusIngest isRtmpSession(Boolean isRtmpSession) {
    
    
    
    
    this.isRtmpSession = isRtmpSession;
    return this;
  }

   /**
   * Whether the session is using RTMP.
   * @return isRtmpSession
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether the session is using RTMP.")

  public Boolean getIsRtmpSession() {
    return isRtmpSession;
  }


  public void setIsRtmpSession(Boolean isRtmpSession) {
    
    
    
    this.isRtmpSession = isRtmpSession;
  }


  public LiveEventSessionStatusIngest isScheduledPlayback(Boolean isScheduledPlayback) {
    
    
    
    
    this.isScheduledPlayback = isScheduledPlayback;
    return this;
  }

   /**
   * Whether the stream is scheduled media playback.
   * @return isScheduledPlayback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", required = true, value = "Whether the stream is scheduled media playback.")

  public Boolean getIsScheduledPlayback() {
    return isScheduledPlayback;
  }


  public void setIsScheduledPlayback(Boolean isScheduledPlayback) {
    
    
    
    this.isScheduledPlayback = isScheduledPlayback;
  }


  public LiveEventSessionStatusIngest rtmpExpiresAt(String rtmpExpiresAt) {
    
    
    
    
    this.rtmpExpiresAt = rtmpExpiresAt;
    return this;
  }

   /**
   * The time in ISO 8601 format when the RTMP expires.
   * @return rtmpExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-07-30T14:00:00+00:00", required = true, value = "The time in ISO 8601 format when the RTMP expires.")

  public String getRtmpExpiresAt() {
    return rtmpExpiresAt;
  }


  public void setRtmpExpiresAt(String rtmpExpiresAt) {
    
    
    
    this.rtmpExpiresAt = rtmpExpiresAt;
  }


  public LiveEventSessionStatusIngest rtmpLink(String rtmpLink) {
    
    
    
    
    this.rtmpLink = rtmpLink;
    return this;
  }

   /**
   * The upstream RTMP link. Send your live content to this link to create a live video on the event.
   * @return rtmpLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rtmp://rtmp.cloud.vimeo.com/live", required = true, value = "The upstream RTMP link. Send your live content to this link to create a live video on the event.")

  public String getRtmpLink() {
    return rtmpLink;
  }


  public void setRtmpLink(String rtmpLink) {
    
    
    
    this.rtmpLink = rtmpLink;
  }


  public LiveEventSessionStatusIngest rtmpsLink(String rtmpsLink) {
    
    
    
    
    this.rtmpsLink = rtmpsLink;
    return this;
  }

   /**
   * The upstream RTMPS link. Send your live content to this secure link to create a live video on the event.
   * @return rtmpsLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rtmps://rtmp.cloud.vimeo.com/live", required = true, value = "The upstream RTMPS link. Send your live content to this secure link to create a live video on the event.")

  public String getRtmpsLink() {
    return rtmpsLink;
  }


  public void setRtmpsLink(String rtmpsLink) {
    
    
    
    this.rtmpsLink = rtmpsLink;
  }


  public LiveEventSessionStatusIngest scheduledStartTime(String scheduledStartTime) {
    
    
    
    
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

   /**
   * The scheduled start time of the live video in ISO 8601 format.
   * @return scheduledStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-07-30T14:00:00+00:00", required = true, value = "The scheduled start time of the live video in ISO 8601 format.")

  public String getScheduledStartTime() {
    return scheduledStartTime;
  }


  public void setScheduledStartTime(String scheduledStartTime) {
    
    
    
    this.scheduledStartTime = scheduledStartTime;
  }


  public LiveEventSessionStatusIngest sessionId(String sessionId) {
    
    
    
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The session ID.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The session ID.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    
    
    
    this.sessionId = sessionId;
  }


  public LiveEventSessionStatusIngest startTime(Double startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

  public LiveEventSessionStatusIngest startTime(Integer startTime) {
    
    
    
    
    this.startTime = startTime.doubleValue();
    return this;
  }

   /**
   * The timestamp in UTC format when the live video started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1612451704", required = true, value = "The timestamp in UTC format when the live video started.")

  public Double getStartTime() {
    return startTime;
  }


  public void setStartTime(Double startTime) {
    
    
    
    this.startTime = startTime;
  }


  public LiveEventSessionStatusIngest status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The ingest status of the live video.  Option descriptions:  * &#x60;0&#x60; - There’s a live video, but no RMTP URL or key.  * &#x60;1&#x60; - There’s an RMTP URL and key, but the machine is provisioning.  * &#x60;2&#x60; - There’s an RMTP URL and key, and the machine is provisioned, but the stream hasn’t started yet.  * &#x60;3&#x60; - There’s an RMTP URL and key, and the machine is provisioned, but the stream didn’t start before the machine timed out.  * &#x60;4&#x60; - The stream has started and is currently underway.  * &#x60;5&#x60; - The stream has ended. 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_1", required = true, value = "The ingest status of the live video.  Option descriptions:  * `0` - There’s a live video, but no RMTP URL or key.  * `1` - There’s an RMTP URL and key, but the machine is provisioning.  * `2` - There’s an RMTP URL and key, and the machine is provisioned, but the stream hasn’t started yet.  * `3` - There’s an RMTP URL and key, and the machine is provisioned, but the stream didn’t start before the machine timed out.  * `4` - The stream has started and is currently underway.  * `5` - The stream has ended. ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public LiveEventSessionStatusIngest streamEndedReason(Double streamEndedReason) {
    
    
    
    
    this.streamEndedReason = streamEndedReason;
    return this;
  }

  public LiveEventSessionStatusIngest streamEndedReason(Integer streamEndedReason) {
    
    
    
    
    this.streamEndedReason = streamEndedReason.doubleValue();
    return this;
  }

   /**
   * The reason why the stream ended. If the stream hasn&#39;t ended, this field is empty.
   * @return streamEndedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The reason why the stream ended. If the stream hasn't ended, this field is empty.")

  public Double getStreamEndedReason() {
    return streamEndedReason;
  }


  public void setStreamEndedReason(Double streamEndedReason) {
    
    
    
    this.streamEndedReason = streamEndedReason;
  }


  public LiveEventSessionStatusIngest streamKey(String streamKey) {
    
    
    
    
    this.streamKey = streamKey;
    return this;
  }

   /**
   * The stream key used in conjunction with the RTMP and RTMPS links.
   * @return streamKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ab9c8def-7a65-4321-b098-c7dd65e43f21", required = true, value = "The stream key used in conjunction with the RTMP and RTMPS links.")

  public String getStreamKey() {
    return streamKey;
  }


  public void setStreamKey(String streamKey) {
    
    
    
    this.streamKey = streamKey;
  }


  public LiveEventSessionStatusIngest width(Double width) {
    
    
    
    
    this.width = width;
    return this;
  }

  public LiveEventSessionStatusIngest width(Integer width) {
    
    
    
    
    this.width = width.doubleValue();
    return this;
  }

   /**
   * The width of the live video in pixels.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", required = true, value = "The width of the live video in pixels.")

  public Double getWidth() {
    return width;
  }


  public void setWidth(Double width) {
    
    
    
    this.width = width;
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
   * @return the LiveEventSessionStatusIngest instance itself
   */
  public LiveEventSessionStatusIngest putAdditionalProperty(String key, Object value) {
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
    LiveEventSessionStatusIngest liveEventSessionStatusIngest = (LiveEventSessionStatusIngest) o;
    return Objects.equals(this.encoderType, liveEventSessionStatusIngest.encoderType) &&
        Objects.equals(this.endTime, liveEventSessionStatusIngest.endTime) &&
        Objects.equals(this.height, liveEventSessionStatusIngest.height) &&
        Objects.equals(this.isRtmpSession, liveEventSessionStatusIngest.isRtmpSession) &&
        Objects.equals(this.isScheduledPlayback, liveEventSessionStatusIngest.isScheduledPlayback) &&
        Objects.equals(this.rtmpExpiresAt, liveEventSessionStatusIngest.rtmpExpiresAt) &&
        Objects.equals(this.rtmpLink, liveEventSessionStatusIngest.rtmpLink) &&
        Objects.equals(this.rtmpsLink, liveEventSessionStatusIngest.rtmpsLink) &&
        Objects.equals(this.scheduledStartTime, liveEventSessionStatusIngest.scheduledStartTime) &&
        Objects.equals(this.sessionId, liveEventSessionStatusIngest.sessionId) &&
        Objects.equals(this.startTime, liveEventSessionStatusIngest.startTime) &&
        Objects.equals(this.status, liveEventSessionStatusIngest.status) &&
        Objects.equals(this.streamEndedReason, liveEventSessionStatusIngest.streamEndedReason) &&
        Objects.equals(this.streamKey, liveEventSessionStatusIngest.streamKey) &&
        Objects.equals(this.width, liveEventSessionStatusIngest.width)&&
        Objects.equals(this.additionalProperties, liveEventSessionStatusIngest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoderType, endTime, height, isRtmpSession, isScheduledPlayback, rtmpExpiresAt, rtmpLink, rtmpsLink, scheduledStartTime, sessionId, startTime, status, streamEndedReason, streamKey, width, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEventSessionStatusIngest {\n");
    sb.append("    encoderType: ").append(toIndentedString(encoderType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isRtmpSession: ").append(toIndentedString(isRtmpSession)).append("\n");
    sb.append("    isScheduledPlayback: ").append(toIndentedString(isScheduledPlayback)).append("\n");
    sb.append("    rtmpExpiresAt: ").append(toIndentedString(rtmpExpiresAt)).append("\n");
    sb.append("    rtmpLink: ").append(toIndentedString(rtmpLink)).append("\n");
    sb.append("    rtmpsLink: ").append(toIndentedString(rtmpsLink)).append("\n");
    sb.append("    scheduledStartTime: ").append(toIndentedString(scheduledStartTime)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    streamEndedReason: ").append(toIndentedString(streamEndedReason)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("encoder_type");
    openapiFields.add("end_time");
    openapiFields.add("height");
    openapiFields.add("is_rtmp_session");
    openapiFields.add("is_scheduled_playback");
    openapiFields.add("rtmp_expires_at");
    openapiFields.add("rtmp_link");
    openapiFields.add("rtmps_link");
    openapiFields.add("scheduled_start_time");
    openapiFields.add("session_id");
    openapiFields.add("start_time");
    openapiFields.add("status");
    openapiFields.add("stream_ended_reason");
    openapiFields.add("stream_key");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("encoder_type");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("is_rtmp_session");
    openapiRequiredFields.add("is_scheduled_playback");
    openapiRequiredFields.add("rtmp_expires_at");
    openapiRequiredFields.add("rtmp_link");
    openapiRequiredFields.add("rtmps_link");
    openapiRequiredFields.add("scheduled_start_time");
    openapiRequiredFields.add("session_id");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("stream_ended_reason");
    openapiRequiredFields.add("stream_key");
    openapiRequiredFields.add("width");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LiveEventSessionStatusIngest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LiveEventSessionStatusIngest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LiveEventSessionStatusIngest is not found in the empty JSON string", LiveEventSessionStatusIngest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LiveEventSessionStatusIngest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("encoder_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoder_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoder_type").toString()));
      }
      if (!jsonObj.get("rtmp_expires_at").isJsonNull() && !jsonObj.get("rtmp_expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rtmp_expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rtmp_expires_at").toString()));
      }
      if (!jsonObj.get("rtmp_link").isJsonNull() && !jsonObj.get("rtmp_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rtmp_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rtmp_link").toString()));
      }
      if (!jsonObj.get("rtmps_link").isJsonNull() && !jsonObj.get("rtmps_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rtmps_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rtmps_link").toString()));
      }
      if (!jsonObj.get("scheduled_start_time").isJsonNull() && !jsonObj.get("scheduled_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_start_time").toString()));
      }
      if (!jsonObj.get("session_id").isJsonNull() && !jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
      if (!jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("stream_key").isJsonNull() && !jsonObj.get("stream_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LiveEventSessionStatusIngest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LiveEventSessionStatusIngest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LiveEventSessionStatusIngest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LiveEventSessionStatusIngest.class));

       return (TypeAdapter<T>) new TypeAdapter<LiveEventSessionStatusIngest>() {
           @Override
           public void write(JsonWriter out, LiveEventSessionStatusIngest value) throws IOException {
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
           public LiveEventSessionStatusIngest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LiveEventSessionStatusIngest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LiveEventSessionStatusIngest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LiveEventSessionStatusIngest
  * @throws IOException if the JSON string is invalid with respect to LiveEventSessionStatusIngest
  */
  public static LiveEventSessionStatusIngest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LiveEventSessionStatusIngest.class);
  }

 /**
  * Convert an instance of LiveEventSessionStatusIngest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

