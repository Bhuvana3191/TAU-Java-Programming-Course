package Chapter_7_Arrays;
/* Useful Tricks for Arrays:
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

import java.util.Scanner;

public class Grades {
    // Initialize Arrays
    private static int[] grades;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args){
        // Ask a user to enter any number of grades
        System.out.println("How many grades would you like to enter?");
        grades = new int[SCANNER.nextInt()];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());

        SCANNER.close();

    }

    // Ask a user to enter any number of grades
    public static void getGrades(){
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades [i] = SCANNER.nextInt();
        }
    }

    // Method for calculating sum of the grades
    public static int calculateSum(){
        int sum = 0;
        for (int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    // Method for calculating Average Score
    public static double calculateAverage(){
        return (double) calculateSum() /grades.length;
    }

    // Method for calculating highest score
    public static int getHighest(){
        int highest = grades[0];
        for (int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    // Method for calculating lowest score
    public static int getLowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

}
