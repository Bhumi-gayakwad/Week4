package reflections.advanced_level.method_execution_timing;

class SampleMethods {
    public void slowMethod() throws InterruptedException {
        Thread.sleep(1000); // Simulate slow method
    }

    public void fastMethod() {
        // Fast execution
    }
}
