package is.a.relationship.ex1;

// Example of flow in is-a relationship
public class D1 {
    static int a = 10;
    int c = 30;

    static {
        System.out.println("From D1 static block");
    }

    {
        System.out.println("From D1 Non-static block");
    }
}
