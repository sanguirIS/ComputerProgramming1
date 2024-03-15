import java.util.Scanner;

public class KineticEnergy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get mass from user
        System.out.print("Enter mass in kilograms: ");
        double mass = scanner.nextDouble();

        // Get velocity from user
        System.out.print("Enter velocity in meters per second: ");
        double velocity = scanner.nextDouble();

        // Calculate kinetic energy using function
        double kineticEnergy = calculateKineticEnergy(mass, velocity);

        // Display result
        System.out.printf("The object's kinetic energy is: %.2f J.\n", kineticEnergy);

        scanner.close();
    }

    // Function to calculate kinetic energy
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2); // 0.5 * m * v^2
    }
}