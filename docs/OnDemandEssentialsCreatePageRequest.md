

# OnDemandEssentialsCreatePageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the On Demand page. |  |
|**acceptedCurrencies** | [**AcceptedCurrenciesEnum**](#AcceptedCurrenciesEnum) | An array of accepted currencies.  Option descriptions:  * &#x60;AUD&#x60; - The currency is in Australian dollars.  * &#x60;CAD&#x60; - The currency is in Canadian dollars.  * &#x60;CHF&#x60; - The currency is in Swiss francs.  * &#x60;DKK&#x60; - The currency is in Danish krone.  * &#x60;EUR&#x60; - The currency is in euros.  * &#x60;GBP&#x60; - The currency is in British pounds.  * &#x60;JPY&#x60; - The currency is in Japanese yen.  * &#x60;KRW&#x60; - The currency is in South Korean won.  * &#x60;NOK&#x60; - The currency is in Norwegian krone.  * &#x60;PLN&#x60; - The currency is in Polish zloty.  * &#x60;SEK&#x60; - The currency is in Swedish krona.  * &#x60;USD&#x60; - The currency is in United States dollars.  |  [optional] |
|**buy** | [**OnDemandEssentialsCreatePageRequestBuy**](OnDemandEssentialsCreatePageRequestBuy.md) |  |  [optional] |
|**contentRating** | [**ContentRatingEnum**](#ContentRatingEnum) | The content rating of the video, given either as a comma-separated list or as a JSON array, depending on the request format.  Option descriptions:  * &#x60;drugs&#x60; - The video contains drug or alcohol use.  * &#x60;language&#x60; - The video contains profanity or sexually suggestive content.  * &#x60;nudity&#x60; - The video contains nudity.  * &#x60;safe&#x60; - The video is suitable for all audiences.  * &#x60;unrated&#x60; - The video hasn&#39;t been rated.  * &#x60;violence&#x60; - The video contains violent or graphic content.  |  |
|**domainLink** | **String** | The custom domain of the On Demand page. |  [optional] |
|**episodes** | [**OnDemandEssentialsCreatePageRequestEpisodes**](OnDemandEssentialsCreatePageRequestEpisodes.md) |  |  [optional] |
|**link** | **String** | The custom string to use in the Vimeo URL of the On Demand page. |  [optional] |
|**name** | **String** | The name of the On Demand page. |  |
|**rent** | [**OnDemandEssentialsCreatePageRequestRent**](OnDemandEssentialsCreatePageRequestRent.md) |  |  [optional] |
|**subscription** | [**OnDemandEssentialsCreatePageRequestSubscription**](OnDemandEssentialsCreatePageRequestSubscription.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the On Demand page.  Option descriptions:  * &#x60;film&#x60; - The On Demand page is a film.  * &#x60;series&#x60; - The On Demand page is a series.  |  |



## Enum: AcceptedCurrenciesEnum

| Name | Value |
|---- | -----|
| AUD | &quot;AUD&quot; |
| CAD | &quot;CAD&quot; |
| CHF | &quot;CHF&quot; |
| DKK | &quot;DKK&quot; |
| EUR | &quot;EUR&quot; |
| GBP | &quot;GBP&quot; |
| JPY | &quot;JPY&quot; |
| KRW | &quot;KRW&quot; |
| NOK | &quot;NOK&quot; |
| PLN | &quot;PLN&quot; |
| SEK | &quot;SEK&quot; |
| USD | &quot;USD&quot; |



## Enum: ContentRatingEnum

| Name | Value |
|---- | -----|
| DRUGS | &quot;drugs&quot; |
| LANGUAGE | &quot;language&quot; |
| NUDITY | &quot;nudity&quot; |
| SAFE | &quot;safe&quot; |
| UNRATED | &quot;unrated&quot; |
| VIOLENCE | &quot;violence&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILM | &quot;film&quot; |
| SERIES | &quot;series&quot; |



