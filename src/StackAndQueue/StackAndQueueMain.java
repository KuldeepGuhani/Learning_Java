package StackAndQueue;

public class StackAndQueueMain {
    public static void main(String[] args) {
/*
        DynamicStack stack = new DynamicStack();
        stack.push(15);
        stack.push(12);
        stack.push(25);
        stack.push(85);
        stack.push(96);
        stack.push(84);
        stack.push(22);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

/*
        //queue
        System.out.println("Queue : ");
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(80);
        queue.add(90);
        queue.add(860);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
*/

        // circular queue
        //queue
        System.out.println(" Circular Queue : ");
        CircularQueue cqueue = new CircularQueue();
        cqueue.add(10);
        cqueue.add(20);
        cqueue.add(80);
        cqueue.add(90);
        cqueue.add(860);
        cqueue.display();
        System.out.println(cqueue.remove());
        cqueue.display();cqueue.add(5555);
        cqueue.display();



    }
}
