public class Problem2 {

    public static void main(String[] args) {

        char c = 65;
        int d = 654;
        double f = 6543.21;

        System.out.println("TYPE CONVERSION EXAMPLE");
        System.out.println("  BEFORE CONVERSION");
        System.out.println("    char value " + c);
        System.out.println("    int value " + d);
        System.out.println("    double value " + f);
        System.out.println();

        // implicit type conversion
        f = d = c;

        System.out.println("  AFTER IMPLICIT TYPE CONVERSION");
        System.out.println("    char value " + c);
        System.out.println("    int value " + d);
        System.out.println("    double value " + f);
        System.out.println();

        // reset
        c = 65;
        d = 654;
        f = 6543.21;

        // explicit type conversion
        d = (int) f;
        c = (char) d;

        System.out.println("  AFTER EXPLICIT TYPE CONVERSION");
        System.out.println("    char value " + c);
        System.out.println("    int value " + d);
        System.out.println("    double value " + f);
        System.out.println();

        // overflow
        long a = 2147483648l;
        int b = (int) a;
        System.out.println("OVERFLOW EXAMPLE");
        System.out.println("    long value " + a);
        System.out.println("    int from long value " + b);
    }

}
