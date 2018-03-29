public class Card {

    private Suit suit;
    private Rank rank;
//    the type is an enum, rather than a class

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }
}