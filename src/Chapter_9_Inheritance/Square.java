package Chapter_9_Inheritance;
/* Chapter 9c - Overriding & Overloading Methods:
 *  Subclass
 *  InheritanceTester class acts as a main class
 */

public class Square extends Rectangle {

    // Override a Method - Exact same signature but change the body
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    // Overloading Method
    public void print(String what){
        System.out.println("I am a "+ what);
    }
}
