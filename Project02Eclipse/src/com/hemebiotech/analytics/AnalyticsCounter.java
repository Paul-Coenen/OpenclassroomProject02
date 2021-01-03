package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * AnalysticsCounter is the class that allows you to analyze the side effects related to the use of certain drugs
 * From a list of symptoms contained in a text file, this counts the number of occurrences of thes symptoms.
 * The result is saved in a text file containing the appeared symptoms list, sorted in alphabetical order and followed by 
 * the number of occurrences.  
 */

public class AnalyticsCounter {

	/**
	 * <p>
	 * main : conducts the analysis in three steps :
	 * <ul>
	 * <li>reading the file</li>
	 * <li>symptom counting</li>
	 * <li>creation of the results file (result.out)</li>
	 * </ul>
	 * </p>
	 * @param args
	 */
	public static void main(String[] args) {
		

		final String kDataSource= "symptoms.txt"; 
		final String kOutFile = "results.out";
		
		AnalyticsCounter myAnalytics = new AnalyticsCounter();
		
		List<String> myListSymptom = new ArrayList<String>();
		try {
			myListSymptom=myAnalytics.reader(kDataSource);
			
			if (myListSymptom.size()!=0) {	//The source file has been read and isn't empty
			
			Map<String, Integer> myAnalysis = new TreeMap<String,Integer>();	
			myAnalysis=myAnalytics.counter(myListSymptom);
			
			myAnalytics.writer(myAnalysis, kOutFile);
			
			System.out.println("Le traitement est terminé!\nLe résultat est enregistré dans le fichier "+kOutFile);
			} else {	// The source file was empty
				System.out.println("Le fichier de symptômes est vide !");
			}
		
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}


	/**
	 * Read the source file containing the symptom and set it in a list of string
	 * 
	 * @param path : filepath a full or partial path to file with symptom strings in it, one per line
	 * @return The list of String describing the symptoms
	 * @throws IOException : The file wasn't read because of non existence or accessibility not allowed
	 * @throws NullPointerException : The path was null
	 */
	
	private List<String> reader(String path) throws IOException,NullPointerException {
		ReadSymptomDataFromFile myReader  = new ReadSymptomDataFromFile(path);
			
		return myReader.GetSymptoms();
		
	}
	
	/**
	 * Read the list of String containing the appeared symptoms and count the number of cases each occurrence appears
	 * The result is saved as a hashmap whose key is the symptom's name and the value is the number of appearings'.
	 * 
	 * @param symptomsRead : The list of String containing the appeared symptom. One element means one appearing.
	 * @return The map containing the result of the cases counting (Symptom's name / Number of appearings as the key/value)
	 */
	private Map<String, Integer> counter (List<String> symptomsRead){
		CountSymptomsFromList myCounter = new CountSymptomsFromList();
		return myCounter.countSymptoms(symptomsRead);
	}
	
	/**
	 * Write the result of the frequency symptom occurence analysis in an output file.
	 * @param sortedSymptoms : the Map containing the result with de symptom's name as the key and the number of occurence as the value.
	 * @param fileName : a full or partial path to the file in which the result must be written. If the path is invalid or null, the
	 * @throws IOException : The fileName is not valid.
	 * @throws NullPointerException : The fileName was omitted 
	 */
	private void writer(Map<String,Integer> sortedSymptoms, String fileName) throws IOException, NullPointerException {
		WriteSymptomAnalysisToFile myWriter = new WriteSymptomAnalysisToFile();
		myWriter.writeAnalysisToFile(sortedSymptoms, fileName);
	}
}
