package data_streams_store_and_retrieve_primitive;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentDataReader {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/main/java/data_streams_store_and_retrieve_primitive/studentread"))) {

            System.out.println("Reading student details from 'students.dat':\n");

            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println("------------------------");
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
