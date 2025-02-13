package list_interface.rotate_element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElements {
    public static <T> List<T> rotate(List<T> arr, int position){
        position %= arr.size();
        List<T> ans = new ArrayList<>();
        for (int i=arr.size()-position; i < arr.size(); i++){
            ans.add(arr.get(i));
        }
        for (int i=0; i<arr.size()-position; i++){
            ans.add(arr.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println("Array before rotate: "+arrayList);
        int rotatePosition = 10;
        List<Integer> rotatedArrayList = rotate(arrayList, rotatePosition);
        System.out.println("Array after rotating it by "+rotatePosition+": "+rotatedArrayList);

    }
}
