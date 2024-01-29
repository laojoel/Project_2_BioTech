package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ISymptomWriter {
    // Takes the analyzed symptoms as a 2D Array (Map) input and write it as an UTF8 text file
    // to a specified String path
    public void WriteSymptomDataToFile(String filePath, Map<String, Integer> result) {
        Charset encoding = StandardCharsets.UTF_8;
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath), encoding);
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                writer.write(entry.getKey() + ", " + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {e.printStackTrace();}
    }
}
