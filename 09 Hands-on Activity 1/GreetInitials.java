import java.util.Scanner;

public class GreetInitials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user's initials
        System.out.print("Please enter your initials (first and last name): ");
        String initials = scanner.nextLine().toUpperCase(); // Convert input to uppercase for consistent initials

        // Extract first and last initials
        char firstInitial = initials.charAt(0);
        char lastInitial;
        if (initials.length() > 1) {
            lastInitial = initials.charAt(initials.indexOf(' ') + 1);
        } else {
            lastInitial = ' '; // Handle single-letter input
        }

        // Greet the user
        System.out.println("Hello " + firstInitial + " " + lastInitial + "!");

        scanner.close();
    }
}