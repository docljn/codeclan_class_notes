import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Deck deck;
    Dealer dealer;
    Player player;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer("James", deck);
        player = new Player("Eric");
    }

    @Test
    public void hasCards() {
        assertEquals(52, dealer.getDeck().getCardDeck().size());
    }

    @Test
    public void canDealCard(){
        dealer.dealCard(player);
        assertEquals(1, player.getHand().size());
        assertEquals(51, dealer.getDeck().getCardDeck().size() );

    }
}
