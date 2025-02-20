package junit_testing.basic_unit_testing.testing_string_utility_methods;



public class StringUtils {

    // Method to reverse a string
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        return str.equalsIgnoreCase(reverse(str));
    }

    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
