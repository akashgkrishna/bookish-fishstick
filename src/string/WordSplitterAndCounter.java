package string;

import java.util.Scanner;

/**
 * Word Splitter & Counter
 * Prompt for a sentence, then:
 * <p>
 * 1. Trim it, split on whitespace (split("\\s+")),
 * <p>
 * 2. Print each word on its own line,
 * <p>
 * 3. Finally, print the total number of words found.
 */
public class WordSplitterAndCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase;
        System.out.println("Enter the phrase");
        phrase = scanner.nextLine().trim();

        String[] strings = phrase.split("\\s+"); // Split on one or more whitespace characters

        for (String word : strings) {
            System.out.println(word);
        }

        if (phrase.isEmpty()) {
            System.out.println("Total number of words is 0");
        } else {
            System.out.println("Total number of words is " + strings.length);
        }


    }
}
