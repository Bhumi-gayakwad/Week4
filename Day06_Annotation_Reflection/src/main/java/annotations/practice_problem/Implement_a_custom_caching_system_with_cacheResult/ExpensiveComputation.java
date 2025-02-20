package annotations.practice_problem.Implement_a_custom_caching_system_with_cacheResult;

import java.lang.reflect.Method;

class ExpensiveComputation {

    @CacheResult
    public int computeFactorial(int n) {
        try {
            // Simulate expensive computation
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return (n <= 1) ? 1 : n * computeFactorial(n - 1);
    }

    // Wrapper method to handle caching manually
    public int cachedComputeFactorial(int n) {
        try {
            Method method = this.getClass().getMethod("computeFactorial", int.class);
            if (method.isAnnotationPresent(CacheResult.class)) {
                Object cachedResult = CacheManager.getCachedResult(method, new Object[]{n});
                if (cachedResult != null) {
                    System.out.println("Returning cached result for " + n);
                    return (int) cachedResult;
                }
                int result = computeFactorial(n);
                CacheManager.storeResult(method, new Object[]{n}, result);
                return result;
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return computeFactorial(n);
    }
}
