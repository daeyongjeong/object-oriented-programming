public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean equals(Card card) {
        if (this.rank.equals(card.getRank()) && this.suit.equals(card.getSuit())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %d", suit.toString(), rank.getRank());
    }
}
