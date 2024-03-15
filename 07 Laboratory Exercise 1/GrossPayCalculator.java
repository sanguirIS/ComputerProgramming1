import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee name
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        // Get employee type (full-time or part-time)
        char employeeType;
        do {
            System.out.print("Press F for Full Time or P for Part Time: ");
            employeeType = Character.toUpperCase(scanner.next().charAt(0)); // Convert to uppercase for case-insensitive input
        } while (employeeType != 'F' && employeeType != 'P'); // Loop until valid input (F or P)

        // Calculate and display gross pay based on employee type
        if (employeeType == 'F') {
            // Full-time employee
            System.out.println("\nFull Time Employee");
            System.out.print("Enter Basic Pay: ");
            double basicPay = scanner.nextDouble();
            System.out.println("\nEmployee Name: " + employeeName);
            System.out.printf("Basic Pay: %.2f\n", basicPay);
            System.out.printf("Gross Pay: %.2f\n", basicPay);
        } else {
            // Part-time employee
            System.out.println("\n--- Part Time Employee ---");
            System.out.print("Enter rate per hour: ");
            double ratePerHour = scanner.nextDouble();
            System.out.print("Enter no. of hours worked: ");
            double hoursWorked = scanner.nextDouble();
            System.out.print("Enter no. of overtime: ");
            double overtime = scanner.nextDouble();

            double basicPay = ratePerHour * hoursWorked;
            double overtimePay = overtime * (ratePerHour * 1.25);
            double grossPay = basicPay + overtimePay;

            System.out.println("\nEmployee Name: " + employeeName);
            System.out.printf("Basic Pay: %.2f\n", basicPay);
            System.out.printf("Overtime Pay: %.2f\n", overtimePay);
            System.out.printf("Gross Pay: %.2f\n", grossPay);
        }

        scanner.close();
    }
}