package exception_handling.checked_exception_compile_time_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String file = "src/main/java/exception_handling/checked_exception_compile_time_exception/data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
