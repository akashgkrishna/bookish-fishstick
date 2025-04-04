package nonstatics;

public class D1 {
    String name = "Shreya";
    public static void main(String[] args) {

        D1 d1 = new D1();

        System.out.println(d1.name + " Name of instance: " + d1);
        System.out.println(new D1());
    }
}
