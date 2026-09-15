

# QueryResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columns** | **List&lt;String&gt;** | Result column names, in order. |  |
|**rows** | **List&lt;List&lt;Object&gt;&gt;** | Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex). |  |
|**truncated** | **Boolean** | True when more rows matched than were returned (hit the row cap). |  |



