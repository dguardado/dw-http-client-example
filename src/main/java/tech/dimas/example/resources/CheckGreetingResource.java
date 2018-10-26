package tech.dimas.example.resources;

import tech.dimas.example.client.GreetingClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/check-greeting")
public class CheckGreetingResource {

    private final GreetingClient client;

    public CheckGreetingResource(GreetingClient client) {
        this.client = client;
    }

    @GET
    public String checkGreeting() {
        String result = client.greet();
        return String.format("Greeting was \"%s\"", result);
    }
}
