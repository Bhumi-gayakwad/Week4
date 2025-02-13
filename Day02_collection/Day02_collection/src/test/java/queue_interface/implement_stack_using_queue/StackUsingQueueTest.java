package queue_interface.implement_stack_using_queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackUsingQueueTest {

    @Test
    void testPushAndTop() {
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        stack.push(10);
        assertEquals(10, stack.top());
        stack.push(20);
        assertEquals(20, stack.top());
        stack.push(30);
        assertEquals(30, stack.top());
    }

    @Test
    void testPop() {
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertNull(stack.pop()); // Stack should be empty
    }

    @Test
    void testEmptyStack() {
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        assertNull(stack.pop());
        assertNull(stack.top());
    }

    @Test
    void testPushAfterPop() {
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.push(30);

        assertEquals(30, stack.top());
    }
}
