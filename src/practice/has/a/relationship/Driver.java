package practice.has.a.relationship;

public class Driver {
    public static void main(String[] args) {

        // Lazy Binding
        LazyCar lazyCar = new LazyCar();
        lazyCar.startCar();
        lazyCar.stopCar();
    }
}
