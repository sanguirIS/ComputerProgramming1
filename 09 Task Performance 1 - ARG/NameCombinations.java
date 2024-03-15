import java.util.Scanner;

public class NameCombinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three first names
        System.out.println("Enter three first names:");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        // Generate all possible two-name combinations
        String[] combinations = {name1 + " " + name2, name1 + " " + name3, name2 + " " + name1,
                name2 + " " + name3, name3 + " " + name1, name3 + " " + name2};

        // Display combinations and prompt for selection
        System.out.println("\nPossible names are:");
        for (int i = 0; i < combinations.length; i++) {
            System.out.println((i + 1) + " - " + combinations[i]);
        }

        int choice;
        do {
            System.out.print("\nEnter 1-6 to select a name: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 6); // Validate input (1-6)

        // Get chosen combination and names
        String chosenName = combinations[choice - 1];
        String[] chosenNames = chosenName.split(" ");

        // Calculate initials and username
        String initials = "";
        for (String name : chosenNames) {
            initials += name.charAt(0);
        }
        initials = initials.toUpperCase();

        String username = chosenName.toLowerCase().replace(" ", "_");

        // Display results
        System.out.println("\nThe initials for " + chosenName + " is " + initials + ".");
        System.out.println("Suggested username: " + username);

        scanner.close();
    }
}