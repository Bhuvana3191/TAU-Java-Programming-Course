package Chapter_14_Java_for_Test_Automation;
/* Exercise 11 - Coin Toss Game:
First Class - Create a Coin class which has the following:
• a field called side
• encapsulation
• constant variables for heads and tails
• a method called flip which randomly chooses heads or tails and assigns the value to side
*/

import java.util.Random;

public class Coin {

    // A field called side
    private String side;

    // Constant Variables
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    // Getters and Setters for encapsulation
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    // Method to randomly choose heads or tails
    public String flip(){
        Random random = new Random();

        if (random.nextBoolean()){
            setSide(HEADS);
        }else {
            setSide(TAILS);
        }

        return getSide();
    }
}
