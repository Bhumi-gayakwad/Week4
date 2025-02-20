package regex_problems.validation_problems.validate_hex_color_code;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateColor {
    public static boolean validation(String regex,String hexColor){
        Pattern pattern=Pattern.compile(regex);

        return  pattern.matcher(hexColor).matches();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String regex="^[#]{1}[a-fA-F0-9]{6}";
        System.out.println("Enter the hex_color");
        String hexColor=scanner.nextLine();

        System.out.println(validation(regex,hexColor));

    }
}
