package statics;

// For tracing loading process of a class
public class D2 {
    static int a;
    static int b = test();

    static {
        System.out.println("Static Initializer 1 Start");
        a = 10;
        System.out.println("Static Initializer 1 End");
    }

    static int test() {
        System.out.println("Test Start");
        return a + 5;
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        test();
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);
        System.out.println("Main End");
    }

    static {
        System.out.println("Static Initializer 2 Start");
        a = 20;
        System.out.println("Static Initializer 2 End");
    }
}
