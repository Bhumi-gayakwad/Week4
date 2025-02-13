package set_interface.symmetric_difference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceFinderTest {

    @Test
    void testGetSymmetricDifference(){
        // arrange
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 3));

        // act
        Set<Integer> symmetricDifference = SymmetricDifferenceFinder.getSymmetricDifference(set1, set2);

        // assert
        Assertions.assertArrayEquals(new Integer[]{1, 2, 4, 5}, symmetricDifference.toArray());
    }

}
