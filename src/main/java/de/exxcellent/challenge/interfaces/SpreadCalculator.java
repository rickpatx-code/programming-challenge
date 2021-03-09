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
	

}
