public class Dog implements Life, Move {
    private String name;
    private String breed;
    private String color;
    private int age;
    private int weight;

    public Dog(String name, String breed, String color, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void front() {
        System.out.println(name + " moves forward");
    }

    @Override
    public void left() {
        System.out.println(name + " moves left");
    }

    @Override
    public void back() {
        System.out.println(name + " moves backward");
    }

    @Override
    public void right() {
        System.out.println(name + " moves right");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats something");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void bark() {
        System.out.println("Woof woof");
    }

    public void wagTail() {
        System.out.println(name + " wags its tail");
    }

    public void printInfo() {
        System.out.println("Dog Information");
        System.out.println("- Name: " + name);
        System.out.println("- Breed: " + breed);
        System.out.println("- Color: " + color);
        System.out.println("- Age: " + age);
        System.out.println("- Weight: " + weight);
    }
}