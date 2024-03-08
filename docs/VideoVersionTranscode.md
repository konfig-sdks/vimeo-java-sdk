

# VideoVersionTranscode

The version's transcode information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status code for the availability of the video version.  Option descriptions:  * &#x60;complete&#x60; - Transcoding is complete. The video version is available.  * &#x60;error&#x60; - There was a transcoding error. The video version isn&#39;t available.  * &#x60;in_progress&#x60; - Transcoding is in progress. The video version isn&#39;t available yet.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;complete&quot; |
| ERROR | &quot;error&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |



