

# UsersEssentialsEditVimeoAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bio** | **String** | The user&#39;s bio. |  [optional] |
|**contentFilter** | **List&lt;String&gt;** | A list of values describing the content in the user&#39;s videos. Find the full list in the [/contentratings](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. You must provide a comma-separated list if you&#39;re using a query string or an array if you&#39;re using JSON. |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) | The authenticated user&#39;s gender.  Option descriptions:  * &#x60;f&#x60; - The user&#39;s preferred pronouns are she and her.  * &#x60;m&#x60; - The user&#39;s preferred pronouns are he and him.  * &#x60;n&#x60; - The user would rather not give preferred pronouns.  * &#x60;o&#x60; - The user&#39;s preferred pronouns are they and them.  |  [optional] |
|**link** | **String** | The user&#39;s custom Vimeo URL. |  [optional] |
|**location** | **String** | The user&#39;s location. |  [optional] |
|**name** | **String** | The user&#39;s display name. |  [optional] |
|**password** | **String** | The default password for all future videos that this user uploads. To use this field, the **videos.privacy.view** field must be &#x60;password&#x60;. |  [optional] |
|**videos** | [**UsersEssentialsEditVimeoAccountRequestVideos**](UsersEssentialsEditVimeoAccountRequestVideos.md) |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| F | &quot;f&quot; |
| M | &quot;m&quot; |
| N | &quot;n&quot; |
| O | &quot;o&quot; |



