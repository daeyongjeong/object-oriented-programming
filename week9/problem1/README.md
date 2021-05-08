# Problem 1

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
