public class Printf {
    /**
     * printf is a method used to format output.
     * <p>
     * %[flags][width][.precision][specifier-character]
     * <p>
     * specifier-character = %s, %c, %d, %f, %b
     * <p>
     * .precision = for %f the display will be 6 decimals ex: 57.5 will be 57.500000
     * To format it we can use precision [%.2f] <- For 2 decimal, so it'll be 57.50
     * + = output a plus
     * , = comma grouping separator
     * ( = negative numbers are enclosed in ()
     * space = displays minus if negative, space if positive
     * <p>
     * [width]
     * 0 = zero padding
     * number = right justified padding
     * negative number = left justified padding
     */
    public static void main(String[] args) {
        String name = "Krishna";
        char firstLetter = 'K';
        int age = 29;
        double height = 57.5;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("You are %.2f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.println();

        // To format using precision
        double price1 = 9.99;
        double price2 = 100.50;
        double price3 = -54.01;

        // For finding positive and negative
        System.out.printf("%+.2f\n", price1); // +9.99
        System.out.printf("%+.2f\n", price2); // +100.50
        System.out.printf("%+.2f\n", price3);// -54.01
        System.out.println();

        // For adding comma[,]
        price1 = 90000.99;
        price2 = 10000.50;
        price3 = -5400.01;

        System.out.printf("%,.2f\n", price1); // 90,000.99
        System.out.printf("%,.2f\n", price2); // 10,000.50
        System.out.printf("%,.2f\n", price3); // -5,400.01
        System.out.println();

        // padding [width]
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // if we give only 0 without 4, it'll give MissingFormatWidthException
        System.out.printf("%04d\n",id1); // 0001
        System.out.printf("%04d\n",id2); // 0023
        System.out.printf("%04d\n",id3); // 0456
        System.out.printf("%04d\n",id4); // 7890
        System.out.println();

        System.out.printf("%4d\n",id1); //    1 = gets space instead of 0
        System.out.printf("%4d\n",id2); //   23
        System.out.printf("%4d\n",id3); //  456
        System.out.printf("%4d\n",id4); // 7890
        System.out.println();

        System.out.printf("%-4d\n",id1); // 1
        System.out.printf("%-4d\n",id2); // 23
        System.out.printf("%-4d\n",id3); // 456
        System.out.printf("%-4d\n",id4); // 7890
    }
}
