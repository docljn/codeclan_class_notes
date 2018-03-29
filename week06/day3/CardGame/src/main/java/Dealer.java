public class Dealer {
    Deck deck;
    String name;

    public Dealer(String name, Deck deck){
        this.name = name;
        this.deck = deck;
    }


    public Deck getDeck() {
        return this.deck;
    }

    public void dealCard(Player player) {
        Card card = this.deck.removeCard();
        player.acceptCard(card);
    }
}
