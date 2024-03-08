

# PresetSettingsOutro


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clips** | **String** | A comma-separated list of video URIs. This field appears only when **type** is &#x60;uploaded_clips&#x60;. |  [optional] |
|**link** | [**PresetSettingsOutroLink**](PresetSettingsOutroLink.md) |  |  [optional] |
|**text** | **String** | The outro text. This appears only when **type** is &#x60;text&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The preset outro type.  Option descriptions:  * &#x60;link&#x60; - The outro includes a link.  * &#x60;no idea&#x60; - The outro type is &#x60;no idea&#x60;. The outro includes uploaded videos.  * &#x60;text&#x60; - The outro includes text.  * &#x60;uploaded_clips&#x60; - The outro includes uploaded videos.  * &#x60;uploaded_videos&#x60; - The outro includes uploaded videos.  |  |
|**videos** | **String** | A comma-separated list of video URIs. This field appears only when **type** is &#x60;no idea&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| NO_IDEA | &quot;no idea&quot; |
| TEXT | &quot;text&quot; |
| UPLOADED_CLIPS | &quot;uploaded_clips&quot; |
| UPLOADED_VIDEOS | &quot;uploaded_videos&quot; |



