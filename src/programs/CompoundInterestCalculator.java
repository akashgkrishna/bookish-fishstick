package programs;

import java.util.Scanner;

/**
 * A = p[1 + r/n]^nt
 */
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principleAmount, interestRate, amount;
        int compoundTimesPerYear, noOfYears;

        System.out.println("Enter the principle amount: ");
        principleAmount = scanner.nextDouble();
        System.out.println("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble() / 100;
        System.out.println("Enter No. of times compounded per year: ");
        compoundTimesPerYear = scanner.nextInt();
        System.out.println("Enter the No. of years: ");
        noOfYears = scanner.nextInt();

        amount = principleAmount * Math.pow(
                1 + (interestRate / compoundTimesPerYear),
                compoundTimesPerYear * noOfYears
        );

        System.out.println("The amount after one year is Rs." + amount);
    }
}
