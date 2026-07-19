package Chapter_4_Repetition_Structures;

import java.util.Scanner;

/*
LOOP BREAK:
Search a String to determine if it contains the letter 'A'.
*/
public class LetterSearch {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Get text
        System.out.println("Enter some text:");
        String text = scanner.next();

        scanner.close();

        boolean letterFound = false;

        //2. Search text for letter 'A'/'a'
        for (int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){ // Check with a breakpoint to know how 'break' statement works
                letterFound = true;
                break;
            }
        }

        if (letterFound){
            System.out.println("This text contains the letter 'A'");
        }else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
