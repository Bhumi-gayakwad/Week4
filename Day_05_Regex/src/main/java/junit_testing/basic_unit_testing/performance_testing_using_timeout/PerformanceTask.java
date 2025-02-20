package junit_testing.basic_unit_testing.performance_testing_using_timeout;




public class PerformanceTask {

    // Simulating a long-running task (3 seconds)
    public boolean longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return true;
    }
}

