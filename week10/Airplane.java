public class Airplane implements Move, OnOff {
    private String model;
    private int serialNumber;
    private int size;
    private int fuel;
    private boolean powered;

    public Airplane(String model, int serialNumber, int size) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.size = size;
        fuel = 0;
        powered = false;
    }

    @Override
    public void on() {
        powered = true;
        System.out.println(model + " powers on");
    }

    @Override
    public void off() {
        powered = false;
        System.out.println(model + " powers off");
    }

    @Override
    public void front() {
        System.out.println(model + " moves forward");
    }

    @Override
    public void left() {
        System.out.println(model + " moves left");
    }

    @Override
    public void back() {
        System.out.println(model + " moves backward");
    }

    @Override
    public void right() {
        System.out.println(model + " moves right");
    }

    public void fuel(int amount) {
        fuel += amount;
        System.out.println("Fueled " + model);
    }

    public void defuel(int amount) {
        fuel -= amount;
        System.out.println("Defueled " + model);
    }

    public void printInfo() {
        System.out.println("Airplane Information");
        System.out.println("- Model: " + model);
        System.out.println("- Serial Number: " + serialNumber);
        System.out.println("- Size: " + size);
        System.out.println("- Current Fuel: " + fuel);
    }
}