package Chapter_11_Abstraction_Interfaces;
/*
Exercise 9 - Farm:
• Create an abstract class called Animal, which declares an abstract method called makeSound(),
and implements a non-abstract method called eat().
• Create a Pig class and a Duck class that both extend the Animal class.
• Create a Farm class to test the implementations.
*/

public class Farm {

    public static void main(String[] args){
        Animal duck = new Duck(); // Upcasting
        duck.makeSound(); // Abstract Method and Class
        duck.eat(); // Non-Abstract Method and Abstract Class

        Duck donald = new Duck();
        donald.makeSound(); // Overriding Method from Abstract Method and Class

        Animal pig = new Pig(); // Upcasting
        pig.makeSound(); // Abstract Method and Class
        pig.eat(); // Non-Abstract Method and Abstract Class

        Pig peppa = new Pig();
        peppa.makeSound(); // Overriding Method from Abstract Method and Class
    }
}
