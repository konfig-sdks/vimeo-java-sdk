

# AnimatedThumbset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clipUri** | **String** | The URI of the video from which the sets of animated thumbnails were created. |  |
|**createdOn** | **String** | The time in ISO 8601 format when the GIF was created. |  |
|**sizes** | [**List&lt;AnimatedThumbnail&gt;**](AnimatedThumbnail.md) | An array of all the animated thumbnails in the set. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The availability of the animated thumbnail.  Option descriptions:  * &#x60;cancelled&#x60; - The animated thumbnail&#39;s creation has been cancelled.  * &#x60;completed&#x60; - The animated thumbnail has been created.  * &#x60;failed&#x60; - The animated thumbnail&#39;s creation has failed.  * &#x60;started&#x60; - The animated thumbnail&#39;s creation has started.  |  |
|**uri** | **String** | The URI of the set of animated thumbnails. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELLED | &quot;cancelled&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| STARTED | &quot;started&quot; |



