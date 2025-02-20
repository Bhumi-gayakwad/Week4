package regex_problems.advance_problems.validate_an_ip_address;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    // Function to validate IPv4 address
    public static boolean isValidIPv4(String ip) {
        // Regular Expression for IPv4 Validation
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.println("Enter an IP Address:");
        String ip = scanner.nextLine();

        // Validate and Print Result
        if (isValidIPv4(ip)) {
            System.out.println(ip + " is a valid IPv4 address.");
        } else {
            System.out.println(ip + " is NOT a valid IPv4 address.");
        }

        scanner.close();
    }
}
