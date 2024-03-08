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
import com.konfigthis.client.model.UserMetadataConnectionsAlbums;
import com.konfigthis.client.model.UserMetadataConnectionsAppearances;
import com.konfigthis.client.model.UserMetadataConnectionsBlock;
import com.konfigthis.client.model.UserMetadataConnectionsCategories;
import com.konfigthis.client.model.UserMetadataConnectionsChannels;
import com.konfigthis.client.model.UserMetadataConnectionsConnectedApps;
import com.konfigthis.client.model.UserMetadataConnectionsFeed;
import com.konfigthis.client.model.UserMetadataConnectionsFolders;
import com.konfigthis.client.model.UserMetadataConnectionsFoldersRoot;
import com.konfigthis.client.model.UserMetadataConnectionsFollowers;
import com.konfigthis.client.model.UserMetadataConnectionsFollowing;
import com.konfigthis.client.model.UserMetadataConnectionsGroups;
import com.konfigthis.client.model.UserMetadataConnectionsLikes;
import com.konfigthis.client.model.UserMetadataConnectionsModeratedChannels;
import com.konfigthis.client.model.UserMetadataConnectionsPictures;
import com.konfigthis.client.model.UserMetadataConnectionsPortfolios;
import com.konfigthis.client.model.UserMetadataConnectionsRecommendedChannels;
import com.konfigthis.client.model.UserMetadataConnectionsRecommendedUsers;
import com.konfigthis.client.model.UserMetadataConnectionsShared;
import com.konfigthis.client.model.UserMetadataConnectionsVideos;
import com.konfigthis.client.model.UserMetadataConnectionsWatchedVideos;
import com.konfigthis.client.model.UserMetadataConnectionsWatchlater;
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
 * The list of resource URIs related to the authenticated user.
 */
@ApiModel(description = "The list of resource URIs related to the authenticated user.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserMetadataConnections {
  public static final String SERIALIZED_NAME_ALBUMS = "albums";
  @SerializedName(SERIALIZED_NAME_ALBUMS)
  private UserMetadataConnectionsAlbums albums;

  public static final String SERIALIZED_NAME_APPEARANCES = "appearances";
  @SerializedName(SERIALIZED_NAME_APPEARANCES)
  private UserMetadataConnectionsAppearances appearances;

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private UserMetadataConnectionsBlock block;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private UserMetadataConnectionsCategories categories;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private UserMetadataConnectionsChannels channels;

  public static final String SERIALIZED_NAME_CONNECTED_APPS = "connected_apps";
  @SerializedName(SERIALIZED_NAME_CONNECTED_APPS)
  private UserMetadataConnectionsConnectedApps connectedApps;

  public static final String SERIALIZED_NAME_FEED = "feed";
  @SerializedName(SERIALIZED_NAME_FEED)
  private UserMetadataConnectionsFeed feed;

  public static final String SERIALIZED_NAME_FOLDERS = "folders";
  @SerializedName(SERIALIZED_NAME_FOLDERS)
  private UserMetadataConnectionsFolders folders;

  public static final String SERIALIZED_NAME_FOLDERS_ROOT = "folders_root";
  @SerializedName(SERIALIZED_NAME_FOLDERS_ROOT)
  private UserMetadataConnectionsFoldersRoot foldersRoot;

  public static final String SERIALIZED_NAME_FOLLOWERS = "followers";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS)
  private UserMetadataConnectionsFollowers followers;

  public static final String SERIALIZED_NAME_FOLLOWING = "following";
  @SerializedName(SERIALIZED_NAME_FOLLOWING)
  private UserMetadataConnectionsFollowing following;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private UserMetadataConnectionsGroups groups;

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private UserMetadataConnectionsLikes likes;

  public static final String SERIALIZED_NAME_MODERATED_CHANNELS = "moderated_channels";
  @SerializedName(SERIALIZED_NAME_MODERATED_CHANNELS)
  private UserMetadataConnectionsModeratedChannels moderatedChannels;

  public static final String SERIALIZED_NAME_PICTURES = "pictures";
  @SerializedName(SERIALIZED_NAME_PICTURES)
  private UserMetadataConnectionsPictures pictures;

  public static final String SERIALIZED_NAME_PORTFOLIOS = "portfolios";
  @SerializedName(SERIALIZED_NAME_PORTFOLIOS)
  private UserMetadataConnectionsPortfolios portfolios;

  public static final String SERIALIZED_NAME_RECOMMENDED_CHANNELS = "recommended_channels";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_CHANNELS)
  private UserMetadataConnectionsRecommendedChannels recommendedChannels;

  public static final String SERIALIZED_NAME_RECOMMENDED_USERS = "recommended_users";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_USERS)
  private UserMetadataConnectionsRecommendedUsers recommendedUsers;

  public static final String SERIALIZED_NAME_SHARED = "shared";
  @SerializedName(SERIALIZED_NAME_SHARED)
  private UserMetadataConnectionsShared shared;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private UserMetadataConnectionsVideos videos;

  public static final String SERIALIZED_NAME_WATCHED_VIDEOS = "watched_videos";
  @SerializedName(SERIALIZED_NAME_WATCHED_VIDEOS)
  private UserMetadataConnectionsWatchedVideos watchedVideos;

  public static final String SERIALIZED_NAME_WATCHLATER = "watchlater";
  @SerializedName(SERIALIZED_NAME_WATCHLATER)
  private UserMetadataConnectionsWatchlater watchlater;

  public UserMetadataConnections() {
  }

  public UserMetadataConnections albums(UserMetadataConnectionsAlbums albums) {
    
    
    
    
    this.albums = albums;
    return this;
  }

   /**
   * Get albums
   * @return albums
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsAlbums getAlbums() {
    return albums;
  }


  public void setAlbums(UserMetadataConnectionsAlbums albums) {
    
    
    
    this.albums = albums;
  }


  public UserMetadataConnections appearances(UserMetadataConnectionsAppearances appearances) {
    
    
    
    
    this.appearances = appearances;
    return this;
  }

   /**
   * Get appearances
   * @return appearances
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsAppearances getAppearances() {
    return appearances;
  }


  public void setAppearances(UserMetadataConnectionsAppearances appearances) {
    
    
    
    this.appearances = appearances;
  }


  public UserMetadataConnections block(UserMetadataConnectionsBlock block) {
    
    
    
    
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsBlock getBlock() {
    return block;
  }


  public void setBlock(UserMetadataConnectionsBlock block) {
    
    
    
    this.block = block;
  }


  public UserMetadataConnections categories(UserMetadataConnectionsCategories categories) {
    
    
    
    
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsCategories getCategories() {
    return categories;
  }


  public void setCategories(UserMetadataConnectionsCategories categories) {
    
    
    
    this.categories = categories;
  }


  public UserMetadataConnections channels(UserMetadataConnectionsChannels channels) {
    
    
    
    
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsChannels getChannels() {
    return channels;
  }


  public void setChannels(UserMetadataConnectionsChannels channels) {
    
    
    
    this.channels = channels;
  }


  public UserMetadataConnections connectedApps(UserMetadataConnectionsConnectedApps connectedApps) {
    
    
    
    
    this.connectedApps = connectedApps;
    return this;
  }

   /**
   * Get connectedApps
   * @return connectedApps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsConnectedApps getConnectedApps() {
    return connectedApps;
  }


  public void setConnectedApps(UserMetadataConnectionsConnectedApps connectedApps) {
    
    
    
    this.connectedApps = connectedApps;
  }


  public UserMetadataConnections feed(UserMetadataConnectionsFeed feed) {
    
    
    
    
    this.feed = feed;
    return this;
  }

   /**
   * Get feed
   * @return feed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsFeed getFeed() {
    return feed;
  }


  public void setFeed(UserMetadataConnectionsFeed feed) {
    
    
    
    this.feed = feed;
  }


  public UserMetadataConnections folders(UserMetadataConnectionsFolders folders) {
    
    
    
    
    this.folders = folders;
    return this;
  }

   /**
   * Get folders
   * @return folders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsFolders getFolders() {
    return folders;
  }


  public void setFolders(UserMetadataConnectionsFolders folders) {
    
    
    
    this.folders = folders;
  }


  public UserMetadataConnections foldersRoot(UserMetadataConnectionsFoldersRoot foldersRoot) {
    
    
    
    
    this.foldersRoot = foldersRoot;
    return this;
  }

   /**
   * Get foldersRoot
   * @return foldersRoot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsFoldersRoot getFoldersRoot() {
    return foldersRoot;
  }


  public void setFoldersRoot(UserMetadataConnectionsFoldersRoot foldersRoot) {
    
    
    
    this.foldersRoot = foldersRoot;
  }


  public UserMetadataConnections followers(UserMetadataConnectionsFollowers followers) {
    
    
    
    
    this.followers = followers;
    return this;
  }

   /**
   * Get followers
   * @return followers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsFollowers getFollowers() {
    return followers;
  }


  public void setFollowers(UserMetadataConnectionsFollowers followers) {
    
    
    
    this.followers = followers;
  }


  public UserMetadataConnections following(UserMetadataConnectionsFollowing following) {
    
    
    
    
    this.following = following;
    return this;
  }

   /**
   * Get following
   * @return following
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsFollowing getFollowing() {
    return following;
  }


  public void setFollowing(UserMetadataConnectionsFollowing following) {
    
    
    
    this.following = following;
  }


  public UserMetadataConnections groups(UserMetadataConnectionsGroups groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsGroups getGroups() {
    return groups;
  }


  public void setGroups(UserMetadataConnectionsGroups groups) {
    
    
    
    this.groups = groups;
  }


  public UserMetadataConnections likes(UserMetadataConnectionsLikes likes) {
    
    
    
    
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsLikes getLikes() {
    return likes;
  }


  public void setLikes(UserMetadataConnectionsLikes likes) {
    
    
    
    this.likes = likes;
  }


  public UserMetadataConnections moderatedChannels(UserMetadataConnectionsModeratedChannels moderatedChannels) {
    
    
    
    
    this.moderatedChannels = moderatedChannels;
    return this;
  }

   /**
   * Get moderatedChannels
   * @return moderatedChannels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsModeratedChannels getModeratedChannels() {
    return moderatedChannels;
  }


  public void setModeratedChannels(UserMetadataConnectionsModeratedChannels moderatedChannels) {
    
    
    
    this.moderatedChannels = moderatedChannels;
  }


  public UserMetadataConnections pictures(UserMetadataConnectionsPictures pictures) {
    
    
    
    
    this.pictures = pictures;
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsPictures getPictures() {
    return pictures;
  }


  public void setPictures(UserMetadataConnectionsPictures pictures) {
    
    
    
    this.pictures = pictures;
  }


  public UserMetadataConnections portfolios(UserMetadataConnectionsPortfolios portfolios) {
    
    
    
    
    this.portfolios = portfolios;
    return this;
  }

   /**
   * Get portfolios
   * @return portfolios
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsPortfolios getPortfolios() {
    return portfolios;
  }


  public void setPortfolios(UserMetadataConnectionsPortfolios portfolios) {
    
    
    
    this.portfolios = portfolios;
  }


  public UserMetadataConnections recommendedChannels(UserMetadataConnectionsRecommendedChannels recommendedChannels) {
    
    
    
    
    this.recommendedChannels = recommendedChannels;
    return this;
  }

   /**
   * Get recommendedChannels
   * @return recommendedChannels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsRecommendedChannels getRecommendedChannels() {
    return recommendedChannels;
  }


  public void setRecommendedChannels(UserMetadataConnectionsRecommendedChannels recommendedChannels) {
    
    
    
    this.recommendedChannels = recommendedChannels;
  }


  public UserMetadataConnections recommendedUsers(UserMetadataConnectionsRecommendedUsers recommendedUsers) {
    
    
    
    
    this.recommendedUsers = recommendedUsers;
    return this;
  }

   /**
   * Get recommendedUsers
   * @return recommendedUsers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsRecommendedUsers getRecommendedUsers() {
    return recommendedUsers;
  }


  public void setRecommendedUsers(UserMetadataConnectionsRecommendedUsers recommendedUsers) {
    
    
    
    this.recommendedUsers = recommendedUsers;
  }


  public UserMetadataConnections shared(UserMetadataConnectionsShared shared) {
    
    
    
    
    this.shared = shared;
    return this;
  }

   /**
   * Get shared
   * @return shared
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsShared getShared() {
    return shared;
  }


  public void setShared(UserMetadataConnectionsShared shared) {
    
    
    
    this.shared = shared;
  }


  public UserMetadataConnections videos(UserMetadataConnectionsVideos videos) {
    
    
    
    
    this.videos = videos;
    return this;
  }

   /**
   * Get videos
   * @return videos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsVideos getVideos() {
    return videos;
  }


  public void setVideos(UserMetadataConnectionsVideos videos) {
    
    
    
    this.videos = videos;
  }


  public UserMetadataConnections watchedVideos(UserMetadataConnectionsWatchedVideos watchedVideos) {
    
    
    
    
    this.watchedVideos = watchedVideos;
    return this;
  }

   /**
   * Get watchedVideos
   * @return watchedVideos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsWatchedVideos getWatchedVideos() {
    return watchedVideos;
  }


  public void setWatchedVideos(UserMetadataConnectionsWatchedVideos watchedVideos) {
    
    
    
    this.watchedVideos = watchedVideos;
  }


  public UserMetadataConnections watchlater(UserMetadataConnectionsWatchlater watchlater) {
    
    
    
    
    this.watchlater = watchlater;
    return this;
  }

   /**
   * Get watchlater
   * @return watchlater
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserMetadataConnectionsWatchlater getWatchlater() {
    return watchlater;
  }


  public void setWatchlater(UserMetadataConnectionsWatchlater watchlater) {
    
    
    
    this.watchlater = watchlater;
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
   * @return the UserMetadataConnections instance itself
   */
  public UserMetadataConnections putAdditionalProperty(String key, Object value) {
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
    UserMetadataConnections userMetadataConnections = (UserMetadataConnections) o;
    return Objects.equals(this.albums, userMetadataConnections.albums) &&
        Objects.equals(this.appearances, userMetadataConnections.appearances) &&
        Objects.equals(this.block, userMetadataConnections.block) &&
        Objects.equals(this.categories, userMetadataConnections.categories) &&
        Objects.equals(this.channels, userMetadataConnections.channels) &&
        Objects.equals(this.connectedApps, userMetadataConnections.connectedApps) &&
        Objects.equals(this.feed, userMetadataConnections.feed) &&
        Objects.equals(this.folders, userMetadataConnections.folders) &&
        Objects.equals(this.foldersRoot, userMetadataConnections.foldersRoot) &&
        Objects.equals(this.followers, userMetadataConnections.followers) &&
        Objects.equals(this.following, userMetadataConnections.following) &&
        Objects.equals(this.groups, userMetadataConnections.groups) &&
        Objects.equals(this.likes, userMetadataConnections.likes) &&
        Objects.equals(this.moderatedChannels, userMetadataConnections.moderatedChannels) &&
        Objects.equals(this.pictures, userMetadataConnections.pictures) &&
        Objects.equals(this.portfolios, userMetadataConnections.portfolios) &&
        Objects.equals(this.recommendedChannels, userMetadataConnections.recommendedChannels) &&
        Objects.equals(this.recommendedUsers, userMetadataConnections.recommendedUsers) &&
        Objects.equals(this.shared, userMetadataConnections.shared) &&
        Objects.equals(this.videos, userMetadataConnections.videos) &&
        Objects.equals(this.watchedVideos, userMetadataConnections.watchedVideos) &&
        Objects.equals(this.watchlater, userMetadataConnections.watchlater)&&
        Objects.equals(this.additionalProperties, userMetadataConnections.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albums, appearances, block, categories, channels, connectedApps, feed, folders, foldersRoot, followers, following, groups, likes, moderatedChannels, pictures, portfolios, recommendedChannels, recommendedUsers, shared, videos, watchedVideos, watchlater, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMetadataConnections {\n");
    sb.append("    albums: ").append(toIndentedString(albums)).append("\n");
    sb.append("    appearances: ").append(toIndentedString(appearances)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    connectedApps: ").append(toIndentedString(connectedApps)).append("\n");
    sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    foldersRoot: ").append(toIndentedString(foldersRoot)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    moderatedChannels: ").append(toIndentedString(moderatedChannels)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    portfolios: ").append(toIndentedString(portfolios)).append("\n");
    sb.append("    recommendedChannels: ").append(toIndentedString(recommendedChannels)).append("\n");
    sb.append("    recommendedUsers: ").append(toIndentedString(recommendedUsers)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    watchedVideos: ").append(toIndentedString(watchedVideos)).append("\n");
    sb.append("    watchlater: ").append(toIndentedString(watchlater)).append("\n");
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
    openapiFields.add("albums");
    openapiFields.add("appearances");
    openapiFields.add("block");
    openapiFields.add("categories");
    openapiFields.add("channels");
    openapiFields.add("connected_apps");
    openapiFields.add("feed");
    openapiFields.add("folders");
    openapiFields.add("folders_root");
    openapiFields.add("followers");
    openapiFields.add("following");
    openapiFields.add("groups");
    openapiFields.add("likes");
    openapiFields.add("moderated_channels");
    openapiFields.add("pictures");
    openapiFields.add("portfolios");
    openapiFields.add("recommended_channels");
    openapiFields.add("recommended_users");
    openapiFields.add("shared");
    openapiFields.add("videos");
    openapiFields.add("watched_videos");
    openapiFields.add("watchlater");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("albums");
    openapiRequiredFields.add("appearances");
    openapiRequiredFields.add("block");
    openapiRequiredFields.add("categories");
    openapiRequiredFields.add("channels");
    openapiRequiredFields.add("connected_apps");
    openapiRequiredFields.add("feed");
    openapiRequiredFields.add("folders");
    openapiRequiredFields.add("folders_root");
    openapiRequiredFields.add("followers");
    openapiRequiredFields.add("following");
    openapiRequiredFields.add("groups");
    openapiRequiredFields.add("likes");
    openapiRequiredFields.add("moderated_channels");
    openapiRequiredFields.add("pictures");
    openapiRequiredFields.add("portfolios");
    openapiRequiredFields.add("recommended_channels");
    openapiRequiredFields.add("recommended_users");
    openapiRequiredFields.add("shared");
    openapiRequiredFields.add("videos");
    openapiRequiredFields.add("watched_videos");
    openapiRequiredFields.add("watchlater");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserMetadataConnections
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserMetadataConnections.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserMetadataConnections is not found in the empty JSON string", UserMetadataConnections.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserMetadataConnections.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `albums`
      UserMetadataConnectionsAlbums.validateJsonObject(jsonObj.getAsJsonObject("albums"));
      // validate the required field `appearances`
      UserMetadataConnectionsAppearances.validateJsonObject(jsonObj.getAsJsonObject("appearances"));
      // validate the required field `block`
      UserMetadataConnectionsBlock.validateJsonObject(jsonObj.getAsJsonObject("block"));
      // validate the required field `categories`
      UserMetadataConnectionsCategories.validateJsonObject(jsonObj.getAsJsonObject("categories"));
      // validate the required field `channels`
      UserMetadataConnectionsChannels.validateJsonObject(jsonObj.getAsJsonObject("channels"));
      // validate the required field `connected_apps`
      UserMetadataConnectionsConnectedApps.validateJsonObject(jsonObj.getAsJsonObject("connected_apps"));
      // validate the required field `feed`
      UserMetadataConnectionsFeed.validateJsonObject(jsonObj.getAsJsonObject("feed"));
      // validate the required field `folders`
      UserMetadataConnectionsFolders.validateJsonObject(jsonObj.getAsJsonObject("folders"));
      // validate the required field `folders_root`
      UserMetadataConnectionsFoldersRoot.validateJsonObject(jsonObj.getAsJsonObject("folders_root"));
      // validate the required field `followers`
      UserMetadataConnectionsFollowers.validateJsonObject(jsonObj.getAsJsonObject("followers"));
      // validate the required field `following`
      UserMetadataConnectionsFollowing.validateJsonObject(jsonObj.getAsJsonObject("following"));
      // validate the required field `groups`
      UserMetadataConnectionsGroups.validateJsonObject(jsonObj.getAsJsonObject("groups"));
      // validate the required field `likes`
      UserMetadataConnectionsLikes.validateJsonObject(jsonObj.getAsJsonObject("likes"));
      // validate the required field `moderated_channels`
      UserMetadataConnectionsModeratedChannels.validateJsonObject(jsonObj.getAsJsonObject("moderated_channels"));
      // validate the required field `pictures`
      UserMetadataConnectionsPictures.validateJsonObject(jsonObj.getAsJsonObject("pictures"));
      // validate the required field `portfolios`
      UserMetadataConnectionsPortfolios.validateJsonObject(jsonObj.getAsJsonObject("portfolios"));
      // validate the required field `recommended_channels`
      UserMetadataConnectionsRecommendedChannels.validateJsonObject(jsonObj.getAsJsonObject("recommended_channels"));
      // validate the required field `recommended_users`
      UserMetadataConnectionsRecommendedUsers.validateJsonObject(jsonObj.getAsJsonObject("recommended_users"));
      // validate the required field `shared`
      UserMetadataConnectionsShared.validateJsonObject(jsonObj.getAsJsonObject("shared"));
      // validate the required field `videos`
      UserMetadataConnectionsVideos.validateJsonObject(jsonObj.getAsJsonObject("videos"));
      // validate the required field `watched_videos`
      UserMetadataConnectionsWatchedVideos.validateJsonObject(jsonObj.getAsJsonObject("watched_videos"));
      // validate the required field `watchlater`
      UserMetadataConnectionsWatchlater.validateJsonObject(jsonObj.getAsJsonObject("watchlater"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserMetadataConnections.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserMetadataConnections' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserMetadataConnections> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserMetadataConnections.class));

       return (TypeAdapter<T>) new TypeAdapter<UserMetadataConnections>() {
           @Override
           public void write(JsonWriter out, UserMetadataConnections value) throws IOException {
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
           public UserMetadataConnections read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserMetadataConnections instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserMetadataConnections given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserMetadataConnections
  * @throws IOException if the JSON string is invalid with respect to UserMetadataConnections
  */
  public static UserMetadataConnections fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserMetadataConnections.class);
  }

 /**
  * Convert an instance of UserMetadataConnections to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

