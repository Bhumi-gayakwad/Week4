package annotations.practice_problem.create_a_maxlength_annotation_for_field_validation;

public class MaxLengthValidation {
    public static void main(String[] args) {
        try {
            User validUser = new User("Alice123"); // ✅ Valid
            System.out.println("User created successfully: " + validUser);

            User invalidUser = new User("VeryLongUsername123"); // ❌ Exceeds max length
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}