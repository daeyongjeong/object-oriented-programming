public class Test {
    public static void main(String[] args) {

        // test TV
        TV tv = new TV("LG", "OLED65CXPUA");
        tv.on();
        tv.off();
        tv.changeChannel(23);
        tv.changeVolume(0.5);
        tv.printInfo();
        System.out.println();

        // test Dog
        Dog dog = new Dog("Max", "Welsh Corgi", "brown", 3, 10);
        dog.front();
        dog.left();
        dog.back();
        dog.right();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.wagTail();
        dog.printInfo();
        System.out.println();

        // test Cat
        Cat cat = new Cat("Lily", "Ragdoll", "white", 2, 9);
        cat.front();
        cat.left();
        cat.back();
        cat.right();
        cat.eat();
        cat.sleep();
        cat.meow();
        cat.groom();
        cat.printInfo();
        System.out.println();

        // test Microwave
        Microwave mw = new Microwave("Samsung", "MC11K7035CG", 1234);
        mw.on();
        mw.off();
        mw.setTimer(30);
        mw.openDoor();
        mw.printInfo();
        System.out.println();

        // test Human
        Human human = new Human("Jack", "Teacher", 25, 180, 80);
        human.front();
        human.left();
        human.back();
        human.right();
        human.eat();
        human.sleep();
        human.doAssignment();
        human.drinkAlcohol();
        human.printInfo();
        System.out.println();

        // Test Airplane
        Airplane ap = new Airplane("Boeing 777", 12344, 64);
        ap.on();
        ap.off();
        ap.front();
        ap.left();
        ap.back();
        ap.right();
        ap.fuel(30);
        ap.defuel(20);
        ap.printInfo();
        System.out.println();
    }
}