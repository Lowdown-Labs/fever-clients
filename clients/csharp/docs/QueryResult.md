# LowdownLabs.Fever.Model.QueryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Columns** | **List&lt;string&gt;** | Result column names, in order. | 
**Rows** | **List&lt;List&lt;Object&gt;&gt;** | Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex). | 
**Truncated** | **bool** | True when more rows matched than were returned (hit the row cap). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

