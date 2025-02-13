package queue_interface.reverse_queue;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseQueueTest {

    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Queue<Integer> reversedQueue = ReverseQueue.reverse(new LinkedList<>(queue));

        Queue<Integer> expectedQueue = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(expectedQueue, reversedQueue);
    }

    @Test
    void testReverseSingleElementQueue() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(42));
        Queue<Integer> reversedQueue = ReverseQueue.reverse(new LinkedList<>(queue));

        assertEquals(queue, reversedQueue);
    }

    @Test
    void testReverseEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> reversedQueue = ReverseQueue.reverse(queue);

        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    void testReverseQueueWithDuplicateElements() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        Queue<Integer> reversedQueue = ReverseQueue.reverse(new LinkedList<>(queue));

        Queue<Integer> expectedQueue = new LinkedList<>(Arrays.asList(3, 3, 3, 2, 2, 1));
        assertEquals(expectedQueue, reversedQueue);
    }
}
