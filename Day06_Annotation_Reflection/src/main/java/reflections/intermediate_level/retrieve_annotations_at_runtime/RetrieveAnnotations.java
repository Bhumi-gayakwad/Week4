package reflections.intermediate_level.retrieve_annotations_at_runtime;

public class RetrieveAnnotations {
    public static void main(String[] args) {
        Class<Book> clazz = Book.class;

        // Check if annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {
            Author authorAnnotation = clazz.getAnnotation(Author.class);
            System.out.println("🔹 Author: " + authorAnnotation.name());
        } else {
            System.out.println("⚠️ No Author annotation found.");
        }
    }
}
