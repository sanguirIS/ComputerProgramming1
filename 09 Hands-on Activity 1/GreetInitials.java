import java.util.Scanner;

/**
 * GreetInitials.java
 *
 * Asks the user for their name initials (first and last name) and
 * outputs a greeting that says "Hello", followed by the initials
 * and an exclamation mark.
 */
public class GreetInitials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their initials (first and last name).
        System.out.print("Please enter your initials: ");
        String input = scanner.nextLine().trim().toUpperCase();

        // Split the input on whitespace to get the first and last initials.
        String[] parts = input.split("\\s+");
        char firstInitial = parts[0].charAt(0);
        char lastInitial = parts.length > 1 ? parts[1].charAt(0) : ' ';

        // Greet the user.
        System.out.println("Hello " + firstInitial + " " + lastInitial + "!");

        scanner.close();
    }
}
