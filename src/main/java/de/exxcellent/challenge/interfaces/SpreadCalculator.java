package de.exxcellent.challenge.interfaces;

import java.util.List;

/**
 * Interface for all SpreadCalculators
 * 
 * @author Patrick Gröber
 *
 */
public interface SpreadCalculator {
	/**
	 * Method to get the "Object" with the minimum Spread at defined data-indexes
	 * 
	 * @param rows
	 * @return
	 */
	public String getTargetWithMinSpread(List<String[]> rows);
	
	/**
	 * Method to get the Index of a String in a StringArrays
	 * 
	 * @param columns
	 * @param tag
	 * @return
	 */
	default int getIndex(String[] columns, String tag) {
		int index = 0;

		// go trough the Array and look for the searched String (tag)
		for (int i = 0; i < columns.length; i++) {
			
			// if the value at [i] is eqaul to the searched String, set the index to the current number and break
			if (columns[i].equals(tag)) {
				index = i;
				break;
			}
		}
		
		// return the index
		return index;
	}

}
