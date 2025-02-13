package set_interface.check_two_sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class TwoSetCheckerTest {

    @Test
    void testIsTwoSetEqualForEqualSets(){
        // arrange
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        set2.add(1);
        set2.add(2);

        // act
        boolean compareSet1AndSet2 = TwoSetChecker.isTwoSetEqual(set1, set2);

        // assert
        Assertions.assertTrue(compareSet1AndSet2);
    }

    @Test
    void testIsTwoSetEqualForUnequalSets(){
        // arrange
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(1);
        set2.add(1);
        set2.add(1);

        // act
        boolean compareSet1AndSet2 = TwoSetChecker.isTwoSetEqual(set1, set2);

        // assert
        Assertions.assertFalse(compareSet1AndSet2);
    }

}
