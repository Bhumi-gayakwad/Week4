package queue_interface.implement_stack_using_queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {

        StackUsingQueue<Integer> stk = new StackUsingQueue<>();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.push(40);
        System.out.println(stk);

    }
}

