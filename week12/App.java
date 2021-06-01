public class App {

    public static void main(String[] args) {
        Car.printCarNumber();
        Car ca1 = new Car("car1", 1234);
        Car ca2 = new Car("car2");
        Car ca3 = new Car("car3");

        Car.printCarInfo(ca1);
        Car.printCarInfo(ca2);

        ca1.price();
        ca2.price();
        ca3.price();
        Car.printCarNumber();
    }

}
