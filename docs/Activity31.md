

# Activity31


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | [**Category**](Category.md) | The category associated with the event. This field is present only when the activity type is &#x60;category&#x60;. |  [optional] |
|**channel** | [**Channel**](Channel.md) | The channel associated with the event. This field is present only when the activity type is &#x60;channel&#x60;. |  [optional] |
|**clip** | [**Video**](Video.md) | The video associated with the activity. |  |
|**group** | [**Group**](Group.md) | The group associated with the event. This field is present only when the activity type is &#x60;group&#x60;. |  [optional] |
|**metadata** | [**Activity31Metadata**](Activity31Metadata.md) |  |  |
|**tag** | [**Tag**](Tag.md) | The tag associated with the event. This field is present only when the activity type is &#x60;tag&#x60;. |  [optional] |
|**time** | **String** | The time that the event occurred. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The activity type.  Option descriptions:  * &#x60;appearance&#x60; - The activity is an appearance action.  * &#x60;category&#x60; - The activity is a category action.  * &#x60;channel&#x60; - The activity is a channel action.  * &#x60;facebook_feed&#x60; - The activity is a Facebook feed action.  * &#x60;group&#x60; - The activity is a group action.  * &#x60;like&#x60; - The activity is a like action.  * &#x60;ondemand&#x60; - The activity is a Vimeo On Demand action.  * &#x60;share&#x60; - The activity is a share action.  * &#x60;tag&#x60; - The activity is a tag action.  * &#x60;twitter_timeline&#x60; - The activity is a Twitter timeline action.  * &#x60;upload&#x60; - The activity is an upload action.  |  |
|**user** | [**User**](User.md) | The user associated with the event. This field is present only when the activity type is &#x60;like&#x60;, &#x60;appearance&#x60;, or &#x60;share&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APPEARANCE | &quot;appearance&quot; |
| CATEGORY | &quot;category&quot; |
| CHANNEL | &quot;channel&quot; |
| FACEBOOK_FEED | &quot;facebook_feed&quot; |
| GROUP | &quot;group&quot; |
| LIKE | &quot;like&quot; |
| ONDEMAND | &quot;ondemand&quot; |
| SHARE | &quot;share&quot; |
| TAG | &quot;tag&quot; |
| TWITTER_TIMELINE | &quot;twitter_timeline&quot; |
| UPLOAD | &quot;upload&quot; |



