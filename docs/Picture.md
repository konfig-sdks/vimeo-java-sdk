

# Picture


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the picture is currently active. |  |
|**baseLink** | **String** | The base link to the image file, without any parameters. |  |
|**defaultPicture** | **Boolean** | Whether the picture is Vimeo&#39;s default. |  |
|**link** | **String** | The upload URL of the picture. This field appears upon the initial creation of a picture resource. |  [optional] |
|**resourceKey** | **String** | The resource key string of the picture. |  |
|**sizes** | [**List&lt;PictureSizesInner&gt;**](PictureSizesInner.md) | An array containing reference information about all available image files. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of picture.  Option descriptions:  * &#x60;caution&#x60; - The picture isn&#39;t appropriate for all ages.  * &#x60;custom&#x60; - The picture is a custom video image.  * &#x60;default&#x60; - The picture is the default video image.  |  |
|**uri** | **String** | The URI of the picture. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAUTION | &quot;caution&quot; |
| CUSTOM | &quot;custom&quot; |
| DEFAULT | &quot;default&quot; |



