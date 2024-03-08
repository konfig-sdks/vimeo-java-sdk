

# LiveEventSessionStatusIngest

The ingest of the video.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encoderType** | [**EncoderTypeEnum**](#EncoderTypeEnum) | The protocol used for this session.  Option descriptions:  * &#x60;dash&#x60; - The protocol is DASH.  * &#x60;rtmp&#x60; - The protocol is RTMP.  * &#x60;simple_live&#x60; - The protocol is Simplelive.  * &#x60;studio_cloud&#x60; - The protocol is StudioCloud.  * &#x60;unknown&#x60; - The protocol is unknown or not set.  * &#x60;webrtc&#x60; - The protocol is WebRTC.  |  |
|**endTime** | **Double** | The timestamp in UTC format when the live stream ended. |  |
|**height** | **Double** | The height of the live video in pixels. |  |
|**isRtmpSession** | **Boolean** | Whether the session is using RTMP. |  |
|**isScheduledPlayback** | **Boolean** | Whether the stream is scheduled media playback. |  |
|**rtmpExpiresAt** | **String** | The time in ISO 8601 format when the RTMP expires. |  |
|**rtmpLink** | **String** | The upstream RTMP link. Send your live content to this link to create a live video on the event. |  |
|**rtmpsLink** | **String** | The upstream RTMPS link. Send your live content to this secure link to create a live video on the event. |  |
|**scheduledStartTime** | **String** | The scheduled start time of the live video in ISO 8601 format. |  |
|**sessionId** | **String** | The session ID. |  |
|**startTime** | **Double** | The timestamp in UTC format when the live video started. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The ingest status of the live video.  Option descriptions:  * &#x60;0&#x60; - There’s a live video, but no RMTP URL or key.  * &#x60;1&#x60; - There’s an RMTP URL and key, but the machine is provisioning.  * &#x60;2&#x60; - There’s an RMTP URL and key, and the machine is provisioned, but the stream hasn’t started yet.  * &#x60;3&#x60; - There’s an RMTP URL and key, and the machine is provisioned, but the stream didn’t start before the machine timed out.  * &#x60;4&#x60; - The stream has started and is currently underway.  * &#x60;5&#x60; - The stream has ended.  |  |
|**streamEndedReason** | **Double** | The reason why the stream ended. If the stream hasn&#39;t ended, this field is empty. |  |
|**streamKey** | **String** | The stream key used in conjunction with the RTMP and RTMPS links. |  |
|**width** | **Double** | The width of the live video in pixels. |  |



## Enum: EncoderTypeEnum

| Name | Value |
|---- | -----|
| DASH | &quot;dash&quot; |
| RTMP | &quot;rtmp&quot; |
| SIMPLE_LIVE | &quot;simple_live&quot; |
| STUDIO_CLOUD | &quot;studio_cloud&quot; |
| UNKNOWN | &quot;unknown&quot; |
| WEBRTC | &quot;webrtc&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |



