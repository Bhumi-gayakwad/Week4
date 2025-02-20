package reflections.advanced_level.create_custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(instance, entry.getValue());
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map properties", e);
        }
    }

    public static void main(String[] args) {
        Map<String, Object> data = Map.of("name", "Alice", "age", 25);
        Person person = toObject(Person.class, data);
        person.display();
    }
}

