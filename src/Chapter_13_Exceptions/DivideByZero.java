package Chapter_13_Exceptions;
/* Exercise 11 - Dividing By Zero:
• Write the following statement and execute:
        int c = 30/0;
• Update program to handle exception.
• Print a statement after division to say "Division is fun".
This statement should be outputted no matter what.
*/

public class DivideByZero {

    public static void main(String[] args){
        // Try-Catch-Finally Block
        try{
            int c = 30/0;
        }catch (Exception e){
            e.printStackTrace(); // Traces the error
            System.out.println("Dividing by Zero is not permitted");
        }finally {
            System.out.println("Division is fun");
        }
    }
}
