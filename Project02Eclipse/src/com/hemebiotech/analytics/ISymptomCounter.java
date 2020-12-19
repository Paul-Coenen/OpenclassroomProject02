/**
 * 
 */
package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

/**
 * @author Coenen
 * 
 * Anything that will count symptoms from a list of String describing symptoms
 * The important part is, the return value from the operation, which is a map whose key is the symptom's name
 * and the value, the number of cases.
 * 
 * 
 * The implementation does not need to sort the map
 */
public interface ISymptomCounter {
	Map<String, Integer> countSymptom (List<String> appearingSymptoms);

}
