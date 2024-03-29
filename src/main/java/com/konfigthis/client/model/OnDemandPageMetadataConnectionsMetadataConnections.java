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
import com.konfigthis.client.model.OnDemandPageMetadataConnectionsMetadataConnectionsComments;
import com.konfigthis.client.model.OnDemandPageMetadataConnectionsMetadataConnectionsGenres;
import com.konfigthis.client.model.OnDemandPageMetadataConnectionsMetadataConnectionsLikes;
import com.konfigthis.client.model.OnDemandPageMetadataConnectionsMetadataConnectionsPictures;
import com.konfigthis.client.model.OnDemandPageMetadataConnectionsMetadataConnectionsSeasons;
import com.konfigthis.client.model.OnDemandPageMetadataConnectionsMetadataConnectionsVideos;
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
 * OnDemandPageMetadataConnectionsMetadataConnections
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OnDemandPageMetadataConnectionsMetadataConnections {
  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private OnDemandPageMetadataConnectionsMetadataConnectionsComments comments;

  public static final String SERIALIZED_NAME_GENRES = "genres";
  @SerializedName(SERIALIZED_NAME_GENRES)
  private OnDemandPageMetadataConnectionsMetadataConnectionsGenres genres;

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private OnDemandPageMetadataConnectionsMetadataConnectionsLikes likes;

  public static final String SERIALIZED_NAME_PICTURES = "pictures";
  @SerializedName(SERIALIZED_NAME_PICTURES)
  private OnDemandPageMetadataConnectionsMetadataConnectionsPictures pictures;

  public static final String SERIALIZED_NAME_SEASONS = "seasons";
  @SerializedName(SERIALIZED_NAME_SEASONS)
  private OnDemandPageMetadataConnectionsMetadataConnectionsSeasons seasons;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private OnDemandPageMetadataConnectionsMetadataConnectionsVideos videos;

  public OnDemandPageMetadataConnectionsMetadataConnections() {
  }

  public OnDemandPageMetadataConnectionsMetadataConnections comments(OnDemandPageMetadataConnectionsMetadataConnectionsComments comments) {
    
    
    
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OnDemandPageMetadataConnectionsMetadataConnectionsComments getComments() {
    return comments;
  }


  public void setComments(OnDemandPageMetadataConnectionsMetadataConnectionsComments comments) {
    
    
    
    this.comments = comments;
  }


  public OnDemandPageMetadataConnectionsMetadataConnections genres(OnDemandPageMetadataConnectionsMetadataConnectionsGenres genres) {
    
    
    
    
    this.genres = genres;
    return this;
  }

   /**
   * Get genres
   * @return genres
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OnDemandPageMetadataConnectionsMetadataConnectionsGenres getGenres() {
    return genres;
  }


  public void setGenres(OnDemandPageMetadataConnectionsMetadataConnectionsGenres genres) {
    
    
    
    this.genres = genres;
  }


  public OnDemandPageMetadataConnectionsMetadataConnections likes(OnDemandPageMetadataConnectionsMetadataConnectionsLikes likes) {
    
    
    
    
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OnDemandPageMetadataConnectionsMetadataConnectionsLikes getLikes() {
    return likes;
  }


  public void setLikes(OnDemandPageMetadataConnectionsMetadataConnectionsLikes likes) {
    
    
    
    this.likes = likes;
  }


  public OnDemandPageMetadataConnectionsMetadataConnections pictures(OnDemandPageMetadataConnectionsMetadataConnectionsPictures pictures) {
    
    
    
    
    this.pictures = pictures;
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OnDemandPageMetadataConnectionsMetadataConnectionsPictures getPictures() {
    return pictures;
  }


  public void setPictures(OnDemandPageMetadataConnectionsMetadataConnectionsPictures pictures) {
    
    
    
    this.pictures = pictures;
  }


  public OnDemandPageMetadataConnectionsMetadataConnections seasons(OnDemandPageMetadataConnectionsMetadataConnectionsSeasons seasons) {
    
    
    
    
    this.seasons = seasons;
    return this;
  }

   /**
   * Get seasons
   * @return seasons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OnDemandPageMetadataConnectionsMetadataConnectionsSeasons getSeasons() {
    return seasons;
  }


  public void setSeasons(OnDemandPageMetadataConnectionsMetadataConnectionsSeasons seasons) {
    
    
    
    this.seasons = seasons;
  }


  public OnDemandPageMetadataConnectionsMetadataConnections videos(OnDemandPageMetadataConnectionsMetadataConnectionsVideos videos) {
    
    
    
    
    this.videos = videos;
    return this;
  }

   /**
   * Get videos
   * @return videos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OnDemandPageMetadataConnectionsMetadataConnectionsVideos getVideos() {
    return videos;
  }


  public void setVideos(OnDemandPageMetadataConnectionsMetadataConnectionsVideos videos) {
    
    
    
    this.videos = videos;
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
   * @return the OnDemandPageMetadataConnectionsMetadataConnections instance itself
   */
  public OnDemandPageMetadataConnectionsMetadataConnections putAdditionalProperty(String key, Object value) {
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
    OnDemandPageMetadataConnectionsMetadataConnections onDemandPageMetadataConnectionsMetadataConnections = (OnDemandPageMetadataConnectionsMetadataConnections) o;
    return Objects.equals(this.comments, onDemandPageMetadataConnectionsMetadataConnections.comments) &&
        Objects.equals(this.genres, onDemandPageMetadataConnectionsMetadataConnections.genres) &&
        Objects.equals(this.likes, onDemandPageMetadataConnectionsMetadataConnections.likes) &&
        Objects.equals(this.pictures, onDemandPageMetadataConnectionsMetadataConnections.pictures) &&
        Objects.equals(this.seasons, onDemandPageMetadataConnectionsMetadataConnections.seasons) &&
        Objects.equals(this.videos, onDemandPageMetadataConnectionsMetadataConnections.videos)&&
        Objects.equals(this.additionalProperties, onDemandPageMetadataConnectionsMetadataConnections.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, genres, likes, pictures, seasons, videos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnDemandPageMetadataConnectionsMetadataConnections {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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
    openapiFields.add("comments");
    openapiFields.add("genres");
    openapiFields.add("likes");
    openapiFields.add("pictures");
    openapiFields.add("seasons");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("genres");
    openapiRequiredFields.add("likes");
    openapiRequiredFields.add("pictures");
    openapiRequiredFields.add("seasons");
    openapiRequiredFields.add("videos");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnDemandPageMetadataConnectionsMetadataConnections
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnDemandPageMetadataConnectionsMetadataConnections.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnDemandPageMetadataConnectionsMetadataConnections is not found in the empty JSON string", OnDemandPageMetadataConnectionsMetadataConnections.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OnDemandPageMetadataConnectionsMetadataConnections.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `comments`
      OnDemandPageMetadataConnectionsMetadataConnectionsComments.validateJsonObject(jsonObj.getAsJsonObject("comments"));
      // validate the required field `genres`
      OnDemandPageMetadataConnectionsMetadataConnectionsGenres.validateJsonObject(jsonObj.getAsJsonObject("genres"));
      // validate the required field `likes`
      OnDemandPageMetadataConnectionsMetadataConnectionsLikes.validateJsonObject(jsonObj.getAsJsonObject("likes"));
      // validate the required field `pictures`
      OnDemandPageMetadataConnectionsMetadataConnectionsPictures.validateJsonObject(jsonObj.getAsJsonObject("pictures"));
      // validate the required field `seasons`
      OnDemandPageMetadataConnectionsMetadataConnectionsSeasons.validateJsonObject(jsonObj.getAsJsonObject("seasons"));
      // validate the required field `videos`
      OnDemandPageMetadataConnectionsMetadataConnectionsVideos.validateJsonObject(jsonObj.getAsJsonObject("videos"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnDemandPageMetadataConnectionsMetadataConnections.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnDemandPageMetadataConnectionsMetadataConnections' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnDemandPageMetadataConnectionsMetadataConnections> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnDemandPageMetadataConnectionsMetadataConnections.class));

       return (TypeAdapter<T>) new TypeAdapter<OnDemandPageMetadataConnectionsMetadataConnections>() {
           @Override
           public void write(JsonWriter out, OnDemandPageMetadataConnectionsMetadataConnections value) throws IOException {
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
           public OnDemandPageMetadataConnectionsMetadataConnections read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnDemandPageMetadataConnectionsMetadataConnections instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OnDemandPageMetadataConnectionsMetadataConnections given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnDemandPageMetadataConnectionsMetadataConnections
  * @throws IOException if the JSON string is invalid with respect to OnDemandPageMetadataConnectionsMetadataConnections
  */
  public static OnDemandPageMetadataConnectionsMetadataConnections fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnDemandPageMetadataConnectionsMetadataConnections.class);
  }

 /**
  * Convert an instance of OnDemandPageMetadataConnectionsMetadataConnections to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

