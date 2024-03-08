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
import com.konfigthis.client.model.AnalyticsCountry;
import com.konfigthis.client.model.AnalyticsMetadata;
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
 * Analytics
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Analytics {
  public static final String SERIALIZED_NAME_AVERAGE_PERCENT_WATCHED = "average_percent_watched";
  @SerializedName(SERIALIZED_NAME_AVERAGE_PERCENT_WATCHED)
  private Double averagePercentWatched;

  public static final String SERIALIZED_NAME_AVERAGE_TIME_WATCHED = "average_time_watched";
  @SerializedName(SERIALIZED_NAME_AVERAGE_TIME_WATCHED)
  private Double averageTimeWatched;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private AnalyticsCountry country;

  public static final String SERIALIZED_NAME_DOWNLOADS = "downloads";
  @SerializedName(SERIALIZED_NAME_DOWNLOADS)
  private Double downloads;

  public static final String SERIALIZED_NAME_EMBED_DOMAIN = "embed_domain";
  @SerializedName(SERIALIZED_NAME_EMBED_DOMAIN)
  private String embedDomain;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_FINISHES = "finishes";
  @SerializedName(SERIALIZED_NAME_FINISHES)
  private Double finishes;

  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Double impressions;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private AnalyticsMetadata metadata;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_TOTAL_TIME_WATCHED = "total_time_watched";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME_WATCHED)
  private Double totalTimeWatched;

  public static final String SERIALIZED_NAME_UNIQUE_IMPRESSIONS = "unique_impressions";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IMPRESSIONS)
  private Double uniqueImpressions;

  public static final String SERIALIZED_NAME_UNIQUE_VIEWERS = "unique_viewers";
  @SerializedName(SERIALIZED_NAME_UNIQUE_VIEWERS)
  private Double uniqueViewers;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private Double views;

  public Analytics() {
  }

  public Analytics averagePercentWatched(Double averagePercentWatched) {
    
    
    
    
    this.averagePercentWatched = averagePercentWatched;
    return this;
  }

  public Analytics averagePercentWatched(Integer averagePercentWatched) {
    
    
    
    
    this.averagePercentWatched = averagePercentWatched.doubleValue();
    return this;
  }

   /**
   * The average percent watched in seconds of the corresponding Vimeo content.
   * @return averagePercentWatched
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50", required = true, value = "The average percent watched in seconds of the corresponding Vimeo content.")

  public Double getAveragePercentWatched() {
    return averagePercentWatched;
  }


  public void setAveragePercentWatched(Double averagePercentWatched) {
    
    
    
    this.averagePercentWatched = averagePercentWatched;
  }


  public Analytics averageTimeWatched(Double averageTimeWatched) {
    
    
    
    
    this.averageTimeWatched = averageTimeWatched;
    return this;
  }

  public Analytics averageTimeWatched(Integer averageTimeWatched) {
    
    
    
    
    this.averageTimeWatched = averageTimeWatched.doubleValue();
    return this;
  }

   /**
   * The average time watched in seconds of the corresponding Vimeo content.
   * @return averageTimeWatched
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "The average time watched in seconds of the corresponding Vimeo content.")

  public Double getAverageTimeWatched() {
    return averageTimeWatched;
  }


  public void setAverageTimeWatched(Double averageTimeWatched) {
    
    
    
    this.averageTimeWatched = averageTimeWatched;
  }


  public Analytics country(AnalyticsCountry country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AnalyticsCountry getCountry() {
    return country;
  }


  public void setCountry(AnalyticsCountry country) {
    
    
    
    this.country = country;
  }


  public Analytics downloads(Double downloads) {
    
    
    
    
    this.downloads = downloads;
    return this;
  }

  public Analytics downloads(Integer downloads) {
    
    
    
    
    this.downloads = downloads.doubleValue();
    return this;
  }

   /**
   * The number of downloads of the corresponding Vimeo content.
   * @return downloads
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of downloads of the corresponding Vimeo content.")

  public Double getDownloads() {
    return downloads;
  }


  public void setDownloads(Double downloads) {
    
    
    
    this.downloads = downloads;
  }


  public Analytics embedDomain(String embedDomain) {
    
    
    
    
    this.embedDomain = embedDomain;
    return this;
  }

   /**
   * The domain name of the website.
   * @return embedDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "vimeo.com", required = true, value = "The domain name of the website.")

  public String getEmbedDomain() {
    return embedDomain;
  }


  public void setEmbedDomain(String embedDomain) {
    
    
    
    this.embedDomain = embedDomain;
  }


  public Analytics endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end time of the time interval in ISO 8601 format.
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-11-06T21:04:47+00:00", required = true, value = "The end time of the time interval in ISO 8601 format.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public Analytics finishes(Double finishes) {
    
    
    
    
    this.finishes = finishes;
    return this;
  }

  public Analytics finishes(Integer finishes) {
    
    
    
    
    this.finishes = finishes.doubleValue();
    return this;
  }

   /**
   * The number of finishes of the corresponding Vimeo content.
   * @return finishes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of finishes of the corresponding Vimeo content.")

  public Double getFinishes() {
    return finishes;
  }


  public void setFinishes(Double finishes) {
    
    
    
    this.finishes = finishes;
  }


  public Analytics impressions(Double impressions) {
    
    
    
    
    this.impressions = impressions;
    return this;
  }

  public Analytics impressions(Integer impressions) {
    
    
    
    
    this.impressions = impressions.doubleValue();
    return this;
  }

   /**
   * The number of impressions of the corresponding Vimeo content.
   * @return impressions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of impressions of the corresponding Vimeo content.")

  public Double getImpressions() {
    return impressions;
  }


  public void setImpressions(Double impressions) {
    
    
    
    this.impressions = impressions;
  }


  public Analytics metadata(AnalyticsMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AnalyticsMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(AnalyticsMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public Analytics startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start time of the time interval in ISO 8601 format.
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-11-05T21:04:47+00:00", required = true, value = "The start time of the time interval in ISO 8601 format.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public Analytics totalTimeWatched(Double totalTimeWatched) {
    
    
    
    
    this.totalTimeWatched = totalTimeWatched;
    return this;
  }

  public Analytics totalTimeWatched(Integer totalTimeWatched) {
    
    
    
    
    this.totalTimeWatched = totalTimeWatched.doubleValue();
    return this;
  }

   /**
   * The total time watched in seconds of the corresponding Vimeo content.
   * @return totalTimeWatched
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "The total time watched in seconds of the corresponding Vimeo content.")

  public Double getTotalTimeWatched() {
    return totalTimeWatched;
  }


  public void setTotalTimeWatched(Double totalTimeWatched) {
    
    
    
    this.totalTimeWatched = totalTimeWatched;
  }


  public Analytics uniqueImpressions(Double uniqueImpressions) {
    
    
    
    
    this.uniqueImpressions = uniqueImpressions;
    return this;
  }

  public Analytics uniqueImpressions(Integer uniqueImpressions) {
    
    
    
    
    this.uniqueImpressions = uniqueImpressions.doubleValue();
    return this;
  }

   /**
   * The number of unique impressions of the corresponding Vimeo content.
   * @return uniqueImpressions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of unique impressions of the corresponding Vimeo content.")

  public Double getUniqueImpressions() {
    return uniqueImpressions;
  }


  public void setUniqueImpressions(Double uniqueImpressions) {
    
    
    
    this.uniqueImpressions = uniqueImpressions;
  }


  public Analytics uniqueViewers(Double uniqueViewers) {
    
    
    
    
    this.uniqueViewers = uniqueViewers;
    return this;
  }

  public Analytics uniqueViewers(Integer uniqueViewers) {
    
    
    
    
    this.uniqueViewers = uniqueViewers.doubleValue();
    return this;
  }

   /**
   * The number of unique viewers of the corresponding Vimeo content.
   * @return uniqueViewers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of unique viewers of the corresponding Vimeo content.")

  public Double getUniqueViewers() {
    return uniqueViewers;
  }


  public void setUniqueViewers(Double uniqueViewers) {
    
    
    
    this.uniqueViewers = uniqueViewers;
  }


  public Analytics views(Double views) {
    
    
    
    
    this.views = views;
    return this;
  }

  public Analytics views(Integer views) {
    
    
    
    
    this.views = views.doubleValue();
    return this;
  }

   /**
   * The number of views of the corresponding Vimeo content.
   * @return views
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of views of the corresponding Vimeo content.")

  public Double getViews() {
    return views;
  }


  public void setViews(Double views) {
    
    
    
    this.views = views;
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
   * @return the Analytics instance itself
   */
  public Analytics putAdditionalProperty(String key, Object value) {
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
    Analytics analytics = (Analytics) o;
    return Objects.equals(this.averagePercentWatched, analytics.averagePercentWatched) &&
        Objects.equals(this.averageTimeWatched, analytics.averageTimeWatched) &&
        Objects.equals(this.country, analytics.country) &&
        Objects.equals(this.downloads, analytics.downloads) &&
        Objects.equals(this.embedDomain, analytics.embedDomain) &&
        Objects.equals(this.endDate, analytics.endDate) &&
        Objects.equals(this.finishes, analytics.finishes) &&
        Objects.equals(this.impressions, analytics.impressions) &&
        Objects.equals(this.metadata, analytics.metadata) &&
        Objects.equals(this.startDate, analytics.startDate) &&
        Objects.equals(this.totalTimeWatched, analytics.totalTimeWatched) &&
        Objects.equals(this.uniqueImpressions, analytics.uniqueImpressions) &&
        Objects.equals(this.uniqueViewers, analytics.uniqueViewers) &&
        Objects.equals(this.views, analytics.views)&&
        Objects.equals(this.additionalProperties, analytics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averagePercentWatched, averageTimeWatched, country, downloads, embedDomain, endDate, finishes, impressions, metadata, startDate, totalTimeWatched, uniqueImpressions, uniqueViewers, views, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Analytics {\n");
    sb.append("    averagePercentWatched: ").append(toIndentedString(averagePercentWatched)).append("\n");
    sb.append("    averageTimeWatched: ").append(toIndentedString(averageTimeWatched)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
    sb.append("    embedDomain: ").append(toIndentedString(embedDomain)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    finishes: ").append(toIndentedString(finishes)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    totalTimeWatched: ").append(toIndentedString(totalTimeWatched)).append("\n");
    sb.append("    uniqueImpressions: ").append(toIndentedString(uniqueImpressions)).append("\n");
    sb.append("    uniqueViewers: ").append(toIndentedString(uniqueViewers)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
    openapiFields.add("average_percent_watched");
    openapiFields.add("average_time_watched");
    openapiFields.add("country");
    openapiFields.add("downloads");
    openapiFields.add("embed_domain");
    openapiFields.add("end_date");
    openapiFields.add("finishes");
    openapiFields.add("impressions");
    openapiFields.add("metadata");
    openapiFields.add("start_date");
    openapiFields.add("total_time_watched");
    openapiFields.add("unique_impressions");
    openapiFields.add("unique_viewers");
    openapiFields.add("views");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("average_percent_watched");
    openapiRequiredFields.add("average_time_watched");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("downloads");
    openapiRequiredFields.add("embed_domain");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("finishes");
    openapiRequiredFields.add("impressions");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("total_time_watched");
    openapiRequiredFields.add("unique_impressions");
    openapiRequiredFields.add("unique_viewers");
    openapiRequiredFields.add("views");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Analytics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Analytics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Analytics is not found in the empty JSON string", Analytics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Analytics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `country`
      AnalyticsCountry.validateJsonObject(jsonObj.getAsJsonObject("country"));
      if (!jsonObj.get("embed_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embed_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embed_domain").toString()));
      }
      if (!jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // validate the required field `metadata`
      AnalyticsMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      if (!jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Analytics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Analytics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Analytics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Analytics.class));

       return (TypeAdapter<T>) new TypeAdapter<Analytics>() {
           @Override
           public void write(JsonWriter out, Analytics value) throws IOException {
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
           public Analytics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Analytics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Analytics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Analytics
  * @throws IOException if the JSON string is invalid with respect to Analytics
  */
  public static Analytics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Analytics.class);
  }

 /**
  * Convert an instance of Analytics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
