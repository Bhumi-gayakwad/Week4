package regex_problems.extraction_problems.extract_date_in_formate;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

    public static void extractDates(String text) {
        // Regular expression to match dates in dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        System.out.println("Extracted Dates:");
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            found = true;
        }

        if (!found) {
            System.out.println("No valid dates found.");
        } else {
            System.out.println("\b\b");
        }
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Call the function to extract dates
        ExtractDates.extractDates(text);
    }
}
