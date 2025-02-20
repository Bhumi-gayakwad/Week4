package annotations.practice_problem.create_an_annotation_for_logging_method_execution_time;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class ExecutionTimeProxyHandler implements InvocationHandler {
    private final Object target;

    public ExecutionTimeProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.nanoTime(); // Start timer

            Object result = method.invoke(target, args); // Execute method

            long endTime = System.nanoTime(); // End timer
            long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds

            System.out.println("Execution time of " + method.getName() + ": " + executionTime + " ms");

            return result;
        } else {
            return method.invoke(target, args); // Execute normally
        }
    }
}
