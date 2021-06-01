# Week 2

## Problem 1

아래 표를 보고 `IceCream` 클래스를 생성한다. 그런 다음 객체 한 개를 생성하여 `setInfo()` 함수를 이용해 `name`, `price`, `numberOfIceCream`에 대한 정보를 설정한 후에 `printInfo()`함수를
이용해 객체의 정보를 출력한다.

- 테스트용 클래스를 만들어서 `IceCream` 객체를 생성해야 한다.
- `setInfo()`, `printInfo()` 함수는 직접 만들어서 실행해야 하며 `name`, `price`, `numberOfIceCream`은 사용자로부터 직접 값을 입력받아야 한다.

출력 예시:

```
Ice cream name: shootingstar
Ice cream price: 3500
Number of ice creams: 10
Ice cream name is shootingstar
Ice cream price is 3500
There are 10 ice creams
```

## Problem 2

아래 그림과 같은 피라미드를 만드는 `Pyramid` 클래스를
하나 생성한다. 이 클래스에는 `printStar()`, `SetInfo()` 2개의
함수가 반드시 포함된다. `printStar()`함수는 피라미드를
출력하는 기능을 하며, `SetInfo()` 함수는 문자의 모양과
피라미드 줄 수를 결정하는 기능을 한다.

- 테스트용 클래스를 만들어서 `Pyramid` 객체를 생성해서 실행해야 한다.

출력 예시

```
  *
 ***
*****
Input character: O
Input line number: 7
      O
     OOO
    OOOOO
   OOOOOOO
  OOOOOOOOO
 OOOOOOOOOOO
OOOOOOOOOOOOO
```

## Problem 3

사용자로부터 숫자 `x`, `y`를 입력을 받은 후 `y`로 `x`를 나누는
코드를 작성해야 한다. 결과를 나타내는 방식은 2가지로
표현해야 한다. 첫 번째는 소수형식으로 출력하는 방식, 두
번째는 몫과 나머지로 나타내는 방식 이다.

- 입력은 한번만 받는다. (`x`, `y` 각 한번씩)
- 결과를 나타내는 문장의 양 끝에는 “”를 붙여야 한다. (아래 화면 참고)

출력 예시

```
정수 X를 입력해주세요: 10
정수 Y를 입력해주세요: 5
"10/5의 값은 2.0입니다."
"10/5의 몫은 2이고 나머지는 0입니다.
```

## Problem 4

사용자로부터 배열의 크기를 입력 받은 후 해당 크기의 A, B 2개의 배열을 만들어야 한다. A는 1, 3, 5 … 홀수로 구성되고, B는 2, 4, 6 … 짝수로 구성되어있다. A와 B를 이용해서 배열 C = {1, 2, 3, 4, 5 … }를 만들어야 한다.

- C는 A와 B의 원소를 입력받는 형식으로 작성해야합니다. (직접 숫자 입력 X)

Ex) C[0] = A[0], C[1] = B[0] …

출력 예시

```
배열 크기를 입력해주세요: 10
배열 A: 1 3 5 7 9 11 13 15 17 19
배열 B: 2 4 6 8 10 12 14 16 18 20
배열 C: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
```
