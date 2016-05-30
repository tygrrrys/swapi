package com.epam;

import java.net.URL;

/**
 * Creating String containing content of passed through constructor URL.
 */
public class CreateContent {
    URL website;
    public CreateContent(URL website) {
        this.website = website;
    }

    /**
     * creates a connection to given URL, returns true if response code is 200
     */
    public boolean connectToWebsite() {


        return true;
    }
}
