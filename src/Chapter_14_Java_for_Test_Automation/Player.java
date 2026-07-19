package Chapter_14_Java_for_Test_Automation;
/* Exercise 11 - Coin Toss Game:
Second Class - Create a Player class which has the following:
• fields called name and guess
• encapsulation
• a constructor which accepts name
*/

public class Player {

    // fields called name and guess
    private String name;
    private String guess;

    // Getters and Setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    // A constructor which accepts name
    public Player(String name){
       setName(name);
    }
}
