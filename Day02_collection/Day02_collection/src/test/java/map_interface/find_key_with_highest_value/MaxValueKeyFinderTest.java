package map_interface.find_key_with_highest_value;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MaxValueKeyFinderTest {

    @Test
    void testFindMaxKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        Assertions.assertEquals("B", MaxValueKeyFinder.findMaxKey(map));
    }

    @Test
    void testFindMaxKeyWithSingleEntry() {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 50);

        assertEquals("X", MaxValueKeyFinder.findMaxKey(map));
    }

    @Test
    void testFindMaxKeyWithEmptyMap() {
        Map<String, Integer> map = new HashMap<>();

        assertNull(MaxValueKeyFinder.findMaxKey(map));
    }

    @Test
    void testFindMaxKeyWithDuplicateMaxValues() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 30);
        map.put("B", 30);
        map.put("C", 25);

        assertTrue(Set.of("A", "B").contains(MaxValueKeyFinder.findMaxKey(map)));
    }
}
