package com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.in;

/**
 * Creating String containing content of passed through constructor URL.
 */
public class CreateContent {

    //is it a uses-a..?? :P
    HandleConnection openConn;
    protected HttpURLConnection connection;
    private Logger logger = Logger.getLogger("CreateContent.class");

    public CreateContent(URL website) {
        openConn = new HandleConnection(website);
        connection = openConn.openConnection();
    }


    public String createContent() {
        StringBuilder sb = new StringBuilder();
        if (connection != null)
            connection.setReadTimeout(60 * 1000);
        try (InputStreamReader in = new InputStreamReader(connection.getInputStream(), Charset.defaultCharset())) {
            BufferedReader bufferedReader = new BufferedReader(in);
            if (bufferedReader != null) {
                int cp;
                while ((cp = bufferedReader.read()) != -1) {
                    sb.append((char) cp);
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "cannot create Input Stream");
        }
        return sb.toString();
    }
}
