package annotations.practice_problem.create_a_maxlength_annotation_for_field_validation;

import java.lang.reflect.Field;

class User {
    @MaxLength(10) // Max length set to 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(this, username);
        this.username = username;
    }

    // Step 3: Validate MaxLength Using Reflection
    private void validateMaxLength(Object obj, String fieldValue) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                int maxLength = annotation.value();

                if (fieldValue.length() > maxLength) {
                    throw new IllegalArgumentException("Error: " + field.getName() +
                            " exceeds max length of " + maxLength + " characters.");
                }
            }
        }
    }
}
