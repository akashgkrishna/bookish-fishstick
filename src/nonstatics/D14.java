package nonstatics;

public class D14 {
    static D15 helper = new D15();
    int instanceId = counter++;

    // Static context
    static int counter = 5;
    static {
        System.out.println("D14 Static Block 1: counter=" + counter);
        helper.modifyStatic(10);
    }

    // Instance context
    {
        System.out.println("D14 Instance Block: id=" + instanceId);
        helper.addToCount(instanceId);
    }

    public D14() {
        System.out.println("D14 Constructor: id=" + instanceId
                + " Total Count=" + D15.totalCount);
        helper.registerInstance(this);
    }

    void process() {
        System.out.println("Processing instance " + instanceId);
        helper.printStats();
        D15.updateAll();
    }

    public static void main(String[] args) {
        System.out.println("D14 Main Start");
        new D14().process();
        new D14().process();
        System.out.println("Final Counter: " + counter);
        System.out.println("Final Total Count: " + D15.totalCount);
        System.out.println("D14 Main End");
    }

    static {
        System.out.println("D14 Static Block 2: counter=" + counter);
        counter += D15.totalCount;
    }
}

class D15 {
    static int totalCount = 0;
    int instanceCount;

    static {
        System.out.println("D15 Static Block: Initial Count=" + totalCount);
    }

    void addToCount(int value) {
        totalCount += value;
        instanceCount += value;
        System.out.println("D15 addToCount: total=" + totalCount
                + " instance=" + instanceCount);
    }

    static void modifyStatic(int value) {
        totalCount += value;
        System.out.println("D15 modifyStatic: total=" + totalCount);
    }

    void registerInstance(D14 instance) {
        System.out.println("Registering D14 instance: " + instance.instanceId);
        instanceCount++;
    }

    static void updateAll() {
        totalCount *= 2;
        System.out.println("D15 updateAll: New total=" + totalCount);
    }

    void printStats() {
        System.out.println("D15 Stats - Total: " + totalCount
                + " Instance: " + instanceCount);
    }
}