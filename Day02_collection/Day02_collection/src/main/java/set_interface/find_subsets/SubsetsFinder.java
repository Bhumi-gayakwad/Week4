package set_interface.find_subsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetsFinder {
    public static <T> boolean checkSubsetForSet(Set<T> subSet, Set<T> set){
        for (T ele : subSet) if (!set.contains(ele)) return false;
        return true;
    }

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(8, 9, 4, 5, 6, 7, 1, 2, 3, 8, 9, 4, 5, 6, 7, 1, 2, 3));
        Set<Integer> subSet = new HashSet<>(Arrays.asList(8, 9, 4, 1, 2, 3, 8, 9, 4, 1, 2, 3));

        System.out.println("Set 1 : "+set);
        System.out.println("Set 2 : "+subSet);

        boolean subsetStatus = checkSubsetForSet(subSet, set);

        if (subsetStatus) System.out.println("Yes, set 2 is a subset of set 1");
        else System.out.println("No, set 2 is not a subset of set 1");

    }
}

