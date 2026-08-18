import java.util.Scanner;

/**
 * LeapYearChecker.java
 *
 * Displays the leap years from 1900 to 2400 starting from the user's
 * valid input. The program keeps asking for a year until the user
 * enters 0, which terminates the program.
 *
 * A year is a leap year if it is divisible by 4, except century years,
 * which must also be divisible by 400.
 */
public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // 0 terminates the program.
            if (year == 0) {
                System.out.println("You entered 0. Program will terminate.");
                break;
            }

            // Validate that the input is within the allowed range.
            if (year < 1900 || year > 2400) {
                System.out.println("Invalid input. Input should be between 1900 to 2400");
                continue;
            }

            // The starting year itself must be a leap year.
            if (!isLeapYear(year)) {
                System.out.println("Invalid input. Input is not a leap year.");
                continue;
            }

            // Display the leap years from the given year up to 2400.
            for (int y = year; y <= 2400; y++) {
                if (isLeapYear(y)) {
                    System.out.println(y + " is a leap year");
                }
            }
        }

        scanner.close();
    }

    // Returns true if the given year is a leap year.
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
