import java.util.Scanner;

/**
 * PrintInitials.java
 *
 * Prints the initials of the full name entered by the user.
 */
public class PrintInitials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their full name.
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();

        // Print the initials of each word in the full name.
        System.out.print("Your initials are: ");
        String[] words = fullName.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(Character.toUpperCase(words[i].charAt(0)));
        }
        System.out.println();

        scanner.close();
    }
}
