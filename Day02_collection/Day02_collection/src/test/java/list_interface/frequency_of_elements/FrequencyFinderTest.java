package list_interface.frequency_of_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FrequencyFinderTest {

    @Test
    void testSetFrequencyOfElement(){
        // arrange
        List<String> stringArrayList = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "apple", "banana", "apple"));

        // act
        Map<String, Integer> stringCountMap = FrequencyFinder.setFrequencyOfElement(stringArrayList);

        // assert
        Assertions.assertEquals(4, stringCountMap.getOrDefault("apple", 0));
        Assertions.assertEquals(2, stringCountMap.getOrDefault("banana", 0));
        Assertions.assertEquals(1, stringCountMap.getOrDefault("orange", 0));
    }

}
