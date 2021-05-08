import java.util.Scanner;

public class App {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void printLogo() {
        System.out.println();
        System.out.println(" $$$$$$\\                            $$\\  $$$$$$\\                                     ");
        System.out.println(" $$  __$$\\                           $$ |$$  __$$\\                                   ");
        System.out.println(
                " $$ /  \\__| $$$$$$\\   $$$$$$\\   $$$$$$$ |$$ /  \\__| $$$$$$\\  $$$$$$\\$$$$\\   $$$$$$\\  ");
        System.out.println(
                " $$ |       \\____$$\\ $$  __$$\\ $$  __$$ |$$ |$$$$\\  \\____$$\\ $$  _$$  _$$\\ $$  __$$\\ ");
        System.out.println(" $$ |       $$$$$$$ |$$ |  \\__|$$ /  $$ |$$ |\\_$$ | $$$$$$$ |$$ / $$ / $$ |$$$$$$$$ |");
        System.out.println(" $$ |  $$\\ $$  __$$ |$$ |      $$ |  $$ |$$ |  $$ |$$  __$$ |$$ | $$ | $$ |$$   ____|");
        System.out.println(
                " \\$$$$$$  |\\$$$$$$$ |$$ |      \\$$$$$$$ |\\$$$$$$  |\\$$$$$$$ |$$ | $$ | $$ |\\$$$$$$$\\ ");
        System.out.println(
                "  \\______/  \\_______|\\__|       \\_______| \\______/  \\_______|\\__| \\__| \\__| \\_______|");
        System.out.println();
    }

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        while (true) {
            printLogo();
            System.out.println("Type \"1\" for new game, \"2\" for quit program.");
            System.out.print(">>> ");
            input = sc.nextInt();
            System.out.println();

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
