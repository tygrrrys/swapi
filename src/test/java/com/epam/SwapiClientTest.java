package com.epam;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.net.URISyntaxException;

import static com.epam.SwapiClient.response;
import static com.epam.SwapiClient.target;
import static org.assertj.core.api.Assertions.assertThat;

/**
 */
public class SwapiClientTest {

    private static Logger logTest = Logger.getLogger(SwapiClientTest.class);

    @Test
    public static void testIfConnectingToSwapiGives200() {

        URI uri = UriBuilder.fromPath("http://swapi.co/api/people/1/").build();
        SwapiClient test = new SwapiClient(uri);

        logTest.info("Response messeage: " + response.getStatusInfo());
        assertThat(response.getStatus()).isEqualTo(200);
    }

    @Test
    public static void testIfContentFromSwapiSiteIsNotNull() {

        URI uri = UriBuilder.fromPath("http://swapi.co/api/people/1/").build();
        SwapiClient test = new SwapiClient(uri);
        String content = target.request().get(String.class);

        assertThat(content).as("Trying to download HTML doc").isNotNull();
    }

    @Test
    public static void main() {
        URI uri = null;
        try {
            uri = new URI("http://swapi.co/api/people/?page=1&format=json");
            SwapiClient test = new SwapiClient(uri);
            String content = target.request().get(String.class);
            JSONObject object = new JSONObject(content);
            System.out.println(object.toString());
        } catch (JSONException e) {
            logTest.error("Unable to create JSON object. " + e.getMessage());
        } catch (URISyntaxException e) {
            logTest.error("Unable to create URI. "+e.getMessage());
        }
    }

}
