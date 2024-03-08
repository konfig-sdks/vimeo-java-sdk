

# VideoSpatial

The video's 360 spatial data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directorTimeline** | [**List&lt;VideoSpatialDirectorTimelineInner&gt;**](VideoSpatialDirectorTimelineInner.md) | The video&#39;s 360 director timeline. |  |
|**fieldOfView** | **Double** | The video&#39;s 360 field of view value, ranging from a mininum of &#x60;30&#x60; to a maximum of &#x60;90&#x60;. The default value is &#x60;50&#x60;. |  |
|**projection** | [**ProjectionEnum**](#ProjectionEnum) | The video&#39;s 360 spatial projection.  Option descriptions:  * &#x60;cubical&#x60; - The spatial projection is cubical.  * &#x60;cylindrical&#x60; - The spatial projection is cylindrical.  * &#x60;dome&#x60; - The spatial projection is dome-shaped.  * &#x60;equirectangular&#x60; - The spatial projection is equirectangular.  * &#x60;pyramid&#x60; - The spatial projection is pyramid-shaped.  |  |
|**stereoFormat** | [**StereoFormatEnum**](#StereoFormatEnum) | The video&#39;s 360 stereo format.  Option descriptions:  * &#x60;left-right&#x60; - The stereo format is left-right.  * &#x60;mono&#x60; - The audio is monaural.  * &#x60;top-bottom&#x60; - The stereo format is top-bottom.  |  |



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



