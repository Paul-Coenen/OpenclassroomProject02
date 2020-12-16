/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.List;

/**
 * @author Coenen
 * 
 * Anything that will count symptom from a list of String describing symptoms
 * The important part is, the return value from the operation, which is a list of Symptom. @see Symptom
 * Each Symptom of the list is a unique (not the same name twice).
 * 
 * The implementation does not need to sort the list
 */
public interface ISymptomCounter {
	List<Symptom> countSymptom (List<String> symptomsRead);

}
