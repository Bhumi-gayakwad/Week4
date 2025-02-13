package list_interface.rotate_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsTest {

    @Test
    void testRotate(){
        // arrange
        List<Integer> arrayOfInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> arrayOfString = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd", "ee"));
        List<Character> arrayOfCharacter = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        int positionToRotate = 7;
        List<Integer> expectedArrayOfInteger = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
        List<String> expectedArrayOfString = new ArrayList<>(Arrays.asList("dd", "ee", "aa", "bb", "cc"));
        List<Character> expectedArrayOfCharacter = new ArrayList<>(Arrays.asList('d', 'e', 'a', 'b', 'c'));


        // act
        List<Integer> rotatedArrayOfInteger = RotateElements.rotate(arrayOfInteger, positionToRotate);
        List<String> rotatedArrayOfString = RotateElements.rotate(arrayOfString, positionToRotate);
        List<Character> rotatedArrayOfCharacter = RotateElements.rotate(arrayOfCharacter, positionToRotate);

        // assert
        Assertions.assertArrayEquals(expectedArrayOfInteger.toArray(), rotatedArrayOfInteger.toArray());
        Assertions.assertArrayEquals(expectedArrayOfString.toArray(), rotatedArrayOfString.toArray());
        Assertions.assertArrayEquals(expectedArrayOfCharacter.toArray(), rotatedArrayOfCharacter.toArray());
    }

}
