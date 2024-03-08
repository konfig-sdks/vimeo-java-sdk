

# VideoVersion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the video version. This description can make use of the full unicode character set. This field appears in the response only when a corresponding value is present. |  [optional] |
|**active** | **Boolean** | Whether the video version is currently active. |  |
|**app** | [**ApiApp**](ApiApp.md) | The API app associated with the video version. |  |
|**canRestoreCreate** | **Boolean** | Whether the version can be restored. |  |
|**createStoryboardId** | **String** | The storyboard ID of the video version. |  |
|**createdTime** | **String** | The time in ISO 8601 format when the video version was created. |  |
|**downloadConfig** | **Object** | The download config associated with the version. |  |
|**duration** | **Double** | The duration in seconds of the video version. |  |
|**filename** | **String** | The file name of the video version. |  |
|**filesize** | **Double** | The size in byes of the video version file. |  |
|**hasInteractive** | **Boolean** | Whether the video has interactive capability. |  |
|**metadata** | [**VideoVersionMetadata**](VideoVersionMetadata.md) |  |  |
|**modifiedTime** | **String** | The time in ISO 8601 format when the video version was last modified. |  |
|**originVariableFrameResolution** | **Boolean** | Whether the video has unified resolution. If the value of this field is &#x60;false&#x60;, the video requires transcoding. |  |
|**play** | [**Play**](Play.md) | The &#x60;Play&#x60; representation. |  [optional] |
|**transcode** | [**VideoVersionTranscode**](VideoVersionTranscode.md) |  |  |
|**upload** | [**VideoVersionUpload**](VideoVersionUpload.md) |  |  |
|**uploadDate** | **String** | The time in ISO 8601 format when the video version was uploaded. |  |
|**uri** | **String** | The version&#39;s canonical relative URI. |  |
|**user** | [**User**](User.md) | The owner of the video version. |  |



