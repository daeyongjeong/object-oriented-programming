# Week 9

## [Problem 1](problem1)

아래 테스트 클래스를 실행시키면 오른쪽 그림과 같은 문구가 출력이 된다. 해당 코드를 실행시키기 위한 클래스를 작성하시오.

```java
public class Test {
    public static Animal[] animals;
    public static void main(String[] args) {
        animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();

        for (int i = 0; i < animals.length; i++) {
            animals[i].bark();
        }
    }
}
```

```
Yawong~
Bow wow
Hmme~~~
```

## [Problem 2](problem2)

2~10과 4개의 문양(스페이드, 다이아, 하트, 클로버)으로 구성된 카드를 이용해 간단한 카드 게임을 만들려고 합니다. 게임은 총 3명이서 진행이 되며 Player와 Com1, Com2 이렇게 3명의 유저가 존재합니다. 게임의 기능은 1. 게임시작, 2. 게임 종료 가 존재하며 게임이 시작하고 끝난 경우 다시 게임을 시작하거나 종료할 수 있습니다. (게임 도중 종료 및 시작 불가능)

1. 3명의 User(Player, Com1, Com2)는 게임 시작시 랜덤으로 카드 5장씩을 받고 남아있는 카드의 순서를 섞어야 합니다.
2. 카드 배분이 끝난 후 남아있는 카드의 맨 첫번째 카드를 공개합니다.
3. Player, Com1, Com2의 순서로 바닥에 공개되어 있는 카드와 숫자가 일치하거나 모양이 같은 카드를 낼 수 있고 카드를 낸 후 바닥에 공개되어있는 카드는 User가 낸 카드로 변경이 됩니다. 낼 수 있는 카드가 없는 경우 남아있는 카드 맨 끝에서부터 카드를 한장씩 가져옵니다. [카드를 가져오는 경우는 가지고 있는 카드 중 낼 수 있는 카드가 없을 때만 가능하며 낼 수 있는 카드가 여러 장일 경우 선택할 수 있어야 한다, Player만 컨트롤 할 수 있고 나머지 Com1, Com2는 적절한 규칙을 줘서 자동으로 플레이가 되도록 한다]
4. User중에 먼저 카드가 없어진 사람이 1등이 되며 그 다음으로 카드가 적은 사람이 2등으로 순위[남아있는 카드가 같을 경우 같은 순위가 매겨짐]가 매겨진다.
