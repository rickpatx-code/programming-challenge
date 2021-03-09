package de.exxcellent.challenge.interfaces;

import java.io.IOException;
import java.util.List;

/**
 * Interface for Readers: 
 * Reader should read the data from a path and give back a List of String[]
 * 
 * @author Patrick Gröber
 *
 */
public interface Reader {
	
	/**
	 * Method to read a file from its path and give back its Information as a List of String-Arrays
	 * One String Array should contain all data which belongs to one "Object"
	 * 
	 * @param filepath
	 * @return
	 * @throws IOException
	 */
	public List<String[]> read(String filepath) throws IOException;

}
