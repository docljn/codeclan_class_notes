package example.docljn.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lornanoble on 24/01/2018.
 */

class Game {
    private final ArrayList<String> choices;
    private String computerHand;
    private String playerHand;
    private int playerScore;
    private int computerScore;

    public Game() {
        choices = new ArrayList<>();
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");

        this.computerHand = null;
        this.playerHand = null;
        this.playerScore = 0;
        this.computerScore = 0;
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }

    public void setComputerHand(String choice) {
        this.computerHand = choice;
    }

    public void setPlayerHand(String choice) {
        this.playerHand = choice;
    }

    public String getComputerHand() {
        return this.computerHand;
    }

    public String getPlayerHand(){
        return this.playerHand;
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public int getComputerScore() {
        return this.computerScore;
    }

    public String getRandomChoice(){
        Collections.shuffle(choices);
        return choices.get(0);
    }



    public String getResult() {

        String result = playerHand + computerHand;

        if (playerHand.equals(computerHand)) {
            this.playerScore += 1;
            this.computerScore += 1;
            return "Draw";
        } else if (result.equals("ScissorsPaper")) {
            this.playerScore += 1;
            return "Player Wins";
        } else if (result.equals("RockScissors")) {
            this.playerScore += 1;
            return "Player Wins";
        } else if (result.equals("PaperRock")) {
            this.playerScore += 1;
            return "Player Wins";
        } else {
            this.computerScore += 1;
            return "Computer Wins";
        }
    }


    public String play(String playerChoice) {
        this.setPlayerHand(playerChoice);
        this.setComputerHand(this.getRandomChoice());
        return this.getResult();
    }
}




