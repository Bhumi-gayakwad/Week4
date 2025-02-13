package queue_interface.implement_stack_using_queue;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue<T>{
    Queue<T> q1;
    Queue<T> q2;

    StackUsingQueue(){
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    @Override
    public String toString(){
        String a = q1.toString();
        return a;
    }

    public void push(T ele){
        if (q1.isEmpty()){
            q1.offer(ele);
            return;
        }
        while (!q1.isEmpty()) q2.offer(q1.poll());
        q1.offer(ele);
        while (!q2.isEmpty()) q1.offer(q2.poll());
    }

    public T pop(){
        if (q1.isEmpty()) return null;
        return q1.poll();
    }

    public T top(){
        if (q1.isEmpty()) return null;
        return q1.peek();
    }

}

