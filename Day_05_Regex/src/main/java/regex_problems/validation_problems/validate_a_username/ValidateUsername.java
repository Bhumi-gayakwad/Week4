package regex_problems.validation_problems.validate_a_username;

import java.util.Scanner;

import java.util.regex.Pattern;



public class ValidateUsername {
    public static boolean validation(String regex, String name){

        Pattern pattern=Pattern.compile(regex);

        return pattern.matcher(name).matches();



    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String regex="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        System.out.println("Enter The UserName");
        String name=scanner.nextLine();

        boolean result=validation(regex,name);
        System.out.println(result);


    }
}
