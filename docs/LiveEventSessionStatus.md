

# LiveEventSessionStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archive** | [**LiveEventSessionStatusArchive**](LiveEventSessionStatusArchive.md) |  |  |
|**canManage** | **Boolean** | Whether the current user can manage the event. |  |
|**id** | **Double** | The ID of the live video. |  |
|**ingest** | [**LiveEventSessionStatusIngest**](LiveEventSessionStatusIngest.md) |  |  |
|**metering** | [**LiveEventSessionStatusMetering**](LiveEventSessionStatusMetering.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the live event.  Option descriptions:  * &#x60;ended&#x60; - The live event has ended.  * &#x60;started&#x60; - The live event has started.  |  |
|**streamMode** | [**StreamModeEnum**](#StreamModeEnum) | The stream mode of the event.  Option descriptions:  * &#x60;live&#x60; - The stream is live playback.  * &#x60;record&#x60; - The stream is in record mode.  * &#x60;simulive&#x60; - The stream is scheduled media playback.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENDED | &quot;ended&quot; |
| STARTED | &quot;started&quot; |



## Enum: StreamModeEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;live&quot; |
| RECORD | &quot;record&quot; |
| SIMULIVE | &quot;simulive&quot; |



