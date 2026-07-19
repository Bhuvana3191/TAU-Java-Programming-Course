package Chapter_9_Inheritance;
/* Chapter 9c - Overriding & Overloading Methods:
 *  Superclass
 *  InheritanceTester class acts as a main class
 */

public class Rectangle {

    protected double length;
    protected double width;
    protected double sides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    // Override a Method - Exact same signature but change the body
    protected double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    // Overloading Method
    public void print(){
        System.out.println("I am a rectangle");
    }

}
