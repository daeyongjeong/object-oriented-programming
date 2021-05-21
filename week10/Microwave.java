public class Microwave implements OnOff {
    private String model;
    private String brand;
    private int serialNumber;
    private boolean powered;
    private int timer;

    public Microwave(String model, String brand, int serialNumber) {
        this.model = model;
        this.brand = brand;
        this.serialNumber = serialNumber;
        powered = false;
        timer = 0;
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

    public void setTimer(int second) {
        timer = second;
        System.out.println(model + " timer set");
    }

    public void openDoor() {
        System.out.println(model + " door open");
    }

    public void printInfo() {
        System.out.println("Microwave Information");
        System.out.println("- Model: " + model);
        System.out.println("- Brand: " + brand);
        System.out.println("- Serial Number: " + serialNumber);
    }
}