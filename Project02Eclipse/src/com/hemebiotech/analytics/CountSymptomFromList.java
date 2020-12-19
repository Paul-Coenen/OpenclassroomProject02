package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * Simple brut force implementation
 * 	
 */
public class CountSymptomFromList implements ISymptomCounter  {

	
	/**
	 * Read the list of String containing the appeared symptoms and count the number of cases each occurrence appears
	 * The result is saved as a hashmap whose key is the symptom's name and the value is the number of appearings'. 
	 * @param appearingSymptoms : The list of String containing the appeared side effects (symptom). One element means one appearing.  
	 * 					
	 * @return The map containing the result of the cases counting (Symptom's name / Number of appearings as the key/value)
	 */
	
	public Map<String,Integer> countSymptom(List<String> appearingSymptoms) {
		Map<String, Integer> countedSymptoms = new HashMap<String, Integer>();
		
		for (String occurrence : appearingSymptoms) {
			if (countedSymptoms.containsKey(occurrence)) {		
				// The symptom already exists => This is not the first appearing -> Value = value + 1
				countedSymptoms.put(occurrence, countedSymptoms.get(occurrence)+1);
			}
			else {	// first appearing's symptom => value = 1
				countedSymptoms.put(occurrence, 1);
			}
		}
		
		return countedSymptoms;
	}
	
}
