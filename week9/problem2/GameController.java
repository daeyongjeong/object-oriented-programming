import java.util.ArrayList;
import java.util.Random;

public class GameController {
    private static final int MAX_PLAYERS = 3;
    private static final int STARTER_CARDS = 5;

    private GameView view = new GameView();

    private Player[] players = new Player[MAX_PLAYERS];
    private Deck deck = new Deck();
    private Card cardOnTable;
    private int activePlayer = 0;

    public GameController() {
        init();
        play();
        endGame();
    }

    private void init() {
        initPlayers();
        view.showDeckShuffleMessage();
        sleep();

        startingDraw();
        view.showStartingDrawMessage(STARTER_CARDS);
        sleep();

        cardOnTable = deck.draw();
        view.showDrawCardOnTableMessage();
        sleep();

        deck.shuffle();
        view.showDeckShuffleMessage();
        sleep();
    }

    private void sleep() {
        try {
            Thread.sleep(1000); // for slow down game speed
        } catch (InterruptedException e) {
        }
    }

    private void initPlayers() {
        players[0] = new Player("USER", PlayerType.USER);
        players[1] = new Player("COM1", PlayerType.COM);
        players[2] = new Player("COM2", PlayerType.COM);
    }

    private void startingDraw() {
        for (int i = 0; i < STARTER_CARDS; i++) {
            for (Player player : players) {
                player.add(deck.draw());
            }
        }
    }

    private void play() {
        while (gameNotFinished()) {
            playTurn(players[activePlayer]);
            activePlayer++;
            activePlayer %= MAX_PLAYERS;
            sleep();
        }
    }

    private boolean gameNotFinished() {
        for (Player player : players) {
            if (player.isHandEmpty()) {
                return false;
            }
        }
        return true;
    }

    private void playTurn(Player player) {
        view.showWhosTurn(player.getName());
        view.showCard(cardOnTable);
        view.showHandSize(player.getHandSize());

        CardCollection playableCards = getPlayableCards(player, cardOnTable);

        if (playableCards.isEmpty()) {
            draw(player);
        } else {
            play(player, playableCards);
        }
    }

    private void draw(Player player) {
        player.add(deck.draw());
        view.showPlayerDrawMessage(player.getName());
    }

    private void play(Player player, CardCollection playableCards) {
        deck.add(cardOnTable);
        Card card = getNextPlayCard(player, playableCards);
        player.playCard(card);
        cardOnTable = card;
        view.showPlayerPlayMessage(player.getName(), card);
    }

    private Card getNextPlayCard(Player player, CardCollection playableCards) {
        CardCollection hand = player.getHand();
        Card nextPlayCard;

        if (player.getPlayerType().isPlayerType(PlayerType.USER)) {
            view.showHandWithPlayableCard(hand, playableCards);
        } // show once

        while (true) {
            int index = 0;
            if (player.getPlayerType().isPlayerType(PlayerType.USER)) {
                index = view.promptNextPlayCardIndex(player, playableCards);
            } else {
                Random random = new Random();
                index = random.nextInt(player.getHandSize());
            }

            if (index >= 0 && index < player.getHandSize()) {
                nextPlayCard = player.getCard(index);
                if (playableCards.contains(nextPlayCard)) {
                    return nextPlayCard;
                }
            }
        }
    }

    private CardCollection getPlayableCards(Player player, Card reference) {
        CardCollection playableCards = new CardCollection();
        for (Card card : player.getHand()) {
            if (card.getRank().equals(reference.getRank()) || (card.getSuit().equals(reference.getSuit()))) {
                playableCards.add(card);
            }
        }
        return playableCards;
    }

    private void endGame() {
        int[] rankings = new int[MAX_PLAYERS];
        for (int i = 0; i < MAX_PLAYERS; i++) {
            rankings[i] = 1;
            for (int j = 0; j < MAX_PLAYERS; j++) {
                if (players[i].getHandSize() > players[j].getHandSize()) {
                    rankings[i]++;
                }
            }
        }

        ArrayList<String> firstWinnerNames = new ArrayList<String>();
        ArrayList<String> secondWinnerNames = new ArrayList<String>();
        for (int i = 0; i < MAX_PLAYERS; i++) {
            if (rankings[i] == 1) {
                firstWinnerNames.add(players[i].getName());
            } else if (rankings[i] == 2) {
                secondWinnerNames.add(players[i].getName());
            }
        }

        view.showFirstWinner(firstWinnerNames);
        view.showSecondWinner(secondWinnerNames);
        view.showCongratulations();
    }
}
