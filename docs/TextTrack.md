

# TextTrack


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the text track is active. |  |
|**displayLanguage** | **String** | The name of the language. |  |
|**hlsLink** | **String** | The read-only URL of the text track file, intended for use with HLS playback. |  |
|**hlsLinkExpiresTime** | **String** | The time in ISO 8601 format when the read-only HLS playback text track file expires. |  |
|**id** | **Double** | The text track identifier. |  |
|**language** | **String** | The language code for the text track. To see a full list, request &#x60;/languages?filter&#x3D;texttrack&#x60;. |  |
|**link** | **String** | The read-only URL of the text track file. You can upload to this link when you create it for the first time. |  |
|**linkExpiresTime** | **String** | The time in ISO 8601 format when the text track link expires. |  |
|**name** | **String** | The descriptive name of the text track. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of text track.  Option descriptions:  * &#x60;captions&#x60; - The text track is for captions.  * &#x60;subtitles&#x60; - The text track is for subtitles.  |  |
|**uri** | **String** | The relative URI of the text track. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAPTIONS | &quot;captions&quot; |
| SUBTITLES | &quot;subtitles&quot; |



