import java.util.*;

public class User {
    protected String name;
    protected LinkedList<Card> hand;
    protected LinkedList<Integer> playableCache;

    public User(String name) {
        this.name = name.toUpperCase();
        this.hand = new LinkedList<Card>();
    }

    public String getName() {
        return name;
    }

    public int getHandSize() {
        return hand.size();
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void showHand() {
        ;
    }

    public boolean isHandEmpty() {
        return hand.isEmpty();
    }

    public boolean isPossibleToPlay(Card facedUp) {

        if (playableCache.size() > 0) {
            return true;
        }
        return false;
    }

    public void calculatePlayableCards(Card facedUp) {
        playableCache = new LinkedList<Integer>();
        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).rankEquals(facedUp) || hand.get(i).suitEquals(facedUp)) {
                playableCache.add(i);
            }
        }
    }

    public Card play() {
        Collections.shuffle(playableCache);
        int index = playableCache.getFirst();
        Card rem = hand.remove(index);
        return rem;
    }
}
