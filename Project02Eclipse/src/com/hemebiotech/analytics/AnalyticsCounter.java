package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.List;
public class AnalyticsCounter {

	public static void main(String[] args) {
		
		ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile("C:/Users/coenen/OpenClassRoom/OpenclassroomProject02/Project02Eclipse/symptoms.txt");
		List<String> myList = myReader.GetSymptoms();
		
		CountSymptomFromList myCounter = new CountSymptomFromList();
		
		List<Symptom> myAnalysis = new ArrayList<Symptom>();
		myAnalysis = myCounter.countSymptom(myList);
		
		SorterSymptome mySorter = new SorterSymptome();
		mySorter.sortSymptom(myAnalysis);
		
		for(Symptom sym : myAnalysis) {
			System.out.println(sym.getName()+"\t\t\t\t"+sym.getNumberCase());
		}
	}

}
