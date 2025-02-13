package set_interface.symmetric_difference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SymmetricDifferenceFinder {
    public static <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2){
        if (set1.isEmpty()) return set2;
        if (set2.isEmpty()) return set1;
        Set<T> symmetricDifferenceSet = new HashSet<>(set1);
        for (T ele : set2){
            if (symmetricDifferenceSet.contains(ele)) symmetricDifferenceSet.remove(ele);
            else symmetricDifferenceSet.add(ele);
        }
        return symmetricDifferenceSet;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 3));

        System.out.println("Set 1 : "+set1);
        System.out.println("Set 2 : "+set2);
        System.out.println("Its symmetric difference : "+getSymmetricDifference(set1, set2));

    }
}
