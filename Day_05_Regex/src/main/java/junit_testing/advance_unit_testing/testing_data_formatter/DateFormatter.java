package junit_testing.advance_unit_testing.testing_data_formatter;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    private static final DateTimeFormatter INPUT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter OUTPUT_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public String formatDate(String inputDate) {
        if (inputDate == null || inputDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Input date cannot be null or empty");
        }
        try {
            LocalDate date = LocalDate.parse(inputDate, INPUT_FORMAT);
            return date.format(OUTPUT_FORMAT);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-MM-dd");
        }
    }
}
