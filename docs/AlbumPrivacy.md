

# AlbumPrivacy

The privacy settings of the showcase.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**password** | **String** | The showcase&#39;s password. This field appears only when **privacy.view** is &#x60;password&#x60;. |  [optional] |
|**view** | [**ViewEnum**](#ViewEnum) | The access level of the showcase.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the showcase. This privacy setting appears as &#x60;Public&#x60; on the Vimeo front end.  * &#x60;embed_only&#x60; - The showcase doesn&#39;t appear on Vimeo, but the owner can embed it on other sites.  * &#x60;nobody&#x60; - No one can access the showacse, including the owner. This privacy setting appears as &#x60;Private&#x60; on the Vimeo front end.  * &#x60;password&#x60; - Only those with the password can access the showcase.  * &#x60;team&#x60; - Only the owner and members of the owner&#39;s team can access the showcase.  * &#x60;unlisted&#x60; - The showcase can&#39;t be accessed if the URL omits its unlisted hash.  |  |



## Enum: ViewEnum

| Name | Value |
|---- | -----|
| ANYBODY | &quot;anybody&quot; |
| EMBED_ONLY | &quot;embed_only&quot; |
| NOBODY | &quot;nobody&quot; |
| PASSWORD | &quot;password&quot; |
| TEAM | &quot;team&quot; |
| UNLISTED | &quot;unlisted&quot; |



