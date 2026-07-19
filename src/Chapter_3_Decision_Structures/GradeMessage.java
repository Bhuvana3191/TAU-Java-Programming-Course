package Chapter_3_Decision_Structures;

import java.util.Scanner;

/*
SWITCH Statement:
Have a user enter their letter grade, and using a switch statement,
print out a message letting them know how they did.
*/
public class GradeMessage {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Get the values of letter grade
        System.out.println("Enter your letter grade:");
        String grade = scanner.next();
        scanner.close();

        String message;

        //2. Make decision - Output
        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need work a bit harder";
                break;
            case "F":
                message = "uh-oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println(message);

    }
}
