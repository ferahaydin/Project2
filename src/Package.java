
import java.util.Scanner;

public class Package {
    private double length;
    private double width;
    private double height;
    private Scanner input = new Scanner(System.in);

    public Package() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    public Package(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Package(Package pkg) {
        this.length = pkg.getLength();
        this.width = pkg.getWidth();
        this.height = pkg.getHeight();
    }

    public void inputLength() {
        System.out.print("Enter length: ");
        this.length = input.nextDouble();
    }

    public void inputWidth() {
        System.out.print("Enter width: ");
        this.width = input.nextDouble();
    }

    public void inputHeight() {
        System.out.print("Enter height: ");
        this.height = input.nextDouble();
    }

    public void displayDimensions() {
        System.out.println(length + " X " + width + " X " + height);
    }

    public double calcVolume() {
        return length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
