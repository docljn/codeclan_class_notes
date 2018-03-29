import static org.junit.Assert.*;
        import org.junit.*;
/*

public class CardTest {

Card card;

@Before
public void before(){
card = new Card("Hearts");
}

@Test
public void canGetSuit(){
assertEquals("Hearts",card.getSuit());
}

If we want to limit the suits to the generally accepted ones, then using a string as the parameter is not going to work
A string can be anything, c.f. passing test below with Hearts spelled wrong.

Enums will let you specify an accepted value such that the compiler will catch the error, where the test won't.

@Test
public void canMissSpellSuit(){
Card missSpelled = new Card("Heates");
assertEquals("Heates", missSpelled.getSuit());
}
}


Enums will let you specify an accepted value such that the compiler will catch the error, where the test won't.
c.f. errorring test below with SPADES spelled wrong.

    @Test
    public void canMissSpellSuit(){
        Card missSpelled = new Card(Suit.SPADESS);
        assertEquals(Suit.SPADESS, missSpelled.getSuit());
    }

*/


public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() { assertEquals(Rank.ACE, card.getRank()); }

    @Test
    public void jackValueIs11(){
        card = new Card(Suit.CLUBS, Rank.JACK);
        int value = card.getRank().getValue();
        assertEquals(11, value);
    }

    @Test
    public void canGetAllSuits(){
        Suit[] suits = Suit.values();
//        declares a primitive array
//        CARE: java uses {} to declare an array literal
        Suit[] expected = {Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS, Suit.SPADES};
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);


//        String somestring; (somestring is a string: has been declared to be a string)
//        "string" is a string literal


    }


}