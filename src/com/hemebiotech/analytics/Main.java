package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws Exception {
        // Open the text file and read the data
        ArrayList<String> inputData = new ISymptomReader().ReadDataFromFile("symptoms.txt");
        // iterate over the data and count the recurrences for each symptom
        Map<String, Integer> result = new AnalyticsCounter().proceedInput(inputData);
        // Write the result as a text file (UTF8)
        new ISymptomWriter().WriteSymptomDataToFile("result.txt", result);
    }
}
