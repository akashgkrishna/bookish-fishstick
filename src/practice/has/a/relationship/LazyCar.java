package practice.has.a.relationship;

// Whole / Container

public class LazyCar {
    Engine engine; // null

    void startCar(){
        if(engine == null){
            engine = new Engine(); //composition
        }
        System.out.println(engine);
        engine.start();
        System.out.println("Car started");
    }

    void stopCar(){
        if(engine == null){
            engine = new Engine(); //composition
        }
        System.out.println(engine);
        engine.stop();
        System.out.println("Car stopped");
    }

}
