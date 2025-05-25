package string;

import java.util.Scanner;

/**
 * Palindrome Checker (Ignore Case & Non-Letters)
 * Ask the user for a phrase and determine whether it’s a palindrome when you ignore case,
 * spaces, and punctuation. (Hint: use replaceAll to strip non-letters, then toLowerCase(),
 * and compare to a reversed copy.)
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        System.out.println("Enter the phrase");
        sentence = scanner.nextLine();

        sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (sentence.contentEquals(new StringBuilder(sentence).reverse())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
