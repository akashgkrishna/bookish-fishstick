package nonstatics;

public class D9 {
    {
        System.out.println("Instance Block 1");
        staticMethod();
    }

    static void staticMethod() {
        System.out.println("Static Method: a = " + a);
    }

    static int a = 10;

    {
        System.out.println("Instance Block 2: a = " + a);
        a = 20;
    }

    D9() {
        System.out.println("Constructor: a = " + a);
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        new D9();
        staticMethod();
        System.out.println("Main End");
    }

    static {
        System.out.println("Static Block: a = " + a);
        a = 15;
    }
}