package regex_problems.extraction_problems.extract_all_email_addressess_from_text;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailExample {
    public static void validation( String emailAddress){
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(emailAddress);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the email address");
        String emailAddress=scanner.nextLine();

        ExtractEmailExample.validation(emailAddress);
    }
}
