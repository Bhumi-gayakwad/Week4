package junit_testing.advance_unit_testing.testing_password_strength_validator;


public class PasswordValidator {
    public boolean isValid(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}
