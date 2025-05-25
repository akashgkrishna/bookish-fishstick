package practice.has.a.relationship;

// Whole / Container

public class Car {
    Engine engine;

    Car(){
        this.engine = new Engine(); // composition
    }

    void startCar(){
        engine.start();
        System.out.println("Car started");
    }

    void stopCar(){
        engine.stop();
        System.out.println("Car stopped");
    }

}
