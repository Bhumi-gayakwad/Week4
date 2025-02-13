package list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        // using arrayList
        System.out.println("\n-----------Arraylist---------\n");
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.println("Original array list : "+arrayList);
        ArrayList<Integer> reversedList=new ArrayList<>();
        for (int i=arrayList.size()-1;i>=0;i--){
            reversedList.add(arrayList.get(i));
        }
        System.out.println("Reversed array list : "+reversedList);

        // using linked list
        System.out.println("\n-----------Linked List----------------\n");
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(9);
        linkedList.add(0);
        System.out.println("Original LinkedList : "+linkedList);
        LinkedList<Integer> ReversedLinkedList=new LinkedList<>();
    for (int i=linkedList.size()-1;i>=0;i--){
        ReversedLinkedList.add(linkedList.get(i));
    }
        System.out.println("Reversed LinkedList : "+ReversedLinkedList);

    }
}
