public class Human implements Life, Move {
    private String name;
    private String job;
    private int age;
    private int height;
    private int weight;

    public Human(String name, String job, int age, int height, int weight) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.height = height;
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

    public void doAssignment() {
        System.out.println(name + " does assignment");
    }

    public void drinkAlcohol() {
        System.out.println(name + " drinks alchol");
    }

    public void printInfo() {
        System.out.println("Human Information");
        System.out.println("- Name: " + name);
        System.out.println("- Job: " + job);
        System.out.println("- Age: " + age);
        System.out.println("- Height: " + height);
        System.out.println("- Weight: " + weight);
    }
}