package Chapter_5_Methods_Variable_Scope;

/*
OUR FIRST METHOD:
Write a method that asks a user for their name, then greets them by name.
*/

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Ask a user for their name
        System.out.println("Enter your name:");
        String name = scanner.next();

        //3. Call Method inside main method
        greetUser(name);
    }

    //2.New Method to greet a user with their name
    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
