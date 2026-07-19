package Chapter_3_Decision_Structures;

import java.util.Scanner;

/*
IF Statement:
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/
public class SalaryCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //2. Get values for unknown
        System.out.println("How many sales did the employee make this week?");
        int sales = scanner.nextInt();
        scanner.close();

        //3. Quick detour from the bonus earners
        if (sales > quota){
            salary = salary + bonus;
        }

        //4. Calculate Salary - Output
        System.out.println("The employee's pay is $" + salary);
    }
}
