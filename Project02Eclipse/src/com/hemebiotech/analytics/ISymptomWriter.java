package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomWriter {

	void writeAnaliticsToFile(Map <String,Integer> sortedSymptoms,String fileName);
}
