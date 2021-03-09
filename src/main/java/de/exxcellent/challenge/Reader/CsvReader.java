package de.exxcellent.challenge.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.exxcellent.challenge.interfaces.Reader;

/**
 * Class to generate a List of String-Arrays out of a CSV-File - using Reader-Interface
 * 
 * @author Patrick Gröber
 *
 */
public class CsvReader implements Reader {

	@Override
	public List<String[]> read(String filepath) throws IOException {
		
		//read the file
		BufferedReader br = new BufferedReader(new FileReader(filepath));		
		
		//init ArrayList
		List<String[]> group = new ArrayList<String[]>();
		
		//read every line of the file
		String line;
		while ((line = br.readLine()) != null) {
			
			//split the current line at each "," and put every value into the StringArray
			String[] columns = line.split(",");
			
			//add the StringArray to the ArrayList
			group.add(columns);
		}
		
		//return the ArrayList
		return group;
	}

}