package filter_streams_convert_uppercase_lowercase;

import java.io.*;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String inputFile = "src/main/java/filter_streams_convert_uppercase_lowercase/source";   // Source file
        String outputFile = "src/main/java/filter_streams_convert_uppercase_lowercase/destination"; // Destination file

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine(); // Preserve line breaks
            }
            System.out.println("Conversion completed! Check 'output.txt'.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

