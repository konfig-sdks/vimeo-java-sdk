

# GroupMetadataInteractionsJoin

An action indicating that someone has joined the group. This data requires a bearer token with the `private` scope.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The user&#39;s title. If this field isn&#39;t applicable, it takes the null value. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**added** | **Boolean** | Whether the user has followed the group. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**addedTime** | **String** | The time in ISO 8601 format when the user joined the group. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Whether the user is a moderator or subscriber. This data requires a bearer token with the &#x60;private&#x60; scope.  Option descriptions:  * &#x60;member&#x60; - The user is a member.  * &#x60;moderator&#x60; - The user is a moderator.  |  |
|**uri** | **String** | The URI for following the group. PUT to this URI to follow the group, or DELETE to this URI to unfollow the group. This data requires a bearer token with the &#x60;private&#x60; scope. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |
| MODERATOR | &quot;moderator&quot; |



