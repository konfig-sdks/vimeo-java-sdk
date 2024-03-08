

# VideosTextTracksEditTextTrackRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the current text track is the *active text track,* or the one that appears in the player. Only one text track per language and per type can be active. |  [optional] |
|**language** | **String** | The language of the text track. For a full list of supported languages, use the [&#x60;/languages?filter&#x3D;texttracks&#x60;](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint. |  [optional] |
|**name** | **String** | The name of the text track. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of text track.  Option descriptions:  * &#x60;captions&#x60; - The text track is the captions type.  * &#x60;chapters&#x60; - The text track is the chapters type.  * &#x60;descriptions&#x60; - The text track is the descriptions type.  * &#x60;metadata&#x60; - The text track is the metadata type.  * &#x60;subtitles&#x60; - The text track is the subtitles type.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAPTIONS | &quot;captions&quot; |
| CHAPTERS | &quot;chapters&quot; |
| DESCRIPTIONS | &quot;descriptions&quot; |
| METADATA | &quot;metadata&quot; |
| SUBTITLES | &quot;subtitles&quot; |


