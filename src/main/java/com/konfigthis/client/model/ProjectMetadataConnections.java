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
import com.konfigthis.client.model.ProjectMetadataConnectionsAncestorPathInner;
import com.konfigthis.client.model.ProjectMetadataConnectionsDataRetention;
import com.konfigthis.client.model.ProjectMetadataConnectionsFolders;
import com.konfigthis.client.model.ProjectMetadataConnectionsGroupFolderGrants;
import com.konfigthis.client.model.ProjectMetadataConnectionsItems;
import com.konfigthis.client.model.ProjectMetadataConnectionsParentFolder;
import com.konfigthis.client.model.ProjectMetadataConnectionsPersonalTeamFolderOwner;
import com.konfigthis.client.model.ProjectMetadataConnectionsResourceCreatorTeamUser;
import com.konfigthis.client.model.ProjectMetadataConnectionsTeamPermissions;
import com.konfigthis.client.model.ProjectMetadataConnectionsUserFolderAccessGrants;
import com.konfigthis.client.model.ProjectMetadataConnectionsVideos;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * A list of resource URIs related to the folder.
 */
@ApiModel(description = "A list of resource URIs related to the folder.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectMetadataConnections {
  public static final String SERIALIZED_NAME_ANCESTOR_PATH = "ancestor_path";
  @SerializedName(SERIALIZED_NAME_ANCESTOR_PATH)
  private List<ProjectMetadataConnectionsAncestorPathInner> ancestorPath = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_RETENTION = "data_retention";
  @SerializedName(SERIALIZED_NAME_DATA_RETENTION)
  private ProjectMetadataConnectionsDataRetention dataRetention;

  public static final String SERIALIZED_NAME_FOLDERS = "folders";
  @SerializedName(SERIALIZED_NAME_FOLDERS)
  private ProjectMetadataConnectionsFolders folders;

  public static final String SERIALIZED_NAME_GROUP_FOLDER_GRANTS = "group_folder_grants";
  @SerializedName(SERIALIZED_NAME_GROUP_FOLDER_GRANTS)
  private ProjectMetadataConnectionsGroupFolderGrants groupFolderGrants;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private ProjectMetadataConnectionsItems items;

  public static final String SERIALIZED_NAME_PARENT_FOLDER = "parent_folder";
  @SerializedName(SERIALIZED_NAME_PARENT_FOLDER)
  private ProjectMetadataConnectionsParentFolder parentFolder;

  public static final String SERIALIZED_NAME_PERSONAL_TEAM_FOLDER_OWNER = "personal_team_folder_owner";
  @SerializedName(SERIALIZED_NAME_PERSONAL_TEAM_FOLDER_OWNER)
  private ProjectMetadataConnectionsPersonalTeamFolderOwner personalTeamFolderOwner;

  public static final String SERIALIZED_NAME_RESOURCE_CREATOR_TEAM_USER = "resource_creator_team_user";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CREATOR_TEAM_USER)
  private ProjectMetadataConnectionsResourceCreatorTeamUser resourceCreatorTeamUser;

  public static final String SERIALIZED_NAME_TEAM_PERMISSIONS = "team_permissions";
  @SerializedName(SERIALIZED_NAME_TEAM_PERMISSIONS)
  private ProjectMetadataConnectionsTeamPermissions teamPermissions;

  public static final String SERIALIZED_NAME_USER_FOLDER_ACCESS_GRANTS = "user_folder_access_grants";
  @SerializedName(SERIALIZED_NAME_USER_FOLDER_ACCESS_GRANTS)
  private ProjectMetadataConnectionsUserFolderAccessGrants userFolderAccessGrants;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private ProjectMetadataConnectionsVideos videos;

  public ProjectMetadataConnections() {
  }

  public ProjectMetadataConnections ancestorPath(List<ProjectMetadataConnectionsAncestorPathInner> ancestorPath) {
    
    
    
    
    this.ancestorPath = ancestorPath;
    return this;
  }

  public ProjectMetadataConnections addAncestorPathItem(ProjectMetadataConnectionsAncestorPathInner ancestorPathItem) {
    this.ancestorPath.add(ancestorPathItem);
    return this;
  }

   /**
   * Information about the folder&#39;s ancestry ordered from the direct parent to higher-level ancestors.
   * @return ancestorPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Information about the folder's ancestry ordered from the direct parent to higher-level ancestors.")

  public List<ProjectMetadataConnectionsAncestorPathInner> getAncestorPath() {
    return ancestorPath;
  }


  public void setAncestorPath(List<ProjectMetadataConnectionsAncestorPathInner> ancestorPath) {
    
    
    
    this.ancestorPath = ancestorPath;
  }


  public ProjectMetadataConnections dataRetention(ProjectMetadataConnectionsDataRetention dataRetention) {
    
    
    
    
    this.dataRetention = dataRetention;
    return this;
  }

   /**
   * Get dataRetention
   * @return dataRetention
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsDataRetention getDataRetention() {
    return dataRetention;
  }


  public void setDataRetention(ProjectMetadataConnectionsDataRetention dataRetention) {
    
    
    
    this.dataRetention = dataRetention;
  }


  public ProjectMetadataConnections folders(ProjectMetadataConnectionsFolders folders) {
    
    
    
    
    this.folders = folders;
    return this;
  }

   /**
   * Get folders
   * @return folders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsFolders getFolders() {
    return folders;
  }


  public void setFolders(ProjectMetadataConnectionsFolders folders) {
    
    
    
    this.folders = folders;
  }


  public ProjectMetadataConnections groupFolderGrants(ProjectMetadataConnectionsGroupFolderGrants groupFolderGrants) {
    
    
    
    
    this.groupFolderGrants = groupFolderGrants;
    return this;
  }

   /**
   * Get groupFolderGrants
   * @return groupFolderGrants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsGroupFolderGrants getGroupFolderGrants() {
    return groupFolderGrants;
  }


  public void setGroupFolderGrants(ProjectMetadataConnectionsGroupFolderGrants groupFolderGrants) {
    
    
    
    this.groupFolderGrants = groupFolderGrants;
  }


  public ProjectMetadataConnections items(ProjectMetadataConnectionsItems items) {
    
    
    
    
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsItems getItems() {
    return items;
  }


  public void setItems(ProjectMetadataConnectionsItems items) {
    
    
    
    this.items = items;
  }


  public ProjectMetadataConnections parentFolder(ProjectMetadataConnectionsParentFolder parentFolder) {
    
    
    
    
    this.parentFolder = parentFolder;
    return this;
  }

   /**
   * Get parentFolder
   * @return parentFolder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsParentFolder getParentFolder() {
    return parentFolder;
  }


  public void setParentFolder(ProjectMetadataConnectionsParentFolder parentFolder) {
    
    
    
    this.parentFolder = parentFolder;
  }


  public ProjectMetadataConnections personalTeamFolderOwner(ProjectMetadataConnectionsPersonalTeamFolderOwner personalTeamFolderOwner) {
    
    
    
    
    this.personalTeamFolderOwner = personalTeamFolderOwner;
    return this;
  }

   /**
   * Get personalTeamFolderOwner
   * @return personalTeamFolderOwner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsPersonalTeamFolderOwner getPersonalTeamFolderOwner() {
    return personalTeamFolderOwner;
  }


  public void setPersonalTeamFolderOwner(ProjectMetadataConnectionsPersonalTeamFolderOwner personalTeamFolderOwner) {
    
    
    
    this.personalTeamFolderOwner = personalTeamFolderOwner;
  }


  public ProjectMetadataConnections resourceCreatorTeamUser(ProjectMetadataConnectionsResourceCreatorTeamUser resourceCreatorTeamUser) {
    
    
    
    
    this.resourceCreatorTeamUser = resourceCreatorTeamUser;
    return this;
  }

   /**
   * Get resourceCreatorTeamUser
   * @return resourceCreatorTeamUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsResourceCreatorTeamUser getResourceCreatorTeamUser() {
    return resourceCreatorTeamUser;
  }


  public void setResourceCreatorTeamUser(ProjectMetadataConnectionsResourceCreatorTeamUser resourceCreatorTeamUser) {
    
    
    
    this.resourceCreatorTeamUser = resourceCreatorTeamUser;
  }


  public ProjectMetadataConnections teamPermissions(ProjectMetadataConnectionsTeamPermissions teamPermissions) {
    
    
    
    
    this.teamPermissions = teamPermissions;
    return this;
  }

   /**
   * Get teamPermissions
   * @return teamPermissions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsTeamPermissions getTeamPermissions() {
    return teamPermissions;
  }


  public void setTeamPermissions(ProjectMetadataConnectionsTeamPermissions teamPermissions) {
    
    
    
    this.teamPermissions = teamPermissions;
  }


  public ProjectMetadataConnections userFolderAccessGrants(ProjectMetadataConnectionsUserFolderAccessGrants userFolderAccessGrants) {
    
    
    
    
    this.userFolderAccessGrants = userFolderAccessGrants;
    return this;
  }

   /**
   * Get userFolderAccessGrants
   * @return userFolderAccessGrants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsUserFolderAccessGrants getUserFolderAccessGrants() {
    return userFolderAccessGrants;
  }


  public void setUserFolderAccessGrants(ProjectMetadataConnectionsUserFolderAccessGrants userFolderAccessGrants) {
    
    
    
    this.userFolderAccessGrants = userFolderAccessGrants;
  }


  public ProjectMetadataConnections videos(ProjectMetadataConnectionsVideos videos) {
    
    
    
    
    this.videos = videos;
    return this;
  }

   /**
   * Get videos
   * @return videos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataConnectionsVideos getVideos() {
    return videos;
  }


  public void setVideos(ProjectMetadataConnectionsVideos videos) {
    
    
    
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
   * @return the ProjectMetadataConnections instance itself
   */
  public ProjectMetadataConnections putAdditionalProperty(String key, Object value) {
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
    ProjectMetadataConnections projectMetadataConnections = (ProjectMetadataConnections) o;
    return Objects.equals(this.ancestorPath, projectMetadataConnections.ancestorPath) &&
        Objects.equals(this.dataRetention, projectMetadataConnections.dataRetention) &&
        Objects.equals(this.folders, projectMetadataConnections.folders) &&
        Objects.equals(this.groupFolderGrants, projectMetadataConnections.groupFolderGrants) &&
        Objects.equals(this.items, projectMetadataConnections.items) &&
        Objects.equals(this.parentFolder, projectMetadataConnections.parentFolder) &&
        Objects.equals(this.personalTeamFolderOwner, projectMetadataConnections.personalTeamFolderOwner) &&
        Objects.equals(this.resourceCreatorTeamUser, projectMetadataConnections.resourceCreatorTeamUser) &&
        Objects.equals(this.teamPermissions, projectMetadataConnections.teamPermissions) &&
        Objects.equals(this.userFolderAccessGrants, projectMetadataConnections.userFolderAccessGrants) &&
        Objects.equals(this.videos, projectMetadataConnections.videos)&&
        Objects.equals(this.additionalProperties, projectMetadataConnections.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestorPath, dataRetention, folders, groupFolderGrants, items, parentFolder, personalTeamFolderOwner, resourceCreatorTeamUser, teamPermissions, userFolderAccessGrants, videos, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMetadataConnections {\n");
    sb.append("    ancestorPath: ").append(toIndentedString(ancestorPath)).append("\n");
    sb.append("    dataRetention: ").append(toIndentedString(dataRetention)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    groupFolderGrants: ").append(toIndentedString(groupFolderGrants)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    parentFolder: ").append(toIndentedString(parentFolder)).append("\n");
    sb.append("    personalTeamFolderOwner: ").append(toIndentedString(personalTeamFolderOwner)).append("\n");
    sb.append("    resourceCreatorTeamUser: ").append(toIndentedString(resourceCreatorTeamUser)).append("\n");
    sb.append("    teamPermissions: ").append(toIndentedString(teamPermissions)).append("\n");
    sb.append("    userFolderAccessGrants: ").append(toIndentedString(userFolderAccessGrants)).append("\n");
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
    openapiFields.add("ancestor_path");
    openapiFields.add("data_retention");
    openapiFields.add("folders");
    openapiFields.add("group_folder_grants");
    openapiFields.add("items");
    openapiFields.add("parent_folder");
    openapiFields.add("personal_team_folder_owner");
    openapiFields.add("resource_creator_team_user");
    openapiFields.add("team_permissions");
    openapiFields.add("user_folder_access_grants");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ancestor_path");
    openapiRequiredFields.add("data_retention");
    openapiRequiredFields.add("folders");
    openapiRequiredFields.add("group_folder_grants");
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("parent_folder");
    openapiRequiredFields.add("personal_team_folder_owner");
    openapiRequiredFields.add("resource_creator_team_user");
    openapiRequiredFields.add("team_permissions");
    openapiRequiredFields.add("user_folder_access_grants");
    openapiRequiredFields.add("videos");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectMetadataConnections
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectMetadataConnections.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectMetadataConnections is not found in the empty JSON string", ProjectMetadataConnections.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectMetadataConnections.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("ancestor_path").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ancestor_path` to be an array in the JSON string but got `%s`", jsonObj.get("ancestor_path").toString()));
      }

      JsonArray jsonArrayancestorPath = jsonObj.getAsJsonArray("ancestor_path");
      // validate the required field `ancestor_path` (array)
      for (int i = 0; i < jsonArrayancestorPath.size(); i++) {
        ProjectMetadataConnectionsAncestorPathInner.validateJsonObject(jsonArrayancestorPath.get(i).getAsJsonObject());
      };
      // validate the required field `data_retention`
      ProjectMetadataConnectionsDataRetention.validateJsonObject(jsonObj.getAsJsonObject("data_retention"));
      // validate the required field `folders`
      ProjectMetadataConnectionsFolders.validateJsonObject(jsonObj.getAsJsonObject("folders"));
      // validate the required field `group_folder_grants`
      ProjectMetadataConnectionsGroupFolderGrants.validateJsonObject(jsonObj.getAsJsonObject("group_folder_grants"));
      // validate the required field `items`
      ProjectMetadataConnectionsItems.validateJsonObject(jsonObj.getAsJsonObject("items"));
      // validate the required field `parent_folder`
      ProjectMetadataConnectionsParentFolder.validateJsonObject(jsonObj.getAsJsonObject("parent_folder"));
      // validate the required field `personal_team_folder_owner`
      ProjectMetadataConnectionsPersonalTeamFolderOwner.validateJsonObject(jsonObj.getAsJsonObject("personal_team_folder_owner"));
      // validate the required field `resource_creator_team_user`
      ProjectMetadataConnectionsResourceCreatorTeamUser.validateJsonObject(jsonObj.getAsJsonObject("resource_creator_team_user"));
      // validate the required field `team_permissions`
      ProjectMetadataConnectionsTeamPermissions.validateJsonObject(jsonObj.getAsJsonObject("team_permissions"));
      // validate the required field `user_folder_access_grants`
      ProjectMetadataConnectionsUserFolderAccessGrants.validateJsonObject(jsonObj.getAsJsonObject("user_folder_access_grants"));
      // validate the required field `videos`
      ProjectMetadataConnectionsVideos.validateJsonObject(jsonObj.getAsJsonObject("videos"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectMetadataConnections.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectMetadataConnections' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectMetadataConnections> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectMetadataConnections.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectMetadataConnections>() {
           @Override
           public void write(JsonWriter out, ProjectMetadataConnections value) throws IOException {
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
           public ProjectMetadataConnections read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectMetadataConnections instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectMetadataConnections given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectMetadataConnections
  * @throws IOException if the JSON string is invalid with respect to ProjectMetadataConnections
  */
  public static ProjectMetadataConnections fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectMetadataConnections.class);
  }

 /**
  * Convert an instance of ProjectMetadataConnections to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

