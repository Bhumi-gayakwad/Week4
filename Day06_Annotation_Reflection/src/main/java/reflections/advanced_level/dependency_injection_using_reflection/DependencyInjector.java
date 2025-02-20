package reflections.advanced_level.dependency_injection_using_reflection;

import java.lang.reflect.Field;

public class DependencyInjector {
    public static void injectDependencies(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    field.set(obj, field.getType().getDeclaredConstructor().newInstance());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Dependency injection failed", e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        injectDependencies(client);
        client.execute();
    }
}
