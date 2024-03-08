

# LiveEventSchedule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dailyTime** | **String** | When **schedule.type** is &#x60;weekly&#x60;, the time in ISO 8601 format when the event is expected to be live. |  [optional] |
|**endTime** | **String** | The time in ISO 8601 format when the live event is expected to end. |  [optional] |
|**rrule** | **String** | The recurrence rule for the event&#39;s schedule according to [RFC 5545](https://datatracker.ietf.org/doc/html/rfc5545). |  [optional] |
|**scheduledTime** | **String** | When **schedule.type** is &#x60;weekly&#x60;, the time in ISO 8601 format when the first occurrence of the event is expected to be live. |  [optional] |
|**startTime** | **String** | The time in ISO 8601 format when the live event is expected to be live. |  [optional] |
|**timeZone** | **String** | The time zone of the live event. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The schedule of the live event.  Option descriptions:  * &#x60;single&#x60; - The event is live only once.  * &#x60;weekly&#x60; - The event is live on a recurring weekly basis.  |  |
|**weekdays** | **List&lt;String&gt;** | When **schedule.type** is &#x60;weekly&#x60;, the weekdays in UTC when the event is expected to be live. The value of this field ranges from &#x60;1&#x60; to &#x60;7&#x60;, where &#x60;1&#x60; is Monday and &#x60;7&#x60; is Sunday. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| WEEKLY | &quot;weekly&quot; |



