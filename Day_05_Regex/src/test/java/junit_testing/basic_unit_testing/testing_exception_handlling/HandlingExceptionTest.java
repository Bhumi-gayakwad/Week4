package junit_testing.basic_unit_testing.testing_exception_handlling;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HandlingExceptionTest{
    @Test
    void testDivideByZero() {


        Exception exception = assertThrows(ArithmeticException.class, () -> {
            HandlingException.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
