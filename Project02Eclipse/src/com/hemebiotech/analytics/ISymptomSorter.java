/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will sort the elements of a hashMap.
 *
 */
public interface ISymptomSorter {
	
	/**
	 * Sorts any hashMap by using the transformation of the hashmap into a treemap which is returned
	 * @param countedSymptom : The hashmap to be sorted.
	 * 
	 * @return : the treemap cloned from countedSymptom  
	 */
	Map <String, Integer> sortSymptom(Map <String,Integer> countedSymptoms);

}
