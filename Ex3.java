import java.util.Scanner;
class Ex3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose from A: Packet of Crisps, B: Health Bar, C: Bar of Chocolate ?");
        String choice =  scanner.nextLine();

        if(choice.equals("A")) {
            System.out.println("A Packet of Crisps costs 1.50");
        } else if(choice.equals("B")) {
            System.out.println("A Health Bar costs 1.20");
        } else if(choice.equals("C")) {
            System.out.println("A Bar of Chocolate 2.00");
        } else {
            System.out.println("I do not have anything for choice " + choice);
        }
    }
}