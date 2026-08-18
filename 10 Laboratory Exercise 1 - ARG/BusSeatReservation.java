import java.util.Scanner;

/**
 * BusSeatReservation.java
 *
 * A simple bus seat reservation program. The bus has 10 rows with 4
 * seats in each row. The user reserves a seat by entering the row and
 * column number. The program keeps running until the user enters a
 * negative number. Reserved seats are marked with an 'X'.
 */
public class BusSeatReservation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ROWS = 10; // Number of rows in the bus
        final int COLS = 4;  // Number of seats per row

        // false = empty seat, true = reserved seat.
        boolean[][] seats = new boolean[ROWS][COLS];

        System.out.println("Bus Seat Reservation:");

        while (true) {
            // Display the current seat map.
            displaySeats(seats);

            // Ask for the row and column number to reserve.
            System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
            int row = scanner.nextInt();

            // A negative number stops the program.
            if (row < 0) {
                System.out.println("Exiting. Thank you!");
                break;
            }

            int col = scanner.nextInt();
            if (col < 0) {
                System.out.println("Exiting. Thank you!");
                break;
            }

            // Validate the seat position.
            if (row < 1 || row > ROWS || col < 1 || col > COLS) {
                System.out.println("Invalid seat. Row must be 1-" + ROWS + " and column must be 1-" + COLS + ".");
            } else if (seats[row - 1][col - 1]) {
                System.out.println("Seat " + row + "-" + col + " is already reserved.");
            } else {
                seats[row - 1][col - 1] = true;
                System.out.println("Seat " + row + "-" + col + " reserved.");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Prints the seat map. '*' = empty, 'X' = reserved.
    public static void displaySeats(boolean[][] seats) {
        System.out.println("    Col 1   Col 2   Col 3   Col 4");
        for (int row = 0; row < seats.length; row++) {
            System.out.printf("Row %2d  ", row + 1);
            for (int col = 0; col < seats[row].length; col++) {
                System.out.printf("   %s    ", seats[row][col] ? "X" : "*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
