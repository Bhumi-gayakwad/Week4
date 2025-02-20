package annotations.practice_problem.create_an_annotation_for_logging_method_execution_time;

public class ExecutionTimeLogger {
    public static void main(String[] args) {
        // Create a proxy instance that logs execution time
        TaskService originalService = new TaskService();
        TaskService proxyService = (TaskService) Proxy.newProxyInstance(
                TaskService.class.getClassLoader(),
                new Class[]{TaskService.class},
                new ExecutionTimeProxyHandler(originalService)
        );

        // Execute methods and log their execution time
        proxyService.quickTask();  // Should take very little time
        proxyService.slowTask();   // Should take ~1000ms
    }
}