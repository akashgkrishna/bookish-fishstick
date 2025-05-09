package programs;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        double price;
        int quantity;

        System.out.println("What item would you like to buy?");
        itemName = scanner.nextLine();
        System.out.println("What is the price for each?");
        price = scanner.nextDouble();
        System.out.println("How many would you like to buy?");
        quantity = scanner.nextInt();

        scanner.close();

        System.out.println("You have bought " + quantity + " " + itemName + "'s.");
        System.out.println("Your total is Rs. " + price * quantity);
    }
}
