package annotations.practice_problem.create_a_todo_annotation_or_pending_tasks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();         // Task description
    String assignedTo();   // Developer responsible
    String priority() default "MEDIUM";  // Priority (default: MEDIUM)
}