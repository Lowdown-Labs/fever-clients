package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.CorpusStats;
import com.lowdownlabs.fever.model.HTTPValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class CorpusApiTest {

    private final CorpusApi api = new CorpusApi();

    @Test
    public void corpusStatsTest() throws ApiException {
        String customerId = null;
        CorpusStats response =
        api.corpusStats(customerId);

    }

}
