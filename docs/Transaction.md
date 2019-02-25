
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputCurrency** | **String** | The input currency describes what currency the transaction will be paid in (3-character alpha ISO 4217 currency format). For example if you wish to create an EUR to NGN transaction then input currency should be set to EUR. | 
**payinMethods** | [**List&lt;PayinMethod&gt;**](PayinMethod.md) | Allows setting alternative collections, where funding the transaction is done through alternative means and not via account balance.  For more information please see [Collections from senders](https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#collections-from-senders) in the API documentation |  [optional]
**metadata** | [**Object**](.md) | Additional metadata to store on the transaction. If you widh to store your local transaction ID, you should add it here inside a &#x60;sendRef&#x60; field, and we will return this value back to you in the daily transaction reports. |  [optional]
**sender** | [**Sender**](Sender.md) |  | 
**recipients** | [**List&lt;Recipient&gt;**](Recipient.md) | The details of where the payment should go. although transactions can support paying out multiple recipients, usually one is provided.  | 
**traits** | [**TransactionTraits**](TransactionTraits.md) |  |  [optional]
**state** | [**TransactionState**](TransactionState.md) |  |  [optional]
**inputAmount** | [**BigDecimal**](BigDecimal.md) | The amount that was requested in the input currency |  [optional]
**payinReference** | **String** | The reference number that has to be provided in case the transaction is not funded through account balance |  [optional]
**paidAmount** | [**BigDecimal**](BigDecimal.md) | The amount that was already paid in to the transaction |  [optional]
**dueAmount** | [**BigDecimal**](BigDecimal.md) | The amount needed to be paid in for the transaction to get funded |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the transaction was created |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | The latest time when the transaction has to be funded, otherwise it will be cancelled |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**errors** | [**Map&lt;String, List&lt;ValidationErrorDescription&gt;&gt;**](List.md) | The fields that have some problems and don&#39;t pass validation |  [optional]



