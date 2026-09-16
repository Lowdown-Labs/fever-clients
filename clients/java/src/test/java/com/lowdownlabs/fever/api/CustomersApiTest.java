package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import java.io.File;
import com.lowdownlabs.fever.model.HTTPValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    @Test
    public void reassignCustomersBulkTest() throws ApiException {
        File _file = null;
        Object response =
        api.reassignCustomersBulk(_file);

    }

}
