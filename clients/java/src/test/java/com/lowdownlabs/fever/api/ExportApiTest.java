package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.ExportRequest;
import com.lowdownlabs.fever.model.ExportResult;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.ImportRequest;
import com.lowdownlabs.fever.model.ImportResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class ExportApiTest {

    private final ExportApi api = new ExportApi();

    @Test
    public void exportTenantTest() throws ApiException {
        ExportRequest exportRequest = null;
        ExportResult response =
        api.exportTenant(exportRequest);

    }

    @Test
    public void importTenantTest() throws ApiException {
        ImportRequest importRequest = null;
        ImportResult response =
        api.importTenant(importRequest);

    }

}
