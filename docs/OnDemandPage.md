

# OnDemandPage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the On Demand page. |  |
|**background** | [**Picture**](Picture.md) | The background image for the On Demand page. |  |
|**colors** | [**OnDemandPageColors**](OnDemandPageColors.md) |  |  |
|**contentRating** | **List&lt;String&gt;** | An array of the On Demand page&#39;s content ratings. |  |
|**createdTime** | **String** | The time in ISO 8601 format when the On Demand page was created. |  [optional] |
|**domainLink** | **String** | The link to the On Demand page on its own domain. |  |
|**episodes** | [**OnDemandPageEpisodes**](OnDemandPageEpisodes.md) |  |  |
|**film** | [**Video**](Video.md) | The On Demand page&#39;s film, if the page is for a film. |  [optional] |
|**genres** | [**List&lt;OnDemandGenre&gt;**](OnDemandGenre.md) | An array of the genres assigned to the On Demand page. |  |
|**link** | **String** | The link to the On Demand page. |  |
|**metadata** | [**OnDemandPageMetadata**](OnDemandPageMetadata.md) |  |  |
|**modifiedTime** | **String** | The time in ISO 8601 format when the On Demand page was last modified. |  [optional] |
|**name** | **String** | The descriptive title of the On Demand page. |  |
|**pictures** | [**Picture**](Picture.md) | The active poster for the On Demand page. |  |
|**preorder** | [**OnDemandPagePreorder**](OnDemandPagePreorder.md) |  |  |
|**published** | [**OnDemandPagePublished**](OnDemandPagePublished.md) |  |  |
|**rating** | **Double** | The rating of the On Demand page. |  |
|**resourceKey** | **String** | The On Demand resource key. |  |
|**sku** | **String** | The creator-designated SKU for the On Demand page. |  [optional] |
|**subscription** | [**OnDemandPageSubscription**](OnDemandPageSubscription.md) |  |  |
|**theme** | **String** | The graphical theme for the On Demand page. |  |
|**thumbnail** | [**Picture**](Picture.md) | The thumbnail image for the On Demand page. |  |
|**trailer** | [**Video**](Video.md) | The trailer for the On Demand page. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Whether the On Demand page is for a film or a series.  Option descriptions:  * &#x60;film&#x60; - The On Demand page is for a film.  * &#x60;series&#x60; - The On Demand page is for a series.  |  |
|**uri** | **String** | The relative URI of the On Demand page. |  |
|**user** | [**User**](User.md) | The user who created the On Demand page. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILM | &quot;film&quot; |
| SERIES | &quot;series&quot; |



