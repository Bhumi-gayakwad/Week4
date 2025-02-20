package reflections.basic_level.dynamically_create_objects;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Create an instance of Student dynamically
            Class<?> clazz = Class.forName("Student");
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // Invoke method dynamically
            clazz.getMethod("display").invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
