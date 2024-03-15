public class Operators_TP {

    public static void main(String[] args) {
        // Employee information
        String employeeName = "Justine";
        double salary = 35000.0; // Salary before deductions

        // Deduction rates (as percentages)
        final double gov_tax = 0.15; // 15%
        final double sss_contri = 0.0363; // 3.63%
        final double medic = 0.0125; // 1.25%

        // Fixed deduction
        final double hmdf = 100.00;

        // Calculate deductions
        double govTax = salary * gov_tax;
        double sssContri = salary * sss_contri;
        double medical = salary * medic;
        double totalDeductions = govTax + sssContri + medical + hmdf;
        double netIncome = salary - totalDeductions;

        // Print employee information
        System.out.println("Employee Name:");
        System.out.println(employeeName);
        System.out.println(); // Add a blank line for better formatting

        System.out.println("Salary:");
        System.out.printf("%.1f\n", salary);  // Format salary with one decimal place

        System.out.println("Deductions");
        System.out.println("Government Tax:");
        System.out.printf("%.1f\n", govTax);  // Format tax with one decimal place
        System.out.println("Mandatory Contribution:");
        System.out.printf("%.1f\n", sssContri);  // Format contribution with one decimal place
        System.out.println("Healthcare:");
        System.out.printf("%.1f\n", medical);  // Format healthcare with one decimal place
        System.out.println("HMDF:");
        System.out.printf("%.1f\n", hmdf);  // Format HMDF with one decimal place
        System.out.println(); // Add a blank line for better formatting

        System.out.println("Income:");
        System.out.printf("%.1f\n", netIncome);  // Format net income with one decimal place
    }
}