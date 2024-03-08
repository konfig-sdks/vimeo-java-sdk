

# WebinarEssentialsCreateWebinarRequestSchedule

Information about the time or times that the webinar is expected to be live.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dailyTime** | **String** | The time in ISO 8601 format when the webinar is expected to be live, with the zero UTC offset &#x60;Z&#x60;. This parameter is required when **schedule.type** is &#x60;weekly&#x60;. _This field is deprecated._ |  [optional] |
|**endTime** | **String** | The time in ISO 8601 format when the webinar is expected to end, with support for different time offsets. This parameter is required when **schedule.type** is &#x60;single&#x60;. |  [optional] |
|**startTime** | **String** | The time in ISO 8601 format when the webinar is expected to be live, with support for different time offsets. This parameter is required when **schedule.type** is &#x60;single&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | How often the webinar is expected to be live.  Option descriptions:  * &#x60;single&#x60; - The webinar is live one time only.  * &#x60;weekly&#x60; - The webinar is live on a weekly basis. _This field is deprecated._  |  [optional] |
|**weekdays** | **List&lt;String&gt;** | A non-empty array of weekdays on which the webinar is expected to be live. Weekdays can range from 1 to 7, where 1 is Monday and 7 is Sunday. This parameter is required when **schedule.type** is &#x60;weekly&#x60;. _This field is deprecated._ |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| WEEKLY | &quot;weekly&quot; |



