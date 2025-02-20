package reflections.intermediate_level.retrieve_annotations_at_runtime;

@Author(name = "John Doe")
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}
