package has.a.relationship.lazy.binding.car;

import has.a.relationship.car.example.Engine;

public class LazyCar {
    private Engine engine; // Starts as null

//    public LazyCar() {
//        // Engine NOT created here
//    }

    public void startCar() {
        if (engine == null) {
            engine = new Engine(); // Created only when needed
        }
        engine.start();
        System.out.println("Car is Moving");
    }

    public void stopCar() {
        if (engine != null) {
            engine.stop(); // Only stop if engine exists
        }
        System.out.println("Car has stopped");
    }
}