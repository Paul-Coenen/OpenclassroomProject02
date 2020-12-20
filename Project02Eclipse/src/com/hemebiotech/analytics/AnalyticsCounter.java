package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnalyticsCounter {

	public static void main(String[] args) {
		
		final String kDataSource= "symptoms.txt"; 
		final String kOutFile = "results.out";
		
		AnalyticsCounter myAnalytics = new AnalyticsCounter();
		
		List<String> myListSymptom = new ArrayList<String>();
		myListSymptom=myAnalytics.reader(kDataSource);
		
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
		CountSymptomsFromList myCounter = new CountSymptomsFromList();
		return myCounter.countSymptoms(symptomsRead);
	}
	
	private Map<String, Integer> sorter (Map <String, Integer> countedSymptoms){
		SortSymptoms mySorter = new SortSymptoms();
		return mySorter.sortSymptoms(countedSymptoms);
	}
	
	private void writer(Map<String,Integer> sortedSymptoms, String fileName) {
		WriteSymptomAnalysisToFile myWriter = new WriteSymptomAnalysisToFile();
		myWriter.writeAnalysisToFile(sortedSymptoms, fileName);
	}
}
