package Chapter_6_Classes_And_Objects;

/* Chapter-6b : Instantiating Objects:
Write a class that describes the fields and methods of a rectangle.
Write another class that creates instances of the Rectangle class to find the total area of two rooms in a house.
*/

public class HomeAreaCalculator {

    public static void main(String[] args){

        /*
        * RECTANGLE 1
        */

        //Create Instance of Rectangle Class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /*
         * RECTANGLE 2
         */

        //Create Instance of Rectangle Class
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        // Calculate total area of both rooms
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
