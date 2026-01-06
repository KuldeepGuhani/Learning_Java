package StackAndQueue;

public class CircularQueue extends Queue{

    int front =0;
    int rear=0;
    int size=0;
    CircularQueue(){
        super();
    }
    CircularQueue(int size){
        super(size);
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {

        return size==0;
    }


    public boolean add(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }

        arr[end++] = item;
        end=end%arr.length;
        size++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
        }
        int removed = arr[front++];
        front=front%arr.length;
        size--;
        return removed;
    }


    public void display(){
        int i=front;
        do {
            System.out.print(arr[i]+"->");
            i++;
            i%=arr.length;
        }while(i!=end);
        System.out.println("END");

    }


}
