package nonstatics;

public class Base {
    static int baseCount = 5;
    int baseId = initId();

    static {
        System.out.println("Base Static Block 1: count=" + baseCount);
        baseCount += Derived.derivedStatic;
    }

    {
        System.out.println("Base Instance Block: id=" + baseId);
        baseId += baseCount;
    }

    public Base() {
        System.out.println("Base Constructor: id=" + baseId);
        baseCount++;
    }

    int initId() {
        System.out.println("Base initId()");
        return baseCount * 2;
    }

    public static void main(String[] args) {
        System.out.println("Base Main Start");
        new Derived().process();
        new Base().process();
        System.out.println("Final Base Count: " + baseCount);
    }

    void process() {
        System.out.println("Base Process: id=" + baseId
                + " count=" + baseCount);
    }
}

class Derived {
    static int derivedStatic = 10;
    int derivedValue = initValue();

    static {
        System.out.println("Derived Static Block: static=" + derivedStatic);
        derivedStatic += Base.baseCount;
    }

    {
        System.out.println("Derived Instance Block: value=" + derivedValue);
        // Removed baseId reference
        derivedValue += 10;  // Changed from baseId to fixed value
    }

    public Derived() {
        System.out.println("Derived Constructor: value=" + derivedValue);
        derivedStatic += derivedValue;
    }

    int initValue() {
        System.out.println("Derived initValue()");
        return derivedStatic * 3;
    }

    // Removed @Override and super call
    void process() {
        System.out.println("Derived Process: value=" + derivedValue
                + " static=" + derivedStatic);
    }
}