package tech.dimas.example;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import tech.dimas.example.client.GreetingClientFactory;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class ExampleConfiguration extends Configuration {
    @Valid
    @NotNull
    private GreetingClientFactory greetingClient = new GreetingClientFactory();

    @JsonProperty("greetingClient")
    public GreetingClientFactory getGreetingClient() {
        return greetingClient;
    }

    @JsonProperty("greetingClient")
    public void setGreetingClient(GreetingClientFactory greetingClient) {
        this.greetingClient = greetingClient;
    }
}
