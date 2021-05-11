public class Player {
    private CardCollection hand = new CardCollection();
    private String name;
    private PlayerType type;

    public Player(String name, PlayerType type) {
        this.name = name;
        this.type = type;
    }

    public void add(Card card) {
        hand.add(card);
    }

    public Card getCard(int index) {
        return hand.get(index);
    }

    public CardCollection getHand() {
        return hand;
    }

    public int getHandSize() {
        return hand.getCount();
    }

    public String getName() {
        return name;
    }

    public PlayerType getPlayerType() {
        return type;
    }

    public boolean isHandEmpty() {
        return hand.isEmpty();
    }

    public Card playCard(int index) {
        Card card = getCard(index);
        return playCard(card);
    }

    public Card playCard(Card card) {
        hand.remove(card);
        return card;
    }
}
