package annotations.practice_problem.Implement_a_custom_caching_system_with_cacheResult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    // Method to get cached result
    public static Object getCachedResult(Method method, Object[] args) {
        String key = generateKey(method, args);
        return cache.getOrDefault(key, null);
    }

    // Method to store result in cache
    public static void storeResult(Method method, Object[] args, Object result) {
        String key = generateKey(method, args);
        cache.put(key, result);
    }

    // Generate a unique key based on method name and arguments
    private static String generateKey(Method method, Object[] args) {
        StringBuilder key = new StringBuilder(method.getName());
        for (Object arg : args) {
            key.append("_").append(arg);
        }
        return key.toString();
    }
}