

# EmailCaptureFormHiddenFieldsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectedFields** | [**List&lt;EmailCaptureFormHiddenFieldsInnerConnectedFieldsInner&gt;**](EmailCaptureFormHiddenFieldsInnerConnectedFieldsInner.md) | The email provider fields associated with the field in the form. |  |
|**fieldMetadata** | [**EmailCaptureFormCustomFieldsInnerFieldMetadata**](EmailCaptureFormCustomFieldsInnerFieldMetadata.md) |  |  |
|**fieldName** | **String** | The name of a field in the form. |  |
|**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | The type of custom field.  Option descriptions:  * &#x60;dropdown&#x60; - The custom field used for dropdown item selection.  * &#x60;text&#x60; - The custom field used for text input.  |  |
|**locked** | **Boolean** | Whether the field&#39;s **required** property is editable but **field_name** isn&#39;t. If the value is &#x60;true&#x60;, the field can&#39;t be deleted. |  |
|**required** | **Boolean** | Whether the field is required. |  |
|**staticField** | **Boolean** | Whether the field&#39;s **required** and **field_name** properties are both uneditable. If the value is &#x60;true&#x60;, the field can&#39;t be deleted. |  |



## Enum: FieldTypeEnum

| Name | Value |
|---- | -----|
| DROPDOWN | &quot;dropdown&quot; |
| TEXT | &quot;text&quot; |



