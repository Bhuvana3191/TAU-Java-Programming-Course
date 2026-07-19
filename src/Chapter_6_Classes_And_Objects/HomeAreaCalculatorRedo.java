package Chapter_6_Classes_And_Objects;
/* Chapter-6c : Objects as Method Parameters & Return Types:
Write a class that describes the fields and methods of a rectangle.
Write another class that creates instances of the Rectangle class to find the total area of two rooms in a house.
*/

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private final Scanner SCANNER = new Scanner(System.in); // Constant or Fixed value that cannot be changed

    public static void main(String[] args){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.SCANNER.close();

    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = SCANNER.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = SCANNER.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();

    }
}
