class Test {
    static int staticVar = 100;   // static variable
    int instanceVar = 20;         // instance variable

    void instanceMethod() {
        System.out.println("Accessing static variable inside instance method: " + staticVar);
        System.out.println("Accessing instance variable inside instance method: " + instanceVar);
    }

    static void staticMethod() {
        // System.out.println(instanceVar); ❌ NOT allowed (needs object)
        System.out.println("Accessing static variable inside static method: " + staticVar);
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();   // creating object
        obj.instanceMethod();    // calling instance method

        Test.staticMethod();     // calling static method
    }
}
