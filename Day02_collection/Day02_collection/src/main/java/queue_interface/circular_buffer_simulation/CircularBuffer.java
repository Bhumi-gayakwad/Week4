package queue_interface.circular_buffer_simulation;

public class CircularBuffer<x> {
    private int size;
    private Object[] queue;
    private int currentFrontIndex;
    private boolean empty;

    CircularBuffer(int size){
        this.size = size;
        this.queue = new Object[size];
        this.currentFrontIndex = 0;
        this.empty = true;
    }

    public void displayData(){
        for (int i=0; i<size; i++) System.out.print(queue[i]+" ");
        System.out.println();
    }

    public void offer(x data){
        queue[currentFrontIndex++] = data;
        currentFrontIndex = currentFrontIndex%size;
        this.empty = false;
    }

    public x poll(){
        if (empty) return null;
        if (currentFrontIndex == 0){
            this.empty = true;
            queue[currentFrontIndex] = null;
            return (x) queue[currentFrontIndex];
        }
        queue[currentFrontIndex] = null;
        return (x) queue[currentFrontIndex--];
    }

    public x peek(){
        if (empty) return null;
        return (x) queue[currentFrontIndex];
    }

    public boolean isEmpty(){
        return empty;
    }

}
