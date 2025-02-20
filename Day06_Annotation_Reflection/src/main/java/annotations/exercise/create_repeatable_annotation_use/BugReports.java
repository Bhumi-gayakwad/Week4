package annotations.create_repeatable_annotation_use;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Container annotation to hold multiple @BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Define @BugReport annotation, making it repeatable
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) // Links to the container annotation
@interface BugReport {
    String description();
    String reportedBy();
}
