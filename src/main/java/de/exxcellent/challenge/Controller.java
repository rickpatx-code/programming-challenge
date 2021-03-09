package de.exxcellent.challenge;

import java.io.IOException;

import de.exxcellent.challenge.Reader.CsvReader;
import de.exxcellent.challenge.SpreadCalculators.WeatherSpreadCalculator;

/**
 * Class to Realize a "Factory" for the main-class
 * 
 * @author Patrick Gröber
 *
 */
public class Controller {
	
	/**
	 * Gets Object Name with the minimum spread for the "Weather"-scenario
	 * 
	 * @return
	 * @throws IOException
	 */
	public String MinSpreadWeatherCSV() throws IOException {
		CsvReader csv = new CsvReader();		
		WeatherSpreadCalculator weatherCsv = new WeatherSpreadCalculator();			
		
		return weatherCsv.getTargetWithMinSpread(csv.read("src/main/resources/de/exxcellent/challenge/weather.csv"));		
	}
}

