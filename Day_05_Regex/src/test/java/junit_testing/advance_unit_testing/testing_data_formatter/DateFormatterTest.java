package junit_testing.advance_unit_testing.testing_data_formatter;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    private final DateFormatter dateFormatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("15-02-2025", dateFormatter.formatDate("2025-02-15"));
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> dateFormatter.formatDate("15/02/2025"));
        assertEquals("Invalid date format. Expected format: yyyy-MM-dd", exception.getMessage());
    }

    @Test
    void testEmptyDate() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> dateFormatter.formatDate(""));
        assertEquals("Input date cannot be null or empty", exception.getMessage());
    }

    @Test
    void testNullDate() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> dateFormatter.formatDate(null));
        assertEquals("Input date cannot be null or empty", exception.getMessage());
    }
}
