package com.hemebiotech.analytics;

/**
 * 
 * 
 *
 *<b> Symptom is the class that represents a side effect due to the intake of the analysed drug.</b>
 *
 * This is characterized by the following informations:
 * <ul>
 * <li>A name</li>
 * <li>The number of cases in which it appeared </li>
 * </ul>
 * 
 */
public class Symptom {
	
	/**
	 * The symptom's name. It is defined at the Symptom object creation and can't be modified after.
	 */
	private String name;
	
	/**
	 * The number of cases in  which the symptom appeared
	 * It is set at the value 1 at the Symptom object creation ant can only be increased after. 
	 * @see increaseCase
	 */
	private int numberCase;

	/**
	 * Constructor Symptom
	 *<p>
	 *When a Symptom object is created, the numberCase is set to the value 1, because it is created at the first 
	 *time it appears.
	 *
	 * 
	 *</p>
	 * @param name
	 * 				The symptom's name
	 * 
	 */
	public Symptom(String name) {
		this.name = name;
		numberCase=1;
	}
	
	/**
	 * Increase the number of cases when the symptom appears once again.
	 */
	public void increaseCase() {
		numberCase++;
	}
	
	
	/**
	 * @return The name of symptom as a String
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the number of case in wich the symptom appeared as an integer
	 */
	public int getNumberCase() {
		return numberCase;
	}

}
