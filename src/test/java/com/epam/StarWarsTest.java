package com.epam;


import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple StarWars.
 */
public class StarWarsTest {
    Logger testLog = Logger.getLogger(StarWarsTest.class);

    @BeforeTest
    public void testIfConnectingToSwapiGives200() {

        try {
            final URL SWAPI = new URL("https://swapi.co/api/");
            HttpURLConnection conn = (HttpURLConnection) SWAPI.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "application/json");
            assertThat(200).isEqualTo(conn.getResponseCode());
        } catch (MalformedURLException e) {
            testLog.error("Check URL passed to test case. " + e.getMessage());
        } catch (IOException e) {
            testLog.error("There was a problem with openConnection() method. " + e.getMessage());
        }
    }

    /**
     * Not handling exception, assuming that URL is valid since test above passes
     * @throws MalformedURLException
     */
    @Test
    public void testIfConnectToSwapiReturnsActuallyTrue () throws MalformedURLException {
        final URL SWAPI = new URL("https://swapi.co/api/");
        OpenConnection connection = new OpenConnection (SWAPI);
        boolean isAccomplished = connection.connectToWebsite();

        assertThat(isAccomplished).isTrue();
    }


    @Test
    public void testIfConnectToInvalidURLReturnsFalse () throws MalformedURLException {
        final URL SWAPI = new URL("https://swapi.co/api/100");
        OpenConnection connection = new OpenConnection (SWAPI);
        boolean isAccomplished = connection.connectToWebsite();

        assertThat(isAccomplished).as("trying to connect to unexisting URL").isFalse();
    }

    @Test
    public void testIfLukeDataIsFetched() {

        StarWars connect = new StarWars();
        StringBuilder lukeInfo = new StringBuilder();
        try {
            final URL LUKE = new URL("https://swapi.co/people/1");

            CreateContent lukesData = new CreateContent(LUKE);
            lukesData.connectToWebsite();
        } catch (MalformedURLException e) {
            testLog.error("Check URL passed to test case. " + e.getMessage());
        } catch (IOException e) {
            testLog.error("Couldn't open connection to Luke's data. " +e.getMessage());
        }

    }
}
