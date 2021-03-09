package de.exxcellent.challenge.SpreadCalculators;

import java.util.List;

import de.exxcellent.challenge.interfaces.SpreadCalculator;

/**
 * Class to implement Calculators for "Weather"-Scenario - using "SpreadCalculator"-interface
 * 
 * @author Patrick Gröber
 *
 */
public class WeatherSpreadCalculator implements SpreadCalculator{

	@Override
	public String getTargetWithMinSpread(List<String[]> rows) {
		
		//init variables
		int valueDiff, smallestDiff = 0;
		String targetValue = "default";

		//going trough all "rows"
		for (int i = 1; i < rows.size(); i++) {
			
			//get the current row
			String[] currentRow = rows.get(i);
			
			//calculate the current Spread of the numbers at Index 1 and Index 2 (default for weather-scenario)
			valueDiff = Math.abs(Integer.parseInt(currentRow[1]) - Integer.parseInt(currentRow[2]));
			
			//check if the older smallest spread is higher or if its not overridden
			if (valueDiff < smallestDiff || targetValue.equals("default")) {
				//override the smallest spread and the "object" with the current values
				smallestDiff = valueDiff;
				targetValue = currentRow[0];
			}
		}
		
		//return the "object" with the smallest spread
		return targetValue;
	}

}
