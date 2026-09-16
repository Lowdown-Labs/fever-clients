package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.Job;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    @Test
    public void cancelJobTest() throws ApiException {
        Integer jobId = null;
        Job response =
        api.cancelJob(jobId);

    }

    @Test
    public void getJobTest() throws ApiException {
        Integer jobId = null;
        Job response =
        api.getJob(jobId);

    }

}
