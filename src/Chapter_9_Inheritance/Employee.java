package Chapter_9_Inheritance;
/* Chapter 9a & 9b - Inheritance & Constructors in Inheritance:
* Employee class is serving as a Subclass
*/

public class Employee extends Person {

    private String employeeId;
    private String title;

    // Default Constructor
    public Employee(){
        super("angie"); // call this from Superclass - Person Constructor
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
