package com.epam;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateContentTest {

    private Logger testLog = Logger.getLogger(CreateContentTest.class);
    private static String luke = CreateContentTest.lukeSkywalkerDossier();

    @BeforeMethod
    public static String lukeSkywalkerDossier (){
        return LukeForTest.createHim();
    }
    /**
     * this URL is checked in HandleConnectionTest
     * @throws MalformedURLException
     */
    @Test
    public void testIfConnectionToSwapiIsNotNull () throws MalformedURLException {
        final URL SWAPI = new URL("https://swapi.co/api/");
        CreateContent testConn = new CreateContent(SWAPI);

        assertThat(testConn.connection).isNotNull();
    }

    @Test
    public void testIfLukesDataIsFetched() throws Exception{
        try {
            final URL LUKE = new URL("http://swapi.co/api/people/1/");
            CreateContent lukesData = new CreateContent(LUKE);
            String fetchedContent = lukesData.createContent();
            assertThat(fetchedContent).isEqualTo(luke);
        } catch (MalformedURLException e) {
            testLog.error("Unable to connect to Luke's data "+e.getMessage());
        }
    }

}
