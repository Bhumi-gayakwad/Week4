package regex_problems.advance_problems.validate_social_security_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    // Function to validate SSN
    public static void validateSSN(String text) {
        // Regular expression for SSN validation
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(" \"" + matcher.group() + "\" is valid");
            found = true;
        }

        if (!found) {
            System.out.println(" No valid SSN found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.println("Enter a text containing SSN:");
        String text = scanner.nextLine();

        // Validate SSN
        validateSSN(text);

        scanner.close();
    }
}
