package Chapter_9_Inheritance;
/* Chapter 9a & 9b - Inheritance & Constructors in Inheritance and Chapter 9c - Overriding & Overloading Methods::
*  InheritanceTester class acts as a main class
*/

public class InheritanceTester {

    public static void main(String[] args){
        /*
        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Square"); // Overloading Method
        */

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());

    }
}
