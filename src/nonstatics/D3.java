package nonstatics;

public class D3 {
    int b;
    static int a = test();
    static int c = test();

    static int test() {
        System.out.println("D3 test start");
        System.out.println("Value of a: " + a);
        a = 20;
        print();
        System.out.println("D3 test end");
        return 15;
    }

    static void print() {
        System.out.println("D3 print start");
        System.out.println("Value of a: " + a);
        a = 38;
        System.out.println("Value of a: " + a);
        System.out.println("D3 print end");
    }

    static {
        System.out.println("Static block 1 start");
        c = 23;
        System.out.println("Value of c: " + c);
        System.out.println("Static block 1 end");
    }

    {
        System.out.println("Non Static block 1 start");
        b = 50;
        a = 80;
        System.out.println("Non Static block 1 end");

    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        D3 d3 = new D3();
        System.out.println("Value of a: " + d3.a);
        System.out.println("Value of b: " + d3.b);
        System.out.println("Value of c: " + d3.c);

        System.out.println("Value of a: " + a);
        System.out.println("Value of c: " + c);

        System.out.println("Main end");

    }

}
