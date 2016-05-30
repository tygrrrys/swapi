package com.epam;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Logger;

/**
 * Created by aga on 30.05.16.
 */
public class OpenConnection {
    URL website;
    Logger logger = Logger.getLogger("OpenConnection.class");

    public OpenConnection(URL website) {
        this.website = website;
    }

    /**
     * creates a connection to given URL, returns true if response code is 200
     */
    public boolean connectToWebsite() {

        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) website.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "application/json");
            return conn.getResponseCode() == 200;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

