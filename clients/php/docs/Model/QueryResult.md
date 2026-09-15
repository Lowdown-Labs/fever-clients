# QueryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **string[]** | Result column names, in order. |
**rows** | **mixed[][]** | Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex). |
**truncated** | **bool** | True when more rows matched than were returned (hit the row cap). |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
