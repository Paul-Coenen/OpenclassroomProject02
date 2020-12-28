package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;




public class AnalyticsCounter {

	public static void main(String[] args) {
		
		final String kDataSource= "symptoms.txt"; 
		final String kOutFile = "results.out";
		
		AnalyticsCounter myAnalytics = new AnalyticsCounter();
		
		List<String> myListSymptom = new ArrayList<String>();
		try {
			myListSymptom=myAnalytics.reader(kDataSource);

			
			if (myListSymptom.size()!=0) {
			Map<String, Integer> myAnalysis = new TreeMap<String,Integer>();	
			myAnalysis=myAnalytics.counter(myListSymptom);
			
			myAnalytics.writer(myAnalysis, kOutFile);
			
			} else {
				System.out.println("Le fichier de symptomes est vide !");
			}
		
		} catch (IOException e) {
			
			System.out.println("Le fichier " + kDataSource + " est introuvable!");
			//System.err.println("Caught IO Exception : " + e.getMessage());
			
		} catch (NullPointerException e) {
			System.out.println("Aucun chemin n'est spécifié pour le fichier de symptomes!");
			//System.err.println("Caught NullPointer Exception : "+e.getMessage());
		}
		

	}

	
	
	private List<String> reader(String path) throws IOException {
		ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile(path);
			
		return myReader.GetSymptoms();
		
	}
	
	private Map<String, Integer> counter (List<String> symptomsRead){
		CountSymptomsFromList myCounter = new CountSymptomsFromList();
		return myCounter.countSymptoms(symptomsRead);
	}
	
	
	private void writer(Map<String,Integer> sortedSymptoms, String fileName) {
		WriteSymptomAnalysisToFile myWriter = new WriteSymptomAnalysisToFile();
		myWriter.writeAnalysisToFile(sortedSymptoms, fileName);
	}
}
