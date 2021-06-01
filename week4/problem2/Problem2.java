import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wordbook wb = new Wordbook();
        int selectMode = 0;

        while (true) {
            System.out.println("Select menu");
            System.out.println("1: 오름차순 출력");
            System.out.println("2: 내림차순 출력");
            System.out.println("3: 단어 추가(20개 max)");
            System.out.println("4: 프로그램 종료");

            selectMode = sc.nextInt();
            sc.nextLine();

            switch (selectMode) {
            case 1:
                wb.printInAscending();
                break;
            case 2:
                wb.printInDescending();
                break;
            case 3:
                System.out.print("Add word: ");
                String w = sc.nextLine();
                wb.addWord(w);
                break;
            case 4:
                System.out.println("Program exit");
                sc.close();
                System.exit(0);
                break;
            }
            System.out.println();
        }
    }
    
}
