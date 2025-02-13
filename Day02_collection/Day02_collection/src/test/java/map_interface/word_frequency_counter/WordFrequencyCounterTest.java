package map_interface.word_frequency_counter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class WordFrequencyCounterTest {

    @Test
    void testCountFrequency() {
        String content = "hello world hello";
        Map<String, Integer> expected = Map.of("hello", 2, "world", 1);

        Map<String, Integer> result = WordFrequencyCounter.countFrequency(content);

        assertEquals(expected, result);
    }

    @Test
    void testCountFrequencyWithPunctuation() {
        String content = "Hello, world! Hello.";
        Map<String, Integer> expected = Map.of("hello", 2, "world", 1);

        Map<String, Integer> result = WordFrequencyCounter.countFrequency(content.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase());

        assertEquals(expected, result);
    }

    @Test
    void testCountFrequencyWithNumbers() {
        String content = "one 1 two 2 one 1";
        Map<String, Integer> expected = Map.of("one", 2, "1", 2, "two", 1, "2", 1);

        Map<String, Integer> result = WordFrequencyCounter.countFrequency(content);

        assertEquals(expected, result);
    }

    @Test
    void testCountFrequencyWithEmptyString() {
        String content = "";
        Map<String, Integer> result = WordFrequencyCounter.countFrequency(content);

        assertTrue(result.isEmpty());
    }

    @Test
    void testCountFrequencyWithWhitespaceOnly() {
        String content = "     ";
        Map<String, Integer> result = WordFrequencyCounter.countFrequency(content);

        assertTrue(result.isEmpty());
    }
}
