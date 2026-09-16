package com.lowdownlabs.fever.api;

import com.lowdownlabs.fever.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Disabled
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    @Test
    public void whoamiTest() throws ApiException {
        Object response =
        api.whoami();

    }

}
