import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    Player player2;
    Game game_with_players;
    Card card_lose;
    Card card_win;


    @Before
    public void before() {
        game = new Game(2);
        player = new Player("Jeeves");
        player2 = new Player( "Bertie");
        game_with_players = new Game(2);
        game_with_players.addPlayer(player);
        game_with_players.addPlayer(player2);
        card_lose = new Card(Suit.HEARTS, Rank.ACE);
        card_win = new Card(Suit.CLUBS, Rank.TEN);
    }

    @Test
    public void gameStartsWithNoPlayers(){
        assertEquals(0, game.getPlayerCount());
    }

    @Test
    public void gameCanTakePlayers(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayerCount());
    }

    @Test
    public void playerNumberCannotExceedNumberPlaying(){
        for(int i = 0; i < 3; i++){
            game.addPlayer(player);
        }
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void gameReturnsStatus(){
        assertEquals(false, game.readyToPlay());
    }

    @Test
    public void gameDealsRound(){
        game_with_players.dealCards();
        assertEquals(1, player.getHand().size());
    }

    @Test
    public void gameRecordsScores(){
        player.acceptCard(card_lose);
        player2.acceptCard(card_win);
        Integer expected = 10;
        assertEquals(expected, game_with_players.recordScores().get(player2));
    }

    @Test
    public void gameCanBeWon(){
        player2.acceptCard(card_win);
        player2.acceptCard(card_win);
        game_with_players.dealCards();
        game_with_players.checkForWinner();
        assertEquals(true, game_with_players.isWon());
    }





    @Test
    public void gameCalculatesWinner(){
        player.acceptCard(card_lose);
        player2.acceptCard(card_win);
        assertEquals(player2, game_with_players.getWinner());

    }


//    @Test
//    public void gamePlaysUntilWon(){
//        game_with_players.play();
//        assertEquals(true, game_with_players.isWon());
//
//
//    }






}
