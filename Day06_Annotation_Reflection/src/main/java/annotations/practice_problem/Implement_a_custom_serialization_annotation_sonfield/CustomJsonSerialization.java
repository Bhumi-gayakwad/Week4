package annotations.practice_problem.Implement_a_custom_serialization_annotation_sonfield;

public class CustomJsonSerialization {
    public static void main(String[] args) {
        User user = new User("Alice", 25, "alice@example.com");

        // Serialize the user object to JSON
        String jsonString = JsonSerializer.serialize(user);
        System.out.println(jsonString);
    }
}