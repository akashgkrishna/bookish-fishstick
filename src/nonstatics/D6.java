package nonstatics;

public class D6 {
    static int counter = 0;
    int id;

    {
        id = ++counter;
        System.out.println("Instance Initializer: ID = " + id);
    }

    static void printCounter() {
        System.out.println("Static Method: Counter = " + counter);
    }

    D6() {
        System.out.println("Constructor: ID = " + id);
    }

    void nonStaticMethod() {
        System.out.println("Non-static Method accesses static: " + counter);
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        printCounter();
        new D6().nonStaticMethod();
        new D6();
        printCounter();
        System.out.println("Main End");
    }
}