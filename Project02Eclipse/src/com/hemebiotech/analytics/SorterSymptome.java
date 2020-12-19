package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * Simple brut force implementation
 *
 */
public class SorterSymptome implements ISymptomSorter {

	/**
	 * Sort the hashMap containing the appeared symptoms according to the name of them.
	 * This is done by cloning the hasmap into a treemap 
	 * 
	 *  @param countedSymptoms : the hashmap to be sorted
	 *  
	 *  @return: the treemap cloned from countedSymptom
	 */
	@Override
	public Map<String, Integer> sortSymptom(Map<String,Integer> countedSymptoms) {
		
		Map<String, Integer> sortedSymptoms = new TreeMap<>(countedSymptoms);
		
		return sortedSymptoms;
	}

}
