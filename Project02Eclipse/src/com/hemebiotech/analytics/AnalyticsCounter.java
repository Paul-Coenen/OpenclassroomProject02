package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnalyticsCounter {

	public static void main(String[] args) {
		
		final String kPath= "symptoms.txt"; //"C:/Users/coenen/OpenClassRoom/OpenclassroomProject02/Project02Eclipse/symptoms.txt";
		final String kOutFile = "results.out";
		
		AnalyticsCounter myAnalytics = new AnalyticsCounter();
		
		List<String> myListSymptom = new ArrayList<String>();
		myListSymptom=myAnalytics.reader(kPath);
		
		
		Map<String, Integer> symptoms = new HashMap<String,Integer>();	
		symptoms=myAnalytics.counter(myListSymptom);
		
		Map<String, Integer> mySortedSymptoms = new HashMap<String, Integer>();
		mySortedSymptoms=myAnalytics.sorter(symptoms);
		
		myAnalytics.writer(mySortedSymptoms, kOutFile);
	}

	
	
	private List<String> reader(String path) {
		ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile(path);
		return myReader.GetSymptoms();
		
	}
	
	private Map<String, Integer> counter (List<String> symptomsRead){
		CountSymptomFromList myCounter = new CountSymptomFromList();
		return myCounter.countSymptom(symptomsRead);
	}
	
	private Map<String, Integer> sorter (Map <String, Integer> countedSymptoms){
		SorterSymptome mySorter = new SorterSymptome();
		return mySorter.sortSymptom(countedSymptoms);
	}
	
	private void writer(Map<String,Integer> sortedSymptoms, String fileName) {
		WriteSymptomAnalysedToFile myWriter = new WriteSymptomAnalysedToFile();
		myWriter.writeAnaliticsToFile(sortedSymptoms, fileName);
	}
}
