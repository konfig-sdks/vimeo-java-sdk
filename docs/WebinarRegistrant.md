

# WebinarRegistrant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analytics** | [**WebinarRegistrantAnalytics**](WebinarRegistrantAnalytics.md) |  |  |
|**createdOn** | **Double** | The date in Unix time when the registrant&#39;s account was created. |  |
|**data** | **Object** | The values of all other fields as submitted on the webinar registration form. |  |
|**email** | **String** | The registrant&#39;s email address as submitted on the webinar registration form. |  |
|**firstName** | **String** | The registrant&#39;s first name as submitted on the webinar registration form. |  |
|**hasAttended** | [**HasAttendedEnum**](#HasAttendedEnum) | The registrant&#39;s attended status for the webinar.  Option descriptions:  * &#x60;B&#x60; - The registrant has been blocked from attending the webinar.  * &#x60;N&#x60; - The registrant has not attended the webinar.  * &#x60;Y&#x60; - The registrant has attended the webinar.  |  |
|**isBlocked** | **Boolean** | Whether the registrant&#39;s viewing status for the webinar is blocked. |  |
|**lastName** | **String** | The registrant&#39;s last name as submitted on the webinar registration form. |  |
|**referrer** | **String** | The web address where the registration form was submitted. |  |
|**sourceDetails** | **Object** | Details about the source from which the registrant&#39;s account was created. |  |
|**sourceType** | **String** | The source from which the registrant&#39;s account was created. |  |
|**uri** | **String** | The API URL to return the webinar registrant&#39;s account. |  |



## Enum: HasAttendedEnum

| Name | Value |
|---- | -----|
| B | &quot;B&quot; |
| N | &quot;N&quot; |
| Y | &quot;Y&quot; |



