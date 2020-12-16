package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;



/**
 * 
 * Simple brut force implementation
 * 	
 */
public class CountSymptomFromList implements ISymptomCounter  {

	/**
	 *  The list of Symptom  which contains every Symptom object created at the first appearing and increased 
	 *  each time it appears after.<br>
	 *  This only can be modified by findSymptom method. 
	 *  @see Symptom  
	 *  
	 */
	private List<Symptom> listSymptom = new ArrayList<Symptom>();
	
	/**
	 * Read the list of String containing the name of side effect and count the number of case each occurrence appears
	 * The result is saved as a list of Symptom objects 
	 * @param symptomsRead : The list of String containing the side effect. 
	 * 					The list of String containing the name of side effect.
	 * @return The list of Symptom object which contains the result of the case count
	 */
	@Override
	public List<Symptom> countSymptom(List<String> symptomsRead) {
		
		for (String occurrence : symptomsRead) {
			if (!findSymptom(occurrence)) {
				listSymptom.add(new Symptom(occurrence));
			}
		}
		
		return listSymptom;
	}
	
	/**
	 * Compare a String containing the name of the side effect to each name of Symptom included in listSymptom 
	 * @param occurrence : The name of the side effect to be compared.
	 * @return true if the name allready exists <br>
	 * 		   false if not	 
	 */
	private boolean findSymptom(String occurrence) {
		
		boolean isFind = false;
		
		for (Symptom sym : listSymptom) {
			// le test sym.getName()==occurrence ne fonctionne pas car il compare les adresses et non les chaines...
			if (sym.getName().equals(occurrence)) {
				sym.increaseCase();
				isFind=true;
				continue;
			}
		}
		
		return isFind;	
	}
	
}
