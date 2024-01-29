package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ISymptomReader {
    // Open a Text file from a specified String path
    // and return his content as an Array of String (for each line)
    public ArrayList<String> ReadDataFromFile (String filePath) {
        if (filePath != null) {
            try {
                ArrayList<String> data = new ArrayList<String>();
                BufferedReader reader = new BufferedReader (new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {data.add(line);}
                reader.close();
                return data;
            } catch (IOException e) {e.printStackTrace();}

        }
        return  null;
    }

}
