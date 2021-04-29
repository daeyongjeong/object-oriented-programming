import java.util.Scanner;

public class CardGameMain {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("******************");
            System.out.println(" Simple Card Game");
            System.out.println(" 1: New Game");
            System.out.println(" 2: Quit");
            System.out.println("******************");
            System.out.print("Command> ");

            input = sc.nextInt();
            switch (input) {
            case 1:
                new CardGame();
                break;
            case 2:
                sc.close();
                System.exit(0);
            default:
                break;
            }
        }
    }
}
