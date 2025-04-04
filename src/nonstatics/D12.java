package nonstatics;

public class D12 {
    static int x = initX();
    int y = initY();

    // Static block
    static {
        System.out.println("D12 Static Block 1: x=" + x);
        x += 5;
    }

    // Instance initializer
    {
        System.out.println("D12 Instance Block: y=" + y + ", x=" + x);
        y += 10;
    }

    static int initX() {
        System.out.println("D12 Static initX()");
        return 10;
    }

    int initY() {
        System.out.println("D12 Non-static initY(): x=" + x);
        return x * 2;
    }

    public D12() {
        System.out.println("D12 Constructor: y=" + y + ", x=" + x);
        x += y;
    }

    void instanceMethod() {
        System.out.println("D12 Instance Method: y=" + y + ", x=" + x);
        staticMethod();
    }

    static void staticMethod() {
        System.out.println("D12 Static Method: x=" + x);
        // Can't access y directly here
    }

    public static void main(String[] args) {
        System.out.println("D12 Main Start");
        staticMethod();
        D12 obj = new D12();
        obj.instanceMethod();
        new D12().instanceMethod();
        System.out.println("D12 Main End");
    }

    static {
        System.out.println("D12 Static Block 2: x=" + x);
        x += 3;
    }
}