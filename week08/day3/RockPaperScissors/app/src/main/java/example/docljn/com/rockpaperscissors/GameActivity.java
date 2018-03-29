package example.docljn.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game game;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game = new Game();
    }

    public void onRockButtonClicked(View button){
        result = game.play("Rock");
        this.displayResults();
    }

    public void onPaperButtonClicked(View button){
        result = game.play("Paper");
        this.displayResults();
    }

    public void onScissorsButtonClicked(View button){
        result = game.play("Scissors");
        this.displayResults();
    }



    public void displayResults(){
        TextView playerChoiceText = findViewById(R.id.player_choice_text);
        playerChoiceText.setText("Player chose " + game.getPlayerHand());

        TextView computerChoiceText = findViewById(R.id.computer_choice_text);
        computerChoiceText.setText("Computer chose " + game.getComputerHand());

        TextView resultText = findViewById(R.id.result_text);
        resultText.setText(result);

        TextView playerScore = findViewById(R.id.player_score);
        playerScore.setText("Player: " + game.getPlayerScore());

        TextView computerScore = findViewById(R.id.computer_score);
        computerScore.setText("Computer: " + game.getComputerScore());

    }


}
