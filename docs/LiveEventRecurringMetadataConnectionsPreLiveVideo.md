

# LiveEventRecurringMetadataConnectionsPreLiveVideo

Information about the event's pre-live video, where applicable. A pre-live video is either activated or in the process of being activated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**options** | **List&lt;String&gt;** | An array of the HTTP methods permitted on this URI. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the pre-live video&#39;s RTMP link.  Option descriptions:  * &#x60;pending&#x60; - Vimeo is working on setting up the connection.  * &#x60;ready&#x60; - Resources have been provisioned for the event.  * &#x60;streaming&#x60; - Live video is currently streaming to the RTMP link.  * &#x60;unavailable&#x60; - The connection is ready, but streaming to the RTMP link has not yet begun.  |  |
|**uri** | **String** | The API URI that resolves to the connection data. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| READY | &quot;ready&quot; |
| STREAMING | &quot;streaming&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



