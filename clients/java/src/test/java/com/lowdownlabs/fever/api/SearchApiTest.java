package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.SearchHit;
import com.lowdownlabs.fever.model.SearchRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    @Test
    public void searchTest() throws ApiException {
        SearchRequest searchRequest = null;
        List<SearchHit> response =
        api.search(searchRequest);

    }

}
