public enum Rank {
    DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

    private int rank;

    Rank(int points) {
        this.rank = points;
    }

    public boolean isRank(Rank rank) {
        if (this == rank) {
            return true;
        }
        return false;
    }

    public int getRank() {
        return rank;
    }
}
