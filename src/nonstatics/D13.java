package nonstatics;

public class D13 {
    static D12 d12 = new D12();
    int id = counter++;

    // Mixed initialization
    static int counter = initCounter();

    {
        System.out.println("D13 Instance Block: id=" + id + ", counter=" + counter);
    }

    static {
        System.out.println("D13 Static Block 1: counter=" + counter);
        D12.staticMethod();
    }

    public D13() {
        System.out.println("D13 Constructor: id=" + id + ", d12.x=" + D12.x);
        D12.x += id;
    }

    static int initCounter() {
        System.out.println("D13 Static initCounter()");
        return 5;
    }

    void process() {
        System.out.println("D13 Process: id=" + id + ", counter=" + counter);
        d12.instanceMethod();
    }

    public static void main(String[] args) {
        System.out.println("D13 Main Start");
        new D13().process();
        new D13().process();
        System.out.println("Final D12.x: " + D12.x);
        System.out.println("D13 Main End");
    }

    static {
        System.out.println("D13 Static Block 2: counter=" + counter);
        counter += 10;
    }
}