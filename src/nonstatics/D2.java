package nonstatics;

public class D2 {
    static int a;
    static int c = 5;
    int b;

    {
        b = 25;
    }

    public static void main(String[] args) {
        D2 d2 = new D2();
        System.out.println(d2.b);
        d2.b = 10;
        D2 d21 = new D2();
        System.out.println(d21.b);
        d21.b = 15;
        System.out.println(d2.b);
        System.out.println(d21.b);
    }
}
