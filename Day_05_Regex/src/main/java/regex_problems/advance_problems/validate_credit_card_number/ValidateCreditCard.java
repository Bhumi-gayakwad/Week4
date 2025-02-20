package regex_problems.advance_problems.validate_credit_card_number;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    // Function to validate credit card numbers
    public static String validateCreditCard(String cardNumber) {
        // Regex patterns for Visa and MasterCard
        String visaRegex = "^4[0-9]{15}$";       // Visa: Starts with 4, 16 digits
        String masterCardRegex = "^5[0-9]{15}$"; // MasterCard: Starts with 5, 16 digits

        if (Pattern.matches(visaRegex, cardNumber)) {
            return "Valid Visa Card";
        } else if (Pattern.matches(masterCardRegex, cardNumber)) {
            return "Valid MasterCard";
        } else {
            return "Invalid Card Number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.println("Enter a Credit Card Number:");
        String cardNumber = scanner.nextLine();

        // Validate and Print Result
        String result = validateCreditCard(cardNumber);
        System.out.println(result);

        scanner.close();
    }
}
