package junit_testing.basic_unit_testing.testing_string_utility_methods;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleH", StringUtils.reverse("Hello"));
        assertEquals("avaJ", StringUtils.reverse("Java"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null)); // Handling null case
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("RaceCar")); // Case-insensitive
        assertFalse(StringUtils.isPalindrome("Hello"));
        assertFalse(StringUtils.isPalindrome(null)); // Handling null case
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("Java"));
        assertEquals("", StringUtils.toUpperCase(""));
        assertNull(StringUtils.toUpperCase(null)); // Handling null case
    }
}



