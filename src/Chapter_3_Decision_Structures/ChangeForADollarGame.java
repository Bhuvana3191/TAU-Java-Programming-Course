package Chapter_3_Decision_Structures;

import java.util.Scanner;
/*
Exercise 2 : Change for a Dollar Game:
The objective of the game is to enter enough change to equal exactly $1!
Create a program that asks a user to enter the quantities for the following coins:
pennies, nickels, dimes, and quarters.
Your program should count up the value of all the change.
If it's exactly $1, they win! If it's more than $1,
tell them by how much they went over. If it's less than $1,
tell them by how much they went under.
Feel free to change the game for your country's currency!
*/
public class ChangeForADollarGame {

    public static void main(String[] args){
        int dollar = 1;
        int cents = 100;
        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Change for a Dollar Game!, " +
                "Your goal is to enter enough change to make exactly $1!");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        int dollartocents = dollar * cents; // $1 is 100 cents
        int totalcents = (numOfPennies * penny) + (numOfNickels * nickel) + (numOfDimes * dime) + (numOfQuarters * quarter);

        //Make Decision - Output
        if (totalcents < dollartocents) {
            int amountShort = dollartocents - totalcents;
            System.out.println("Sorry, you lose! You were short " + amountShort + " cents.");
        } else if (totalcents > dollartocents) {
            int amountOver = totalcents - dollartocents;
            System.out.println("Sorry, you lose! You were over " + amountOver + " cents.");
        }else {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }


    }
}
