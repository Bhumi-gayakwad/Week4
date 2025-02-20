package regex_problems.extraction_problems.extract_all_capitalized_words_from_sentence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractCapitalizedWords {

    public static void extractCapitalizedWords(String text) {
        // Regular expression to match capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false; // Track if any word is found
        System.out.println("Extracted Capitalized Words:");
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            found = true;
        }

        if (!found) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println("\b\b"); // Remove the last comma and space
        }
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Call the function from the CapitalizedWordExtractor class
        ExtractCapitalizedWords.extractCapitalizedWords(text);
    }
}


