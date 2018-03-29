import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;
    Card card2;

    @Before
    public void before(){
        player = new Player("Eric");
        card = new Card(Suit.HEARTS, Rank.QUEEN);
        card2 = new Card(Suit.CLUBS, Rank.FIVE);
    }

    @Test
    public void playerCanAcceptCard(){
        player.acceptCard(card);
        assertEquals(1, player.getHand().size());
    }

    @Test
    public void playerCanCalculateHandScore(){
        player.acceptCard(card);
        player.acceptCard(card2);
        assertEquals(17, player.getHandScore());
    }


}
