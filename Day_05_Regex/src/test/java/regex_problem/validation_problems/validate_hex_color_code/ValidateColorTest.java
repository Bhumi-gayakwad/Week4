package regex_problem.validation_problems.validate_hex_color_code;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import regex_problems.validation_problems.validate_hex_color_code.ValidateColor;

public class ValidateColorTest {

    private static final String REGEX = "^[#]{1}[a-fA-F0-9]{6}$";

    @Test
    public void testValidHexColors() {
        assertTrue("Valid hex color should pass.", ValidateColor.validation(REGEX, "#1A2B3C"));
        assertTrue("Valid white color should pass.", ValidateColor.validation(REGEX, "#FFFFFF"));
        assertTrue("Valid black color should pass.", ValidateColor.validation(REGEX, "#000000"));
        assertTrue("Valid mixed-case hex color should pass.", ValidateColor.validation(REGEX, "#ABCDEF"));
    }

    @Test
    public void testInvalidHexColors() {
        assertFalse("Missing '#' should fail.", ValidateColor.validation(REGEX, "1A2B3C"));
        assertFalse("Less than 6 characters should fail.", ValidateColor.validation(REGEX, "#12345"));
        assertFalse("More than 6 characters should fail.", ValidateColor.validation(REGEX, "#1234567"));
        assertFalse("Invalid hex characters should fail.", ValidateColor.validation(REGEX, "#ZZZZZZ"));
        assertFalse("Invalid character (G) should fail.", ValidateColor.validation(REGEX, "#123ABG"));
    }
}
