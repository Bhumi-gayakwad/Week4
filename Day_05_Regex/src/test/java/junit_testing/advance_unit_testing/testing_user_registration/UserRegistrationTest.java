package junit_testing.advance_unit_testing.testing_user_registration;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private final UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("john_doe", "john@example.com", "Secure123"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("", "john@example.com", "Secure123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("john_doe", "invalid-email", "Secure123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("john_doe", "john@example.com", "12345"));
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}
