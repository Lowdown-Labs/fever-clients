# QueryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **Vec<String>** | Result column names, in order. | 
**rows** | [**Vec<Vec<serde_json::Value>>**](Vec.md) | Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex). | 
**truncated** | **bool** | True when more rows matched than were returned (hit the row cap). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


