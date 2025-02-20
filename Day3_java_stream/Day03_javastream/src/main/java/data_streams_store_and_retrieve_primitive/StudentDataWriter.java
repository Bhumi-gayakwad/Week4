package data_streams_store_and_retrieve_primitive;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentDataWriter {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/java/data_streams_store_and_retrieve_primitive/studentread"));
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of students: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Roll Number: ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter GPA: ");
                double gpa = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                // Writing data to file
                dos.writeInt(rollNumber);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
            }

            System.out.println("Student details successfully written to 'students.dat'.");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
