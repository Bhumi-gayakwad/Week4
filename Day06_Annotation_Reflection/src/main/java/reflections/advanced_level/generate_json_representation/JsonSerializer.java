package reflections.advanced_level.generate_json_representation;

import reflections.basic_level.access_private_field.Person;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                json.append("\"").append(fields[i].getName()).append("\": ");
                json.append("\"").append(fields[i].get(obj)).append("\"");
                if (i < fields.length - 1) json.append(", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}
