// 2018112180 정대용

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cc = new Calculator();
        int selectMode = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select menu");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiply");
            System.out.println("4: Division");
            System.out.println("5: Exit");

            selectMode = sc.nextInt();

            switch (selectMode) {
            case 1:
                cc.addition();
                break;
            case 2:
                cc.subtraction();
                break;
            case 3:
                cc.multiply();
                break;
            case 4:
                cc.division();
                break;
            case 5:
                System.out.println("Program exit");
                System.exit(0);
                break;
            }
        }
    }
}
