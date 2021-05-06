public class Card {
    public CardType type;
    public int number;

    public Card(CardType type, int number) {
        this.type = type;
        this.number = number;
    }

    public String toString() {
        return String.format("%s %d", type.toString(), number);
    }
}
