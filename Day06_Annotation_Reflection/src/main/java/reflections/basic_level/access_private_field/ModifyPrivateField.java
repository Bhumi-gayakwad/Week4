package reflections.basic_level.access_private_field;

import java.lang.reflect.Field;

public class ModifyPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            System.out.println("🔹 Before modification:");
            person.displayAge();

            // Access and modify private field
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Allow modification of private field
            ageField.set(person, 30);

            System.out.println("\n🔹 After modification:");
            person.displayAge();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
