package reflections.basic_level.get_class_information;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("\n🔹 Class: " + clazz.getName());

            // Display Constructors
            System.out.println("\n🔹 Constructors:");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println("   ➤ " + constructor);
            }

            // Display Fields
            System.out.println("\n🔹 Fields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println("   ➤ " + field);
            }

            // Display Methods
            System.out.println("\n🔹 Methods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("   ➤ " + method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("⚠️ Class not found: " + e.getMessage());
        }

        scanner.close();
    }
}
