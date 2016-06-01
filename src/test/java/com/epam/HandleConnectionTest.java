package com.epam;


import org.glassfish.jersey.client.ClientConfig;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Unit test for simple StarWars.
 */
public class HandleConnectionTest {
    Logger testLog = Logger.getLogger(HandleConnectionTest.class);

    @BeforeTest
    public void testIfConnectingToSwapiGives200() {

    }


    /**
     * Not handling exception, assuming that URL is valid since test above passes
     * @throws MalformedURLException
     */
    @Test
    public void testIfConnectToSwapiReturnsActuallyTrue () throws MalformedURLException {
    }


    @Test
    public void testIfConnectToInvalidURLReturnsFalse () throws MalformedURLException {
    }




}
