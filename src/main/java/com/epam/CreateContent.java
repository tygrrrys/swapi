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

    }


    public String createContent() throws IOException {

        return "";
    }
}
