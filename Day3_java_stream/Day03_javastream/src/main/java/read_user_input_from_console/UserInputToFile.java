package read_user_input_from_console;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
        String fileName="src/main/java/read_user_input_from_console/user_data";

        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer=new FileWriter(fileName,true)){
            System.out.println("Enter your name: ");
            String name=reader.readLine();

            System.out.println("Enter your age: ");
            String age=reader.readLine();

            System.out.println("Enter your programming language: ");
            String language=reader.readLine();

            writer.write("Name: "+name+ "\n");
            writer.write("Age: "+age+"\n");

            writer.write("Programming"+language+"\n");

            System.out.println("Data Successfully saved to : " + fileName);
        }catch(IOException e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}
