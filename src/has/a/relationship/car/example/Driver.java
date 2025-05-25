package has.a.relationship.car.example;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car(); // Car has an Engine internally
        car.startCar(); // Output: Engine started. Car is Moving
        car.stopCar(); // Output: Engine stopped. Car has stopped
    }
}
