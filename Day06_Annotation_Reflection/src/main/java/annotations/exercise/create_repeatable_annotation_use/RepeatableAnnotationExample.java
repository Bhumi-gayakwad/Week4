package annotations.create_repeatable_annotation_use;

import java.lang.reflect.Method;

public class RepeatableAnnotationExample {
    public static void main(String[] args) {
        try {
            // Get class reference
            Class<SoftwareModule> obj = SoftwareModule.class;

            // Iterate through methods
            for (Method method : obj.getDeclaredMethods()) {
                // Check if the method has multiple @BugReport annotations
                if (method.isAnnotationPresent(BugReports.class)) {
                    BugReports bugReports = method.getAnnotation(BugReports.class);

                    // Print each bug report
                    System.out.println("Method: " + method.getName());
                    for (BugReport bug : bugReports.value()) {
                        System.out.println("Bug Description: " + bug.description());
                        System.out.println("Reported By: " + bug.reportedBy());
                        System.out.println("---------------------------");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
