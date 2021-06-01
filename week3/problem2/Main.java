// 2018112180 정대용

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int selectMode = 0;
        Scanner sc = new Scanner(System.in);
        Timer tm = new Timer();

        while (true) {
            System.out.println("Select menu");
            System.out.println("1: Current time");
            System.out.println("2: Timer");
            System.out.println("3: Exit");

            selectMode = sc.nextInt();

            switch (selectMode) {
            case 1:
                tm.currentTime();
                break;
            case 2:
                tm.timer();
                break;
            case 3:
                System.out.println("Program exit");
                System.exit(0);
                break;
            }
        }
    }
}