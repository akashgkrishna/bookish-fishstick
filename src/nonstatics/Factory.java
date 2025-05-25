package nonstatics;

public class Factory {
    static Warehouse storage = new Warehouse();
    double factoryID = counter++;
    static double counter = initCounter();

    static {
        System.out.println("Factory Static Block 1: counter=" + counter);
        storage.capacity += 100;
    }

    {
        System.out.println("Factory Instance Block: ID=" + factoryID
                + " Stock=" + storage.stock);
        storage.stock -= factoryID;
    }

    public Factory() {
        System.out.println("Factory Constructor: ID=" + factoryID
                + " Capacity=" + storage.capacity);
        storage.capacity += factoryID;
    }

    static int initCounter() {
        System.out.println("Factory Static Initializer");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Factory Main Start");
        new Factory().produce();
        new Warehouse().deliver();
        System.out.println("Final Stock: " + storage.stock
                + " Capacity: " + storage.capacity);
    }

    void produce() {
        System.out.println("Factory Produce: ID=" + factoryID);
        storage.stock += factoryID * 2;
    }
}

class Warehouse {
    static double capacity = 500;
    double stock = initStock();

    static {
        System.out.println("Warehouse Static Block: Capacity=" + capacity);
        capacity -= 50;
    }

    {
        System.out.println("Warehouse Instance Block: stock=" + stock);
        stock += capacity / 10;
    }

    public Warehouse() {
        System.out.println("Warehouse Constructor: stock=" + stock
                + " capacity=" + capacity);
        capacity -= stock;
    }

    double initStock() {
        System.out.println("Warehouse initStock()");
        return capacity / 2;
    }

    void deliver() {
        System.out.println("Warehouse Deliver: stock=" + stock
                + " capacity=" + capacity);
        stock -= 50;
    }
}