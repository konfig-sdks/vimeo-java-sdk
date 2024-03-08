

# TeamRole


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicablePermissionPolicies** | [**TeamRoleApplicablePermissionPolicies**](TeamRoleApplicablePermissionPolicies.md) |  |  [optional] |
|**count** | **Double** | The total number of team members with this role. |  [optional] |
|**displayDescription** | **String** | The translated display description of the role. |  [optional] |
|**displayName** | **String** | The translated display name of the role. |  [optional] |
|**permissionLevel** | [**PermissionLevelEnum**](#PermissionLevelEnum) | The untranslated role of the user who made the request.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can&#39;t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can&#39;t upload or edit videos.  |  |
|**role** | [**RoleEnum**](#RoleEnum) | The untranslated role of the user who made the request.  Option descriptions:  * &#x60;Admin&#x60; - The team member has admin permissions. They can upload and edit videos for the entire team and perform team administration tasks.  * &#x60;Contributor&#x60; - The team member has contributor permissions. They can upload and edit videos for the entire team but can’t perform team administration tasks.  * &#x60;Contributor Plus&#x60; - The team member has contributor-plus permissions. They can upload and edit videos for the entire team and have additional sets of permissions but can&#39;t perform team administration tasks.  * &#x60;Owner&#x60; - The team member has owner permissions.  * &#x60;Uploader&#x60; - The team member has uploader permissions. They can upload videos for the entire team but can’t edit videos.  * &#x60;Viewer&#x60; - The team member has viewer permissions. They can access team videos and specific team folders but can’t upload or edit videos.  |  |
|**uri** | **String** | The unique identifier to access the team role. |  |



## Enum: PermissionLevelEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;Admin&quot; |
| CONTRIBUTOR | &quot;Contributor&quot; |
| CONTRIBUTOR_PLUS | &quot;Contributor Plus&quot; |
| OWNER | &quot;Owner&quot; |
| UPLOADER | &quot;Uploader&quot; |
| VIEWER | &quot;Viewer&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;Admin&quot; |
| CONTRIBUTOR | &quot;Contributor&quot; |
| CONTRIBUTOR_PLUS | &quot;Contributor Plus&quot; |
| OWNER | &quot;Owner&quot; |
| UPLOADER | &quot;Uploader&quot; |
| VIEWER | &quot;Viewer&quot; |



