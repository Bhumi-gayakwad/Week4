package save_and_retrieve_object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeEmployees {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/save_and_retrieve_object/employee"))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employee List:");
            for (Employee emp : employees) {
                emp.display();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
