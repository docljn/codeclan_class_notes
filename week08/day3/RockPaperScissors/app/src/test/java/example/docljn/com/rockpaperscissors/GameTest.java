package example.docljn.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by lornanoble on 24/01/2018.
 */

public class GameTest {


    private Game game;

    @Before
    public void before(){
    game = new Game();

    }

    @Test
    public void canGetChoices(){
        assertEquals("Rock", game.getChoices().get(0));
    }

    @Test
    public void canGetComputerHand(){
        game.setComputerHand("Rock");
        assertEquals("Rock", game.getComputerHand());
    }

    @Test
    public void drawWithTwoTheSame(){
        game.setPlayerHand("Rock");
        game.setComputerHand("Rock");
        assertEquals("Draw", game.getResult());
    }

    @Test
    public void playerWinsWithPaperAgainstRock(){
        game.setPlayerHand("Paper");
        game.setComputerHand("Rock");
        assertEquals("Player Wins", game.getResult());
    }

    @Test
    public void playerLosesWithScissorsAgainstRock(){
        game.setPlayerHand("Scissors");
        game.setComputerHand("Rock");
        assertEquals("Computer Wins", game.getResult());
    }

    @Test
    public void playerLosesWithPaperAgainstScissors(){
        game.setPlayerHand("Paper");
        game.setComputerHand("Scissors");
        assertEquals("Computer Wins", game.getResult());
    }


    @Test
    public void gameStartsWithZeroScores(){
        assertEquals(0, game.getPlayerScore());
        assertEquals(0, game.getComputerScore());
    }

    @Test
    public void winIncreasesScore(){
        game.setPlayerHand("Paper");
        game.setComputerHand("Scissors");
        game.getResult();
        assertEquals(1, game.getComputerScore());
    }

    @Test
    public void drawIncrementsBothScores(){
        game.setPlayerHand("Paper");
        game.setComputerHand("Paper");
        game.getResult();
        assertEquals(1, game.getComputerScore());
        assertEquals(1, game.getPlayerScore());
    }

    @Test
    public void playGameGeneratesResult(){
        assertNotNull(game.play("Rock"));
    }




}
