package queue_interface.reverse_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
    public static <T> Queue<T> reverse(Queue<T> q){
        if (q.size() == 1 || q.isEmpty()) return q;
        T front = q.poll();
        q = reverse(q);
        q.offer(front);
        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println("Original Queue :  "+queue);
        Queue<Integer> reversedQueue = reverse(queue);
        System.out.println("Reversed Queue : "+reversedQueue);

    }
}

