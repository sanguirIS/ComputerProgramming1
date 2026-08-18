import java.util.Scanner;

public class StudentStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of males: ");
        int numMales = scanner.nextInt();
        System.out.print("Enter the number of females: ");
        int numFemales = scanner.nextInt();

        // Calculate total students and percentages
        int totalStudents = numMales + numFemales;

        // Print results
        System.out.println("Number of students = " + totalStudents);

        // Guard against division by zero when no students are registered.
        if (totalStudents == 0) {
            System.out.println("Male = 0.00%");
            System.out.println("Female = 0.00%");
        } else {
            double malePercentage = (double) numMales / totalStudents * 100;
            double femalePercentage = (double) numFemales / totalStudents * 100;
            System.out.printf("Male = %.2f%%%n", malePercentage);
            System.out.printf("Female = %.2f%%%n", femalePercentage);
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}