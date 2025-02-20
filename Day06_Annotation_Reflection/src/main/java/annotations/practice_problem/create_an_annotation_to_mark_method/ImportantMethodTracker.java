package annotations.practice_problem.create_an_annotation_to_mark_method;

import java.lang.reflect.Method;

public class ImportantMethodTracker {
    public static void main(String[] args) {
        Class<SystemOperations> clazz = SystemOperations.class;
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println(" Important Methods:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println(" Method: " + method.getName());
                System.out.println("   Importance Level: " + annotation.level());
                System.out.println("------------------------------------");
            }
        }
    }
}