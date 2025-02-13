package set_interface.union_and_intersection_of_two_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class UnionAndIntersectionCreator {
    public static <T> Set<T> getUnion(Set<T> set1, Set<T> set2){
        if (set1.isEmpty()) return set2;
        if (set2.isEmpty()) return set1;
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> getIntersection(Set<T> set1, Set<T> set2){
        if (set1.isEmpty() || set2.isEmpty()) return new HashSet<>();
        Set<T> intersectionSet = new HashSet<>();
        for (T ele : set1){
            if (set2.contains(ele)) intersectionSet.add(ele);
        }
        return intersectionSet;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 3));

        System.out.println("Set 1 : "+set1);
        System.out.println("Set 2 : "+set2);
        System.out.println("Its union : "+getUnion(set1, set2));
        System.out.println("Its intersection : "+getIntersection(set1, set2));

    }
}
