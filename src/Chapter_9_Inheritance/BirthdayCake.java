package Chapter_9_Inheritance;
/* Exercise 8 - Cake! Cake! Cake!:
• Create a superclass called Cake that has two fields: flavor and price, and a constructor that accepts the flavor.
Getter and setter methods should be created for the fields.
• Create a BirthdayCake class which inherits from Cake and has a field called candles.
Its constructor should set the flavor. Include getter and setter method.
• Create a WeddingCake class which inherits from Cake and has a field called tiers.
Its constructor should set the flavor. Include getter and setter method.
• Create a Taste Tester class to test out your inheritance by printing the flavor
and price of each of these types of cakes.
*/

public class BirthdayCake extends Cake {

    // A field created - candles
    private int candles;

    // Getter and setter methods for the field
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    // Constructor to set the flavor
    public BirthdayCake(){
        super("Vanilla");
    }
}
