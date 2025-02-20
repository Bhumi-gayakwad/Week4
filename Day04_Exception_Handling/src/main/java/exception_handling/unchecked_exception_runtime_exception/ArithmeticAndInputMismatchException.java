package exception_handling.unchecked_exception_runtime_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticAndInputMismatchException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter the number");
            int number1=scanner.nextInt();
            System.out.println("Enter the number");
            int number2=scanner.nextInt();

            int div=number1/number2;
            System.out.println("Result is: "+" "+div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            scanner.close();
        }

    }
}
