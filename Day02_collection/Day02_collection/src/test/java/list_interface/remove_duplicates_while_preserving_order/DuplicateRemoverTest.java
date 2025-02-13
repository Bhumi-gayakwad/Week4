package list_interface.remove_duplicates_while_preserving_order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateRemoverTest {

    @Test
    void testRemoveDuplicatesWhilePreservingOrder(){
        // arrange
        List<Integer> arrayListInteger = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        List<Character> arrayListCharacter = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '1', '2', '3', '4', '8', '5', '6', '7', '1', '2', '3', '1', '2', '3', '1', '2', '3'));
        List<Integer> expectedArrayListInteger = new ArrayList<>(Arrays.asList(3, 1, 2, 4));
        List<Character> expectedArrayListCharacter = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8'));

        // act
        List<Integer> arrayListIntegerWithNoDuplicates = DuplicateRemover.removeDuplicatesWhilePreservingOrder(arrayListInteger);
        List<Character> arrayListCharacterWithNoDuplicates = DuplicateRemover.removeDuplicatesWhilePreservingOrder(arrayListCharacter);

        // assert
        Assertions.assertArrayEquals(expectedArrayListInteger.toArray(), arrayListIntegerWithNoDuplicates.toArray());
        Assertions.assertArrayEquals(expectedArrayListCharacter.toArray(), arrayListCharacterWithNoDuplicates.toArray());
    }

}
