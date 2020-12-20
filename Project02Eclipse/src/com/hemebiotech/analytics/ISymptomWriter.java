package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write the result of the frequency of symptom occurence analysis in a file.
 */
public interface ISymptomWriter {

	/**
	 * This write the result of the analysis.
	 * @param sortedSymptoms : the Map containing the result with de symptom's name as the key and the number of occurence as the value.
	 * @param fileName : a full or partial path to the file in which the result must be written.
	 */
	void writeAnalysisToFile(Map <String,Integer> sortedSymptoms,String fileName);
}
