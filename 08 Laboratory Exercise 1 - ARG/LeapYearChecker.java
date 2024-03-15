import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get start year from user
        int startYear;
        do {
            System.out.print("Enter a year between 1900 and 2400 (or 0 to exit): ");
            startYear = scanner.nextInt();
        } while (startYear < 1900 || startYear > 2400);

        // Exit if user enters 0
        if (startYear == 0) {
            System.out.println("You entered 0. Program will terminate.");
            return;
        }

        // Check and display leap years from startYear to 2400
        System.out.println("List of leap years from " + startYear + " to 2400:");
        for (int year = startYear; year <= 2400; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }

        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}