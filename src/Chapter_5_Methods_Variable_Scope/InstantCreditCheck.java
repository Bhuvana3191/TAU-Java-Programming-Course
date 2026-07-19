package Chapter_5_Methods_Variable_Scope;
/*
VARIABLE SCOPE:
Write an 'instant credit check' program that approves
anyone who makes more than $25,000 and has a credit score
of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);

    //1. Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

   public static void main(String[] args){


        //2. Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();


        //3. Check if the user is qualified
        boolean qualified = isUserQualified(creditScore,salary);

        //4. Notify the user
        notifyUser(qualified);
    }

    //2. Get what we don't know
    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
   }

   //2. Get what we don't know
   public static int getCreditScore(){
       System.out.println("Enter your credit score:");
       int creditScore = scanner.nextInt();
       return creditScore;
   }

    //3. Check if the user is qualified
    public static boolean isUserQualified(int creditScore, double salary){
       if(creditScore >= requiredCreditScore && salary >= requiredSalary){
           return true;
       }else {
           return false;
       }
    }

    //4. Notify the user
    public static void notifyUser(boolean isQualified){
       if(isQualified){
           System.out.println("Congrats! You've been approved");
       }else {
           System.out.println("Sorry, You've been declined");
       }
   }
}
