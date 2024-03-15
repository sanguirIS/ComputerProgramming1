import java.util.Scanner;

public class BusSeatReservation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for number of rows and columns (seats per row)
        final int ROWS = 10;
        final int COLUMNS = 4;

        // Create a 2D array to represent the bus seats (0 - empty, 1 - reserved)
        int[][] seats = new int[ROWS][COLUMNS];

        // Display menu
        int choice;
        do {
            System.out.println("\nBus Seat Reservation System");
            System.out.println("1. View Available Seats");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 4); // Validate input (1-4)

        // Process user choice
        switch (choice) {
            case 1:
                displayAvailableSeats(seats);
                break;
            case 2:
                reserveSeat(seats, scanner);
                break;
            case 3:
                cancelReservation(seats, scanner);
                break;
            case 4:
                System.out.println("Exiting Bus Seat Reservation System.");
        }

        scanner.close();
    }

    // Method to display available seats
    public static void displayAvailableSeats(int[][] seats) {
        System.out.println("\nAvailable Seats:");
        for (int row = 0; row < seats.length; row++) {
            System.out.print("Row " + (row + 1) + ": ");
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == 0) {
                    System.out.print("E "); // E for empty
                } else {
                    System.out.print("X "); // X for reserved
                }
            }
            System.out.println();
        }
    }

    // Method to reserve a seat
    public static void reserveSeat(int[][] seats, Scanner scanner) {
        int row, col;
        do {
            System.out.print("\nEnter row number (1-" + seats.length + "): ");
            row = scanner.nextInt() - 1; // Adjust for zero-based indexing
            System.out.print("Enter column number (1-" + seats[0].length + "): ");
            col = scanner.nextInt() - 1; // Adjust for zero-based indexing
        } while (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length || seats[row][col] != 0);

        // Reserve the seat
        seats[row][col] = 1;
        System.out.println("Seat reserved successfully!");
    }

    // Method to cancel a reservation
    public static void cancelReservation(int[][] seats, Scanner scanner) {
        int row, col;
        do {
            System.out.print("\nEnter row number (1-" + seats.length + ") of the seat to cancel: ");
            row = scanner.nextInt() - 1; // Adjust for zero-based indexing
            System.out.print("Enter column number (1-" + seats[0].length + ") of the seat to cancel: ");
            col = scanner.nextInt() - 1; // Adjust for zero-based indexing
        } while (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length || seats[row][col] == 0);

        // Cancel the reservation
        seats[row][col] = 0;
        System.out.println("Reservation canceled successfully!");
    }
}