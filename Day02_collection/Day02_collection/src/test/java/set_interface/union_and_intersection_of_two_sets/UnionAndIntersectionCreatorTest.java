package set_interface.union_and_intersection_of_two_sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionCreatorTest {

    @Test
    void testGetUnion(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 3));

        Set<Integer> union = UnionAndIntersectionCreator.getUnion(set1, set2);

        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, union.toArray());
    }

    @Test
    void testGetIntersection(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 3));

        Set<Integer> intersection = UnionAndIntersectionCreator.getIntersection(set1, set2);

        Assertions.assertArrayEquals(new Integer[]{3}, intersection.toArray());
    }
}
