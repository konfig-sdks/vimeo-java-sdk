

# TeamMembership


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessGrant** | **Object** | Information about an access grant that applies to the team member on the folder. _This field is deprecated because grants are no longer exposed via API responses._ |  |
|**active** | **Boolean** | Whether the team membership is currently active. |  |
|**applicablePermissionPolicies** | [**TeamMembershipApplicablePermissionPolicies**](TeamMembershipApplicablePermissionPolicies.md) |  |  |
|**applicableRoles** | [**List&lt;TeamRole&gt;**](TeamRole.md) | An array of the team roles this team member can have. |  |
|**createdTime** | **String** | The time in ISO 8601 format when the invite was sent. |  |
|**email** | **String** | The team member&#39;s email. |  |
|**hasFolderAccess** | **Boolean** | Whether the team member has folder access. |  [optional] |
|**inviteUrl** | **String** | The URL for the invited user to join the team. The value of this field is null if the invited user has already joined. |  |
|**joinedTime** | **String** | The time in ISO 8601 format when the invite was accepted. |  |
|**metadata** | [**TeamMembershipMetadata**](TeamMembershipMetadata.md) |  |  |
|**modifiedTime** | **String** | The time in ISO 8601 format when the team membership was last modified. |  |
|**permissionLevel** | [**PermissionLevelEnum**](#PermissionLevelEnum) | The team member&#39;s permission level.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can&#39;t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor plus permissions. They can upload and edit videos for the entire team, and have additional sets of permissions, but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can&#39;t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can&#39;t upload or edit videos.  |  |
|**recentlyReminded** | **Boolean** | Whether the team member has been reminded about the invite. |  [optional] |
|**resourceKey** | **String** | The resource key of the team membership. |  |
|**role** | **String** | The team member&#39;s role, translated. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the team membership invite.  Option descriptions:  * &#x60;accepted&#x60; - Team membership has been accepted.  * &#x60;pending&#x60; - Team membership has been offered but not yet accepted.  |  |
|**uri** | **String** | The unique identifier to access the team membership resource. |  |
|**user** | [**User**](User.md) | The team member. The value of this field is null if the user hasn&#39;t joined the team yet. |  |



## Enum: PermissionLevelEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;Admin&quot; |
| CONTRIBUTOR | &quot;Contributor&quot; |
| CONTRIBUTOR_PLUS | &quot;Contributor Plus&quot; |
| OWNER | &quot;Owner&quot; |
| UPLOADER | &quot;Uploader&quot; |
| VIEWER | &quot;Viewer&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| PENDING | &quot;pending&quot; |



