package queue_interface.generate_binary_number_using_queue;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryNumberGeneratorTest {

    @Test
    void testGenerateBinaryNumbers() {
        assertEquals(List.of("1", "10", "11", "100", "101"), BinaryNumberGenerator.generateBinaryNumbers(5));
        assertEquals(List.of("1", "10", "11"), BinaryNumberGenerator.generateBinaryNumbers(3));
        assertEquals(List.of("1"), BinaryNumberGenerator.generateBinaryNumbers(1));
    }

    @Test
    void testGenerateBinaryNumbersWithZero() {
        assertEquals(List.of(), BinaryNumberGenerator.generateBinaryNumbers(0));
    }

    @Test
    void testGenerateBinaryNumbersWithLargeInput() {
        assertEquals("1100100", BinaryNumberGenerator.generateBinaryNumbers(100).get(99));
    }
}
