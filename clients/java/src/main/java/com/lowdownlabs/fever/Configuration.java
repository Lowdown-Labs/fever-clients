package com.lowdownlabs.fever;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.25.0")
public class Configuration {
  public static final String VERSION = "0.3.2";

  private static final AtomicReference<ApiClient> defaultApiClient = new AtomicReference<>();
  private static volatile Supplier<ApiClient> apiClientFactory = ApiClient::new;

  public static ApiClient getDefaultApiClient() {
    ApiClient client = defaultApiClient.get();
    if (client == null) {
      client = defaultApiClient.updateAndGet(val -> {
        if (val != null) {
          return val;
        }
        return apiClientFactory.get();
      });
    }
    return client;
  }

  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient.set(apiClient);
  }

  public static void setApiClientFactory(Supplier<ApiClient> factory) {
    apiClientFactory = Objects.requireNonNull(factory);
  }

  private Configuration() {
  }
}
