package list_interface.reverse_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseListTest {

    @Test
    void testReverseArrayList(){
        // arrange
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expectedArray = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        // act
        ReverseList.reverseList(array);

        // assert
        Assertions.assertArrayEquals(expectedArray.toArray(), array.toArray());
    }

    @Test
    void testReverseLinkedList(){
        // arrange
        List<Integer> array = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expectedArray = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));

        // act
        ReverseList.reverseList(array);

        // assert
        Assertions.assertArrayEquals(expectedArray.toArray(), array.toArray());
    }


}
