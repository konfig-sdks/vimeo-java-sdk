

# Album


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A brief description of the showcase&#39;s content. |  |
|**allowContinuousPlay** | **Boolean** | Whether the showcase permits continuous play. |  |
|**allowDownloads** | **Boolean** | Whether the showcase permits downloads. |  |
|**allowShare** | **Boolean** | Whether the showcase permits sharing. |  |
|**autoplay** | **Boolean** | Whether to start playback of the next video in the showcase&#39;s embedded playlist immediately after the previous video finishes. |  |
|**brandColor** | **String** | The hexadecimal code for the color of the player buttons and showcase controls. |  |
|**createdTime** | **String** | The time in ISO 8601 format when the showcase was created. |  |
|**customLogo** | [**Picture**](Picture.md) | The custom logo of the showcase. |  |
|**domain** | **String** | The custom domain of the showcase. |  |
|**domainCertificateState** | [**DomainCertificateStateEnum**](#DomainCertificateStateEnum) | The state of the SSL certificate that is associated with the showcase&#39;s domain.  Option descriptions:  * &#x60;null&#x60; - There is no associated HTTPS domain with this showcase.  * &#x60;0&#x60; - The new certificate has yet to be processed.  * &#x60;1&#x60; - The new certificate is being processed in the queue.  * &#x60;2&#x60; - The certificate is being processed for renewal in the queue.  * &#x60;3&#x60; - The new certificate has failed to be issued in the queue.  * &#x60;4&#x60; - The certificate has failed to be renewed in the queue.  * &#x60;5&#x60; - The certificate has been successfully issued.  * &#x60;6&#x60; - The certificate has been successfully renewed.  * &#x60;7&#x60; - The certificate has failed in the polling flow.  * &#x60;8&#x60; - The certificate has failed to be renewed in the polling flow.  |  |
|**duration** | **Double** | The total duration in seconds of all the videos in the showcase. |  |
|**embed** | [**AlbumEmbed**](AlbumEmbed.md) |  |  |
|**embedBrandColor** | **Boolean** | Whether to show the showcase&#39;s custom brand color in the player of the showcase&#39;s embedded playlist. |  |
|**embedCustomLogo** | **Boolean** | Whether to show the showcase&#39;s custom logo in the player of the showcase&#39;s embedded playlist. |  |
|**hasChosenThumbnail** | **Boolean** | Whether the showcase has a thumbnail. |  |
|**hideFromVimeo** | **Boolean** | Whether the showcase should be hidden from Vimeo when unlisted. |  |
|**hideNav** | **Boolean** | Whether to hide Vimeo navigation when displaying the showcase. |  |
|**hideUpcoming** | **Boolean** | Whether to include the upcoming event in the showcase. |  |
|**hideVimeoLogo** | **Boolean** | Whether to hide the Vimeo logo in the player of the showcase&#39;s embedded playlist. |  |
|**layout** | [**LayoutEnum**](#LayoutEnum) | The type of layout for presenting the showcase.  Option descriptions:  * &#x60;grid&#x60; - The showcase videos appear in a grid.  * &#x60;player&#x60; - The showcase videos appear in the player.  |  |
|**link** | **String** | The URL of the showcase. |  |
|**loop** | **Boolean** | Whether automatic playback restarts at the top of the showcase&#39;s embedded playlist after reaching the end of the last video in the playlist. |  |
|**metadata** | [**AlbumMetadata**](AlbumMetadata.md) |  |  |
|**modifiedTime** | **String** | The time in ISO 8601 format when the showcase was last modified. |  |
|**name** | **String** | The display name of the showcase. |  |
|**pictures** | [**Picture**](Picture.md) | The active image of the showcase. |  |
|**privacy** | [**AlbumPrivacy**](AlbumPrivacy.md) |  |  |
|**resourceKey** | **String** | The resource key of the showcase. |  |
|**reviewMode** | **Boolean** | Whether showcase videos use the review mode URL. |  |
|**seoAllowIndexed** | **Boolean** | Whether search engines can index the showcase. |  |
|**seoDescription** | **String** | The SEO description of the showcase. |  |
|**seoKeywords** | **List&lt;String&gt;** | The SEO keywords of the showcase. |  |
|**seoTitle** | **String** | The SEO title of the showcase. |  |
|**shareLink** | **String** | The URL for sharing the showcase. |  |
|**sort** | [**SortEnum**](#SortEnum) | The sort order of the showcase.  Option descriptions:  * &#x60;added_first&#x60; - Sort the showcase videos in order of those most recently added.  * &#x60;added_last&#x60; - Sort the showcase videos in order of those least recently added.  * &#x60;alphabetical&#x60; - Sort the showcase videos alphabetically.  * &#x60;arranged&#x60; - Sort the showcase videos according to their custom arrangement.  * &#x60;comments&#x60; - Sort the showcase videos by number of comments.  * &#x60;likes&#x60; - Sort the showcase videos by number of likes.  * &#x60;newest&#x60; - Sort the showcase videos in order of creation date with the newest first.  * &#x60;oldest&#x60; - Sort the showcase videos in order of creation date with the oldest first.  * &#x60;plays&#x60; - Sort the showcase videos by number of plays.  |  |
|**theme** | [**ThemeEnum**](#ThemeEnum) | The color theme of the showcase.  Option descriptions:  * &#x60;dark&#x60; - The showcase uses the dark theme.  * &#x60;standard&#x60; - The showcase uses the standard theme.  |  |
|**unlistedHash** | **String** | The unlisted hash of the showcase. Omit this hash from the showcase URL to prevent access to the showcase on Vimeo. |  |
|**uri** | **String** | The URI of the showcase. |  |
|**url** | **String** | The custom Vimeo URL of the showcase. |  |
|**useCustomDomain** | **Boolean** | Whether the showcase uses a custom domain. |  |
|**user** | [**User**](User.md) | The owner of the showcase. |  |
|**webBrandColor** | **Boolean** | Whether to use the showcase&#39;s brand color in the web layout. |  |
|**webCustomLogo** | **Boolean** | Whether to use the showcase&#39;s custom logo in the web layout. |  |



## Enum: DomainCertificateStateEnum

| Name | Value |
|---- | -----|
| NULL | &quot;null&quot; |
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |



## Enum: LayoutEnum

| Name | Value |
|---- | -----|
| GRID | &quot;grid&quot; |
| PLAYER | &quot;player&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| ADDED_FIRST | &quot;added_first&quot; |
| ADDED_LAST | &quot;added_last&quot; |
| ALPHABETICAL | &quot;alphabetical&quot; |
| ARRANGED | &quot;arranged&quot; |
| COMMENTS | &quot;comments&quot; |
| LIKES | &quot;likes&quot; |
| NEWEST | &quot;newest&quot; |
| OLDEST | &quot;oldest&quot; |
| PLAYS | &quot;plays&quot; |



## Enum: ThemeEnum

| Name | Value |
|---- | -----|
| DARK | &quot;dark&quot; |
| STANDARD | &quot;standard&quot; |



