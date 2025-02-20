package junit_testing.basic_unit_testing.testing_calculator_class;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3));
        Assertions.assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(1, calculator.subtract(3, 2));
        Assertions.assertEquals(-3, calculator.subtract(-2, 1));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, calculator.divide(6, 3));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }
}
