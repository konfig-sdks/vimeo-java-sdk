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
import com.konfigthis.client.model.ProjectMetadataInteractionsAddSubfolder;
import com.konfigthis.client.model.ProjectMetadataInteractionsDelete;
import com.konfigthis.client.model.ProjectMetadataInteractionsDeleteVideo;
import com.konfigthis.client.model.ProjectMetadataInteractionsEdit;
import com.konfigthis.client.model.ProjectMetadataInteractionsEditSettings;
import com.konfigthis.client.model.ProjectMetadataInteractionsInvite;
import com.konfigthis.client.model.ProjectMetadataInteractionsMoveVideo;
import com.konfigthis.client.model.ProjectMetadataInteractionsUploadVideo;
import com.konfigthis.client.model.ProjectMetadataInteractionsView;
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
 * A list of permitted interactions related to the folder.
 */
@ApiModel(description = "A list of permitted interactions related to the folder.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectMetadataInteractions {
  public static final String SERIALIZED_NAME_ADD_SUBFOLDER = "add_subfolder";
  @SerializedName(SERIALIZED_NAME_ADD_SUBFOLDER)
  private ProjectMetadataInteractionsAddSubfolder addSubfolder;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private ProjectMetadataInteractionsDelete delete;

  public static final String SERIALIZED_NAME_DELETE_VIDEO = "delete_video";
  @SerializedName(SERIALIZED_NAME_DELETE_VIDEO)
  private ProjectMetadataInteractionsDeleteVideo deleteVideo;

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private ProjectMetadataInteractionsEdit edit;

  public static final String SERIALIZED_NAME_EDIT_SETTINGS = "edit_settings";
  @SerializedName(SERIALIZED_NAME_EDIT_SETTINGS)
  private ProjectMetadataInteractionsEditSettings editSettings;

  public static final String SERIALIZED_NAME_INVITE = "invite";
  @SerializedName(SERIALIZED_NAME_INVITE)
  private ProjectMetadataInteractionsInvite invite;

  public static final String SERIALIZED_NAME_MOVE_VIDEO = "move_video";
  @SerializedName(SERIALIZED_NAME_MOVE_VIDEO)
  private ProjectMetadataInteractionsMoveVideo moveVideo;

  public static final String SERIALIZED_NAME_UPLOAD_VIDEO = "upload_video";
  @SerializedName(SERIALIZED_NAME_UPLOAD_VIDEO)
  private ProjectMetadataInteractionsUploadVideo uploadVideo;

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private ProjectMetadataInteractionsView view;

  public ProjectMetadataInteractions() {
  }

  public ProjectMetadataInteractions addSubfolder(ProjectMetadataInteractionsAddSubfolder addSubfolder) {
    
    
    
    
    this.addSubfolder = addSubfolder;
    return this;
  }

   /**
   * Get addSubfolder
   * @return addSubfolder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsAddSubfolder getAddSubfolder() {
    return addSubfolder;
  }


  public void setAddSubfolder(ProjectMetadataInteractionsAddSubfolder addSubfolder) {
    
    
    
    this.addSubfolder = addSubfolder;
  }


  public ProjectMetadataInteractions delete(ProjectMetadataInteractionsDelete delete) {
    
    
    
    
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsDelete getDelete() {
    return delete;
  }


  public void setDelete(ProjectMetadataInteractionsDelete delete) {
    
    
    
    this.delete = delete;
  }


  public ProjectMetadataInteractions deleteVideo(ProjectMetadataInteractionsDeleteVideo deleteVideo) {
    
    
    
    
    this.deleteVideo = deleteVideo;
    return this;
  }

   /**
   * Get deleteVideo
   * @return deleteVideo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsDeleteVideo getDeleteVideo() {
    return deleteVideo;
  }


  public void setDeleteVideo(ProjectMetadataInteractionsDeleteVideo deleteVideo) {
    
    
    
    this.deleteVideo = deleteVideo;
  }


  public ProjectMetadataInteractions edit(ProjectMetadataInteractionsEdit edit) {
    
    
    
    
    this.edit = edit;
    return this;
  }

   /**
   * Get edit
   * @return edit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsEdit getEdit() {
    return edit;
  }


  public void setEdit(ProjectMetadataInteractionsEdit edit) {
    
    
    
    this.edit = edit;
  }


  public ProjectMetadataInteractions editSettings(ProjectMetadataInteractionsEditSettings editSettings) {
    
    
    
    
    this.editSettings = editSettings;
    return this;
  }

   /**
   * Get editSettings
   * @return editSettings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsEditSettings getEditSettings() {
    return editSettings;
  }


  public void setEditSettings(ProjectMetadataInteractionsEditSettings editSettings) {
    
    
    
    this.editSettings = editSettings;
  }


  public ProjectMetadataInteractions invite(ProjectMetadataInteractionsInvite invite) {
    
    
    
    
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsInvite getInvite() {
    return invite;
  }


  public void setInvite(ProjectMetadataInteractionsInvite invite) {
    
    
    
    this.invite = invite;
  }


  public ProjectMetadataInteractions moveVideo(ProjectMetadataInteractionsMoveVideo moveVideo) {
    
    
    
    
    this.moveVideo = moveVideo;
    return this;
  }

   /**
   * Get moveVideo
   * @return moveVideo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsMoveVideo getMoveVideo() {
    return moveVideo;
  }


  public void setMoveVideo(ProjectMetadataInteractionsMoveVideo moveVideo) {
    
    
    
    this.moveVideo = moveVideo;
  }


  public ProjectMetadataInteractions uploadVideo(ProjectMetadataInteractionsUploadVideo uploadVideo) {
    
    
    
    
    this.uploadVideo = uploadVideo;
    return this;
  }

   /**
   * Get uploadVideo
   * @return uploadVideo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsUploadVideo getUploadVideo() {
    return uploadVideo;
  }


  public void setUploadVideo(ProjectMetadataInteractionsUploadVideo uploadVideo) {
    
    
    
    this.uploadVideo = uploadVideo;
  }


  public ProjectMetadataInteractions view(ProjectMetadataInteractionsView view) {
    
    
    
    
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectMetadataInteractionsView getView() {
    return view;
  }


  public void setView(ProjectMetadataInteractionsView view) {
    
    
    
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
   * @return the ProjectMetadataInteractions instance itself
   */
  public ProjectMetadataInteractions putAdditionalProperty(String key, Object value) {
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
    ProjectMetadataInteractions projectMetadataInteractions = (ProjectMetadataInteractions) o;
    return Objects.equals(this.addSubfolder, projectMetadataInteractions.addSubfolder) &&
        Objects.equals(this.delete, projectMetadataInteractions.delete) &&
        Objects.equals(this.deleteVideo, projectMetadataInteractions.deleteVideo) &&
        Objects.equals(this.edit, projectMetadataInteractions.edit) &&
        Objects.equals(this.editSettings, projectMetadataInteractions.editSettings) &&
        Objects.equals(this.invite, projectMetadataInteractions.invite) &&
        Objects.equals(this.moveVideo, projectMetadataInteractions.moveVideo) &&
        Objects.equals(this.uploadVideo, projectMetadataInteractions.uploadVideo) &&
        Objects.equals(this.view, projectMetadataInteractions.view)&&
        Objects.equals(this.additionalProperties, projectMetadataInteractions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addSubfolder, delete, deleteVideo, edit, editSettings, invite, moveVideo, uploadVideo, view, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMetadataInteractions {\n");
    sb.append("    addSubfolder: ").append(toIndentedString(addSubfolder)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    deleteVideo: ").append(toIndentedString(deleteVideo)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    editSettings: ").append(toIndentedString(editSettings)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
    sb.append("    moveVideo: ").append(toIndentedString(moveVideo)).append("\n");
    sb.append("    uploadVideo: ").append(toIndentedString(uploadVideo)).append("\n");
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
    openapiFields.add("add_subfolder");
    openapiFields.add("delete");
    openapiFields.add("delete_video");
    openapiFields.add("edit");
    openapiFields.add("edit_settings");
    openapiFields.add("invite");
    openapiFields.add("move_video");
    openapiFields.add("upload_video");
    openapiFields.add("view");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("add_subfolder");
    openapiRequiredFields.add("delete");
    openapiRequiredFields.add("delete_video");
    openapiRequiredFields.add("edit");
    openapiRequiredFields.add("edit_settings");
    openapiRequiredFields.add("invite");
    openapiRequiredFields.add("move_video");
    openapiRequiredFields.add("upload_video");
    openapiRequiredFields.add("view");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectMetadataInteractions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectMetadataInteractions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectMetadataInteractions is not found in the empty JSON string", ProjectMetadataInteractions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectMetadataInteractions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `add_subfolder`
      ProjectMetadataInteractionsAddSubfolder.validateJsonObject(jsonObj.getAsJsonObject("add_subfolder"));
      // validate the required field `delete`
      ProjectMetadataInteractionsDelete.validateJsonObject(jsonObj.getAsJsonObject("delete"));
      // validate the required field `delete_video`
      ProjectMetadataInteractionsDeleteVideo.validateJsonObject(jsonObj.getAsJsonObject("delete_video"));
      // validate the required field `edit`
      ProjectMetadataInteractionsEdit.validateJsonObject(jsonObj.getAsJsonObject("edit"));
      // validate the required field `edit_settings`
      ProjectMetadataInteractionsEditSettings.validateJsonObject(jsonObj.getAsJsonObject("edit_settings"));
      // validate the required field `invite`
      ProjectMetadataInteractionsInvite.validateJsonObject(jsonObj.getAsJsonObject("invite"));
      // validate the required field `move_video`
      ProjectMetadataInteractionsMoveVideo.validateJsonObject(jsonObj.getAsJsonObject("move_video"));
      // validate the required field `upload_video`
      ProjectMetadataInteractionsUploadVideo.validateJsonObject(jsonObj.getAsJsonObject("upload_video"));
      // validate the required field `view`
      ProjectMetadataInteractionsView.validateJsonObject(jsonObj.getAsJsonObject("view"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectMetadataInteractions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectMetadataInteractions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectMetadataInteractions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectMetadataInteractions.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectMetadataInteractions>() {
           @Override
           public void write(JsonWriter out, ProjectMetadataInteractions value) throws IOException {
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
           public ProjectMetadataInteractions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectMetadataInteractions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectMetadataInteractions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectMetadataInteractions
  * @throws IOException if the JSON string is invalid with respect to ProjectMetadataInteractions
  */
  public static ProjectMetadataInteractions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectMetadataInteractions.class);
  }

 /**
  * Convert an instance of ProjectMetadataInteractions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

