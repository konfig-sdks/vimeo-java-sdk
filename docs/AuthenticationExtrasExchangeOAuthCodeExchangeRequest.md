

# AuthenticationExtrasExchangeOAuthCodeExchangeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The authorization code received from the authorization server. |  |
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | The grant type. The value of this field must be &#x60;authorization_code&#x60;. |  |
|**redirectUri** | **String** | The redirect URI. The value of this field must match the URI from &#x60;/oauth/authorize&#x60;. |  |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |



