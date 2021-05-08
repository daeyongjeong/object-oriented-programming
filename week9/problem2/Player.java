import java.util.*;

public class Player extends User {
    public Player(String name) {
        super(name);
    }

    public void showHand() {
        System.out.println("- Hand");
        int index = 0;
        for (int i = 0; i < hand.size(); i++) {
            if (index < playableCache.size() && i == playableCache.get(index)) {
                System.out.print(ConsoleColors.BLUE);
                System.out.println("  [" + i + "] " + hand.get(i).toString());
                System.out.print(ConsoleColors.RESET);
                index++;
            } else {
                System.out.println("  [" + i + "] " + hand.get(i).toString());
            }
        }
    }

    @Override
    public Card play() {
        int index = 0;

        if (playableCache.size() > 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type index for play card.");
            System.out.print(">>> ");

            index = sc.nextInt();

            while (!playableCache.contains(index)) {
                System.out.print(">>> ");
                index = sc.nextInt();
            }
        }

        Card rem = hand.remove((int) playableCache.get(index));
        return rem;
    }
}
