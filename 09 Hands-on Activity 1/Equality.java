import java.util.Scanner;

/**
 * Equality.java
 *
 * Asks the user to enter two numbers and displays whether the numbers
 * are equal or not equal.
 */
public class Equality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for two numbers.
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare the numbers and display the result.
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not equal.");
        }

        scanner.close();
    }
}
