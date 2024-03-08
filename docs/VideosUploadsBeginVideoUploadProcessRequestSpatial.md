

# VideosUploadsBeginVideoUploadProcessRequestSpatial


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directorTimeline** | [**List&lt;VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner&gt;**](VideosUploadsBeginVideoUploadProcessRequestSpatialDirectorTimelineInner.md) | An array representing the 360 director timeline. |  [optional] |
|**fieldOfView** | **Double** | The 360 field of view. This value must be between &#x60;30&#x60; and &#x60;90&#x60;; the default value is &#x60;50&#x60;. |  [optional] |
|**projection** | [**ProjectionEnum**](#ProjectionEnum) | The 360 spatial projection.  Option descriptions:  * &#x60;cubical&#x60; - Use cubical projection.  * &#x60;cylindrical&#x60; - Use cylindrical projection.  * &#x60;dome&#x60; - Use dome projection.  * &#x60;equirectangular&#x60; - Use equirectangular projection.  * &#x60;pyramid&#x60; - Use pyramid projection.  |  [optional] |
|**stereoFormat** | [**StereoFormatEnum**](#StereoFormatEnum) | The 360 spatial stereo format.  Option descriptions:  * &#x60;left-right&#x60; - Use left-right stereo.  * &#x60;mono&#x60; - Use monaural audio.  * &#x60;top-bottom&#x60; - Use top-bottom stereo.  |  [optional] |



## Enum: ProjectionEnum

| Name | Value |
|---- | -----|
| CUBICAL | &quot;cubical&quot; |
| CYLINDRICAL | &quot;cylindrical&quot; |
| DOME | &quot;dome&quot; |
| EQUIRECTANGULAR | &quot;equirectangular&quot; |
| PYRAMID | &quot;pyramid&quot; |



## Enum: StereoFormatEnum

| Name | Value |
|---- | -----|
| LEFT_RIGHT | &quot;left-right&quot; |
| MONO | &quot;mono&quot; |
| TOP_BOTTOM | &quot;top-bottom&quot; |



