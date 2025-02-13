package set_interface.find_subsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetsFinderTest {

    @Test
    void testCheckSubsetForSetUsingValidSubset(){
        Set<Integer> set = new HashSet<>(Arrays.asList(8, 9, 4, 5, 6, 7, 1, 2, 3, 8, 9, 4, 5, 6, 7, 1, 2, 3));
        Set<Integer> subSet = new HashSet<>(Arrays.asList(8, 9, 4, 1, 2, 3, 8, 9, 4, 1, 2, 3));

        boolean subsetStatus = SubsetsFinder.checkSubsetForSet(subSet, set);

        Assertions.assertTrue(subsetStatus);
    }

    @Test
    void testCheckSubsetForSetUsingInvalidSubset(){
        Set<Integer> set = new HashSet<>(Arrays.asList(8, 9, 4, 5, 6, 7, 1, 2, 3, 8, 9, 4, 5, 6, 7, 1, 2, 3));
        Set<Integer> subSet = new HashSet<>(Arrays.asList(8, 9, 4, 11, 2, 3, 8, 9, 4, 1, 2, 3));

        boolean subsetStatus = SubsetsFinder.checkSubsetForSet(subSet, set);

        Assertions.assertFalse(subsetStatus);
    }
}
