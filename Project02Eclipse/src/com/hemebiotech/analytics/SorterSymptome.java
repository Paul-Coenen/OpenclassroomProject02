package com.hemebiotech.analytics;

import java.util.List;
/**
 * 
 * Simple brut force implementation
 *
 */
public class SorterSymptome implements ISymptomSorter {

	/**
	 * Sort the list of Symptom objects according to the name of the side effect. <br>
	 * The process used is a loop of reading the list and switching the elements each time it is larger lexicographically
	 * then the next.
	 * The loop stop when there are no changes during a complete reading of the list.
	 * 
	 *  @param symptoms : the list to be sorted
	 */
	@Override
	public void sortSymptom(List<Symptom> symptoms) {
		boolean isSorted;
		Symptom symptom1;
		Symptom symptom2;
		
		do {
			isSorted=true;
			for(int i=0;i < symptoms.size()-1;i++) {
				symptom1=symptoms.get(i);
				symptom2=symptoms.get(i+1);
				
				if (symptom1.getName().compareTo(symptom2.getName()) > 0) {
					symptoms.set(i,symptom2);
					symptoms.set(i+1,symptom1);
					isSorted=false;
					
				}
			}
		} while (!isSorted);
		

	}

}
