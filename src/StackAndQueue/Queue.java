package StackAndQueue;

public class Queue {

    int[] arr;
    private static final int DEFAULT_SIZE = 5;

    int end = 0;

    Queue() {
        this(DEFAULT_SIZE);
    }

    Queue(int size) {
        this.arr = new int[size];
    }

    public boolean isFull() {
        return end == arr.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean add(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }

        arr[end++] = item;
        return true;
    }

    public boolean offer(int item) {
        if (isFull()) {
            return false;
        }

        arr[end++] = item;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        int removed = arr[0];
        for(int i=1;i<end;i++){
            arr[i-1]=arr[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(arr[i]+" ->");
        }
        System.out.println("END");

    }



}
