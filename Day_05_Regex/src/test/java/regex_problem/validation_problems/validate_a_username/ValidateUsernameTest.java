package regex_problem.validation_problems.validate_a_username;


import org.junit.Test;
import regex_problems.validation_problems.validate_a_username.ValidateUsername;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidateUsernameTest {

    private static final String REGEX = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

    @Test
    public void testValidUsernames() {
        assertTrue("Valid username should pass.", ValidateUsername.validation(REGEX, "John123"));
        assertTrue("Valid username with underscore should pass.", ValidateUsername.validation(REGEX, "Alice_Win"));
        assertTrue("Valid username with digits and underscore should pass.", ValidateUsername.validation(REGEX, "Bob_789"));
        assertTrue("Valid username within length limits should pass.", ValidateUsername.validation(REGEX, "TestUser12"));
    }

    @Test
    public void testInvalidUsernames() {
        assertFalse("Username starting with a digit should fail.", ValidateUsername.validation(REGEX, "123User"));
        assertFalse("Username starting with an underscore should fail.", ValidateUsername.validation(REGEX, "_Alice"));
        assertFalse("Username shorter than 5 characters should fail.", ValidateUsername.validation(REGEX, "Jo"));
        assertFalse("Username longer than 15 characters should fail.", ValidateUsername.validation(REGEX, "ThisIsAVeryLongUsername123"));
        assertFalse("Username with special characters should fail.", ValidateUsername.validation(REGEX, "User!@#"));
    }
}
