

# LiveEssentialsCreateEventForUserRequestSchedule

Information about the time or times that the event is expected to be live.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dailyTime** | **String** | The time in ISO 8601 format when the event is expected to be live, with the zero UTC offset &#x60;Z&#x60;. This parameter is required when **schedule.type** is &#x60;weekly&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | How often the event is expected to be live.  Option descriptions:  * &#x60;single&#x60; - The event is live one time only.  * &#x60;weekly&#x60; - The event is live on a weekly basis.  |  [optional] |
|**weekdays** | **List&lt;String&gt;** | A non-empty array of weekdays on which the event is expected to be live. Weekdays can range from 1 to 7, where 1 is Monday and 7 is Sunday. This parameter is required when **schedule.type** is &#x60;weekly&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| WEEKLY | &quot;weekly&quot; |



