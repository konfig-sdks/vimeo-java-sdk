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
import com.konfigthis.client.model.TeamRoleApplicablePermissionPolicies;
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
 * TeamRole
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TeamRole {
  public static final String SERIALIZED_NAME_APPLICABLE_PERMISSION_POLICIES = "applicable_permission_policies";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_PERMISSION_POLICIES)
  private TeamRoleApplicablePermissionPolicies applicablePermissionPolicies;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Double count;

  public static final String SERIALIZED_NAME_DISPLAY_DESCRIPTION = "display_description";
  @SerializedName(SERIALIZED_NAME_DISPLAY_DESCRIPTION)
  private String displayDescription;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * The untranslated role of the user who made the request.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can&#39;t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can&#39;t upload or edit videos. 
   */
  @JsonAdapter(PermissionLevelEnum.Adapter.class)
 public enum PermissionLevelEnum {
    ADMIN("Admin"),
    
    CONTRIBUTOR("Contributor"),
    
    CONTRIBUTOR_PLUS("Contributor Plus"),
    
    OWNER("Owner"),
    
    UPLOADER("Uploader"),
    
    VIEWER("Viewer");

    private String value;

    PermissionLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionLevelEnum fromValue(String value) {
      for (PermissionLevelEnum b : PermissionLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSION_LEVEL = "permission_level";
  @SerializedName(SERIALIZED_NAME_PERMISSION_LEVEL)
  private PermissionLevelEnum permissionLevel;

  /**
   * The untranslated role of the user who made the request.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can’t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can’t upload or edit videos. 
   */
  @JsonAdapter(RoleEnum.Adapter.class)
 public enum RoleEnum {
    ADMIN("Admin"),
    
    CONTRIBUTOR("Contributor"),
    
    CONTRIBUTOR_PLUS("Contributor Plus"),
    
    OWNER("Owner"),
    
    UPLOADER("Uploader"),
    
    VIEWER("Viewer");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public TeamRole() {
  }

  public TeamRole applicablePermissionPolicies(TeamRoleApplicablePermissionPolicies applicablePermissionPolicies) {
    
    
    
    
    this.applicablePermissionPolicies = applicablePermissionPolicies;
    return this;
  }

   /**
   * Get applicablePermissionPolicies
   * @return applicablePermissionPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TeamRoleApplicablePermissionPolicies getApplicablePermissionPolicies() {
    return applicablePermissionPolicies;
  }


  public void setApplicablePermissionPolicies(TeamRoleApplicablePermissionPolicies applicablePermissionPolicies) {
    
    
    
    this.applicablePermissionPolicies = applicablePermissionPolicies;
  }


  public TeamRole count(Double count) {
    
    
    
    
    this.count = count;
    return this;
  }

  public TeamRole count(Integer count) {
    
    
    
    
    this.count = count.doubleValue();
    return this;
  }

   /**
   * The total number of team members with this role.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The total number of team members with this role.")

  public Double getCount() {
    return count;
  }


  public void setCount(Double count) {
    
    
    
    this.count = count;
  }


  public TeamRole displayDescription(String displayDescription) {
    
    
    
    
    this.displayDescription = displayDescription;
    return this;
  }

   /**
   * The translated display description of the role.
   * @return displayDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Can view and manage all videos, folders, people, and analytics on the account.", value = "The translated display description of the role.")

  public String getDisplayDescription() {
    return displayDescription;
  }


  public void setDisplayDescription(String displayDescription) {
    
    
    
    this.displayDescription = displayDescription;
  }


  public TeamRole displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The translated display name of the role.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Admin", value = "The translated display name of the role.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public TeamRole permissionLevel(PermissionLevelEnum permissionLevel) {
    
    
    
    
    this.permissionLevel = permissionLevel;
    return this;
  }

   /**
   * The untranslated role of the user who made the request.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can&#39;t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can&#39;t upload or edit videos. 
   * @return permissionLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADMIN", required = true, value = "The untranslated role of the user who made the request.  Option descriptions:  * `Admin` - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * `Contributor` - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * `Contributor Plus` - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can't perform team administration tasks.  * `Owner` - The team member has owner permissions.  * `Uploader` - The team member has uploader permissions. They can upload videos for the entire team but can't edit videos.  * `Viewer` - The team member has viewer permissions. They can access team videos and specific team folders but can't upload or edit videos. ")

  public PermissionLevelEnum getPermissionLevel() {
    return permissionLevel;
  }


  public void setPermissionLevel(PermissionLevelEnum permissionLevel) {
    
    
    
    this.permissionLevel = permissionLevel;
  }


  public TeamRole role(RoleEnum role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * The untranslated role of the user who made the request.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can’t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can’t upload or edit videos. 
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADMIN", required = true, value = "The untranslated role of the user who made the request.  Option descriptions:  * `Admin` - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * `Contributor` - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * `Contributor Plus` - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can't perform team administration tasks.  * `Owner` - The team member has owner permissions.  * `Uploader` - The team member has uploader permissions. They can upload videos for the entire team but can’t edit videos.  * `Viewer` - The team member has viewer permissions. They can access team videos and specific team folders but can’t upload or edit videos. ")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    
    
    
    this.role = role;
  }


  public TeamRole uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The unique identifier to access the team role.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/users/152184/team/role", required = true, value = "The unique identifier to access the team role.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
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
   * @return the TeamRole instance itself
   */
  public TeamRole putAdditionalProperty(String key, Object value) {
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
    TeamRole teamRole = (TeamRole) o;
    return Objects.equals(this.applicablePermissionPolicies, teamRole.applicablePermissionPolicies) &&
        Objects.equals(this.count, teamRole.count) &&
        Objects.equals(this.displayDescription, teamRole.displayDescription) &&
        Objects.equals(this.displayName, teamRole.displayName) &&
        Objects.equals(this.permissionLevel, teamRole.permissionLevel) &&
        Objects.equals(this.role, teamRole.role) &&
        Objects.equals(this.uri, teamRole.uri)&&
        Objects.equals(this.additionalProperties, teamRole.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicablePermissionPolicies, count, displayDescription, displayName, permissionLevel, role, uri, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRole {\n");
    sb.append("    applicablePermissionPolicies: ").append(toIndentedString(applicablePermissionPolicies)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    displayDescription: ").append(toIndentedString(displayDescription)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    permissionLevel: ").append(toIndentedString(permissionLevel)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("applicable_permission_policies");
    openapiFields.add("count");
    openapiFields.add("display_description");
    openapiFields.add("display_name");
    openapiFields.add("permission_level");
    openapiFields.add("role");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("permission_level");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("uri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamRole
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamRole is not found in the empty JSON string", TeamRole.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamRole.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `applicable_permission_policies`
      if (jsonObj.get("applicable_permission_policies") != null && !jsonObj.get("applicable_permission_policies").isJsonNull()) {
        TeamRoleApplicablePermissionPolicies.validateJsonObject(jsonObj.getAsJsonObject("applicable_permission_policies"));
      }
      if ((jsonObj.get("display_description") != null && !jsonObj.get("display_description").isJsonNull()) && !jsonObj.get("display_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_description").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (!jsonObj.get("permission_level").isJsonNull() && !jsonObj.get("permission_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission_level").toString()));
      }
      if (!jsonObj.get("role").isJsonNull() && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamRole.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamRole>() {
           @Override
           public void write(JsonWriter out, TeamRole value) throws IOException {
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
           public TeamRole read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TeamRole instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TeamRole given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamRole
  * @throws IOException if the JSON string is invalid with respect to TeamRole
  */
  public static TeamRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamRole.class);
  }

 /**
  * Convert an instance of TeamRole to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
