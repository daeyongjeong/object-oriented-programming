public class CardGame {
    private Deck deck;
    private User[] users;
    private Card facedUp;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";
    private static int USERS = 3;
    private static int INITIAL_CARDS = 5;

    public CardGame() {
        init();
        playing();
        result();
    }

    private void init() {
        constructDeck();
        constructUsers();
        startingDraw();
        faceUpCard();
    }

    private void constructDeck() {
        deck = new Deck();
    }

    private void constructUsers() {
        users = new User[USERS];
        users[0] = new Player("Player");

        for (int i = 1; i < USERS; i++) {
            users[i] = new User("Com" + i);
        }
    }

    private void startingDraw() {
        for (int i = 0; i < INITIAL_CARDS; i++) {
            for (User user : users) {
                user.draw(deck);
            }
        }
    }

    private void faceUpCard() {
        facedUp = deck.draw();
    }

    private void playing() {
        int i = 0;
        while (!isHandEmpty()) {
            turn(users[i]);
            i = (i + 1) % USERS;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean isHandEmpty() {
        for (User user : users) {
            if (user.isHandEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void turn(User user) {
        System.out.print(ConsoleColors.WHITE_BOLD);
        System.out.println(user.getName().toUpperCase() + " TURN");
        System.out.print(ConsoleColors.RESET);
        System.out.println("- Faced-up card: " + facedUp.toString());
        System.out.println("- " + user.getHandSize() + " card(s) left");
        user.calculatePlayableCards(facedUp);
        user.showHand();

        if (user.isPossibleToPlay(facedUp)) {
            deck.addLast(facedUp);
            facedUp = user.play();
            System.out.println(user.getName().toUpperCase() + " played " + facedUp.toString());
        } else {
            user.draw(deck);
            System.out.println(user.getName().toUpperCase() + " drew a card");
        }
        System.out.println();
    }

    private void result() {

    }
}
