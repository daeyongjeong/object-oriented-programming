public class TV implements OnOff {
    private String model;
    private String brand;
    private int currentChannel;
    private double currentVolume;
    private boolean powered;

    public TV(String brand, String model) {
        this.currentChannel = 1;
        this.currentVolume = 0.5;
        this.powered = false;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void on() {
        powered = true;
        System.out.println(model +" powers on");
    }

    @Override
    public void off() {
        powered = false;
        System.out.println(model +" powers off");
    }

    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println(model + " channel changed to " + currentChannel);
    }

    public void changeVolume(double volume) {
        currentVolume = volume;
        System.out.println(model + " volume changed to " + currentVolume);
    }

    public void printInfo() {
        System.out.println("TV Information");
        System.out.println("- brand: " + brand);
        System.out.println("- model: " + model);
    }
}