import java.util.*;

public class DotComBust {
    private final int maxGuesses = 60;
    private int numOfGuesses = 0;
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    /* Randomly create 3~5 DotCom and add them to dotComsList */
    public void setupGame() {
        int numOfDotCom = (int) (Math.random() * 2 + 3);
        for (int i = 0; i < numOfDotCom; i++) {
            DotCom dc = new DotCom();
            dotComsList.add(dc);
        }
    }

    /* Traverse dotComsList and checks with userGuess */
    private void checkUserGuess(String userGuess) {
        String result = "miss";

        for (Iterator<DotCom> iter = dotComsList.iterator(); iter.hasNext();) {
            String iterResult = iter.next().check(userGuess);
            if (iterResult == "kill") {
                result = "kill";
                System.out.println(result);
                iter.remove();
            } else if (iterResult == "hit") {
                result = "hit";
                System.out.println(result);
            }
        }

        if (result == "miss") {
            System.out.println(result);
        }
    }

    /* Get an input and call checkUserGuess method while the game is in progress */
    public void startPlaying() {
        GameHelper helper = new GameHelper();

        while (dotComsList.size() > 0 && numOfGuesses < maxGuesses) {
            System.out.println();
            String userGuess = helper.getUserInput("Enter a number: ");
            checkUserGuess(userGuess);
            numOfGuesses++;
            System.out.println("You have " + (maxGuesses - numOfGuesses) + " guesses left.");
        }
    }

    /* Print a message after the game is over */
    public void finishGame() {
        System.out.println();
        if (numOfGuesses < maxGuesses) {
            System.out.println("Congratulations! You win the game!");
        } else {
            System.out.println("Too many guesses, You lose!");
        }
    }

}
