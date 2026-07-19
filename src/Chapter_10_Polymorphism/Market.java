package Chapter_10_Polymorphism;
/* Exercise 9 - Fruit Market:
• Create a class called Fruit. This class should contain a field called calories and a
method called makeJuice which prints a statement (e.g. “Juice is made”).
• Create two subclasses of the Fruit class (e.g. Apple, Banana) and create
method(s) in these classes that are specific to them (e.g. removeSeeds, peel).
• Set the calories within the constructors of these subclasses. Override the
makeJuice method to print the specific type of juice that's made.
• Create a Market class which tests polymorphism by creating several variations of
these objects.
*/

public class Market {

    public static void main(String[] args){

        Fruit apple = new Apple();
        apple.makeJuice();
        ((Apple) apple).removeSeeds(); // Casting

        Fruit banana = new Banana();
        banana.makeJuice();
        ((Banana) banana).peel(); // Casting

        Apple apple1 = new Apple();
        apple1.removeSeeds(); // Without Casting

        Banana banana1 = new Banana();
        banana1.peel(); // Without Casting

        Fruit orange = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(apple1);
        squeeze(banana1);
        squeeze(orange);
    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing....");
        fruit.makeJuice();
    }
}
