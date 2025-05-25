package string;

import java.util.Locale;
import java.util.Scanner;

/**
 * Username Sanitizer
 * Prompt for a “raw” username string, then:
 * <p>
 * 1. Trim leading/trailing whitespace.
 * <p>
 * 2. Replace all spaces with underscores.
 * <p>
 * 3. Convert to lowercase using Locale.ROOT.
 * <p>
 * 4. Print the cleaned username.
 */

public class UserNameSanitizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username;
        System.out.println("Enter the username:");
        username = scanner.nextLine();

        username = username.trim()
                .replace(' ', '_')
                .toLowerCase(Locale.ROOT);

        System.out.println("Cleaned username is " + username);
    }
}
