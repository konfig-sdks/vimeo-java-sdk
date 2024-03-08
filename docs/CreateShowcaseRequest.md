

# CreateShowcaseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the showcase. |  [optional] |
|**brandColor** | **String** | The hexadecimal code for the color of the player buttons and showcase controls. |  [optional] |
|**hideFromVimeo** | **Boolean** | Whether the showcase should be hidden from Vimeo when unlisted. |  [optional] |
|**hideNav** | **Boolean** | Whether to hide Vimeo navigation when displaying the showcase. |  [optional] |
|**hideUpcoming** | **Boolean** | Whether to include the upcoming event in the showcase. |  [optional] |
|**layout** | [**LayoutEnum**](#LayoutEnum) | The type of layout for presenting the showcase.  Option descriptions:  * &#x60;grid&#x60; - The videos appear in a grid.  * &#x60;player&#x60; - The videos appear in the player.  |  [optional] |
|**name** | **String** | The name of the showcase. |  |
|**password** | **String** | The showcase&#39;s password. This field is required only when **privacy** is &#x60;password&#x60;. |  [optional] |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) | The privacy level of the showcase.  Option descriptions:  * &#x60;anybody&#x60; - Anyone can access the showcase, either on Vimeo or through an embed.  * &#x60;embed_only&#x60; - The showcase doesn&#39;t appear on Vimeo, but it can be embedded on other sites.  * &#x60;nobody&#x60; - No one can access the showcase, including the authenticated user.  * &#x60;password&#x60; - Only those with the password can access the showcase.  * &#x60;team&#x60; - Only members of the authenticated user&#39;s team can access the showcase.  * &#x60;unlisted&#x60; - The showcase can&#39;t be accessed if the URL omits its unlisted hash.  |  [optional] |
|**reviewMode** | **Boolean** | Whether showcase videos use the review mode URL. |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | The default sort order of the videos as they appear in the showcase.  Option descriptions:  * &#x60;added_first&#x60; - The videos appear according to when they were added to the showcase, with the most recently added first.  * &#x60;added_last&#x60; - The videos appear according to when they were added to the showcase, with the most recently added last.  * &#x60;alphabetical&#x60; - The videos appear alphabetically by their title.  * &#x60;arranged&#x60; - The videos appear as arranged by the owner of the showcase.  * &#x60;comments&#x60; - The videos appear according to their number of comments.  * &#x60;likes&#x60; - The videos appear according to their number of likes.  * &#x60;newest&#x60; - The videos appear in chronological order with the newest first.  * &#x60;oldest&#x60; - The videos appear in chronological order with the oldest first.  * &#x60;plays&#x60; - The videos appear according to their number of plays.  |  [optional] |
|**theme** | [**ThemeEnum**](#ThemeEnum) | The color theme of the showcase.  Option descriptions:  * &#x60;dark&#x60; - The showcase uses the dark theme.  * &#x60;standard&#x60; - The showcase uses the standard theme.  |  [optional] |



## Enum: LayoutEnum

| Name | Value |
|---- | -----|
| GRID | &quot;grid&quot; |
| PLAYER | &quot;player&quot; |



## Enum: PrivacyEnum

| Name | Value |
|---- | -----|
| ANYBODY | &quot;anybody&quot; |
| EMBED_ONLY | &quot;embed_only&quot; |
| NOBODY | &quot;nobody&quot; |
| PASSWORD | &quot;password&quot; |
| TEAM | &quot;team&quot; |
| UNLISTED | &quot;unlisted&quot; |



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



