

# UpdateWebinarRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the webinar. |  [optional] |
|**description** | **String** | The description of the webinar. |  [optional] |
|**emailSettings** | [**UpdateWebinarRequestEmailSettings**](UpdateWebinarRequestEmailSettings.md) |  |  [optional] |
|**password** | **String** | The password when **privacy.view** is &#x60;password&#x60;. Anyone with the password can view the videos generated by streaming to the webinar event. |  [optional] |
|**privacy** | [**UpdateWebinarRequestPrivacy**](UpdateWebinarRequestPrivacy.md) |  |  [optional] |
|**schedule** | [**UpdateWebinarRequestSchedule**](UpdateWebinarRequestSchedule.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the webinar.  Option descriptions:  * &#x60;ended&#x60; - The webinar has ended.  * &#x60;started&#x60; - The webinar has started.  |  [optional] |
|**timeZone** | **String** | The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENDED | &quot;ended&quot; |
| STARTED | &quot;started&quot; |



