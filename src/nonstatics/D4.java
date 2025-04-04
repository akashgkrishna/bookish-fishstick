package nonstatics;

public class D4 {
    static int a;
    int b = bike();
    void car(){
        System.out.println("Car running");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        bike();
        System.out.println("Car stopped");
    }
    int bike(){
        System.out.println("Bike running");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Bike stopped");
        return 5;
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        a = 15;
        D4 d4 = new D4();
        d4.car();
        System.out.println("Main End");
    }
}
