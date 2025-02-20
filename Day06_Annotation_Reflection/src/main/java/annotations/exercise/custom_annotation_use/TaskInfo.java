package annotations.custom_annotation_use;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.METHOD) // Applicable only to methods
@interface TaskInfo {
    String priority();
    String assignedTo();
}
