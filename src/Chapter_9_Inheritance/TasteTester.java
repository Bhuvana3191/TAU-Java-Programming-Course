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

public class TasteTester {

    public static void main(String[] args){
        // Direct Cake object with both flavor (constructor) and price (setter) set
        Cake cake = new Cake("Chocolate");
        cake.setPrice(29.99); // tests superclass directly
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        // BirthdayCake with default flavor but custom price
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95); // tests price override via setter
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        // WeddingCake with custom flavor but default price
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Pina Colada"); // tests flavor override via setter and price intentionally left as default
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}
