package set_interface.convert_set_to_sorted_list;
import java.util.*;
public class HashSetToSortedListConverter {
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
}

