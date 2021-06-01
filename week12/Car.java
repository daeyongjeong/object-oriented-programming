import java.text.DecimalFormat;
import java.util.Random;

public class Car {

    private static int carCount = 0;
    private static Random random = new Random();
    private static DecimalFormat formatter = new DecimalFormat("###,###");
    private String carName;
    private int carNumber;

    public Car(String name, int number) {
        carName = name;
        carNumber = number;
        carCount++;
        System.out.println("make " + carName + " & number is " + carNumber);
    }

    public Car(String name) {
        this(name, random.nextInt(10000));
    }

    public static void printCarNumber() {
        System.out.println("carCount is " + carCount);
    }

    public static void printCarInfo(Car ca) {
        System.out.println("carName is " + ca.carName + " & carNumber is " + ca.carNumber);
    }

    public void price() {
        int price = random.nextInt(900000000) + 100000000;
        System.out.println("the price is " + formatter.format(price));
    }

}
