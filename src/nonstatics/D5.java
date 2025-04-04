package nonstatics;

public class D5 {
    static int x = 10;
    int y = initY();

    {
        System.out.println("Instance Initializer 1: y = " + y);
    }

    static {
        System.out.println("Static Block 1: x = " + x);
        x += 5;
    }

    int initY() {
        System.out.println("initY() called, x = " + x);
        return x * 2;
    }

    void display() {
        System.out.println("Display: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        D5 obj = new D5();
        obj.display();
        System.out.println("Main End");
    }

    static {
        System.out.println("Static Block 2: x = " + x);
    }
}