package de.exxcellent.challenge;

import java.io.IOException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     * @throws IOException 
     */
    public static void main(String... args) throws IOException {

        // Your preparation code …
    	Controller controller = new Controller();

        String dayWithSmallestTempSpread = controller.MinSpreadWeatherCSV();     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = controller.MinSpreadFootballCSV(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
