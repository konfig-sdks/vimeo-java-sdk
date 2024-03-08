

# VideoTranscode

The transcode information of the video upload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The video&#39;s availability status.  Option descriptions:  * &#x60;complete&#x60; - Transcoding is complete. The video is available.  * &#x60;error&#x60; - There was a transcoding error. The video isn&#39;t available.  * &#x60;in_progress&#x60; - Transcoding is currently underway. The video isn&#39;t available yet.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;complete&quot; |
| ERROR | &quot;error&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |



