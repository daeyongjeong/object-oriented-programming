// 2018112180 정대용

import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;
    Scanner sc = new Scanner(System.in);

    // 생성자
    public Calculator() {
        num1 = 0;
        num2 = 0;
    }

    // 사용자로부터 정수 num1, num2에 숫자를 입력받는 함수
    public void userInput() {
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
    }

    // 사용자로부터 정수 num1, num2에 숫자를 입력받은 후 덧셈 결과를 출력하는 함수
    public void addition() {
        userInput();
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    // 사용자로부터 정수 num1, num2에 숫자를 입력받은 후 뺄셈 결과를 출력하는 함수
    public void subtraction() {
        userInput();
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    // 사용자로부터 정수 num1, num2에 숫자를 입력받은 후 곱셈 결과를 출력하는 함수
    public void multiply() {
        userInput();
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    // 사용자로부터 정수 num1, num2에 숫자를 입력받은 후 나눗셈 결과를 출력하는 함수 (ex. 5/2 = 2.5)
    public void division() {
        userInput();
        while (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            System.out.print("Please enter num2 again: ");
            num2 = sc.nextInt();
        }
        double result = num1 * 1.0 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}