package regex_problems.extraction_problems.extract_link_from_web_page;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractURLs {
    // Function to extract URLs from text
    public static void extractUrls(String text) {
        // Regex pattern for URLs
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Print all found URLs
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example Input
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // Extract and print URLs
        extractUrls(text);

        scanner.close();
    }
}
