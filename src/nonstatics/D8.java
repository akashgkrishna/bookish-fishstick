package nonstatics;

public class D8 {
    static D8 instance = new D8();
    static int x = 5;

    int y;

    {
        System.out.println("Instance Block: x = " + x + ", y = " + y);
        y = x + 5;
        x += 10;
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println("x = " + x);
        new D8();
        System.out.println("x = " + x);
        System.out.println("Main End");
    }

    static {
        System.out.println("Static Block: x = " + x);
    }
}