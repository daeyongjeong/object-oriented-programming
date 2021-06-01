import java.util.Arrays;
import java.util.Collections;

public class Wordbook {
    String[] words = new String[20];
    int index = -1;

    public Wordbook() {
        for (int i = 0; i < 20; i++) {
            words[i] = "";
        }
    }

    public void printInAscending() {
        if (index == -1) {
            System.out.println("Wordbook is empty.");
        } else {
            Arrays.sort(words);
            for (int i = 20 - index - 1; i < 20; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }
    }

    public void printInDescending() {
        if (index == -1) {
            System.out.println("Wordbook is empty.");
        } else {
            Arrays.sort(words, Collections.reverseOrder());
            for (int i = 0; i <= index; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }
    }

    public void addWord(String w) {
        if (index + 1 < 20) {
            index++;
            words[index] = w;
        } else {
            System.out.println("Can't add a word, Wordbook is full.");
        }
    }

}
