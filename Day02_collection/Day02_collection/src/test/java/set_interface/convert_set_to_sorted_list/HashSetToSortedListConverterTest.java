package set_interface.convert_set_to_sorted_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class HashSetToSortedListConverterTest {

    public static List<Integer> convertSetToSortedList(Set<Integer> set){
        List<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(8, 9, 4, 5, 6, 7, 1, 2, 3, 8, 9, 4, 5, 6, 7, 1, 2, 3));

        System.out.println("Data before sorting (can be sorted or unsorted): "+set);
        List<Integer> sortedData = convertSetToSortedList(set);
        System.out.println("Data after sorting: "+sortedData);

    }

    @Test
    void testConvertSetToSortedList(){
        Set<Integer> set = new HashSet<>(Arrays.asList(8, 9, 4, 5, 6, 7, 1, 2, 3, 8, 9, 4, 5, 6, 7, 1, 2, 3));
        List<Integer> expectedData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> sortedData = convertSetToSortedList(set);

        Assertions.assertArrayEquals(expectedData.toArray(), sortedData.toArray());
    }
}
