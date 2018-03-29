import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cardDeck;
    Card card;
    Suit[] allSuits;
    Rank[] allRanks;

    public Deck(){
        this.cardDeck = new ArrayList<>();
        fillDeck();
    }


    public ArrayList<Card> getCardDeck() {
        return this.cardDeck;
    }

    private void fillDeck() {
        Suit[] allSuits = Suit.values();
        Rank[] allRanks = Rank.values();


        for (Suit suit: allSuits){
            for (Rank rank: allRanks) {
                Card newCard = new Card(suit, rank);
                this.cardDeck.add(newCard);
            }
        }
        shuffleDeck();

    }

    private void shuffleDeck() {
        Collections.shuffle(this.cardDeck);
    }

    public Card removeCard() {
//        might need to add logic to check there are enough cards to deal
//        either here, or in the dealer class....
        return this.cardDeck.remove(0);
    }
}
