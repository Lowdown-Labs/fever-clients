package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.model.ApiKey;
import com.lowdownlabs.fever.model.CreateKeyRequest;
import com.lowdownlabs.fever.model.HTTPValidationError;
import com.lowdownlabs.fever.model.KeyReveal;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class KeysApiTest {

    private final KeysApi api = new KeysApi();

    @Test
    public void createKeyTest() throws ApiException {
        CreateKeyRequest createKeyRequest = null;
        KeyReveal response =
        api.createKey(createKeyRequest);

    }

    @Test
    public void listKeysTest() throws ApiException {
        List<ApiKey> response =
        api.listKeys();

    }

    @Test
    public void revokeKeyTest() throws ApiException {
        Integer keyId = null;
        Object response =
        api.revokeKey(keyId);

    }

}
