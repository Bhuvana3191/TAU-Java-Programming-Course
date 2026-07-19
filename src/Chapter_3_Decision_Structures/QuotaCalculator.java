package Chapter_3_Decision_Structures;

import java.util.Scanner;

/*
IF-ELSE Statement:
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Initialize the values we know
        int quota = 10;

        //2. Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        int sales = scanner.nextInt();

        scanner.close();

        //3. Make a decision on the path to take - Output
        if (sales >= 10){
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort +" sales short");
        }

    }
}
