package file_handling_read_write_text_file;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
        try (FileInputStream foi = new FileInputStream("src/main/java/file_handling_read_write_text_file/readFile");
             FileOutputStream fos = new FileOutputStream("src/main/java/file_handling_read_write_text_file/writeFile")) {

            int byteData;
            while ((byteData = foi.read()) != -1) {  // Corrected condition
                fos.write(byteData);
            }
            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("Error: An I/O exception occurred - " + e.getMessage());
        }
    }
}
