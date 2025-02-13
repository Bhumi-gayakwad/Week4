package list_interface.find_Nth_element_from_end;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class NthElementFinderInLinkedList {
    public static <T> T getNthElementFromEnd(List<T> linkedList, int n){
        Iterator<T> linkedListIterator = linkedList.iterator();
        int length = 0;
        while (linkedListIterator.hasNext()){
            length++;
            linkedListIterator.next();
        }
        if (n > length){
            System.out.println("The position is greater than the length of LinkedList.");
            return null;
        }
        linkedListIterator = linkedList.iterator();
        int pos = 0;
        n = length - n;
        while (linkedListIterator.hasNext()){
            if (pos == n) break;
            linkedListIterator.next();
            pos++;
        }
        return linkedListIterator.next();
    }

    public static void main(String[] args) {

        List<Character> linkedList = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));

        System.out.println("Linked list: "+linkedList);
        int positionFromEnd = 20;
        System.out.println("The element at "+positionFromEnd+"th position from end is "+getNthElementFromEnd(linkedList, positionFromEnd));

    }
}


