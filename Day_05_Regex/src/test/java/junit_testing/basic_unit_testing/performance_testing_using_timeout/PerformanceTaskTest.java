package junit_testing.basic_unit_testing.performance_testing_using_timeout;




import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceTaskTest {

    private final PerformanceTask performanceTask = new PerformanceTask();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test should fail if it takes more than 2 seconds
    void testLongRunningTaskTimeout() {
        assertTrue(performanceTask.longRunningTask()); // Expected to fail as it takes 3 sec
    }
}
