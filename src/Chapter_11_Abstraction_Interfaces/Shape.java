package Chapter_11_Abstraction_Interfaces;
/*
Chapter-11a : Abstraction
*/

public abstract class Shape {

    abstract double calculateArea(); // An Abstract Method should be inside a Abstract Class

    public void print(){
        System.out.println("I am a shape");
    }
}
