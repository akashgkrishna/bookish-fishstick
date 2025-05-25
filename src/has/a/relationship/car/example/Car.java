package has.a.relationship.car.example;

/**
 * Container class (uses composition to include Engine)
 * Demonstrates a "has-a" relationship:
 * <p>
 * A Car has an Engine
 */

public class Car {
    Engine engine; // "has-a" relationship: Car has an Engine

    Car() {
        this.engine = new Engine(); // Composition: Engine is created inside Car
    }

    void startCar() {
        engine.start(); // Delegates the call to Engine
        System.out.println("Car is Moving");
    }

    void stopCar() {
        engine.stop(); // Delegates the call to Engine
        System.out.println("Car has stopped");
    }
}
