/**
 * Operators_TP.java
 *
 * Calculates and prints the monthly net pay of an employee after
 * applying the government tax, mandatory contribution, healthcare,
 * and HMDF deductions.
 */
public class Operators_TP {

    public static void main(String[] args) {
        // Employee information: name and salary before deductions.
        String employeeName = "Justine";
        double salary = 35000.0; // Monthly salary (before deductions)

        // Deduction rates and fixed deduction.
        final double GOV_TAX = 0.15;     // Government Tax = 15%
        final double SSS_CONTRI = 0.0363; // Mandatory Contribution = 3.63%
        final double MEDIC = 0.0125;     // Healthcare = 1.25%
        final double HMDF = 100.00;      // HMDF = PHP 100.00 (fixed amount)

        // Calculate the individual deductions.
        double govTax = salary * GOV_TAX;
        double sssContri = salary * SSS_CONTRI;
        double medic = salary * MEDIC;
        double totalDeductions = govTax + sssContri + medic + HMDF;

        // Net pay is the salary minus all deductions.
        double netPay = salary - totalDeductions;

        // Print the employee information and the computed amounts.
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Salary: %.1f%n", salary);
        System.out.println();

        System.out.println("Deductions");
        System.out.printf("Government Tax: %.1f%n", govTax);
        System.out.printf("Mandatory Contribution: %.1f%n", sssContri);
        System.out.printf("Healthcare: %.1f%n", medic);
        System.out.printf("HMDF: %.1f%n", HMDF);
        System.out.println();

        System.out.printf("Net Pay: %.1f%n", netPay);
    }
}
