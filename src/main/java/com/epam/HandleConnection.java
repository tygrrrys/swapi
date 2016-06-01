package com.epam;


import java.net.HttpURLConnection;
import java.net.URI;
import java.util.logging.Logger;

/**
 * Class connecting to URL passed through constructor.
 */
public class HandleConnection {
    URI website;
    Logger logger = Logger.getLogger("HandleConnection.class");

    static HttpURLConnection connection;
    static String content;

    public HandleConnection(URI website) {
        this.website = website;

    }

    /**
     * returns connection to the website for further operations.
     * @return connection to the given URL
     */
    public HttpURLConnection openConnection() {
        HandleConnection openIt = new HandleConnection(website);
        if (openIt.connectToWebsite()) {
            logger.info("Connection to " + website + " was successful.");
            return connection;
        }
        return null;
    }

    /**
     * creates a connection to given URL, returns true if response code is 200 (HTTP_OK)
     */
    protected boolean connectToWebsite() {


        return false;
    }

}

