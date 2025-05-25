package has.a.relationship.car.example;

/**
 * Container class (uses composition to include Engine)
 * Demonstrates a "has-a" relationship:
 * <p>
 * A Car has an Engine
 * <p>
 * It is an example for Early Binding Design Technique
 */

public class Car {
    Engine engine; // "has-a" relationship: Car has an Engine || Early binding (eager initialization)

    public Car() {
        this.engine = new Engine(); // Composition: Engine is created inside Car || Engine created upfront
    }

    public void startCar() {
        engine.start(); // Delegates the call to Engine
        System.out.println("Car is Moving");
    }

    public void stopCar() {
        engine.stop(); // Delegates the call to Engine
        System.out.println("Car has stopped");
    }
}
