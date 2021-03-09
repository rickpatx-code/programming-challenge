package de.exxcellent.challenge.SpreadCalculators;

import java.util.List;

import de.exxcellent.challenge.interfaces.SpreadCalculator;

/**
 * Class to implement Calculators for "Football"-Scenario - using "SpreadCalculator"-interface
 * 
 * @author Patrick Gröber
 *
 */
public class FootballSpreadCalculator implements SpreadCalculator {
	
	@Override
	public String getTargetWithMinSpread(List<String[]> rows) {
		
		//init variables
		int valueDiff, smallestDiff = 0;
		String targetValue = "default";

		//get Indexs of the target Strings for this scenario
		int index1 = getIndex(rows.get(0), "Goals");
		int index2 = getIndex(rows.get(0), "Goals Allowed");

		//going trough all "rows"
		for (int i = 1; i < rows.size(); i++) {
			
			//get the current row
			String[] currentRow = rows.get(i);
			
			//calculate the current Spread of the numbers at the indexes
			valueDiff = Math.abs(Integer.parseInt(currentRow[index1]) - Integer.parseInt(currentRow[index2]));
			
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

