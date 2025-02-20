package annotations.practice_problem.Implement_a_custom_serialization_annotation_sonfield;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class JsonSerializer {
    public static String serialize(Object obj) {
        Map<String, Object> jsonMap = new HashMap<>();

        // Get all fields from the class
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields

            // Check if the field has @JsonField annotation
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name(); // Custom key from annotation

                try {
                    Object value = field.get(obj);
                    jsonMap.put(jsonKey, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Convert Map to JSON String (Using Gson for formatting)
        return new Gson().toJson(jsonMap);
    }
}