

# WebinarEmailContent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | The HTML body of the email. |  |
|**buttonLink** | **String** | The target link for the call-to-action button in the email. |  |
|**buttonText** | **String** | The text for the call-to-action button in the email. |  |
|**header** | **String** | The HTML header section of the email. |  |
|**modifiedTime** | **String** | The time in ISO 8601 format when the webinar email content was updated. |  |
|**subject** | **String** | The HTML subject of the email. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The email type for which the content was customized.  Option descriptions:  * &#x60;email_event_reminder_24_hrs&#x60; - The webinar reminder email, which goes out 24 hours before the event.  * &#x60;email_post_event_thank_you&#x60; - The webinar post-event thank-you email.  * &#x60;email_registration_confirmation&#x60; - The webinar registration confirmation email.  |  |
|**useCalender** | **Boolean** | Whether to show the calendar in the email. |  |
|**useCustomLink** | **Boolean** | Whether to include a custom link in emails that are sent about the webinar. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVENT_REMINDER_24_HRS | &quot;email_event_reminder_24_hrs&quot; |
| POST_EVENT_THANK_YOU | &quot;email_post_event_thank_you&quot; |
| REGISTRATION_CONFIRMATION | &quot;email_registration_confirmation&quot; |



