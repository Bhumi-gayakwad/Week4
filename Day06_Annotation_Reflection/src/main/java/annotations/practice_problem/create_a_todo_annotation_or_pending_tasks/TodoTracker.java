package annotations.practice_problem.create_a_todo_annotation_or_pending_tasks;

import java.lang.reflect.Method;

public class TodoTracker {
    public static void main(String[] args) {
        Class<ProjectTasks> clazz = ProjectTasks.class;
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println(" Pending Tasks:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println(" Method: " + method.getName());
                System.out.println("    Task: " + todo.task());
                System.out.println("   Assigned To: " + todo.assignedTo());
                System.out.println("    Priority: " + todo.priority());
                System.out.println("------------------------------------");
            }
        }
    }
}