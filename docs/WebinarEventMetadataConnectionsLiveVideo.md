

# WebinarEventMetadataConnectionsLiveVideo

Information about the event's live video, where applicable.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**options** | **List&lt;String&gt;** | An array of the HTTP methods permitted on this URI. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the live video&#39;s RTMP link.  Option descriptions:  * &#x60;streaming&#x60; - The stream is open and receiving content.  |  |
|**uri** | **String** | The API URI that resolves to the connection data. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STREAMING | &quot;streaming&quot; |



