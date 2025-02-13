package list_interface.remove_duplicates_while_preserving_order;
import java.util.*;
public class DuplicateRemover {
    public static <T> List<T> removeDuplicatesWhilePreservingOrder(List<T> array){
        List<T> arrayWithNoDuplicates = new ArrayList<>();
        Set<T> arrayElementsSet = new HashSet<>();
        for (int i=0; i<array.size(); i++){
            if (!arrayElementsSet.contains(array.get(i))){
                arrayWithNoDuplicates.add(array.get(i));
                arrayElementsSet.add(array.get(i));
            }
        }
        return arrayWithNoDuplicates;
    }

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 8, 5, 6, 7, 1, 2, 3, 1, 2, 3, 1, 2, 3));

        System.out.println("Original Array: "+arrayList);
        List<Integer> arrayListWithNoDuplicates = removeDuplicatesWhilePreservingOrder(arrayList);
        System.out.println("Array after removing duplicates: "+arrayListWithNoDuplicates);

    }
}

