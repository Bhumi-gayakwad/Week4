package regex_problem.validation_problems.validate_a_lincense_plat_number;



import org.junit.Test;
import regex_problems.validation_problems.validate_a_lincense_plat_number.ValidateLicenseNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidateLicenseNumberTest {

    private static final String REGEX = "^[A-Z]{2}[0-9]{4}$";

    @Test
    public void testValidLicenseNumbers() {
        assertTrue("Valid plate number should pass.", ValidateLicenseNumber.validation(REGEX, "AB1234"));
        assertTrue("Valid plate number should pass.", ValidateLicenseNumber.validation(REGEX, "XY5678"));
    }

    @Test
    public void testInvalidLicenseNumbers() {
        assertFalse("Plate with one letter should fail.", ValidateLicenseNumber.validation(REGEX, "A1234"));
        assertFalse("Plate with three letters should fail.", ValidateLicenseNumber.validation(REGEX, "ABC123"));
        assertFalse("Plate with non-numeric characters in number part should fail.", ValidateLicenseNumber.validation(REGEX, "AB12C4"));
        assertFalse("Incorrect format should fail.", ValidateLicenseNumber.validation(REGEX, "1234AB"));
        assertFalse("Lowercase letters should fail.", ValidateLicenseNumber.validation(REGEX, "ab1234"));
    }
}
