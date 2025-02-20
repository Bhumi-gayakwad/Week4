package annotations.create_repeatable_annotation_use;

class SoftwareModule {

    @BugReport(description = "Null pointer exception occurs on invalid input", reportedBy = "Alice")
    @BugReport(description = "Performance issue in data processing", reportedBy = "Bob")
    public void processData() {
        System.out.println("Processing data...");
    }
}
