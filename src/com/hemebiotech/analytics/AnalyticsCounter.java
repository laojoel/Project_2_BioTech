package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AnalyticsCounter {

	// Compute the frequency of each symptom from the input -> A String Array
	public Map<String, Integer> proceedInput(ArrayList<String> inputs) {
		Map<String, Integer> result = null;
		if (inputs != null) {
			result = new HashMap<>();
			// For each symptom for the input list
			for (String symptomName : inputs) {
				// Increment the count if the symptom is already recorded
				if (result.containsKey(symptomName)) {
					result.put(symptomName, result.get(symptomName)+1);
				}
				// Add it to the output List if this is a new symptom
				else {
					result.put(symptomName, 1);
				}
			}
		}
		// return null if the inputs is null
		return result;
	}

}
