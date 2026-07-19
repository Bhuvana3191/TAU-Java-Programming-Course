package Chapter_10_Polymorphism;
// Polymorphism

public class Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch(); // Casting
        feed(sasha);
    }

    public static void feed(Animal animal){

        // instanceof operator
        if (animal instanceof Dog){
            System.out.println("Here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }
    }
}
