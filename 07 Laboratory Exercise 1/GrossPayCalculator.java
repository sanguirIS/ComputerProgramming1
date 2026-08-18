import java.util.Scanner;

/**
 * GrossPayCalculator.java
 *
 * A simple payroll program that displays an employee's information.
 * The user selects full time (F) or part time (P) employment, and the
 * program computes and displays the corresponding pay. An invalid
 * selection displays an error message.
 */
public class GrossPayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the name of the employee.
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        // Ask the user to select between full time (F) and part time (P).
        System.out.print("Press F for Full Time or P for Part Time: ");
        char employeeType = Character.toUpperCase(scanner.next().charAt(0));

        if (employeeType == 'F') {
            // Full-time employee: display the name and monthly salary.
            System.out.println("\nFull Time Employee");
            System.out.print("Enter Basic Pay: ");
            double basicPay = scanner.nextDouble();

            System.out.println("\nEmployee Name: " + employeeName);
            System.out.printf("Basic Pay: %.2f%n", basicPay);
            System.out.printf("Gross Pay: %.2f%n", basicPay);
        } else if (employeeType == 'P') {
            // Part-time employee: display the name and the computed wage.
            System.out.println("\n--- Part Time Employee ---");
            System.out.print("Enter rate per hour: ");
            double ratePerHour = scanner.nextDouble();
            System.out.print("Enter no. of hours worked: ");
            double hoursWorked = scanner.nextDouble();
            System.out.print("Enter no. of overtime: ");
            double overtime = scanner.nextDouble();

            // Basic pay = rate per hour * hours worked.
            double basicPay = ratePerHour * hoursWorked;
            // Overtime pay = hours of overtime * (rate per hour * 125%).
            double overtimePay = overtime * (ratePerHour * 1.25);
            double grossPay = basicPay + overtimePay;

            System.out.println("\nEmployee Name: " + employeeName);
            System.out.printf("Basic Pay: %.2f%n", basicPay);
            System.out.printf("Overtime Pay: %.2f%n", overtimePay);
            System.out.printf("Gross Pay: %.2f%n", grossPay);
        } else {
            // Invalid selection: display an error message.
            System.out.println("Invalid input. Please enter F for Full Time or P for Part Time.");
        }

        scanner.close();
    }
}
