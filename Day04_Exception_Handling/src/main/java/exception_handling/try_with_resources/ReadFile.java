package exception_handling.try_with_resources;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            // Read the first line from the file
            String firstLine = reader.readLine();

            // Print the first line if it exists
            if (firstLine != null) {
                System.out.println(firstLine);
            }
        } catch (IOException e) {
            // Handle file not found or other I/O errors
            System.out.println("Error reading file");
        }
    }
}
