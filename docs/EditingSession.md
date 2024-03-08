

# EditingSession


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasWatermark** | **Boolean** | Whether the video has a watermark. |  |
|**isEditedByTve** | **Boolean** | Whether the video has been edited by Transcript Video Editing. |  |
|**isMaxResolution** | **Boolean** | Whether the current version of the video is at the maximum resolution. |  |
|**isMusicLicensed** | **Boolean** | Whether the video has licensed music. |  |
|**isRated** | **Boolean** | Whether the video has been rated. |  |
|**minTierForMovie** | **String** | The minimum required Vimeo membership for the user to be able to share the video. |  |
|**resultVideoHash** | **String** | The result video hash for the created video. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the video.  Option descriptions:  * &#x60;done&#x60; - The video is finished processing.  * &#x60;processing&#x60; - The video is still being processed.  |  |
|**versionUri** | **String** | The version&#39;s canonical relative URI. |  [optional] |
|**vsid** | **Double** | The ID of the video&#39;s editing session. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DONE | &quot;done&quot; |
| PROCESSING | &quot;processing&quot; |



