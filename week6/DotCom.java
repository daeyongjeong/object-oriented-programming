import java.util.*;

public class DotCom {
    private final int mapSize = 9;
    private final int cellSize = 4;
    private ArrayList<Point> points = new ArrayList<Point>();

    /* Randomly set the location and add points to points(List) */
    public DotCom() {
        int orientation = (int) (Math.random()); // 0 or 1
        int x = (int) (Math.random() * (mapSize - cellSize * orientation));
        int y = (int) (Math.random() * (mapSize - cellSize * (1 - orientation)));

        for (int i = 0; i < cellSize; i++) {
            Point p = new Point(x + i * orientation, y + i * (1 - orientation));
            points.add(p);
        }
        System.out.print("Create DotCom: ");
        printInfo();
    }

    /* Print current DotCom's points information */
    public void printInfo() {
        for (int i = 0; i < cellSize; i++) {
            System.out.print(points.get(i).toString() + " ");
        }
        System.out.println();
    }

    /* Compare DotCom's location and stringGuess and returns the result */
    public String check(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        Point guessPoint = new Point(guess / 10, guess % 10);
        String result = "miss";
        for (Iterator<Point> iter = points.iterator(); iter.hasNext();) {
            if (guessPoint.equals(iter.next())) {
                result = "hit";
                iter.remove();
            }
        }
        if (points.size() == 0) {
            result = "kill";
        }
        return result;
    }
}
