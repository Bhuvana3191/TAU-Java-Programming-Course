package Chapter_3_Decision_Structures;

import java.util.Scanner;

/*
IF-ELSE-IF statement:
Display the letter grade for a student based on their test score.
*/
public class TestResults {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Get the test score
        System.out.println("Enter your test score:");
        double score = scanner.nextDouble();

        scanner.close();

        //2. Determine the letter grade
        char grade;

        //3. Make decision - Output
        if (score < 60){
            grade = 'F';
        }
        else if (score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
