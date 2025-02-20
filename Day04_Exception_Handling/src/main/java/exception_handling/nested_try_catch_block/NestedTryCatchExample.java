package exception_handling.nested_try_catch_block;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println("Enter the index of the element to access");
        int index=scanner.nextInt();
        System.out.println("Enter the divisor");
        int divisor=scanner.nextInt();

        try {
            int element = arr[index];

            try {
                int result = element / divisor; // Might throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }

scanner.close();
    }
}
