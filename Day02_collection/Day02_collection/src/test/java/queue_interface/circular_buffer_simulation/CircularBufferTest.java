package queue_interface.circular_buffer_simulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    void testOfferAndPoll() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);
        buffer.offer(10);
        buffer.offer(20);
        buffer.offer(30);
        assertEquals(10, buffer.poll());
        assertEquals(20, buffer.poll());
    }

    @Test
    void testOverwriteOldestData() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);
        buffer.offer(10);
        buffer.offer(20);
        buffer.offer(30);
        buffer.offer(40);
        assertEquals(20, buffer.poll()); // 10 was overwritten
    }

    @Test
    void testPeek() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);
        buffer.offer(5);
        assertEquals(5, buffer.peek());
        buffer.poll();
        assertNull(buffer.peek());
    }

    @Test
    void testIsEmpty() {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);
        assertTrue(buffer.isEmpty());
        buffer.offer(1);
        assertFalse(buffer.isEmpty());
        buffer.poll();
        assertTrue(buffer.isEmpty());
    }
}
