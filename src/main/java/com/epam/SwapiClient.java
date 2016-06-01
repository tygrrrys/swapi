package com.epam;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;

/**
 */
public class SwapiClient {
    private ClientConfig config;
    private Client client; //maybe needed configuration for that, don't know yet
    static WebTarget target;
    static Response response;

    public SwapiClient (URI uri) {
        config = new ClientConfig();
        client = ClientBuilder.newClient(config);
        response = client.target(uri).request("application/json").get();
        target = client.target(uri);
    }




}
