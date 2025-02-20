package exception_handling.multiple_catch_blocks;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = (size > 0) ? new int[size] : null;

        if (arr != null) {
            System.out.println("Enter " + size + " elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        }

        // Input index
        System.out.print("Enter the index of the element to access: ");
        int index = scanner.nextInt();

        // Exception handling
        try {
            if (arr == null) {
                throw new NullPointerException();
            }
            int element = arr[index];
            System.out.println("Value at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        scanner.close();
    }
}

