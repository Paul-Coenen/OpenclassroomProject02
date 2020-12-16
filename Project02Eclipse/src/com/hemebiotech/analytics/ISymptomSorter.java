/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will sort the elements of a list of Symptom objects
 *
 */
public interface ISymptomSorter {
	
	/**
	 * Sort a list of Symptom objects according to one or more defined criteria
	 * @param symptoms : The list to be sorted.
	 */
	void sortSymptom(List <Symptom> symptoms);

}
