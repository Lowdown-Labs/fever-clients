package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.Health;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    @Test
    public void healthTest() throws ApiException {
        Health response =
        api.health();

    }

    @Test
    public void healthzHealthzGetTest() throws ApiException {
        Object response =
        api.healthzHealthzGet();

    }

}
