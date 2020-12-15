package com.hemebiotech.analytics;

public class Symptom {
	
	// propriétés
	private String name;
	private int numberCase;
	
	
	public String getName() {
		return name;
	}


	/**
	 * @return the numberCase
	 */
	public int getNumberCase() {
		return numberCase;
	}


	public void increaseCase() {
		numberCase++;
	}


	public Symptom(String name) {
		super();
		this.name = name;
		numberCase=0;
	}
	

	
}
