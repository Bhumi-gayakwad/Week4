package set_interface.check_two_sets;
import java.util.HashSet;
import java.util.Set;
public class TwoSetChecker {
    public static <T> boolean isTwoSetEqual(Set<T> set1, Set<T> set2){
        if (set1.size() != set2.size()) return false;
        for (T ele : set1){
            if (!set2.contains(ele)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(2);
        set2.add(3);

        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);

        boolean compareSet1AndSet2 = isTwoSetEqual(set1, set2);
        System.out.println(compareSet1AndSet2 ? "Yes, Both are equal" : "No, Both aren't equal");

        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>();

        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(2);
        set3.add(3);

        set4.add(11);
        set4.add(21);
        set4.add(31);
        set4.add(21);
        set4.add(31);

        System.out.println("Set 3: "+set3);
        System.out.println("Set 4: "+set4);

        boolean compareSet3AndSet4 = isTwoSetEqual(set3, set4);
        System.out.println(compareSet3AndSet4 ? "Yes, Both are equal" : "No, Both aren't equal");

    }
}

