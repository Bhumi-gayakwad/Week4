package queue_interface.circular_buffer_simulation;

public class ImplementCircularBufferSimulation {
    public static void main(String[] args) {

        CircularBuffer<Integer> q = new CircularBuffer<>(3);

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.displayData();
        System.out.println(q.peek());
        q.poll();
        q.displayData();
        q.offer(40);
        q.displayData();
        q.offer(50);
        q.displayData();

    }
}

