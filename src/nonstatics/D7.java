package nonstatics;

public class D7 {
    static int a = initA();
    int b = initB();

    static int initA() {
        System.out.println("Static initA()");
        return 5;
    }

    int initB() {
        System.out.println("Non-static initB(), a = " + a);
        return a + 5;
    }

    {
        System.out.println("Instance Block 1: b = " + b);
        a += 10;
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println("a = " + a);
        D7 obj = new D7();
        System.out.println("obj.b = " + obj.b);
        System.out.println("a = " + a);
        System.out.println("Main End");
    }

    static {
        System.out.println("Static Block: a = " + a);
    }
}