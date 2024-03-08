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
 * UploadVideoRequestPrivacy
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UploadVideoRequestPrivacy {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private Boolean add;

  /**
   * The privacy level required to comment on the video.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment on the video.  * &#x60;contacts&#x60; - Only the video owner&#39;s contacts can comment on the video.  * &#x60;nobody&#x60; - No one can comment on the video. 
   */
  @JsonAdapter(CommentsEnum.Adapter.class)
 public enum CommentsEnum {
    ANYBODY("anybody"),
    
    CONTACTS("contacts"),
    
    NOBODY("nobody");

    private String value;

    CommentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommentsEnum fromValue(String value) {
      for (CommentsEnum b : CommentsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CommentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommentsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CommentsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private CommentsEnum comments;

  public static final String SERIALIZED_NAME_DOWNLOAD = "download";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD)
  private Boolean download;

  /**
   * The video&#39;s embed setting. Specify the &#x60;whitelist&#x60; value to restrict embedding to a specific set of domains. For more information, see our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide.  Option descriptions:  * &#x60;private&#x60; - The video can&#39;t be embedded.  * &#x60;public&#x60; - The video can be embedded.  * &#x60;whitelist&#x60; - The video can be embedded on the specified domains only. 
   */
  @JsonAdapter(EmbedEnum.Adapter.class)
 public enum EmbedEnum {
    PRIVATE("private"),
    
    PUBLIC("public"),
    
    WHITELIST("whitelist");

    private String value;

    EmbedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmbedEnum fromValue(String value) {
      for (EmbedEnum b : EmbedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmbedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmbedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmbedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmbedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMBED = "embed";
  @SerializedName(SERIALIZED_NAME_EMBED)
  private EmbedEnum embed;

  /**
   * The video&#39;s privacy setting. When this value is &#x60;users&#x60;, &#x60;application/json&#x60; is the only valid content type. Also, some privacy settings are unavailable to Vimeo Free members; for more information, see our [Help Center](https://vimeo.zendesk.com/hc/en-us/articles/224817847).  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the video. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only those who follow the owner on Vimeo can access the video. _This field is deprecated._  * &#x60;disable&#x60; - The video is embeddable, but it&#39;s hidden on Vimeo and can&#39;t be played. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end. _This field is deprecated._  * &#x60;nobody&#x60; - No one except the owner can access the video. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the video.  * &#x60;unlisted&#x60; - Only those with the private link can access the video.  * &#x60;users&#x60; - Only Vimeo members can access the video. _This field is deprecated._ 
   */
  @JsonAdapter(ViewEnum.Adapter.class)
 public enum ViewEnum {
    ANYBODY("anybody"),
    
    CONTACTS("contacts"),
    
    DISABLE("disable"),
    
    NOBODY("nobody"),
    
    PASSWORD("password"),
    
    UNLISTED("unlisted"),
    
    USERS("users");

    private String value;

    ViewEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewEnum fromValue(String value) {
      for (ViewEnum b : ViewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private ViewEnum view;

  public UploadVideoRequestPrivacy() {
  }

  public UploadVideoRequestPrivacy add(Boolean add) {
    
    
    
    
    this.add = add;
    return this;
  }

   /**
   * Whether a user can add the video to a showcase, channel, or group.
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a user can add the video to a showcase, channel, or group.")

  public Boolean getAdd() {
    return add;
  }


  public void setAdd(Boolean add) {
    
    
    
    this.add = add;
  }


  public UploadVideoRequestPrivacy comments(CommentsEnum comments) {
    
    
    
    
    this.comments = comments;
    return this;
  }

   /**
   * The privacy level required to comment on the video.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment on the video.  * &#x60;contacts&#x60; - Only the video owner&#39;s contacts can comment on the video.  * &#x60;nobody&#x60; - No one can comment on the video. 
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The privacy level required to comment on the video.  Option descriptions:  * `anybody` - Anyone can comment on the video.  * `contacts` - Only the video owner's contacts can comment on the video.  * `nobody` - No one can comment on the video. ")

  public CommentsEnum getComments() {
    return comments;
  }


  public void setComments(CommentsEnum comments) {
    
    
    
    this.comments = comments;
  }


  public UploadVideoRequestPrivacy download(Boolean download) {
    
    
    
    
    this.download = download;
    return this;
  }

   /**
   * Whether a user can download the video. This field isn&#39;t available to Vimeo Free members.
   * @return download
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a user can download the video. This field isn't available to Vimeo Free members.")

  public Boolean getDownload() {
    return download;
  }


  public void setDownload(Boolean download) {
    
    
    
    this.download = download;
  }


  public UploadVideoRequestPrivacy embed(EmbedEnum embed) {
    
    
    
    
    this.embed = embed;
    return this;
  }

   /**
   * The video&#39;s embed setting. Specify the &#x60;whitelist&#x60; value to restrict embedding to a specific set of domains. For more information, see our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide.  Option descriptions:  * &#x60;private&#x60; - The video can&#39;t be embedded.  * &#x60;public&#x60; - The video can be embedded.  * &#x60;whitelist&#x60; - The video can be embedded on the specified domains only. 
   * @return embed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The video's embed setting. Specify the `whitelist` value to restrict embedding to a specific set of domains. For more information, see our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide.  Option descriptions:  * `private` - The video can't be embedded.  * `public` - The video can be embedded.  * `whitelist` - The video can be embedded on the specified domains only. ")

  public EmbedEnum getEmbed() {
    return embed;
  }


  public void setEmbed(EmbedEnum embed) {
    
    
    
    this.embed = embed;
  }


  public UploadVideoRequestPrivacy view(ViewEnum view) {
    
    
    
    
    this.view = view;
    return this;
  }

   /**
   * The video&#39;s privacy setting. When this value is &#x60;users&#x60;, &#x60;application/json&#x60; is the only valid content type. Also, some privacy settings are unavailable to Vimeo Free members; for more information, see our [Help Center](https://vimeo.zendesk.com/hc/en-us/articles/224817847).  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the video. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only those who follow the owner on Vimeo can access the video. _This field is deprecated._  * &#x60;disable&#x60; - The video is embeddable, but it&#39;s hidden on Vimeo and can&#39;t be played. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end. _This field is deprecated._  * &#x60;nobody&#x60; - No one except the owner can access the video. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the video.  * &#x60;unlisted&#x60; - Only those with the private link can access the video.  * &#x60;users&#x60; - Only Vimeo members can access the video. _This field is deprecated._ 
   * @return view
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The video's privacy setting. When this value is `users`, `application/json` is the only valid content type. Also, some privacy settings are unavailable to Vimeo Free members; for more information, see our [Help Center](https://vimeo.zendesk.com/hc/en-us/articles/224817847).  Option descriptions:  * `anybody` - Anyone can access the video. This privacy setting appears as `Public` on the Vimeo front end.  * `contacts` - Only those who follow the owner on Vimeo can access the video. _This field is deprecated._  * `disable` - The video is embeddable, but it's hidden on Vimeo and can't be played. This privacy setting appears as `Hide from Vimeo` on the Vimeo front end. _This field is deprecated._  * `nobody` - No one except the owner can access the video. This privacy setting appears as `Private` on the Vimeo front end.  * `password` - Only those with the password can access the video.  * `unlisted` - Only those with the private link can access the video.  * `users` - Only Vimeo members can access the video. _This field is deprecated._ ")

  public ViewEnum getView() {
    return view;
  }


  public void setView(ViewEnum view) {
    
    
    
    this.view = view;
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
   * @return the UploadVideoRequestPrivacy instance itself
   */
  public UploadVideoRequestPrivacy putAdditionalProperty(String key, Object value) {
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
    UploadVideoRequestPrivacy uploadVideoRequestPrivacy = (UploadVideoRequestPrivacy) o;
    return Objects.equals(this.add, uploadVideoRequestPrivacy.add) &&
        Objects.equals(this.comments, uploadVideoRequestPrivacy.comments) &&
        Objects.equals(this.download, uploadVideoRequestPrivacy.download) &&
        Objects.equals(this.embed, uploadVideoRequestPrivacy.embed) &&
        Objects.equals(this.view, uploadVideoRequestPrivacy.view)&&
        Objects.equals(this.additionalProperties, uploadVideoRequestPrivacy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, comments, download, embed, view, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadVideoRequestPrivacy {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("comments");
    openapiFields.add("download");
    openapiFields.add("embed");
    openapiFields.add("view");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UploadVideoRequestPrivacy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UploadVideoRequestPrivacy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadVideoRequestPrivacy is not found in the empty JSON string", UploadVideoRequestPrivacy.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if ((jsonObj.get("embed") != null && !jsonObj.get("embed").isJsonNull()) && !jsonObj.get("embed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embed").toString()));
      }
      if ((jsonObj.get("view") != null && !jsonObj.get("view").isJsonNull()) && !jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadVideoRequestPrivacy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadVideoRequestPrivacy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadVideoRequestPrivacy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadVideoRequestPrivacy.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadVideoRequestPrivacy>() {
           @Override
           public void write(JsonWriter out, UploadVideoRequestPrivacy value) throws IOException {
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
           public UploadVideoRequestPrivacy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UploadVideoRequestPrivacy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UploadVideoRequestPrivacy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadVideoRequestPrivacy
  * @throws IOException if the JSON string is invalid with respect to UploadVideoRequestPrivacy
  */
  public static UploadVideoRequestPrivacy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadVideoRequestPrivacy.class);
  }

 /**
  * Convert an instance of UploadVideoRequestPrivacy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
