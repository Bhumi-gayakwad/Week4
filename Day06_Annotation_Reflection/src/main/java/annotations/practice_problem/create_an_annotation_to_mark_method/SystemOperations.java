package annotations.practice_problem.create_an_annotation_to_mark_method;

class SystemOperations {

    @ImportantMethod
    public void processCriticalData() {
        System.out.println("Processing critical data...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating report...");
    }

    @ImportantMethod(level = "LOW")
    public void logActivity() {
        System.out.println("Logging system activity...");
    }
}
