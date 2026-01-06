package Linkedlist;

public class SLL_Main {
   public  static void main(String[] args) {
    SLL sl=new SLL();
       sl.insertFirst(30);
       sl.insertFirst(18);
       sl.insertFirst(15);
       sl.insertFirst(2);
       sl.insertFirst(25);
       sl.insertLast(99);
       sl.display();
       sl.insertAtIndex(255,2);
    sl.display();
       System.out.println(sl.deleteFirst());
    sl.display();

    }

}
