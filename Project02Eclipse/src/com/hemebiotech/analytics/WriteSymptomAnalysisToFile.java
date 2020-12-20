package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * Simple brut force implementation
 *
 */

public class WriteSymptomAnalysisToFile implements ISymptomWriter {
	
	/**
	 * 	Write the result of the frequency symptom occurence analysis in an output file.
	 * 
	 *  @param sortedSymptoms : the Map containing the result with de symptom's name as the key and the number of occurence as the value.
	 *  @param fileName : a full or partial path to the file in which the result must be written.
	 */
	public void writeAnalysisToFile(Map<String, Integer> sortedSymptoms,String fileName) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			
			for (String key : sortedSymptoms.keySet()) {
				writer.write(key + "="+sortedSymptoms.get(key)+"\n");
			}
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
