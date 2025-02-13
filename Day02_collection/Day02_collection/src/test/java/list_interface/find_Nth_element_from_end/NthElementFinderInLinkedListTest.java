package list_interface.find_Nth_element_from_end;

import list_interface.remove_duplicates_while_preserving_order.DuplicateRemover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class NthElementFinderInLinkedListTest {

    @Test
    void testGetNthElementFromEndForDifferentTypes(){
        // arrange
        List<Integer> linkedListInteger = new LinkedList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        List<Character> linkedListCharacter = new LinkedList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '1', '2', '3', '4', '8', '5', '6', '7', '1', '2', '3', '1', '2', '3', '1', '2', '3'));
        int positionFromEnd = 5;
        int expectedNthInteger = 1;
        int expectedNthCharacter = '2';

        // act
        int nthInteger = NthElementFinderInLinkedList.getNthElementFromEnd(linkedListInteger, positionFromEnd);
        int nthCharacter = NthElementFinderInLinkedList.getNthElementFromEnd(linkedListCharacter, positionFromEnd);

        // assert
        Assertions.assertEquals(expectedNthInteger, nthInteger);
        Assertions.assertEquals(expectedNthCharacter, nthCharacter);
    }

}
