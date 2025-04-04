package statics;

public class D3 {
    static int c = 20;
    static int d;

    static {
        System.out.println("Static block from D3");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        D2.test();
        System.out.println("Value of c :" + c);
        System.out.println("Value of a :" + D2.a);
        System.out.println("Value of d :" + (D2.b + d));
        System.out.println("Main End");
    }
}
