public class Card {
    private Suit suit;
    private int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public boolean suitEquals(Card card) {
        if (card.getSuit() == this.suit) {
            return true;
        }
        return false;
    }

    public boolean rankEquals(Card card) {
        if (card.getRank() == this.rank) {
            return true;
        }
        return false;
    }

    public boolean equals(Card card) {
        if (suitEquals(card) && rankEquals(card)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %d", suit.toString(), rank);
    }
}
