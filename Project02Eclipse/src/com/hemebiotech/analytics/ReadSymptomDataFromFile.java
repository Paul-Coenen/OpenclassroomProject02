package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/** 
	 * The file's path of the must-be-read file
	 */
	private String filepath;
	
	/**
	 * Constructor ReadSymptomDataFromFile
	 * When it's created an instance of ReadSymptomDataFromFile is initialize to point to the file containing the list 
	 * of symptoms
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	/**
	 * Read the file containing the list of symptoms (one per line) and set each of them in a list of String
	 * If the source file is not accessible (omitted or wrong path), the exception will be thrown. 
	 * @return The list of String describing the symptoms
	 * @throws IOException : The filePath is not valid
	 * @throws NullPointerException : The filePath was omitted.
	 */
	@Override
	public List<String> GetSymptoms() throws IOException, NullPointerException {
		
		ArrayList<String> result = new ArrayList<String>();
		
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				
				reader.close();
			} catch (IOException e) {
				String errorMessage = "Le fichier " + filepath + " est inaccessible!";
				throw new IOException(errorMessage);
				
			}catch (NullPointerException e) {
				String errorMessage = "Aucun chemin n'a été spécifié pour le fichier de symptômes!";
				throw new NullPointerException(errorMessage);
			}
		
		return result;	
	}

}
