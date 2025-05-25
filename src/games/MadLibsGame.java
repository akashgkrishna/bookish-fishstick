package games;

import java.util.Scanner;

/**
 * An adjective is a word that describes or modifies a noun or pronoun.
 * It provides information about the qualities, quantity, or extent of the noun
 * or pronoun it modifies.
 * <p>
 * A noun is a word that names a person, place, thing, or idea.
 * Examples include: person: cat, place: city, thing: book, idea: happiness.
 * More examples: dog, park, freedom, chair, table, computer, man, woman, teacher, and student.
 * <p>
 * A verb is a word that expresses an action, occurrence, or state of being.
 * It's a crucial part of a sentence, indicating what the subject is doing, experiencing, or being.
 * Verbs are often called "doing words" because they convey action.
 * Examples: Run, walk, jump, talk, sing, speak, eat, drink, cry, skip, pull, push, fetch, give, make,
 * bake, try, bring, teach, study, etc.
 */


public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1, noun1, adjective2, verb1, adjective3;

        System.out.println("Enter a adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (animal/person): ");
        noun1 = scanner.nextLine();

        System.out.println("Enter a adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb end with ing (action): ");
        verb1 = scanner.nextLine();

        System.out.println("Enter a adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ". ");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}
