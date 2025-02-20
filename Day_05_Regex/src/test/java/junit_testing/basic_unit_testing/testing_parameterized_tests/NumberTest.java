package junit_testing.basic_unit_testing.testing_parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {

    private final NumberUtils numberUtils = new NumberUtils();

    // Test for even numbers
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEven(int number) {
        assertTrue(numberUtils.isEven(number), number + " should be even");
    }

    // Test for odd numbers
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsOdd(int number) {
        assertFalse(numberUtils.isEven(number), number + " should be odd");
    }
}
