package annotations.custom_annotation_use;

import java.lang.reflect.Method;

public class CustomAnnotationExample {
    public static void main(String[] args) {
        try {
            // Get class reference
            Class<TaskManager> obj = TaskManager.class;

            // Iterate through methods
            for (Method method : obj.getDeclaredMethods()) {
                // Check if @TaskInfo is present
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    // Retrieve annotation
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                    // Display annotation details
                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + taskInfo.priority());
                    System.out.println("Assigned To: " + taskInfo.assignedTo());
                    System.out.println("---------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
