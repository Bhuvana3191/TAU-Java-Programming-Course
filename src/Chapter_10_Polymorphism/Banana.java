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

public class Banana extends Fruit {

    // constructor for calories
    public Banana(){
        setCalories(105);
    }

    // Method for peel
    public void peel(){
        System.out.println("Banana has been peeled");
    }

    // Override the makeJuice method
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is gross");
    }
}
