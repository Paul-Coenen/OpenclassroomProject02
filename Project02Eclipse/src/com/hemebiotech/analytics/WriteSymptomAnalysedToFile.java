package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomAnalysedToFile implements ISymptomWriter {
	
	public void writeAnaliticsToFile(Map<String, Integer> sortedSymptoms,String fileName) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			
			for (String key : sortedSymptoms.keySet()) {
				writer.write(key + "="+sortedSymptoms.get(key)+"\n");
			}
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
