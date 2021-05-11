public enum Suit {
    CLUB, DIAMOND, HEART, SPADE;

    public boolean isSuit(Suit suit) {
        if (this == suit) {
            return true;
        }
        return false;
    }
}
