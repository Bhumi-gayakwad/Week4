package junit_testing.advance_unit_testing.testing_password_strength_validator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Secure123"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(validator.isValid("short"));
        assertFalse(validator.isValid("nouppercase123"));
        assertFalse(validator.isValid("NOLOWERCASE123"));
    }
}
