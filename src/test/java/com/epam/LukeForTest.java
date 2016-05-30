package com.epam;

/**
 * Class used only by test to create expected content of Luke Skywalker from swapi website
 */
public class LukeForTest {

    public static String createHim() {
        String dossier = "{\n" +
                "\t\"name\": \"Luke Skywalker\",\n" +
                "\t\"height\": \"172\",\n" +
                "\t\"mass\": \"77\",\n" +
                "\t\"hair_color\": \"blond\",\n" +
                "\t\"skin_color\": \"fair\",\n" +
                "\t\"eye_color\": \"blue\",\n" +
                "\t\"birth_year\": \"19BBY\",\n" +
                "\t\"gender\": \"male\",\n" +
                "\t\"homeworld\": \"http://swapi.co/api/planets/1/\",\n" +
                "\t\"films\": [\n" +
                "\t\t\"http://swapi.co/api/films/6/\",\n" +
                "\t\t\"http://swapi.co/api/films/3/\",\n" +
                "\t\t\"http://swapi.co/api/films/2/\",\n" +
                "\t\t\"http://swapi.co/api/films/1/\",\n" +
                "\t\t\"http://swapi.co/api/films/7/\"\n" +
                "\t],\n" +
                "\t\"species\": [\n" +
                "\t\t\"http://swapi.co/api/species/1/\"\n" +
                "\t],\n" +
                "\t\"vehicles\": [\n" +
                "\t\t\"http://swapi.co/api/vehicles/14/\",\n" +
                "\t\t\"http://swapi.co/api/vehicles/30/\"\n" +
                "\t],\n" +
                "\t\"starships\": [\n" +
                "\t\t\"http://swapi.co/api/starships/12/\",\n" +
                "\t\t\"http://swapi.co/api/starships/22/\"\n" +
                "\t],\n" +
                "\t\"created\": \"2014-12-09T13:50:51.644000Z\",\n" +
                "\t\"edited\": \"2014-12-20T21:17:56.891000Z\",\n" +
                "\t\"url\": \"http://swapi.co/api/people/1/\"\n" +
                "}";

        return dossier;
    }

}
