// 2018112180 정대용

import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Timer {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat form1 = new SimpleDateFormat("HH:mm:ss"); // 데이터 form을 HH:mm:ss로 맞추는 코드
    // Date time = new Date();

    public void currentTime() {
        System.out.println("현재 시간은 " + form1.format(System.currentTimeMillis()));
    }

    public void timer() {
        int timerOut = 0;
        System.out.println("타이머를 종료하려면 숫자 5를 입력해주세요");
        long time1 = System.currentTimeMillis(); // 시스템에서의 현재 시간이 time1로 입력되는 코드

        while (timerOut != 5) { // 5를 입력받기 전까지 계속해서 정수를 입력받는 코드
            timerOut = sc.nextInt();
        }

        long time2 = System.currentTimeMillis(); // 시스템에서의 현재 시간이 time2로 입력되는 코드
        System.out.println("시간 차는 " + (time2 - time1) / 1000.000 + "초 입니다.");
    }
}
