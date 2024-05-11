import java.util.*;
public class OddLettersPattern {
    public static void main(String[] args) {
        String word = "HELLO";
        int length = word.length();

        // Print upper half of the pattern
        for (int i = 0; i < length; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print the character
            System.out.print(word.charAt(i));

            // Print spaces between characters
            for (int j = 0; j < 2 * (length - i - 1); j++) {
                System.out.print("  ");
            }

            // Print the mirrored character
            if (i != length - 1) {
                System.out.println(word.charAt(length - i - 1));
            } else {
                System.out.println();
            }
        }

        // Print lower half of the pattern
        for (int i = length - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print the character
            System.out.print(word.charAt(i));

            // Print spaces between characters
            for (int j = 0; j < 2 * (length - i - 1); j++) {
                System.out.print("  ");
            }

            // Print the mirrored character
            System.out.println(word.charAt(length - i - 1));
        }
    }
}
