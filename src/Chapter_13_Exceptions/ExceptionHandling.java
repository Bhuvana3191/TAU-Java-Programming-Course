package Chapter_13_Exceptions;
/* 1. Chapter-13a - Exceptions:
Example 1:
• Write a program that creates a new file.
• Handle exceptions that may occur.
Example 2:
• Write a program that reads decimal numbers from a file.
• Handle exceptions FileNotFoundException and InputMismatchException
2. Chapter-13b - Throwing Exceptions:
• Write a program that creates a new file but does not catch the exceptions.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args){

//        createNewFile();
//        numbersExceptionHandling();
//          createNewFileRethrow();
    }

//    public static void createNewFile(){
//        File file = new File("resources/nonexistent.txt");
//
//        // Try-Catch Block
//        try {
//            file.createNewFile();
//        }catch (Exception e){
//            System.out.println("Directory does not exist.");
//            e.printStackTrace();
//        }
//    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

//    public static void numbersExceptionHandling(){
//        File file = new File("resources/numbers.txt");
//
//        // Try-Catch-Finally Block
//        try(Scanner fileReader = new Scanner(file)) {
//            while (fileReader.hasNext()){
//                double num = fileReader.nextDouble();
//                System.out.println(num);
//            }
//        }catch (FileNotFoundException | InputMismatchException e){
//            e.printStackTrace();
//        }
//        finally {
//            fileReader.close();
//        }
    }

