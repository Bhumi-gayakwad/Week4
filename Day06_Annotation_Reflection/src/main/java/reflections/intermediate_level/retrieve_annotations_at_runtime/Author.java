package reflections.intermediate_level.retrieve_annotations_at_runtime;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}
