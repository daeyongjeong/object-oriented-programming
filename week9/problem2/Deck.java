public class Deck {
    private CardCollection cards = new CardCollection();

    public Deck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        cards.shuffle();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public Card draw() {
        return cards.removeFirst();
    }

    public void shuffle() {
        cards.shuffle();
    }
}
