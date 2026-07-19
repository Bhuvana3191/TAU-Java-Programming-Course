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

public class PhoneBillCalculator {

    public static void main(String[] args){
        PhoneBill bill = new PhoneBill(123456);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}
