package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.DuplicatesRequest;
import com.lowdownlabs.fever.model.DuplicatesResponse;
import com.lowdownlabs.fever.model.HTTPValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class DuplicatesApiTest {

    private final DuplicatesApi api = new DuplicatesApi();

    @Test
    public void findDuplicatesTest() throws ApiException {
        DuplicatesRequest duplicatesRequest = null;
        DuplicatesResponse response =
        api.findDuplicates(duplicatesRequest);

    }

    @Test
    public void suggestedDedupThresholdTest() throws ApiException {
        String customerId = null;
        Object response =
        api.suggestedDedupThreshold(customerId);

    }

}
