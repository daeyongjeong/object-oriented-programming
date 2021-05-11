import java.util.ArrayList;
import java.util.Scanner;

public class GameView {
    public int promptNextPlayCardIndex(Player player, CardCollection playableCards) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Type index for play card.");
            System.out.print(">>> ");
            try {
                int index = sc.nextInt();
                return index;
            } catch (Exception e) {
                sc = new Scanner(System.in);
            }
        }
    }

    public void showCard(Card card) {
        System.out.print("- Card on Table: ");
        System.out.print(ConsoleColors.YELLOW);
        System.out.print(card.toString());
        System.out.println(ConsoleColors.RESET);
    }

    public void showCongratulations() {
        System.out.println("Congratulations!");
        System.out.println();
    }

    public void showDeckShuffleMessage() {
        System.out.println("Shuffle deck...");
    }

    public void showDrawCardOnTableMessage() {
        System.out.println("Face up card on table...");
    }

    public void showFirstWinner(ArrayList<String> firstWinnerNames) {
        System.out.print(ConsoleColors.WHITE_BOLD);
        System.out.print("FIRST WINNER");
        System.out.println(ConsoleColors.RESET);
        for (String string : firstWinnerNames) {
            System.out.println("- " + string);
        }
        System.out.println();
    }

    public void showHandSize(int size) {
        System.out.println("- " + size + " card(s) left");
    }

    public void showHandWithPlayableCard(CardCollection hand, CardCollection playableCards) {
        System.out.println("- Hand");

        int index = 0;
        for (Card card : hand) {
            if (playableCards.contains(card)) {
                System.out.print(ConsoleColors.YELLOW);
            } else {
                System.out.print(ConsoleColors.RESET);
            }
            System.out.printf("  [%d] %s\n", index, card.toString());
            index++;
        }
        System.out.print(ConsoleColors.RESET);
    }

    public void showPlayerDrawMessage(String name) {
        System.out.println(name.toUpperCase() + " drew a card");
    }

    public void showPlayerPlayMessage(String name, Card card) {
        System.out.println(name.toUpperCase() + " played " + card.toString());
    }

    public void showSecondWinner(ArrayList<String> secondWinnerNames) {
        System.out.print(ConsoleColors.WHITE_BOLD);
        System.out.print("SECOND WINNER");
        System.out.println(ConsoleColors.RESET);
        for (String string : secondWinnerNames) {
            System.out.println("- " + string);
        }
        System.out.println();
    }

    public void showStartingDrawMessage(int number) {
        System.out.println("Draw " + number + " starting cards...");
    }

    public void showWhosTurn(String name) {
        System.out.println(ConsoleColors.WHITE_BOLD);
        System.out.print(name.toUpperCase() + " TURN");
        System.out.println(ConsoleColors.RESET);
    }
}
