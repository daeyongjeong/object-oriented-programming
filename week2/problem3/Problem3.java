import java.util.Scanner;

public class Problem3 {
	
    Scanner sc = new Scanner(System.in);

    public void main3() {
        System.out.print("정수 x를 입력해주세요: ");
        int x = sc.nextInt();

        System.out.print("정수 y를 입력해주세요: ");
        int y = sc.nextInt();

        double x2 = x;
        System.out.println("\"" + x + "/" + y + "의 값은 " + x2/y + "입니다.\"");
        System.out.println("\"" + x + "/" + y + "의 몫은 " + x/y + "이고 나머지는 " + x%y + "입니다.\"");
    }    
    
}