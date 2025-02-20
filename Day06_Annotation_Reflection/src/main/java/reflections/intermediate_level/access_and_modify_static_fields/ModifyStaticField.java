package reflections.intermediate_level.access_and_modify_static_fields;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            Class<Configuration> clazz = Configuration.class;
            Field apiKeyField = clazz.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true); // Make private field accessible

            // Modify the static field
            apiKeyField.set(null, "NEW_SECRET_KEY");

            // Call the method to verify the change
            Configuration.displayApiKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

