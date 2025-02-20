package regex_problems.advance_problems.find_repeating_words;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;

public class FindRepeatingWords {
    // Function to find repeating words
    public static void findRepeatingWords(String text) {
        // Regular expression for repeated words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1)); // Store only unique repeated words
        }

        // Print result
        if (!repeatedWords.isEmpty()) {
            System.out.println("Repeated words: " + String.join(", ", repeatedWords));
        } else {
            System.out.println("No repeated words found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Find and Print Repeating Words
        findRepeatingWords(text);

        scanner.close();
    }
}

