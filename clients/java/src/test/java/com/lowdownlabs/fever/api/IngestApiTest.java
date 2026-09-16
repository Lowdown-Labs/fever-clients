package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.IngestRequest;
import com.lowdownlabs.fever.model.IngestResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class IngestApiTest {

    private final IngestApi api = new IngestApi();

    @Test
    public void ingestMediaTest() throws ApiException {
        IngestRequest ingestRequest = null;
        IngestResult response =
        api.ingestMedia(ingestRequest);

    }

}
