# QueryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | Pointer to **NullableString** | Admin keys only: run this query scoped to one customer, exactly as if a key scoped to that customer had submitted it. Scoped keys are always forced to their own customer_id and may not pass another. | [optional] 
**RowLimit** | Pointer to **int32** | Max rows to return; capped at 1000 regardless of what&#39;s requested. A LIMIT already in the sql, if smaller, is honored instead. | [optional] [default to 200]
**Sql** | **string** | A single read-only SELECT over the corpus tables (as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items; internal jobs/job_items stay queryable but are bookkeeping). Raw vector columns (vec_prefix, vec_full) are selectable with an admin key, rejected for scoped keys; tsvector columns (fts) are excluded for everyone. Natural-language search: an &#x60;e.vec_full &lt;&#x3D;&gt; fever_search(&#39;text&#39;)&#x60; comparison may sit in ORDER BY (ranking) or the SELECT target list (raw cosine distance; similarity &#x3D; 1.0 - distance), with at most four distinct texts per statement. | 

## Methods

### NewQueryRequest

`func NewQueryRequest(sql string, ) *QueryRequest`

NewQueryRequest instantiates a new QueryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQueryRequestWithDefaults

`func NewQueryRequestWithDefaults() *QueryRequest`

NewQueryRequestWithDefaults instantiates a new QueryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomerId

`func (o *QueryRequest) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *QueryRequest) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *QueryRequest) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *QueryRequest) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *QueryRequest) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *QueryRequest) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetRowLimit

`func (o *QueryRequest) GetRowLimit() int32`

GetRowLimit returns the RowLimit field if non-nil, zero value otherwise.

### GetRowLimitOk

`func (o *QueryRequest) GetRowLimitOk() (*int32, bool)`

GetRowLimitOk returns a tuple with the RowLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRowLimit

`func (o *QueryRequest) SetRowLimit(v int32)`

SetRowLimit sets RowLimit field to given value.

### HasRowLimit

`func (o *QueryRequest) HasRowLimit() bool`

HasRowLimit returns a boolean if a field has been set.

### GetSql

`func (o *QueryRequest) GetSql() string`

GetSql returns the Sql field if non-nil, zero value otherwise.

### GetSqlOk

`func (o *QueryRequest) GetSqlOk() (*string, bool)`

GetSqlOk returns a tuple with the Sql field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSql

`func (o *QueryRequest) SetSql(v string)`

SetSql sets Sql field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


