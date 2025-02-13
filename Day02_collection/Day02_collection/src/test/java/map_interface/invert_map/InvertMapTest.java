package map_interface.invert_map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class InvertMapTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, List.of("A", "C"));
        expected.put(2, List.of("B"));

        Map<Integer, List<String>> result = InvertMap.invertMap(input);

        assertEquals(expected, result);
    }

    @Test
    void testInvertMapWithSingleEntry() {
        Map<String, Integer> input = Map.of("X", 5);
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(5, List.of("X"));

        Map<Integer, List<String>> result = InvertMap.invertMap(input);

        assertEquals(expected, result);
    }

    @Test
    void testInvertMapWithEmptyMap() {
        Map<String, Integer> input = Map.of();
        Map<Integer, List<String>> result = InvertMap.invertMap(input);

        assertTrue(result.isEmpty());
    }

    @Test
    void testInvertMapWithMultipleSameValues() {
        Map<String, Integer> input = Map.of("P", 3, "Q", 3, "R", 3);
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(3, List.of("P", "Q", "R"));

        Map<Integer, List<String>> result = InvertMap.invertMap(input);

        assertEquals(expected, result);
    }
}
