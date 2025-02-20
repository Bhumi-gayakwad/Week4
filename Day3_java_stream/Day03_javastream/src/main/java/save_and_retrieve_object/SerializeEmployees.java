package save_and_retrieve_object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "Engineering", 75000));
        employees.add(new Employee(103, "Charlie", "Finance", 65000));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/save_and_retrieve_object/employees.ser"))) {
            oos.writeObject(employees);
            System.out.println("Employee list serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

