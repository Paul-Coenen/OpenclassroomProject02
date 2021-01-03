/**
 * 
 */
package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

/**
 * 
 * Anything that will count symptoms from a list of String describing symptoms
 * The important part is, the return value from the operation, which is a map whose key is the symptom's name
 * and the value, the number of cases.
 * 
 * @param appearingSymptoms : The list of String containing the appeared side effects (symptom). One element means one appearing.  
 * 					
 * @return The map containing the result of the cases counting (Symptom's name / Number of appearings as the key/value)
 * 
 */
public interface ISymptomCounter {
	
	Map<String, Integer> countSymptoms (List<String> appearingSymptoms);

}
