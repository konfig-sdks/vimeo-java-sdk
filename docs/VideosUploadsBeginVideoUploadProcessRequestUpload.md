

# VideosUploadsBeginVideoUploadProcessRequestUpload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approach** | [**ApproachEnum**](#ApproachEnum) | The upload approach.  Option descriptions:  * &#x60;post&#x60; - Use the &#x60;post&#x60; approach.  * &#x60;pull&#x60; - Use the &#x60;pull&#x60; approach.  * &#x60;tus&#x60; - Use the &#x60;tus&#x60; approach.  |  |
|**link** | **String** | The public URL at which the video is hosted. The URL must be valid for at least 24 hours. Use this parameter when **approach** is &#x60;pull&#x60;. |  [optional] |
|**redirectUrl** | **String** | The app&#39;s redirect URL. Use this parameter when **approach** is &#x60;post&#x60;. |  [optional] |
|**size** | **String** | The size in bytes of the video to upload. The maximum value of this field is &#x60;268435456000&#x60;, which corresponds to 250 GB. |  [optional] |



## Enum: ApproachEnum

| Name | Value |
|---- | -----|
| POST | &quot;post&quot; |
| PULL | &quot;pull&quot; |
| TUS | &quot;tus&quot; |



