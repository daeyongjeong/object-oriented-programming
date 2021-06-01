import java.util.ArrayList;
import java.util.Scanner;

public class CardGame {
    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> removed = new ArrayList<Card>();

    public CardGame() {
        Scanner sc = new Scanner(System.in);

        // create cardset
        System.out.println("Starting new game...");
        createCardset();

        // draw and calculate winning probability 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println("Press enter to draw a card:");
            sc.nextLine();
            System.out.println("Draw a card...");
            Card card = draw();
            Double p = calculateWinningProbability();
            System.out.println("Your card: " + card.toString());
            System.out.println("Current winning probability: " + p);
            System.out.println();
        }

        // game over
        printResult();
        sc.close();
    }

    private void createCardset() {
        for (CardType type : CardType.values()) {
            for (int num = 2; num <= 10; num++) {
                Card card = new Card(type, num);
                deck.add(card);
            }
        }
    }

    private Card draw() {
        int index = (int) (Math.random() * deck.size());
        Card card = deck.remove(index);
        removed.add(card);

        return card;
    }

    public double calculateWinningProbability() {
        int sum = 0;
        for (Card card : removed) {
            sum += card.number;
        }

        int p = 0;
        for (Card card : deck) {
            if (card.number + sum > 15) {
                p++;
            }
        }

        return (double) p / (double) deck.size();
    }

    private void printResult() {
        int sum = 0;
        for (Card card : removed) {
            sum += card.number;
        }

        if (sum > 15) {
            System.out.println(" You Win!");
        } else {
            System.out.println(" You Lose!");
        }
        System.out.println();
        System.out.println();
    }
}
