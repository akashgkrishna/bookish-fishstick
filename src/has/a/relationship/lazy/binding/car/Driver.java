package has.a.relationship.lazy.binding.car;

public class Driver {
    public static void main(String[] args) {
        // Lazy Initialization Example
        System.out.println("\n--- Lazy Initialization Car ---");
        LazyCar lazyCar = new LazyCar();
        lazyCar.startCar(); // Engine created here
        lazyCar.stopCar();
    }
}
