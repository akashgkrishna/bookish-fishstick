package nonstatics;

public class Alpha {
    static int alphaX = Bravo.initBravoStatic();
    int alphaY = initY();

    static {
        System.out.println("Alpha Static Block 1: alphaX=" + alphaX);
        alphaX += Bravo.betaStatic;
    }

    {
        System.out.println("Alpha Instance Block: alphaY=" + alphaY);
        alphaY += Bravo.betaStatic;
    }

    public Alpha() {
        System.out.println("Alpha Constructor: alphaY=" + alphaY
                + ", bravoStatic=" + Bravo.betaStatic);
        Bravo.betaStatic += alphaY;
    }

    int initY() {
        System.out.println("Alpha initY()");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("Alpha Main Start");
        new Bravo().process();
        new Alpha();
        System.out.println("Final Values - alphaX:" + alphaX
                + " betaStatic:" + Bravo.betaStatic);
    }
}

class Bravo {
    static int betaStatic = 5;
    int betaY = Alpha.alphaX * 2;

    static int initBravoStatic() {
        System.out.println("Bravo Static Initializer");
        return 20;
    }

    {
        System.out.println("Bravo Instance Block: betaY=" + betaY
                + " alphaX=" + Alpha.alphaX);
        betaY += Alpha.alphaX;
    }

    public Bravo() {
        System.out.println("Bravo Constructor: betaY=" + betaY);
        betaStatic += betaY;
    }

    void process() {
        System.out.println("Bravo Process: betaY=" + betaY
                + " betaStatic=" + betaStatic);
    }
}