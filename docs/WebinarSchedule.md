

# WebinarSchedule

The description of the time or times that the webinar is expected to be live.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dailyTime** | **String** | The time in ISO 8601 format at which the webinar is expected to be live when **schedule.type** is &#x60;weekly&#x60;. |  |
|**endTime** | **String** | The date in ISO 8601 format on which the webinar is expected to end. This field applies when **schedule.type** is &#x60;single&#x60;. |  |
|**scheduledTime** | **String** | The date in ISO 8601 format on which the first occurrence of the webinar is expected to be live when **schedule.type** is &#x60;weekly&#x60;. |  |
|**startTime** | **String** | The date in ISO 8601 format on which the webinar is expected to be live when **schedule.type** is &#x60;single&#x60;. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The schedule of the webinar.  Option descriptions:  * &#x60;single&#x60; - The webinar is live only once.  * &#x60;weekly&#x60; - The webinar is live on a recurring weekly basis.  |  |
|**weekdays** | **List&lt;String&gt;** | The weekdays in UTC on which the webinar is expected to be live when **schedule.time** is &#x60;weekly&#x60;. The value of this field ranges from &#x60;1&#x60; to &#x60;7&#x60;, where &#x60;1&#x60; is Monday and &#x60;7&#x60; is Sunday. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| WEEKLY | &quot;weekly&quot; |



