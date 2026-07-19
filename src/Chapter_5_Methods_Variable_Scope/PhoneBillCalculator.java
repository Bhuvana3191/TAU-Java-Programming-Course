package Chapter_5_Methods_Variable_Scope;

import java.util.Scanner;

/*
Exercise 4 : Phone Bill Calculator - Calculate the final total of someone's cell phone bill.
• Allow the operator to input the plan fee and the number of overage minutes.
• Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
• Create separate methods to calculate the tax, overage fees, and final total.
• Print the itemized bill.
 */

public class PhoneBillCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Get user's input
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes");
        double overageMinutes = scanner.nextDouble();

        //2. Calculate overage fees
        double overageCharge = calculateOverages(overageMinutes);

        //3. Calculate tax
        double tax = calculateTax(baseCost + overageCharge);

        //4. Calculate final total and Print the bill
        calculateAndPrintBill(baseCost, overageCharge, tax);

        scanner.close();
    }

    //2. Method for Calculating overage fees
    public static double calculateOverages(double extraMinutes){
        double overageRate = 0.25;
        double overage = extraMinutes * overageRate;
        return overage;
    }

    //3. Method for Calculating tax
    public static double calculateTax(double subTotal){
        double taxRate = 0.15;
        double tax = subTotal * taxRate;
        return tax;
    }

    //4. Method for Calculating final total & Print the bill
    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
