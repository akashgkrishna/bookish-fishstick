package string;

public class D1 {
    public static void main(String[] args) {
        String name = "Akash Krishna";
        System.out.println(name);

        System.out.println("CharAt 1: " + name.charAt(1)); // Gives a character at specified index
        System.out.println("index of k: " + name.indexOf("k")); // Finding index of first occurrence of k
        System.out.println("index of Kri: " + name.indexOf("Kri")); // Can give a string value as well

        /**
         Adjusts the indentation of each line of this string based on the value of n,
         and normalizes line termination characters.

         */
        System.out.println("Indented by 1 space/Giving indent(space):" +
                name.indent(1)); // shifted one space to the right

        /**
         Returns the index within this string of the first occurrence of the specified character,
         starting the search at the specified index.
         If no such character occurs in this string at or after position fromIndex,
         then -1 is returned
         */
        System.out.println("index of 65('A'): " + name.indexOf(65, 0)); // in ch it takes ascii value

        /**
         public int indexOf(
         @NotNull String str,
         int beginIndex,
         int endIndex
         )
         */
        System.out.println("index of sh from 2 to 10 index: " + name.indexOf("sh", 2, 10));

        System.out.println("last index of sh: " + name.lastIndexOf("sh")); // gives last index

        System.out.println("To uppercase: " + name.toUpperCase());
        System.out.println("To lowercase: " + name.toLowerCase());

        name = "   Akash Krishna  ";
        System.out.println("New String value: " + name);

        name = name.trim();
        System.out.println("After trimming spaces: " + name);

        name = name.replace("a", "o");
        System.out.println("After replacing a with o: " + name);
        name = name.replace("o", "a"); // replacing it back

        /**
         Returns true if, and only if, length() is 0.
         */
        if (name.isEmpty()) {
            System.out.println("Name is Empty");
        } else {
            System.out.println("Name is not empty");
        }

        /**
         Returns true if and only if this string contains the specified sequence of char values.
         */
        if (name.contains(" ")) {
            System.out.println("Name contains space");
        } else {
            System.out.println("Name has no space");
        }

        /**
         Compares this string to the specified object.
         */
        if (name.equals("Johnny")) {
            System.out.println("Your name is Johnny");
        } else {
            System.out.println("Your name is not Johnny");
        }

        /**
         Two strings are considered equal ignoring case if they are of the same length and
         corresponding Unicode code points in the two strings are equal ignoring case.
         */
        if (name.equalsIgnoreCase("Johnny")) {
            System.out.println("Your name is Johnny");
        } else {
            System.out.println("Your name is not Johnny");
        }
    }
}
