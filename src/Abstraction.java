public abstract class Abstraction {
    abstract void speek();
    void display(){
        System.out.println("Default methods");
    }
    static void staticMethod(){
        System.out.println("Static method");
    }
    static int no=10;

   protected Abstraction(){
   int no_of_class=4;
       System.out.println("Contructor no: "+no_of_class);
   }
}

