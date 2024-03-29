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
 * UsersEssentialsEditVimeoAccountRequestVideosPrivacy
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersEssentialsEditVimeoAccountRequestVideosPrivacy {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private Boolean add;

  /**
   * Who can comment on the user&#39;s video uploads by default.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment.  * &#x60;contacts&#x60; - Only the user&#39;s contacts can comment.  * &#x60;nobody&#x60; - No one can comment. 
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
   * The privacy for the user&#39;s embedded videos. The whitelist value enables you to define all valid embeddable domains. See our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide for details on adding and removing domains.  Option descriptions:  * &#x60;private&#x60; - The videos can&#39;t be embedded on any domain.  * &#x60;public&#x60; - The videos can be embedded on any domain.  * &#x60;whitelist&#x60; - The videos can be embedded on the specified domains only. 
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
   * Who can access the user&#39;s videos by default.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the videos. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only the user&#39;s contacts can access the videos. _This field is deprecated._  * &#x60;disable&#x60; - The videos are disabled. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end.  * &#x60;nobody&#x60; - No one can access the videos. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the videos.  * &#x60;unlisted&#x60; - The videos are unlisted.  * &#x60;users&#x60; - Only other Vimeo members can access the videos. _This field is deprecated._ 
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

  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy() {
  }

  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy add(Boolean add) {
    
    
    
    
    this.add = add;
    return this;
  }

   /**
   * Whether the user can add videos to showcases, channels, or groups by default.
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the user can add videos to showcases, channels, or groups by default.")

  public Boolean getAdd() {
    return add;
  }


  public void setAdd(Boolean add) {
    
    
    
    this.add = add;
  }


  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy comments(CommentsEnum comments) {
    
    
    
    
    this.comments = comments;
    return this;
  }

   /**
   * Who can comment on the user&#39;s video uploads by default.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can comment.  * &#x60;contacts&#x60; - Only the user&#39;s contacts can comment.  * &#x60;nobody&#x60; - No one can comment. 
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who can comment on the user's video uploads by default.  Option descriptions:  * `anybody` - Anyone can comment.  * `contacts` - Only the user's contacts can comment.  * `nobody` - No one can comment. ")

  public CommentsEnum getComments() {
    return comments;
  }


  public void setComments(CommentsEnum comments) {
    
    
    
    this.comments = comments;
  }


  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy download(Boolean download) {
    
    
    
    
    this.download = download;
    return this;
  }

   /**
   * Whether the user can download videos. This value becomes the default download setting for all future videos that the user uploads.
   * @return download
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the user can download videos. This value becomes the default download setting for all future videos that the user uploads.")

  public Boolean getDownload() {
    return download;
  }


  public void setDownload(Boolean download) {
    
    
    
    this.download = download;
  }


  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy embed(EmbedEnum embed) {
    
    
    
    
    this.embed = embed;
    return this;
  }

   /**
   * The privacy for the user&#39;s embedded videos. The whitelist value enables you to define all valid embeddable domains. See our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide for details on adding and removing domains.  Option descriptions:  * &#x60;private&#x60; - The videos can&#39;t be embedded on any domain.  * &#x60;public&#x60; - The videos can be embedded on any domain.  * &#x60;whitelist&#x60; - The videos can be embedded on the specified domains only. 
   * @return embed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The privacy for the user's embedded videos. The whitelist value enables you to define all valid embeddable domains. See our [Interacting with Videos](https://developer.vimeo.com/api/guides/videos/interact#set-off-site-privacy) guide for details on adding and removing domains.  Option descriptions:  * `private` - The videos can't be embedded on any domain.  * `public` - The videos can be embedded on any domain.  * `whitelist` - The videos can be embedded on the specified domains only. ")

  public EmbedEnum getEmbed() {
    return embed;
  }


  public void setEmbed(EmbedEnum embed) {
    
    
    
    this.embed = embed;
  }


  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy view(ViewEnum view) {
    
    
    
    
    this.view = view;
    return this;
  }

   /**
   * Who can access the user&#39;s videos by default.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the videos. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;contacts&#x60; - Only the user&#39;s contacts can access the videos. _This field is deprecated._  * &#x60;disable&#x60; - The videos are disabled. This privacy setting appears as &#x60;Hide from Vimeo&#x60; on the Vimeo front end.  * &#x60;nobody&#x60; - No one can access the videos. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the videos.  * &#x60;unlisted&#x60; - The videos are unlisted.  * &#x60;users&#x60; - Only other Vimeo members can access the videos. _This field is deprecated._ 
   * @return view
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who can access the user's videos by default.  Option descriptions:  * `anybody` - Anyone can access the videos. This privacy setting appears as `Public` on the Vimeo front end.  * `contacts` - Only the user's contacts can access the videos. _This field is deprecated._  * `disable` - The videos are disabled. This privacy setting appears as `Hide from Vimeo` on the Vimeo front end.  * `nobody` - No one can access the videos. This privacy setting appears as `Private` on the Vimeo front end.  * `password` - Only those with the password can access the videos.  * `unlisted` - The videos are unlisted.  * `users` - Only other Vimeo members can access the videos. _This field is deprecated._ ")

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
   * @return the UsersEssentialsEditVimeoAccountRequestVideosPrivacy instance itself
   */
  public UsersEssentialsEditVimeoAccountRequestVideosPrivacy putAdditionalProperty(String key, Object value) {
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
    UsersEssentialsEditVimeoAccountRequestVideosPrivacy usersEssentialsEditVimeoAccountRequestVideosPrivacy = (UsersEssentialsEditVimeoAccountRequestVideosPrivacy) o;
    return Objects.equals(this.add, usersEssentialsEditVimeoAccountRequestVideosPrivacy.add) &&
        Objects.equals(this.comments, usersEssentialsEditVimeoAccountRequestVideosPrivacy.comments) &&
        Objects.equals(this.download, usersEssentialsEditVimeoAccountRequestVideosPrivacy.download) &&
        Objects.equals(this.embed, usersEssentialsEditVimeoAccountRequestVideosPrivacy.embed) &&
        Objects.equals(this.view, usersEssentialsEditVimeoAccountRequestVideosPrivacy.view)&&
        Objects.equals(this.additionalProperties, usersEssentialsEditVimeoAccountRequestVideosPrivacy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, comments, download, embed, view, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersEssentialsEditVimeoAccountRequestVideosPrivacy {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to UsersEssentialsEditVimeoAccountRequestVideosPrivacy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersEssentialsEditVimeoAccountRequestVideosPrivacy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersEssentialsEditVimeoAccountRequestVideosPrivacy is not found in the empty JSON string", UsersEssentialsEditVimeoAccountRequestVideosPrivacy.openapiRequiredFields.toString()));
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
       if (!UsersEssentialsEditVimeoAccountRequestVideosPrivacy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersEssentialsEditVimeoAccountRequestVideosPrivacy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersEssentialsEditVimeoAccountRequestVideosPrivacy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersEssentialsEditVimeoAccountRequestVideosPrivacy.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersEssentialsEditVimeoAccountRequestVideosPrivacy>() {
           @Override
           public void write(JsonWriter out, UsersEssentialsEditVimeoAccountRequestVideosPrivacy value) throws IOException {
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
           public UsersEssentialsEditVimeoAccountRequestVideosPrivacy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsersEssentialsEditVimeoAccountRequestVideosPrivacy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsersEssentialsEditVimeoAccountRequestVideosPrivacy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersEssentialsEditVimeoAccountRequestVideosPrivacy
  * @throws IOException if the JSON string is invalid with respect to UsersEssentialsEditVimeoAccountRequestVideosPrivacy
  */
  public static UsersEssentialsEditVimeoAccountRequestVideosPrivacy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersEssentialsEditVimeoAccountRequestVideosPrivacy.class);
  }

 /**
  * Convert an instance of UsersEssentialsEditVimeoAccountRequestVideosPrivacy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

