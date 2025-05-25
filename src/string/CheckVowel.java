package string;

import java.util.Scanner;

/**
 * Write a program that prompts the user for a word and then prints each
 * <p>
 * vowel (a, e, i, o, u) it contains along with the index at which it appears.
 */
public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        System.out.println("Enter your word: ");
        word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char original = word.charAt(i);
            char letter = Character.toLowerCase(original);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Vowel '" + original + "' found at index " + i);
            }
        }
    }
}
