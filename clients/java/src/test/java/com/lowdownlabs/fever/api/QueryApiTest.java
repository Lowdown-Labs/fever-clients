package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.QueryRequest;
import com.lowdownlabs.fever.model.QueryResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class QueryApiTest {

    private final QueryApi api = new QueryApi();

    @Test
    public void queryTest() throws ApiException {
        QueryRequest queryRequest = null;
        QueryResult response =
        api.query(queryRequest);

    }

}
