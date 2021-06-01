import java.util.Scanner;

public class IceCream {

    private String name;
    private int price;
    private int numberOfIceCream;
    Scanner sc = new Scanner(System.in);

    public void setInfo() {
        System.out.print("Ice cream name: ");
        name = sc.nextLine();
        System.out.print("Ice cream price: ");
        price = sc.nextInt();
        System.out.print("Number of ice creams: ");
        numberOfIceCream = sc.nextInt();
    }

    public void printInfo() {
        System.out.println("Ice cream name is " + name);
        System.out.println("Ice cream price is " + price);
        System.out.println("There are " + numberOfIceCream + " ice creams");
    }

}
