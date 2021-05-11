import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CardCollection implements Iterable<Card> {
    private List<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        cards.add(card);
    }

    public boolean contains(Card card) {
        return cards.contains(card);
    }

    public boolean containsCard(Card card) {
        if (card == null) {
            return false;
        }
        for (Card other : cards) {
            if (other.equals(card)) {
                return true;
            }
        }
        return false;
    }

    public Card get(int index) {
        return cards.get(index);
    }

    public int getCount() {
        return cards.size();
    }

    // TODO
    /*
     * public Card getRandom() { if (cards.isEmpty()) { return null; } return
     * cards.get(//RANDOM); }
     */

    public boolean hasCardOfType(Suit suit) {
        for (Card card : cards) {
            if (card.getSuit().equals(suit)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    public boolean remove(Card card) {
        return cards.remove(card);
    }

    public void removeAll() {
        cards.clear();
    }

    public Card removeFirst() {
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /*
     * public void sort() { cards.sort((card1, card2) ->
     * card1.getName().compareTo(card2.getName())); }
     */

    public List<Card> toList() {
        return new ArrayList<>(cards);
    }
}
