# QueryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Columns** | **[]string** | Result column names, in order. | 
**Rows** | **[][]interface{}** | Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex). | 
**Truncated** | **bool** | True when more rows matched than were returned (hit the row cap). | 

## Methods

### NewQueryResult

`func NewQueryResult(columns []string, rows [][]interface{}, truncated bool, ) *QueryResult`

NewQueryResult instantiates a new QueryResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQueryResultWithDefaults

`func NewQueryResultWithDefaults() *QueryResult`

NewQueryResultWithDefaults instantiates a new QueryResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColumns

`func (o *QueryResult) GetColumns() []string`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *QueryResult) GetColumnsOk() (*[]string, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *QueryResult) SetColumns(v []string)`

SetColumns sets Columns field to given value.


### GetRows

`func (o *QueryResult) GetRows() [][]interface{}`

GetRows returns the Rows field if non-nil, zero value otherwise.

### GetRowsOk

`func (o *QueryResult) GetRowsOk() (*[][]interface{}, bool)`

GetRowsOk returns a tuple with the Rows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRows

`func (o *QueryResult) SetRows(v [][]interface{})`

SetRows sets Rows field to given value.


### GetTruncated

`func (o *QueryResult) GetTruncated() bool`

GetTruncated returns the Truncated field if non-nil, zero value otherwise.

### GetTruncatedOk

`func (o *QueryResult) GetTruncatedOk() (*bool, bool)`

GetTruncatedOk returns a tuple with the Truncated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTruncated

`func (o *QueryResult) SetTruncated(v bool)`

SetTruncated sets Truncated field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


