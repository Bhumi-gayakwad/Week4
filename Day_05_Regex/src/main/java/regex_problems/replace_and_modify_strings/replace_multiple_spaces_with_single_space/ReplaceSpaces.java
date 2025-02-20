package regex_problems.replace_and_modify_strings.replace_multiple_spaces_with_single_space;

import java.util.Scanner;

public class ReplaceSpaces {
    // Function to replace multiple spaces with a single space
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " "); // Replaces multiple spaces with a single space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example Input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Process and Print Output
        String result = replaceMultipleSpaces(input);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
