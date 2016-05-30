package com.epam;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class connecting to URL passed through constructor.
 */
public class HandleConnection {
    URL website;
    Logger logger = Logger.getLogger("HandleConnection.class");

    static HttpURLConnection connection;
    static String content;

    public HandleConnection(URL website) {
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

        try {
            connection = (HttpURLConnection) website.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "application/json");
            content = connection.getContent().toString();
            return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Cannot connect to given URL! "+e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) throws MalformedURLException {
        HandleConnection test = new HandleConnection(new URL("http://swapi.co/api/people/1/"));
        System.out.println(content);
    }
}

