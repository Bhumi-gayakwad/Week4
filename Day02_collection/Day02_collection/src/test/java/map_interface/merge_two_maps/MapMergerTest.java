package map_interface.merge_two_maps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MapMergerTest {

    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        Map<String, Integer> expected = Map.of("A", 1, "B", 5, "C", 4);

        Map<String, Integer> result = MapMerger.mergeMaps(map1, map2);

        assertEquals(expected, result);
    }

    @Test
    void testMergeMapsWithNoOverlap() {
        Map<String, Integer> map1 = Map.of("X", 10);
        Map<String, Integer> map2 = Map.of("Y", 20);
        Map<String, Integer> expected = Map.of("X", 10, "Y", 20);

        Map<String, Integer> result = MapMerger.mergeMaps(map1, map2);

        assertEquals(expected, result);
    }

    @Test
    void testMergeMapsWithEmptyFirstMap() {
        Map<String, Integer> map1 = Map.of();
        Map<String, Integer> map2 = Map.of("P", 5, "Q", 10);
        Map<String, Integer> expected = Map.of("P", 5, "Q", 10);

        Map<String, Integer> result = MapMerger.mergeMaps(map1, map2);

        assertEquals(expected, result);
    }

    @Test
    void testMergeMapsWithEmptySecondMap() {
        Map<String, Integer> map1 = Map.of("L", 7, "M", 8);
        Map<String, Integer> map2 = Map.of();
        Map<String, Integer> expected = Map.of("L", 7, "M", 8);

        Map<String, Integer> result = MapMerger.mergeMaps(map1, map2);

        assertEquals(expected, result);
    }

    @Test
    void testMergeMapsWithBothEmptyMaps() {
        Map<String, Integer> map1 = Map.of();
        Map<String, Integer> map2 = Map.of();
        Map<String, Integer> expected = Map.of();

        Map<String, Integer> result = MapMerger.mergeMaps(map1, map2);

        assertEquals(expected, result);
    }
}
