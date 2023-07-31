import java.util.Scanner;

public class Shipment extends Package {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ferah's Shipping Calculator!");

        // Input package 1
        System.out.println("\nPackage 1:");
        Package pkg1 = new Package();
        pkg1.inputLength();
        pkg1.inputWidth();
        pkg1.inputHeight();
        double volume1 = pkg1.calcVolume();
        System.out.println("First package dimensions : " + pkg1.getLength() + " X " + pkg1.getWidth() + " X " + pkg1.getHeight() + " , Volume1 : " + volume1);

        // Input package 2
        System.out.println("\nPackage 2:");
        Package pkg2 = new Package();
        pkg2.inputLength();
        pkg2.inputWidth();
        pkg2.inputHeight();
        double volume2 = pkg2.calcVolume();
        System.out.println("Second package dimensions : " + pkg2.getLength() + " X " + pkg2.getWidth() + " X " + pkg2.getHeight() + " , Volume2 :" + volume2);

        // Calculate costs
        double cost1 = 3.0 + (volume1 - 1.0);
        double cost2 = 3.0 + (volume2 - 1.0);

        System.out.println("Package1 will cost : $" + cost1 + " to ship");
        System.out.println("Package2 will cost : $" + cost2 + " to ship");


        // Display appropriate message
        // I assume that the first package always cheaper than the second package
        if (cost1 == cost2) {
            System.out.println("The first package is the same cost as the second package.");
        } else if (cost2 < 2 * cost1) {
            System.out.println("The second package is slightly more than the first package.");
        } else if (cost2 < 3 * cost1) {
            System.out.println("The cost of the first package is double the cost of the second package.");
        } else if (cost2 < 4 * cost1) {
            System.out.println("The second package is triple the first package.");
        } else if (cost2 < 5 * cost1) {
            System.out.println("The cost of the first package is quadruple the cost of the second package.");
        } else {
            System.out.println("The cost of the first package is " + cost2 / cost1 + " times the cost of the second package.");

        }
    }
}
