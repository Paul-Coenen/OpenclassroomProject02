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
	 * @param countedSymptoms : The hashmap to be sorted. It contains the symptoms (as the key) and the number of appearings (as the value).
	 * 
	 * @return : the treemap cloned from countedSymptoms  
	 */
	Map <String, Integer> sortSymptoms(Map <String,Integer> countedSymptoms);

}
