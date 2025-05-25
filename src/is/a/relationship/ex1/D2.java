package is.a.relationship.ex1;

public class D2 extends D1{
    static int b = 20;

    {
        System.out.println("From D2 non-static block");
    }
    static {
        System.out.println("From D2 static block");
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
