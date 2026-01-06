package Linkedlist;


public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size=0;
    }

    public void insertFirst(int val){
    Node node=new Node(val);
    node.next=head;
    head=node;
    if(tail==null){
       tail=head;
    }
    size++;

    }

    public int deleteFirst(){
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
return value;
    }


    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;

        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deleteLast(){
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public void insertAtIndex(int val,int index){
        Node temp=head;
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        for(int i=1;i<index;i++){
temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print( temp.val+" ->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;

        }
    }
}
