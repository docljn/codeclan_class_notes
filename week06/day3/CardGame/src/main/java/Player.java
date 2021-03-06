import java.util.ArrayList;

public class Player {

    ArrayList<Card> hand;
    String name;

    public Player(String name){

        this.hand = new ArrayList<>();
        this.name = name;

    }


    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void acceptCard(Card card) {
        this.hand.add(card);
    }

    public int getHandScore() {

        Integer handScore = 0;
        for(Card card: hand){
            handScore = handScore + card.getRank().getValue();
        }

        return handScore;
    }
}
