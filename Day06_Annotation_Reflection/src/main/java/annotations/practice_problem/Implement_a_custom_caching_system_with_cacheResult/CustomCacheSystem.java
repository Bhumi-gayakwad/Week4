package annotations.practice_problem.Implement_a_custom_caching_system_with_cacheResult;

public class CustomCacheSystem {
    public static void main(String[] args) {
        ExpensiveComputation obj = new ExpensiveComputation();

        // First call - computes result
        System.out.println("Factorial(5): " + obj.cachedComputeFactorial(5));

        // Second call - returns cached result
        System.out.println("Factorial(5): " + obj.cachedComputeFactorial(5));
    }
}