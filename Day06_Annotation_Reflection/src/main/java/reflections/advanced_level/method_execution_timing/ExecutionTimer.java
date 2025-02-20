package reflections.advanced_level.method_execution_timing;
import java.lang.reflect.Method;

public class ExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            long startTime = System.nanoTime();
            method.invoke(obj);
            long endTime = System.nanoTime();
            System.out.println("Execution time for " + methodName + ": " + (endTime - startTime) / 1_000_000.0 + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SampleMethods sample = new SampleMethods();
        measureExecutionTime(sample, "slowMethod");
        measureExecutionTime(sample, "fastMethod");
    }
}
