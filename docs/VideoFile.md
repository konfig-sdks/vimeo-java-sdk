

# VideoFile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**codec** | [**CodecEnum**](#CodecEnum) | The codec of the video file.  Option descriptions:  * &#x60;AV1&#x60; - The codec is AV1.  * &#x60;H264&#x60; - The codec is H264.  * &#x60;HEVC&#x60; - The codec is HEVC.  |  |
|**createdTime** | **String** | The time in ISO 8601 format when the video file was created. |  |
|**expires** | **String** | The time in ISO 8601 format when the video file expires. |  [optional] |
|**fps** | **Double** | The frames per second of the video. |  |
|**height** | **Double** | The height of the video in pixels. |  |
|**link** | **String** | The direct link to the video file. |  |
|**log** | [**VideoFileLog**](VideoFileLog.md) |  |  [optional] |
|**md5** | **String** | The MD5 hash of the video file. |  |
|**publicName** | **String** | The public name of the video file. |  |
|**quality** | [**QualityEnum**](#QualityEnum) | The video quality as determined by height and width.  Option descriptions:  * &#x60;hd&#x60; - The video is in high definition.  * &#x60;hls&#x60; - The video is suitable for HTTP live streaming.  * &#x60;mobile&#x60; - The video is mobile quality.  * &#x60;sd&#x60; - The video is in standard definition.  * &#x60;source&#x60; - The video&#39;s source file.  * &#x60;uhd&#x60; - The video resolution is 2K or higher.  |  |
|**rendition** | [**RenditionEnum**](#RenditionEnum) | The video rendition.  Option descriptions:  * &#x60;1080p&#x60; - The video has 1080p resolution.  * &#x60;240p&#x60; - The video has 240p resolution.  * &#x60;2k&#x60; - The video has 2K resolution.  * &#x60;360p&#x60; - The video has 360p resolution.  * &#x60;480p&#x60; - The video has 480p resolution.  * &#x60;4k&#x60; - The video has 4K resolution.  * &#x60;540p&#x60; - The video has 540p resolution.  * &#x60;5k&#x60; - The video has 5K resolution.  * &#x60;6k&#x60; - The video has 6K resolution.  * &#x60;720p&#x60; - The video has 720p resolution.  * &#x60;7k&#x60; - The video has 7K resolution.  * &#x60;8k&#x60; - The video has 8K resolution.  * &#x60;adaptive&#x60; - The video rendition is adaptive (for example, HLS or DASH).  * &#x60;source&#x60; - The video is the source file.  |  |
|**size** | **Double** | The approximate size in bytes of the video file. |  |
|**sizeShort** | **String** | The converted size of the video file rounded to two decimal places. |  |
|**sourceLink** | **String** | The source link of the video file. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of video file.  Option descriptions:  * &#x60;source&#x60; - The video file is a source file.  * &#x60;video/mp4&#x60; - The video file is in MP4 format.  * &#x60;video/webm&#x60; - The video file is in WebM format.  * &#x60;vp6/x-video&#x60; - The video file is in VP6 format.  |  |
|**videoFileId** | **String** | The ID of the video file. |  [optional] |
|**width** | **Double** | The width of the video in pixels. |  |



## Enum: CodecEnum

| Name | Value |
|---- | -----|
| AV1 | &quot;AV1&quot; |
| H264 | &quot;H264&quot; |
| HEVC | &quot;HEVC&quot; |



## Enum: QualityEnum

| Name | Value |
|---- | -----|
| HD | &quot;hd&quot; |
| HLS | &quot;hls&quot; |
| MOBILE | &quot;mobile&quot; |
| SD | &quot;sd&quot; |
| SOURCE | &quot;source&quot; |
| UHD | &quot;uhd&quot; |



## Enum: RenditionEnum

| Name | Value |
|---- | -----|
| _1080P | &quot;1080p&quot; |
| _240P | &quot;240p&quot; |
| _2K | &quot;2k&quot; |
| _360P | &quot;360p&quot; |
| _480P | &quot;480p&quot; |
| _4K | &quot;4k&quot; |
| _540P | &quot;540p&quot; |
| _5K | &quot;5k&quot; |
| _6K | &quot;6k&quot; |
| _720P | &quot;720p&quot; |
| _7K | &quot;7k&quot; |
| _8K | &quot;8k&quot; |
| ADAPTIVE | &quot;adaptive&quot; |
| SOURCE | &quot;source&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SOURCE | &quot;source&quot; |
| VIDEO_MP4 | &quot;video/mp4&quot; |
| VIDEO_WEBM | &quot;video/webm&quot; |
| VP6_X_VIDEO | &quot;vp6/x-video&quot; |



