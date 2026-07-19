package Chapter_6_Classes_And_Objects;

/* Chapter-6a : Classes & Objects (General Class and Used as definition. It csn be used in other classes):
Write a class that describes the fields and methods of a rectangle.
Write another class that creates instances of the Rectangle class to find the total area of two rooms in a house.
*/

public class Rectangle {

    // Set Global Variables or Fields
    private double length;
    private double width;

    // Set Default Constructor
    public Rectangle(){ // Name a constructor as same class name
        length = 0;
        width = 0;
    }

    // Set Another Constructor with Parameters - Multiple Constructor
    public Rectangle(double length, double width){ // This "length" and "width" is different from Global Variable "length" and "width"
        this.length = length; // Can be set this way
        setWidth(width); // Or Can be set this way. these are only different here to demo alternative options
    }

    // Getter and Setter Methods for each of the fields - Both Length & Width
    public double getLength(){
        return length;
    }

    public void setLength(double length){ // This "length" is different from Global Variable "length"
        this.length = length;
    }

    public double getWidth(){ // This "width" is different from Global Variable "width"
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // Methods for calculating Perimeter and Area of a Rectangle
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
