

# Comment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdOn** | **String** | The time in ISO 8601 format when the comment was posted. |  |
|**link** | **String** | The permalink to the comment. |  |
|**metadata** | [**CommentMetadata**](CommentMetadata.md) |  |  |
|**replies** | [**List&lt;Reply&gt;**](Reply.md) | The list of replies to the comment. |  |
|**resourceKey** | **String** | The comment&#39;s resource key string. |  |
|**text** | **String** | The content of the comment. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The Vimeo content to which the comment relates.  Option descriptions:  * &#x60;video&#x60; - The comment is about a video.  |  |
|**uri** | **String** | The unique identifier to access the comment resource. |  |
|**user** | [**User**](User.md) | The user who posted the comment. _This field is deprecated. Use the &#x60;metadata.connections.user&#x60; field instead._ |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VIDEO | &quot;video&quot; |



