import java.util.Scanner;

public class CharacterAttackSpeed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the base attack speed: ");
        double baseAttackSpeed = scanner.nextDouble();
        System.out.print("Enter the bonus attack speed %: ");
        double bonusAttackSpeedPercent = scanner.nextDouble();
        System.out.print("Enter the level: ");
        int level = scanner.nextInt();

        // Convert bonus attack speed to decimal
        double bonusAttackSpeed = bonusAttackSpeedPercent / 100;

        // Calculate current attack speed
        double currentAttackSpeed = baseAttackSpeed * (1 + (bonusAttackSpeed * (level - 1)));

        // Round to three decimal places
        currentAttackSpeed = Math.round(currentAttackSpeed * 1000) / 1000.0; // More precise rounding

        // Display result
        System.out.printf("The character's current attack speed is %.3f.\n", currentAttackSpeed);

        scanner.close();
    }
}