package regex_problems.advance_problems.Extract_name_from_text;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractText {
    // Function to extract programming languages
    public static void extractLanguages(String text) {
        // Regular expression for programming languages
        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C#|Go|Ruby|Swift|Kotlin|PHP|TypeScript)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Programming Languages:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Print each match
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        // Extract and Print Programming Languages
        extractLanguages(text);

        scanner.close();
    }
}
