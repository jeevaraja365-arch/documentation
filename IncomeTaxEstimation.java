import java.util.Scanner;

public class IncomeTaxEstimation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Income Tax Estimation and Deduction Calculation System ===");
        System.out.print("Enter your total annual income (₹): ");
        double income = sc.nextDouble();

        System.out.print("Enter total deductions (₹): ");
        double deductions = sc.nextDouble();

        double taxableIncome = income - deductions;
        double tax = calculateTax(taxableIncome);

        System.out.println("\n--------------------------------------------");
        System.out.println("Gross Income: ₹" + income);
        System.out.println("Total Deductions: ₹" + deductions);
        System.out.println("Taxable Income: ₹" + taxableIncome);
        System.out.println("Calculated Tax (including 4% cess): ₹" + tax);
        System.out.println("--------------------------------------------");
        System.out.println("Thank you for using the Tax Estimation System!");
        sc.close();
    }
    public static double calculateTax(double taxableIncome) {
        double tax = 0;

        if (taxableIncome <= 250000) {
            tax = 0;
        } else if (taxableIncome <= 500000) {
            tax = (taxableIncome - 250000) * 0.05;
        } else if (taxableIncome <= 1000000) {
            tax = 12500 + (taxableIncome - 500000) * 0.20;
        } else {
            tax = 112500 + (taxableIncome - 1000000) * 0.30;
        }

        // Add 4% Health & Education Cess
        tax += tax * 0.04;
        return tax;
    }
}