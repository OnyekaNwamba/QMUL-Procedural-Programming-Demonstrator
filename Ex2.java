import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        double area = (getLength() * getWidth()) / 10000;
        double extra = area * 0.10;

        //Round extra to 3 dp (1.472)
        extra = extra * 1000;
        extra = (int) extra;
        extra = extra / 1000;

        double total = area + extra;

        //Round total to 1 dp (16.1)
        total = total * 10;
        total = (int) total;
        total = total / 10;

        System.out.println("Area: " + area);
        System.out.println("Extra: " + extra);
        System.out.println("Total: " + total);

    }

    private static double getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length: ");
        double length = scanner.nextInt();
        return length;
    }

    private static double getWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        double width = scanner.nextDouble();
        return width;
    }

}
