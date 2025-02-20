package exception_handling.finally_block_execution;

import java.util.Scanner;

public class IntegerDivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number1=scanner.nextInt();
        System.out.println("Enter the number");
        int number2=scanner.nextInt();

        try{
            int div=number1/number2;
            System.out.println("Result is: "+" "+div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
