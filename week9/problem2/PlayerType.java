public enum PlayerType {
    USER, COM;

    public boolean isPlayerType(PlayerType type) {
        if (this == type) {
            return true;
        }
        return false;
    }
}
