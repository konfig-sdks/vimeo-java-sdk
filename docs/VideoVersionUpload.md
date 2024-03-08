

# VideoVersionUpload

The version's upload information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approach** | [**ApproachEnum**](#ApproachEnum) | The approach for uploading the video.  Option descriptions:  * &#x60;post&#x60; - The video upload uses the POST approach.  * &#x60;pull&#x60; - The video upload uses the pull approach.  * &#x60;tus&#x60; - The video upload uses the tus approach.  |  [optional] |
|**form** | **String** | The HTML form for uploading a video through the POST approach. |  [optional] |
|**gcsUid** | **String** | The ID of the Google Cloud Storage upload. |  [optional] |
|**link** | **String** | The link of the video to capture through the pull approach. |  [optional] |
|**redirectUrl** | **String** | The redirect URL for the upload app. |  [optional] |
|**size** | **Double** | The file size in bytes of the uploaded video. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status code for the availability of the uploaded video.  Option descriptions:  * &#x60;complete&#x60; - The upload is complete.  * &#x60;error&#x60; - The upload ended with an error.  * &#x60;in_progress&#x60; - The upload is underway.  |  |
|**uploadLink** | **String** | The link for sending video file data. |  [optional] |



## Enum: ApproachEnum

| Name | Value |
|---- | -----|
| POST | &quot;post&quot; |
| PULL | &quot;pull&quot; |
| TUS | &quot;tus&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;complete&quot; |
| ERROR | &quot;error&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |



