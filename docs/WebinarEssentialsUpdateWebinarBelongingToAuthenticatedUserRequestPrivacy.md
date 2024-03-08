

# WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestPrivacy

The privacy settings of the webinar.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**embed** | [**EmbedEnum**](#EmbedEnum) | The initial embed privacy of the webinar.  Option descriptions:  * &#x60;private&#x60; - The webinar can&#39;t be embedded on any domain.  * &#x60;public&#x60; - The webinar can be embedded on any domain.  * &#x60;whitelist&#x60; - The webinar can be embedded on whitelisted domains only.  |  [optional] |
|**view** | [**ViewEnum**](#ViewEnum) | The initial privacy of the webinar. This can&#39;t be updated once the webinar is in session.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the webinar. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;nobody&#x60; - No one except the owner can access the webinar. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the live event.  * &#x60;team&#x60; - Only members of the authenticated user&#39;s team can access the webinar.  |  [optional] |



## Enum: EmbedEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |
| WHITELIST | &quot;whitelist&quot; |



## Enum: ViewEnum

| Name | Value |
|---- | -----|
| ANYBODY | &quot;anybody&quot; |
| NOBODY | &quot;nobody&quot; |
| PASSWORD | &quot;password&quot; |
| TEAM | &quot;team&quot; |



