package reflections.basic_level.invoke_private_method;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();

            // Access private method
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allow invocation of private method

            int result = (int) multiplyMethod.invoke(calculator, 5, 10);
            System.out.println("🔹 Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

