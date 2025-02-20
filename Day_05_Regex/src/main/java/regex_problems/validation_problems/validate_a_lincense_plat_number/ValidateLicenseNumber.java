package regex_problems.validation_problems.validate_a_lincense_plat_number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateLicenseNumber {
    public static boolean validation(String regex, String platNumber){

        Pattern pattern=Pattern.compile(regex);

        return pattern.matcher(platNumber).matches();



    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String regex="^[A-Z]{2}[0-9]{4}$";
        System.out.println("Enter The Plate Number");
        String platNumber=scanner.nextLine();

        System.out.println(validation(regex,platNumber));
    }
}
