package regex_problems.replace_and_modify_strings.censor_bad_words_in_sentence;



import java.util.Scanner;
import java.util.regex.Pattern;

public class CensorBadWords {

    public static String censorBadWords(String text, String[] badWords) {
        for (String badWord : badWords) {
            // Create regex pattern with word boundaries (\b) and case-insensitivity (?i)
            String regex = "(?i)\\b" + Pattern.quote(badWord) + "\\b";
            text = text.replaceAll(regex, "****");
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define bad words list
        String[] badWords = {"damn", "stupid"};

        // Input sentence
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Censor the bad words
        String censoredText = censorBadWords(input, badWords);

        // Output result
        System.out.println("Censored Output: " + censoredText);

        scanner.close();
    }
}
