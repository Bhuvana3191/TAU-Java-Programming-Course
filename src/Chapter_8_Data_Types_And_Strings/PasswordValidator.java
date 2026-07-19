package Chapter_8_Data_Types_And_Strings;
/*
Exercise 7 : Password Validator:
Validate the complexity of a proposed password by assuring it meets
these rules:
• at least 8 characters long
• contain an uppercase letter
• contain a special character
• not contain the username
• not the same as the old password
*/

import java.util.Scanner;

public class PasswordValidator {
    public static final Scanner SCANNER = new Scanner(System.in);

    private String username; // Variable to check whether the new password does not contain the username
    private String currentPassword; // Variable to check whether the new password does not the same as the old password

    private boolean valid; // Variable for setting true or false
    private String errorMessage; // Variable for printing the error messages

    public static void main(String[] args){
        var validator = login();
        validator.printPasswordRules();

        // Does or checks the validation and then while is executed - Keep asking until password is valid
        do {
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if (!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }while (!validator.isValid());

        System.out.println("The proposed password is valid");

        SCANNER.close();

    }

    // Constructor for username and current password - Global variables are different from the parameters given in the constructor
    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    // Getter Methods for Valid and Error Message
    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    // Method to get user input for username and password
    public static PasswordValidator login(){
        System.out.println("Enter your username:");
        String username = SCANNER.nextLine();

        System.out.println("Enter your password:");
        String password = SCANNER.nextLine();

        return new PasswordValidator(username, password);
    }

    // Method for printing Password Rules
    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println(); // for new line
    }

    // Method to get user input for new password
    public String getProposedPassword(){
        System.out.println("Enter your new password:");
        return SCANNER.nextLine();
    }

    // Method for Validating the new password rules
    public void changePassword(String newPassword){
        // Initial setting values for valid and error message variable
        valid = true;
        errorMessage = " ";

        // To check whether the password contains at least 8 characters - length of the string
        if (newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters."; // "\n" - new line
        }

        // To check whether the password includes an uppercase letter
        if (newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }

        // To check whether the password includes an special character
        if (newPassword.matches("[a-zA-z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }

        // To check whether the password doesn't contain username
        // Using toUpperCase() - Case-Insensitive Check and Both converted to same case before comparing
        if (newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }

        // To check whether the password doesn't contain old password
        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
    }

}
