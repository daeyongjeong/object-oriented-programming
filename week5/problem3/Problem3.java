import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        int size = 3;
        Student[] students = new Student[size];

        for (int num = 0; num < size; num++) {
            students[num] = new Student(inputName(), inputScore());
        }

        for (int num = 0; num < size; num++) {
            switch (students[num].getScore() / 10) {
            case 10:
            case 9:
                System.out.println(students[num].name + " grade is A");
                break;
            case 8:
                System.out.println(students[num].name + " grade is B");
                break;
            case 7:
                System.out.println(students[num].name + " grade is C");
                break;
            default:
                System.out.println(students[num].name + " grade is D");
                break;
            }
        }
    }

    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요: ");
        return sc.nextLine();
    }

    public static int inputScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요: ");
        return sc.nextInt();
    }
}
