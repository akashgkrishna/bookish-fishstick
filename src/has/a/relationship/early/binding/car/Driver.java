package has.a.relationship.early.binding.car;

import has.a.relationship.car.example.Car;

public class Driver {
    public static void main(String[] args) {
        // Early Binding Example
        System.out.println("--- Early Binding Car ---");
        Car eagerCar = new Car();
        eagerCar.startCar(); // Engine already exists
        eagerCar.stopCar();
    }
}
