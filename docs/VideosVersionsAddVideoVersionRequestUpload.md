

# VideosVersionsAddVideoVersionRequestUpload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approach** | [**ApproachEnum**](#ApproachEnum) | The approach by which to upload the version.  Option descriptions:  * &#x60;post&#x60; - Use the &#x60;post&#x60; method.  * &#x60;pull&#x60; - Use the &#x60;pull&#x60; method.  * &#x60;tus&#x60; - Use the &#x60;tus&#x60; method.  |  |
|**link** | **String** | The public URL from which to download the version when **upload.approach** is &#x60;pull&#x60;. This URL must be valid for at least 24 hours. |  [optional] |
|**redirectUrl** | **String** | The app&#39;s redirect URL when **upload.approach** is &#x60;post&#x60;. |  [optional] |
|**size** | **String** | The upload size of the version. |  [optional] |



## Enum: ApproachEnum

| Name | Value |
|---- | -----|
| POST | &quot;post&quot; |
| PULL | &quot;pull&quot; |
| TUS | &quot;tus&quot; |



