

# EmailCaptureForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clipId** | **Double** | The ID of the video associated with the form. If there is no associated video, the value of this field is &#x60;-1&#x60;. |  |
|**createdTime** | **String** | The time in ISO 8601 format when the form was created. |  |
|**customFields** | [**List&lt;EmailCaptureFormCustomFieldsInner&gt;**](EmailCaptureFormCustomFieldsInner.md) | The fields to show in the form. |  |
|**customLogo** | **Double** | The ID of the logo image to display on the form. |  |
|**customMessage** | **String** | The message to display on the form. |  |
|**emailLists** | [**List&lt;EmailCaptureFormEmailListsInner&gt;**](EmailCaptureFormEmailListsInner.md) | The mailing lists on a third-party email service provider that submissions should get synced to. |  |
|**hiddenFields** | [**List&lt;EmailCaptureFormHiddenFieldsInner&gt;**](EmailCaptureFormHiddenFieldsInner.md) | The hidden fields to show only in the webinar management page. These fields are hidden in the player registration form. |  |
|**id** | **Double** | The ID of the email capture form. |  |
|**position** | [**PositionEnum**](#PositionEnum) | When the form appears relative to the video playback.  Option descriptions:  * &#x60;after-video&#x60; - The form appears immediately after the video ends.  * &#x60;before-video&#x60; - The form appears before the video begins.  * &#x60;during-video&#x60; - The form appears during the video at the time specified by the **timecode** field.  |  |
|**privacyPolicy** | **String** | The URL of the privacy policy related to the form. |  |
|**skippable** | **Boolean** | Whether the user can skip the form. |  |
|**timecode** | **String** | The timecode for when the form appears. This field is used when the value of **position** is &#x60;during-video&#x60;. |  |
|**uri** | **String** | The canonical relative URI of the video&#39;s email capture form. |  |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| AFTER_VIDEO | &quot;after-video&quot; |
| BEFORE_VIDEO | &quot;before-video&quot; |
| DURING_VIDEO | &quot;during-video&quot; |



