import java.util.*;

public class Deck {
    private LinkedList<Card> deck;

    private static int RANK_LBOUND = 2;
    private static int RANK_RBOUND = 10;

    public Deck() {
        deck = generateDeck();
        shuffle();
    }

    private LinkedList<Card> generateDeck() {
        LinkedList<Card> deck = new LinkedList<Card>();

        for (Suit suit : Suit.values()) {
            for (int rank = RANK_LBOUND; rank <= RANK_RBOUND; rank++) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }

        return deck;
    }

    public Card draw() {
        return deck.remove();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void addLast(Card card) {
        deck.addLast(card);
    }
}
