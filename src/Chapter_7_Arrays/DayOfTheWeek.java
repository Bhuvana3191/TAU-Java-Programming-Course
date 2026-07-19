package Chapter_7_Arrays;
/* Exercise 6 : Day of the Week
• Make an array that holds the textual values of the days of the week
• Have the user input a number corresponding to the day of the week
  Assume the week starts on Monday.
• Your program should output the String that represents the day of
  week
• Example: User inputs the number 1, your program should print
  "Monday"
*/

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args){
        // Create an array that holds the textual values of the days of the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        /* Get the user input a number corresponding to the day of the week
           Assume the week starts on Monday.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for the day of the week:");
        int index = scanner.nextInt();
        scanner.close();

        System.out.println("Corresponding day: " + days[index-1]);
    }
}
