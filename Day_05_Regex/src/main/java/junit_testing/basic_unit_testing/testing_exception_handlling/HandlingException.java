package junit_testing.basic_unit_testing.testing_exception_handlling;

public class HandlingException {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}


