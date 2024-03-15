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
        double malePercentage = (double) numMales / totalStudents * 100;
        double femalePercentage = (double) numFemales / totalStudents * 100;

        // Print results
        System.out.println("Number of students = " + totalStudents);
        System.out.printf("Male = %.2f%%\n", malePercentage);
        System.out.printf("Female = %.2f%%\n", femalePercentage);

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}