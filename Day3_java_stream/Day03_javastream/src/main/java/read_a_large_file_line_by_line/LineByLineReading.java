package read_a_large_file_line_by_line;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineByLineReading {
    public static void main(String[] args) {
        String filePath="src/main/java/read_a_large_file_line_by_line/LargeFile";

        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=reader.readLine())!=null){
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
