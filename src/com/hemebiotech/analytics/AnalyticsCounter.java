package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AnalyticsCounter {
	public Map<String, Integer> proceedInput(ArrayList<String> inputs) {
		Map<String, Integer> result = null;
		if (inputs != null) {
			result = new HashMap<>();
			for (String symptomName : inputs) {
				if (result.containsKey(symptomName)) {
					result.put(symptomName, result.get(symptomName)+1);
				}
				else {
					result.put(symptomName, 1);
				}
			}
		}
		return result;
	}

}
