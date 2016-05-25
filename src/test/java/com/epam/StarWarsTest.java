package com.epam;


import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple StarWars.
 */
public class StarWarsTest {
    @BeforeTest
    public void testIfConnectingToSwapiGives200() {

        try {
            final URL SWAPI = new URL("https://swapi.co/api/");
            HttpURLConnection conn = (HttpURLConnection) SWAPI.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent","");
            assertThat(200).isEqualTo(conn.getResponseCode());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void l(){

    }
}
