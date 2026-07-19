package Chapter_3_Decision_Structures;

import java.util.Scanner;

/*
Logical Operators:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
*/
public class LogicalOperatorLoanQualifier {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Initialize the values we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //2. Get the unknown values
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //3. Make decision - Output
        if (salary >= requiredSalary && years >= requiredYearsEmployed){
            System.out.println("Congrats! You qualify for the loan");
        }
        else {
            System.out.println("Sorry, you must earn at least $"
                    + requiredSalary + " to qualify for the loan.");
        }

    }
}
