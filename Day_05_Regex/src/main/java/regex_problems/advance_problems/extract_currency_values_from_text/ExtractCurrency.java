package regex_problems.advance_problems.extract_currency_values_from_text;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    // Function to extract currency values
    public static void extractCurrencyValues(String text) {
        // Regular expression for currency values
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Currency Values:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Print each match
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Extract and Print Currency Values
        extractCurrencyValues(text);

        scanner.close();
    }
}

