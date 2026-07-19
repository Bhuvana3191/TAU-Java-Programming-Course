package Chapter_6_Classes_And_Objects;
/*
Exercise 5 : Phone Bill Calculator #2
• Enhance the Phone Bill exercise by redoing it in an object-oriented style.
• A phone bill should have an id, base cost, number of allotted minutes, and number of minutes used. One
  should also be able to calculate the overage, tax, and total on a phone bill,
  and also be able to print an itemized bill.
• Include the following constructors: default, id-only, all fields.
  No matter which constructor is used, all fields should be set.
• Create a class that instantiates a phone bill and prints the itemized bill.

Note: Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
*/

public class PhoneBill {

    // Set Global Variables or Fields
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    // Set Default Constructor
    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    // Set Constructor only for id and rest of the fields are default - Single Parameter Constructor
    public PhoneBill(int id){
        this.id = id;
        this.baseCost = 79.99;
        this.allottedMinutes = 800;
        this.minutesUsed = 800;
    }

    // Set Constructor for all the fields - Multiple Parameter Constructor
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // Getter and Setter Methods for each of the fields -
    /* Note: The "id, baseCost, allottedMinutes and minutesUsed" which are mentioned in Setter
    are different from Global Variables "id, baseCost, allottedMinutes and minutesUsed"
    */
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    // Methods for calculating the overage, tax, and total on a phone bill
    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes; // Formula for calculating Overage Minutes : Overage Minutes = minutesUsed − allottedMinutes (only if positive, else 0)
        return overageMinutes * overageRate; // Formula for calculating Overage Charge : Overage Charge = overageMinutes × $0.25
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage()); // Formulas for calculating Tax : Tax = subtotal × 0.15 and Subtotal = baseCost + overageCharge
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax(); // Formula for calculating Total Bill : Total = subtotal + tax
    }

    // Method for printing an itemized bill
    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + String.format("%.2f", baseCost));
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
