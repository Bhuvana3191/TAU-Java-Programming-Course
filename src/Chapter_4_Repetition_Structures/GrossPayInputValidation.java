package Chapter_4_Repetition_Structures;

import java.util.Scanner;

/*
WHILE LOOP:
Each store employee makes $15 an hour. Write a program that allows the employee
to enter the number of hours worked for the week. Do not allow overtime.
*/
public class GrossPayInputValidation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Initialize known variables
        int rate = 15;
        int maxHours = 40; // 5 days * 8 hours = 40

        //2. Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        double hoursWorked = scanner.nextDouble();

        //3. Validate input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //4. Calculate Gross Pay
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay: $" + gross);
    }
}

