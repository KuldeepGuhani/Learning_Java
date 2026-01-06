package StackAndQueue;

public class Stack {

        int[] arr;
        private static final int  DEFAULT_SIZE=5;

        int top=-1;
    Stack(){
        this(DEFAULT_SIZE);
    }
        Stack(int size){
            this.arr=new int[size];
        }

        public boolean push(int item){
           if (isFull()){
               System.out.println("Stack is Full.");
               return false;
           }
            top++;
            arr[top]=item;
    return true;
        }

    public boolean isFull() {
            return top==arr.length-1;
    }

    int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty.");
                return -1;
            }

            return arr[top--];
        }

    public boolean isEmpty() {
        return top==-1;
    }

    int peek(){
            if(top==-1) {
                System.out.println("Stack is Empty.");
                return -1;
            }
            return arr[top];
        }

    public static void main(String[] args) {

            Stack stack=new Stack(5);
            stack.push(15);
            stack.push(10);
            stack.push(52);
        stack.push(84);
        stack.push(14);
            //stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
